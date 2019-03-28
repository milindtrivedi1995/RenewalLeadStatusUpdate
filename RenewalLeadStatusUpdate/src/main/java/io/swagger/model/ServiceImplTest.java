package io.swagger.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceImplTest {
	
	ServiceImpl service=new ServiceImpl();

	@Test
	public void test() {
		
		RenewalLeadStatusUpdateRequest request=new RenewalLeadStatusUpdateRequest();
		
		request.setCreateDate("2019-02-01");
		request.setPolicyNumber("1234");
		request.setRenewalDueDate("2018-02-01");
		request.setVymoId("abcdefgh");
		
		assertEquals("Success", service.insertLeadStatus(request).getStatus());
		assertEquals("Record updated successfully", service.insertLeadStatus(request).getFinalMessage());
	}
	
	@Test
	public void testTwo() {
		
		RenewalLeadStatusUpdateRequest request=new RenewalLeadStatusUpdateRequest();
		
		request.setCreateDate("2019-02-01");
		request.setPolicyNumber("1234");
		request.setRenewalDueDate(null);
		request.setVymoId("abcdefgh");
		
		assertEquals("Success", service.insertLeadStatus(request).getStatus());
		assertEquals("Record updated successfully", service.insertLeadStatus(request).getFinalMessage());
	}
	@Test
	public void testThree() {
		
		RenewalLeadStatusUpdateRequest request=new RenewalLeadStatusUpdateRequest();
		
		request.setCreateDate("2019-02-01");
		request.setPolicyNumber("1234");
		request.setRenewalDueDate(null);
		request.setVymoId("abcdefgh");
		
		assertEquals("Success", service.insertLeadStatus(request).getStatus());
		assertEquals("Record updated successfully", service.insertLeadStatus(request).getFinalMessage());
	}
	
	@Test
	public void testFour() {
		
		RenewalLeadStatusUpdateRequest request=new RenewalLeadStatusUpdateRequest();
		
		request.setCreateDate(null);
		request.setPolicyNumber(null);
		request.setRenewalDueDate(null);
		request.setVymoId(null);
		
		assertEquals("Success", service.insertLeadStatus(request).getStatus());
		assertEquals("Record updated successfully", service.insertLeadStatus(request).getFinalMessage());
	}

}
