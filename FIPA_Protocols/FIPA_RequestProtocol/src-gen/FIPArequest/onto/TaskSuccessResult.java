package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptPredicate;

@SuppressWarnings("all")
public class TaskSuccessResult implements JadescriptPredicate {
  private Integer result;

  public Integer getResult() {
    return this.result;
  }

  public void setResult(final Integer result) {
    this.result = result;
  }

  private Integer id_of_request;

  public Integer getId_of_request() {
    return this.id_of_request;
  }

  public void setId_of_request(final Integer id_of_request) {
    this.id_of_request = id_of_request;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.TaskSuccessResult");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getResult()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getId_of_request()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof TaskSuccessResult) {
    	TaskSuccessResult o = (TaskSuccessResult) obj;
    	return true && java.util.Objects.equals(this.getResult(), o.getResult()) && java.util.Objects.equals(this.getId_of_request(), o.getId_of_request());
    } else {
    	return super.equals(obj);
    }
  }

  public TaskSuccessResult() {
    {
    	this.setResult(0);
    	
    	this.setId_of_request(0);
    }
  }

  public TaskSuccessResult(final Integer result, final Integer id_of_request) {
    super();
    
    this.setResult(result);
    this.setId_of_request(id_of_request);
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_TaskSuccessResult(final Integer result, final Integer id_of_request) {
    return null;
  }
}
