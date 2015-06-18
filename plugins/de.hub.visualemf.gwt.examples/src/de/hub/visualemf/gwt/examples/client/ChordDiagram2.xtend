package de.hub.visualemf.gwt.examples.client

import com.google.gwt.resources.client.ClientBundle
import com.google.gwt.core.client.GWT
import com.google.gwt.resources.client.CssResource
import com.github.gwtd3.api.D3
import com.github.gwtd3.api.Arrays
import com.github.gwtd3.api.arrays.Array
import com.google.gwt.user.client.ui.FlowPanel
import com.github.gwtd3.api.functions.DatumFunction
import com.google.gwt.dom.client.Element
import com.github.gwtd3.api.core.Value
import com.github.gwtd3.api.layout.Chord
import com.github.gwtd3.api.core.Selection
import com.google.gwt.core.client.JsArray
import com.google.gwt.core.client.JsArrayNumber
import com.google.gwt.core.client.JavaScriptObject
import com.github.gwtd3.api.layout.Chord.ChordItem
import de.itemis.xtend.auto.gwt.JsNative

class ChordDiagram2 extends FlowPanel {
	
	public interface Bundle extends ClientBundle {
		public static final Bundle INSTANCE = GWT.create(typeof(Bundle));

		//@Source("ChordDiagramStyles.css")
		def MyResources ChordDiagramStyles();
	}

	interface MyResources extends CssResource {
		def String chord();
	}

	new() {
		Bundle.INSTANCE.ChordDiagramStyles().ensureInjected();
	}

	def render() {
		val css = Bundle.INSTANCE.ChordDiagramStyles();
		val matrix = null; matrix();

		val chord = D3.layout().chord().padding(0.05)
				.sortSubgroups(Arrays.descending())
				.matrix(matrix);

		val width = 960;
		val height = 500;
		val innerRadius = Math.min(width, height) * 0.41;
		val outerRadius = innerRadius * 1.1;

		val fill = D3.scale.ordinal().domain(Arrays.range(4))
				.range(Array.fromObjects("#000000", "#FFDD89", "#957244", "#F26223"));

		val svg = D3
				.select(this)
				.append("svg")
				.attr("width", width)
				.attr("height", height)
				.append("g")
				.attr("transform",
						"translate(" + (width / 2) + "," + (height / 2) + ")");

		val DatumFunction<String> indexFunction = [context, d, index |
			try {
				val i = d.^as(typeof(Chord.Group)).index;
				return fill.apply(i).asString;					
			} catch (Exception e) {
				e.printStackTrace();
				return "blah2";
			}
		];

		svg.append("g")
			.selectAll("path")
			.data(chord.groups())
			.enter()
			.append("path")
			.style("fill", indexFunction)
			.style("stroke", indexFunction)
			.attr("d", D3.svg().arc().innerRadius(innerRadius)
					.outerRadius(outerRadius))
					.on("mouseover", fade(css, svg, 0.1))
					.on("mouseout", fade(css, svg, 1));

		// Returns an array of tick angles and labels, given a group.
		val DatumFunction<Array<GroupTick>> groupTicks = [context, d, nop |
			val g = d.<Chord.Group>^as;
			val k = (g.endAngle - g.startAngle) / g.value;
			return Arrays.range(0, g.value, 1000).<Array<Double>>cast.map([thisArg, v, index, array |
				val angle = v.asDouble * k + g.startAngle;
				val label = if ((index % 5) != 0) null else (v.asDouble / 1000) + "k";
				return GroupTick.create(angle, label);
			]); 							
		];

		var Selection ticks;
		try {
			ticks = svg.append("g").selectAll("g").data(chord.groups()).enter()
					.append("g").selectAll("g").data(groupTicks).enter()
					.append("g").attr("transform", [Element context, Value d, int index |
						val groupTick = d.<GroupTick>^as();
						'''rotate(«(((groupTick.angle() * 180) / Math::PI) - 90)»)translate(«outerRadius»,0)''';							
					]);					
			ticks.append("line").attr("x1", 1).attr("y1", 0).attr("x2", 5)
			.attr("y2", 0).style("stroke", "#000");

			ticks.append("text")
				.attr("x", 8).attr("dy", ".35em")
				.attr("transform", [Element context, Value d, int index |
					if (d.<GroupTick>^as().angle() > Math::PI) "rotate(180)translate(-16)" else null;
				])
				.style("text-anchor",[Element context, Value d, int index |
					if (d.<GroupTick>^as().angle() > Math::PI) "end" else null;
				])
				.text([Element context, Value d, int index | d.<GroupTick>^as().label(); ]);

			svg.append("g").attr("class", css.chord()).selectAll("path")
				.data(chord.chords()).enter().append("path")
				.attr("d", D3.svg().chord().radius(innerRadius))
				.style("fill", [Element context, Value d, int index | return fill.apply(d.<ChordItem>^as().target().index()).asString();])
			.style("opacity", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@JsNative def private static JsArray<JsArrayNumber> matrix() '''
		return [ [ 11975, 5871, 8916, 2868 ], [ 1951, 10048, 2060, 6171 ],
				[ 8010, 16145, 8090, 8045 ], [ 1013, 990, 940, 6907 ] ];
	'''

	@JsNative def static String call(JavaScriptObject f) '''
		f();
	'''

	def DatumFunction<Void> fade(MyResources css, Selection svg, double opacity) {
		return [Element context, Value d, int i |
				svg.selectAll("." + css.chord() + " path")
				.<Array<ChordItem>> cast()
				.filter([Object thisArg, Value v, int index, Array<?> array |
					(v.<ChordItem>^as.source.index != i) && (v.<ChordItem>^as.target.index != i);
				
				]).<Selection> cast().transition()
				.style("opacity", opacity);
				return null;
		];
	}

	private static class GroupTick extends JavaScriptObject {
		protected new() {}

		@JsNative def public static GroupTick create(double angle, String label) '''
			return {
				angle : angle,
				label : label
			};
		'''

		@JsNative def double angle() '''
			return this.angle;
		'''

		@JsNative def String label() '''
			return this.label;
		'''
	}
}