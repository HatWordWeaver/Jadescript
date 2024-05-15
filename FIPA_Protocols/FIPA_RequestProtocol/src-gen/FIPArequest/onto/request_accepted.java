package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptPredicate;

@SuppressWarnings("all")
public class request_accepted implements JadescriptPredicate {
  private Integer id_of_request;

  public Integer getId_of_request() {
    return this.id_of_request;
  }

  public void setId_of_request(final Integer id_of_request) {
    this.id_of_request = id_of_request;
  }

  private Boolean status;

  public Boolean getStatus() {
    return this.status;
  }

  public void setStatus(final Boolean status) {
    this.status = status;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.request_accepted");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getId_of_request()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getStatus()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof request_accepted) {
    	request_accepted o = (request_accepted) obj;
    	return true && java.util.Objects.equals(this.getId_of_request(), o.getId_of_request()) && java.util.Objects.equals(this.getStatus(), o.getStatus());
    } else {
    	return super.equals(obj);
    }
  }

  public request_accepted() {
    {
    	this.setId_of_request(0);
    	
    	this.setStatus(false);
    }
  }

  public request_accepted(final Integer id_of_request, final Boolean status) {
    super();
    
    this.setId_of_request(id_of_request);
    this.setStatus(status);
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_request_accepted(final Integer id_of_request, final Boolean status) {
    return null;
  }
}
