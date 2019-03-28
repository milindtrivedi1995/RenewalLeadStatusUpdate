package io.swagger.model;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
@XmlRootElement(name="renewalLeadStatusUpdateResponse")
public class RenewalLeadStatusUpdateResponse  {
  
  
  private String status = null;

  
  private String finalMessage = null;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RenewalLeadStatusUpdateResponse status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getFinalMessage() {
    return finalMessage;
  }

  public void setFinalMessage(String finalMessage) {
    this.finalMessage = finalMessage;
  }

  public RenewalLeadStatusUpdateResponse finalMessage(String finalMessage) {
    this.finalMessage = finalMessage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalLeadStatusUpdateResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    finalMessage: ").append(toIndentedString(finalMessage)).append("\n");
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

