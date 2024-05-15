package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptPredicate;

@SuppressWarnings("all")
public class CancelAccepted implements JadescriptPredicate {
  private Integer id_of_request;

  public Integer getId_of_request() {
    return this.id_of_request;
  }

  public void setId_of_request(final Integer id_of_request) {
    this.id_of_request = id_of_request;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.CancelAccepted");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getId_of_request()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof CancelAccepted) {
    	CancelAccepted o = (CancelAccepted) obj;
    	return true && java.util.Objects.equals(this.getId_of_request(), o.getId_of_request());
    } else {
    	return super.equals(obj);
    }
  }

  public CancelAccepted() {
    {
    	this.setId_of_request(0);
    }
  }

  public CancelAccepted(final Integer id_of_request) {
    super();
    
    this.setId_of_request(id_of_request);
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_CancelAccepted(final Integer id_of_request) {
    return null;
  }
}
