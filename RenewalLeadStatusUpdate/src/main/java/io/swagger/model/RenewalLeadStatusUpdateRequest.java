package io.swagger.model;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
@XmlRootElement(name="renewalLeadStatusUpdateRequest")
public class RenewalLeadStatusUpdateRequest  {
  
  
  private String vymoId = null;

  
  private String policyNumber = null;

  
  private String renewalDueDate = null;

  
  private String createDate = null;
 /**
   * Get vymoId
   * @return vymoId
  **/
  @JsonProperty("vymoId")
  public String getVymoId() {
    return vymoId;
  }

  public void setVymoId(String vymoId) {
    this.vymoId = vymoId;
  }

  public RenewalLeadStatusUpdateRequest vymoId(String vymoId) {
    this.vymoId = vymoId;
    return this;
  }

 /**
   * Get policyNumber
   * @return policyNumber
  **/
  @JsonProperty("policyNumber")
  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public RenewalLeadStatusUpdateRequest policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

 /**
   * Get renewalDueDate
   * @return renewalDueDate
  **/
  @JsonProperty("renewalDueDate")
  public String getRenewalDueDate() {
    return renewalDueDate;
  }

  public void setRenewalDueDate(String renewalDueDate) {
    this.renewalDueDate = renewalDueDate;
  }

  public RenewalLeadStatusUpdateRequest renewalDueDate(String renewalDueDate) {
    this.renewalDueDate = renewalDueDate;
    return this;
  }

 /**
   * Get createDate
   * @return createDate
  **/
  @JsonProperty("createDate")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public RenewalLeadStatusUpdateRequest createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalLeadStatusUpdateRequest {\n");
    
    sb.append("    vymoId: ").append(toIndentedString(vymoId)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    renewalDueDate: ").append(toIndentedString(renewalDueDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

