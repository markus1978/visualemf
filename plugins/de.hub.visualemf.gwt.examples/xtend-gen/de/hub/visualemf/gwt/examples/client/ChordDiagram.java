package de.hub.visualemf.gwt.examples.client;

import com.github.gwtd3.api.Arrays;
import com.github.gwtd3.api.D3;
import com.github.gwtd3.api.Sort;
import com.github.gwtd3.api.arrays.Array;
import com.github.gwtd3.api.arrays.ForEachCallback;
import com.github.gwtd3.api.core.EnteringSelection;
import com.github.gwtd3.api.core.Selection;
import com.github.gwtd3.api.core.Transition;
import com.github.gwtd3.api.core.UpdateSelection;
import com.github.gwtd3.api.core.Value;
import com.github.gwtd3.api.functions.DatumFunction;
import com.github.gwtd3.api.layout.Chord;
import com.github.gwtd3.api.layout.Layout;
import com.github.gwtd3.api.scales.OrdinalScale;
import com.github.gwtd3.api.svg.Arc;
import com.github.gwtd3.api.svg.SVG;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.FlowPanel;
import de.hub.visualemf.gwt.examples.client.ChordDiagramHelper;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ChordDiagram extends FlowPanel {
  public ChordDiagram() {
    ChordDiagramHelper.MyResources _css = ChordDiagramHelper.Bundle.INSTANCE.css();
    _css.ensureInjected();
  }
  
  public Selection render() {
    Selection _xblockexpression = null;
    {
      final ChordDiagramHelper.MyResources css = ChordDiagramHelper.Bundle.INSTANCE.css();
      final JsArray<JsArrayNumber> matrix = ChordDiagramHelper.matrix();
      Layout _layout = D3.layout();
      Chord _chord = _layout.chord();
      Chord _padding = _chord.padding(0.05);
      Sort _descending = Arrays.descending();
      Chord _sortSubgroups = _padding.sortSubgroups(_descending);
      final Chord chord = _sortSubgroups.matrix(matrix);
      final int width = 960;
      final int height = 500;
      int _min = Math.min(width, height);
      final double innerRadius = (_min * 0.41);
      final double outerRadius = (innerRadius * 1.1);
      OrdinalScale _ordinal = D3.scale.ordinal();
      Array<Integer> _range = Arrays.range(4);
      OrdinalScale _domain = _ordinal.domain(_range);
      Array<String> _fromObjects = Array.<String>fromObjects("#000000", "#FFDD89", "#957244", "#F26223");
      final OrdinalScale fill = _domain.range(_fromObjects);
      Selection _select = D3.select(this);
      Selection _append = _select.append("svg");
      Selection _attr = _append.attr("width", width);
      Selection _attr_1 = _attr.attr("height", height);
      Selection _append_1 = _attr_1.append("g");
      final Selection svg = _append_1.<Object>attr("transform", 
        (((("translate(" + Integer.valueOf((width / 2))) + ",") + Integer.valueOf((height / 2))) + ")"));
      final DatumFunction<String> _function = new DatumFunction<String>() {
        public String apply(final Element context, final Value d, final int index) {
          try {
            Chord.Group _as = d.<Chord.Group>as(Chord.Group.class);
            final int i = _as.index();
            Value _apply = fill.apply(i);
            return _apply.asString();
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
              e.printStackTrace();
              return "blah2";
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      };
      final DatumFunction<String> indexFunction = _function;
      Selection _append_2 = svg.append("g");
      Selection _selectAll = _append_2.selectAll("path");
      JsArray<Chord.Group> _groups = chord.groups();
      UpdateSelection _data = _selectAll.data(_groups);
      EnteringSelection _enter = _data.enter();
      Selection _append_3 = _enter.append("path");
      Selection _style = _append_3.style("fill", indexFunction);
      Selection _style_1 = _style.style("stroke", indexFunction);
      SVG _svg = D3.svg();
      Arc _arc = _svg.arc();
      Arc _innerRadius = _arc.innerRadius(innerRadius);
      Arc _outerRadius = _innerRadius.outerRadius(outerRadius);
      Selection _attr_2 = _style_1.attr("d", _outerRadius);
      DatumFunction<Void> _fade = this.fade(css, svg, 0.1);
      Selection _on = _attr_2.on("mouseover", _fade);
      DatumFunction<Void> _fade_1 = this.fade(css, svg, 1);
      _on.on("mouseout", _fade_1);
      final DatumFunction<Array<ChordDiagramHelper.GroupTick>> _function_1 = new DatumFunction<Array<ChordDiagramHelper.GroupTick>>() {
        public Array<ChordDiagramHelper.GroupTick> apply(final Element context, final Value d, final int nop) {
          final Chord.Group g = d.<Chord.Group>as();
          double _endAngle = g.endAngle();
          double _startAngle = g.startAngle();
          double _minus = (_endAngle - _startAngle);
          double _value = g.value();
          final double k = (_minus / _value);
          double _value_1 = g.value();
          JavaScriptObject _range = Arrays.range(0, _value_1, 1000);
          Array<Double> _cast = _range.<Array<Double>>cast();
          final ForEachCallback<ChordDiagramHelper.GroupTick> _function = new ForEachCallback<ChordDiagramHelper.GroupTick>() {
            public ChordDiagramHelper.GroupTick forEach(final Object thisArg, final Value v, final int index, final Array<?> array) {
              double _asDouble = v.asDouble();
              double _multiply = (_asDouble * k);
              double _startAngle = g.startAngle();
              final double angle = (_multiply + _startAngle);
              String _xifexpression = null;
              if (((index % 5) != 0)) {
                _xifexpression = null;
              } else {
                double _asDouble_1 = v.asDouble();
                double _divide = (_asDouble_1 / 1000);
                _xifexpression = (Double.valueOf(_divide) + "k");
              }
              final String label = _xifexpression;
              return ChordDiagramHelper.GroupTick.create(angle, label);
            }
          };
          return _cast.<ChordDiagramHelper.GroupTick>map(_function);
        }
      };
      final DatumFunction<Array<ChordDiagramHelper.GroupTick>> groupTicks = _function_1;
      Selection ticks = null;
      Selection _xtrycatchfinallyexpression = null;
      try {
        Selection _xblockexpression_1 = null;
        {
          Selection _append_4 = svg.append("g");
          Selection _selectAll_1 = _append_4.selectAll("g");
          JsArray<Chord.Group> _groups_1 = chord.groups();
          UpdateSelection _data_1 = _selectAll_1.data(_groups_1);
          EnteringSelection _enter_1 = _data_1.enter();
          Selection _append_5 = _enter_1.append("g");
          Selection _selectAll_2 = _append_5.selectAll("g");
          UpdateSelection _data_2 = _selectAll_2.<Array<ChordDiagramHelper.GroupTick>>data(groupTicks);
          EnteringSelection _enter_2 = _data_2.enter();
          Selection _append_6 = _enter_2.append("g");
          final DatumFunction<String> _function_2 = new DatumFunction<String>() {
            public String apply(final Element context, final Value d, final int index) {
              String _xblockexpression = null;
              {
                final ChordDiagramHelper.GroupTick groupTick = d.<ChordDiagramHelper.GroupTick>as();
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("rotate(");
                double _angle = groupTick.angle();
                double _multiply = (_angle * 180);
                double _divide = (_multiply / Math.PI);
                double _minus = (_divide - 90);
                _builder.append(_minus, "");
                _builder.append(")translate(");
                _builder.append(outerRadius, "");
                _builder.append(",0)");
                _xblockexpression = _builder.toString();
              }
              return _xblockexpression;
            }
          };
          Selection _attr_3 = _append_6.attr("transform", _function_2);
          ticks = _attr_3;
          Selection _append_7 = ticks.append("line");
          Selection _attr_4 = _append_7.attr("x1", 1);
          Selection _attr_5 = _attr_4.attr("y1", 0);
          Selection _attr_6 = _attr_5.attr("x2", 5);
          Selection _attr_7 = _attr_6.attr("y2", 0);
          _attr_7.style("stroke", "#000");
          Selection _append_8 = ticks.append("text");
          Selection _attr_8 = _append_8.attr("x", 8);
          Selection _attr_9 = _attr_8.<Object>attr("dy", ".35em");
          final DatumFunction<String> _function_3 = new DatumFunction<String>() {
            public String apply(final Element context, final Value d, final int index) {
              String _xifexpression = null;
              ChordDiagramHelper.GroupTick _as = d.<ChordDiagramHelper.GroupTick>as();
              double _angle = _as.angle();
              boolean _greaterThan = (_angle > Math.PI);
              if (_greaterThan) {
                _xifexpression = "rotate(180)translate(-16)";
              } else {
                _xifexpression = null;
              }
              return _xifexpression;
            }
          };
          Selection _attr_10 = _attr_9.attr("transform", _function_3);
          final DatumFunction<String> _function_4 = new DatumFunction<String>() {
            public String apply(final Element context, final Value d, final int index) {
              String _xifexpression = null;
              ChordDiagramHelper.GroupTick _as = d.<ChordDiagramHelper.GroupTick>as();
              double _angle = _as.angle();
              boolean _greaterThan = (_angle > Math.PI);
              if (_greaterThan) {
                _xifexpression = "end";
              } else {
                _xifexpression = null;
              }
              return _xifexpression;
            }
          };
          Selection _style_2 = _attr_10.style("text-anchor", _function_4);
          final DatumFunction<String> _function_5 = new DatumFunction<String>() {
            public String apply(final Element context, final Value d, final int index) {
              ChordDiagramHelper.GroupTick _as = d.<ChordDiagramHelper.GroupTick>as();
              return _as.label();
            }
          };
          _style_2.text(_function_5);
          Selection _append_9 = svg.append("g");
          String _chord_1 = css.chord();
          Selection _attr_11 = _append_9.<Object>attr("class", _chord_1);
          Selection _selectAll_3 = _attr_11.selectAll("path");
          JavaScriptObject _chords = chord.chords();
          UpdateSelection _data_3 = _selectAll_3.data(_chords);
          EnteringSelection _enter_3 = _data_3.enter();
          Selection _append_10 = _enter_3.append("path");
          SVG _svg_1 = D3.svg();
          com.github.gwtd3.api.svg.Chord _chord_2 = _svg_1.chord();
          com.github.gwtd3.api.svg.Chord _radius = _chord_2.radius(innerRadius);
          Selection _attr_12 = _append_10.attr("d", _radius);
          final DatumFunction<String> _function_6 = new DatumFunction<String>() {
            public String apply(final Element context, final Value d, final int index) {
              Chord.ChordItem _as = d.<Chord.ChordItem>as();
              Chord.Group _target = _as.target();
              int _index = _target.index();
              Value _apply = fill.apply(_index);
              return _apply.asString();
            }
          };
          Selection _style_3 = _attr_12.style("fill", _function_6);
          _xblockexpression_1 = _style_3.style("opacity", 1);
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  public DatumFunction<Void> fade(final ChordDiagramHelper.MyResources css, final Selection svg, final double opacity) {
    final DatumFunction<Void> _function = new DatumFunction<Void>() {
      public Void apply(final Element context, final Value d, final int i) {
        String _chord = css.chord();
        String _plus = ("." + _chord);
        String _plus_1 = (_plus + " path");
        Selection _selectAll = svg.selectAll(_plus_1);
        Array<Chord.ChordItem> _cast = _selectAll.<Array<Chord.ChordItem>>cast();
        final ForEachCallback<Boolean> _function = new ForEachCallback<Boolean>() {
          public Boolean forEach(final Object thisArg, final Value v, final int index, final Array<?> array) {
            boolean _and = false;
            Chord.ChordItem _as = v.<Chord.ChordItem>as();
            Chord.Group _source = _as.source();
            int _index = _source.index();
            boolean _notEquals = (_index != i);
            if (!_notEquals) {
              _and = false;
            } else {
              Chord.ChordItem _as_1 = v.<Chord.ChordItem>as();
              Chord.Group _target = _as_1.target();
              int _index_1 = _target.index();
              boolean _notEquals_1 = (_index_1 != i);
              _and = _notEquals_1;
            }
            return Boolean.valueOf(_and);
          }
        };
        Array<Chord.ChordItem> _filter = _cast.filter(_function);
        Selection _cast_1 = _filter.<Selection>cast();
        Transition _transition = _cast_1.transition();
        _transition.style("opacity", opacity);
        return null;
      }
    };
    return _function;
  }
}
