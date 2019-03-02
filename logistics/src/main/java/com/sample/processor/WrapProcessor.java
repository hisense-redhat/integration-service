package com.sample.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class WrapProcessor implements Processor {
	
	static String TEMPLATE = "{ \"commands\":[ { \"insert\":{ \"object\":{ \"com.myspace.logistics.Order\":REPLACEMENT_TARGET }, \"out-identifier\":\"order\" } }, { \"fire-all-rules\":{ } } ]}";

	@Override
	public void process(Exchange exchange) throws Exception {

		Object in = exchange.getIn().getBody();
		byte[] buf = (byte[]) in;
		
		String order = new String(buf);
		String request = TEMPLATE.replace("REPLACEMENT_TARGET", order);
		
		Message msg = exchange.getIn();
		msg.setBody(request);
		exchange.setOut(msg);
	}



}
