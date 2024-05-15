package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class send_request implements JadescriptAction {
  private compute_request data;

  public compute_request getData() {
    return this.data;
  }

  public void setData(final compute_request data) {
    this.data = data;
  }

  private operation operation_request;

  public operation getOperation_request() {
    return this.operation_request;
  }

  public void setOperation_request(final operation operation_request) {
    this.operation_request = operation_request;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.send_request");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getData()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getOperation_request()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof send_request) {
    	send_request o = (send_request) obj;
    	return true && java.util.Objects.equals(this.getData(), o.getData()) && java.util.Objects.equals(this.getOperation_request(), o.getOperation_request());
    } else {
    	return super.equals(obj);
    }
  }

  public send_request() {
    {
    	this.setData(new FIPArequest.onto.compute_request());
    	
    	this.setOperation_request(new FIPArequest.onto.operation());
    }
  }

  public send_request(final compute_request data, final operation operation_request) {
    super();
    
    this.setData(data);
    this.setOperation_request(operation_request);
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_send_request(final compute_request data, final operation operation_request) {
    return null;
  }
}
