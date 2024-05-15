package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class compute_request implements JadescriptConcept {
  private Boolean agreed;

  public Boolean getAgreed() {
    return this.agreed;
  }

  public void setAgreed(final Boolean agreed) {
    this.agreed = agreed;
  }

  private Boolean refused;

  public Boolean getRefused() {
    return this.refused;
  }

  public void setRefused(final Boolean refused) {
    this.refused = refused;
  }

  private Boolean notification_necessary;

  public Boolean getNotification_necessary() {
    return this.notification_necessary;
  }

  public void setNotification_necessary(final Boolean notification_necessary) {
    this.notification_necessary = notification_necessary;
  }

  private Integer id_of_message;

  public Integer getId_of_message() {
    return this.id_of_message;
  }

  public void setId_of_message(final Integer id_of_message) {
    this.id_of_message = id_of_message;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.compute_request");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getAgreed()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getRefused()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getNotification_necessary()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getId_of_message()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof compute_request) {
    	compute_request o = (compute_request) obj;
    	return true && java.util.Objects.equals(this.getAgreed(), o.getAgreed()) && java.util.Objects.equals(this.getRefused(), o.getRefused()) && java.util.Objects.equals(this.getNotification_necessary(), o.getNotification_necessary()) && java.util.Objects.equals(this.getId_of_message(), o.getId_of_message());
    } else {
    	return super.equals(obj);
    }
  }

  public compute_request() {
    {
    	this.setAgreed(false);
    	
    	this.setRefused(false);
    	
    	this.setNotification_necessary(false);
    	
    	this.setId_of_message(0);
    }
  }

  public compute_request(final Boolean agreed, final Boolean refused, final Boolean notification_necessary, final Integer id_of_message) {
    super();
    
    this.setAgreed(agreed);
    this.setRefused(refused);
    this.setNotification_necessary(notification_necessary);
    this.setId_of_message(id_of_message);
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_compute_request(final Boolean agreed, final Boolean refused, final Boolean notification_necessary, final Integer id_of_message) {
    return null;
  }
}
