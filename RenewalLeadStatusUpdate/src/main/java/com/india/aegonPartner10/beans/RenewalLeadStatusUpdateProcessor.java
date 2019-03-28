package com.india.aegonPartner10.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import io.swagger.model.RenewalLeadStatusUpdateRequest;
import io.swagger.model.RenewalLeadStatusUpdateResponse;

import io.swagger.model.ServiceImpl;

public class RenewalLeadStatusUpdateProcessor implements Processor{
	
	public void process(Exchange exchange) throws Exception {
		RenewalLeadStatusUpdateRequest request = exchange.getIn().getBody(RenewalLeadStatusUpdateRequest.class);
		
		RenewalLeadStatusUpdateResponse response = ServiceImpl.insertLeadStatus(request);
		System.out.println("Response is::" + response);
		exchange.getOut().setBody(response);
	}
	
}
