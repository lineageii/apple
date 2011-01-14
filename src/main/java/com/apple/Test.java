package com.apple;

import java.io.IOException;

import org.xml.sax.SAXException;

import com.apple.constants.OrderStatus;
import com.meterware.httpunit.ClientProperties;
import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.HttpUnitOptions;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;

public class Test {
	public static void main(String[] args) throws IOException, SAXException {
		// HttpUnitOptions.setDefaultCharacterSet("utf-8");
		// HttpUnitOptions.setScriptingEnabled(false);
		// HttpUnitOptions.setExceptionsThrownOnScriptError(false);
		// HttpUnitOptions.setLoggingHttpHeaders(true);
		// HttpUnitOptions.setAcceptCookies(true);
		// ClientProperties.getDefaultProperties().setAcceptCookies(true);
		WebConversation wc = new WebConversation();
		wc.setUserAgent("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/534.12 (KHTML, like Gecko) Chrome/9.0.587.0 Safari/534.12");

		WebRequest request = new GetMethodWebRequest(
				"http://www.yesnap.com/preview/www.youku.com");
		WebResponse response = wc.getResource(request);
		System.out.println(response.getHeaderField("Location"));
		System.out.println(OrderStatus.已下单.ordinal());
	}
}
