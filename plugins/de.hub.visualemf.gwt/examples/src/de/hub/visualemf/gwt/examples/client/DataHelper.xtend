package de.hub.visualemf.gwt.examples.client

import com.google.gwt.http.client.Request
import com.google.gwt.http.client.RequestBuilder
import com.google.gwt.http.client.RequestCallback
import com.google.gwt.http.client.RequestException
import com.google.gwt.http.client.Response
import org.eclipse.xtext.xbase.lib.Functions.Function1

class DataHelper {
	
	public static val prefix = "data/emffrag"

	static def load(String file, Function1<String, Void> onFinish) {
		try {
			new RequestBuilder(RequestBuilder.GET, prefix + "/" + file).sendRequest(null, new RequestCallback() {
				override def onError(Request request, Throwable exception) {
					onFinish.apply(null)
				}

				override def onResponseReceived(Request request, Response response) {
					if (200 == response.getStatusCode()) {
						onFinish.apply(response.getText());
					} else {
						onFinish.apply(null)
					}
				}
			});
		} catch (RequestException e) {
			onFinish.apply(null)
		}
	}
}