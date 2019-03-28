package com.india.aegonPartner10.beans;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.swagger.model.RenewalLeadStatusUpdateRequest;
import io.swagger.model.RenewalLeadStatusUpdateResponse;

public interface RenewalLeadStatusUpdateApi {

	@POST
	 //@Path("/transactionId={transactionId}")
	 @Path("/")
	 @Consumes({ "application/json" })
	 @Produces({ "application/json" })
	 public RenewalLeadStatusUpdateResponse insertRenewalLeadStatus(RenewalLeadStatusUpdateRequest renewalLeadStatusUpdateRequest);
}
