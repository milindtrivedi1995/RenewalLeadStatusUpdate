package io.swagger.model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.sql.DataSource;
import org.springframework.context.support.StaticApplicationContext;
import oracle.jdbc.pool.OracleDataSource;
import io.swagger.model.RenewalLeadStatusUpdateResponse;

public class ServiceImpl {

	public static DataSource getOracleDataSource() {
		OracleDataSource oracleDS = null;
		
		System.out.println("Inside ");
		try {
			oracleDS = new OracleDataSource();
			/*UAT*/
			oracleDS.setURL("jdbc:oracle:thin:@//10.151.35.12:1521/mipdb01");
			/*PROD*/
			//oracleDS.setURL("jdbc:oracle:thin:@//10.151.33.17:1521/ODSPDB");
			oracleDS.setUser("mi");
			oracleDS.setPassword("mi");

			System.out.println("Connection Established Successfully");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return oracleDS;
	}

	public static RenewalLeadStatusUpdateResponse insertLeadStatus(RenewalLeadStatusUpdateRequest request) {

		String query = null;
		RenewalLeadStatusUpdateResponse response = new RenewalLeadStatusUpdateResponse();

		try {

			DataSource ds = ServiceImpl.getOracleDataSource();
			Connection connection = null;
			ResultSet rs = null;
			Statement smt = null;
			StringBuilder sb=new StringBuilder();

			
			
			try {
				connection = ds.getConnection();
				smt = connection.createStatement();
				
							SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd",java.util.Locale.getDefault());
						    SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy",java.util.Locale.getDefault());
						    Date date;
						    String temp1=null,temp2=null;
						    
						    sb.append("insert into VYMO_RENEWAL_LEAD_DTLS values('"+request.getVymoId()+"','"+request.getPolicyNumber()+"',");
							
								if(request.getRenewalDueDate()==null)
									temp1=null;
								else
								{
									date = format1.parse(request.getRenewalDueDate());
								     temp1 = format2.format(date);
								}
								date = format1.parse(request.getCreateDate());
						        temp2 = format2.format(date);
						        
						        if(temp1==null)
						        sb.append(temp1+",'"+temp2+"')");
						        else
						        	sb.append("'"+temp1+"','"+temp2+"')");
							
							System.out.println(sb.toString());
							int status=smt.executeUpdate(sb.toString());
							
							if(status>0)
							{
								response.setStatus("Success");
								response.setFinalMessage("Record updated successfully");
							}
							
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				response.setFinalMessage("Provider service is down");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setFinalMessage("Provider service is down");
		}
		return response;

	}

}
