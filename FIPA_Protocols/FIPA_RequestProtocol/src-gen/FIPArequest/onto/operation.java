package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class operation implements JadescriptConcept {
  private Integer value1;

  public Integer getValue1() {
    return this.value1;
  }

  public void setValue1(final Integer value1) {
    this.value1 = value1;
  }

  private Integer value2;

  public Integer getValue2() {
    return this.value2;
  }

  public void setValue2(final Integer value2) {
    this.value2 = value2;
  }

  private String operator;

  public String getOperator() {
    return this.operator;
  }

  public void setOperator(final String operator) {
    this.operator = operator;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.operation");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getValue1()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getValue2()));
    _sb.append(", ");
    _sb.append("\"" + java.lang.String.valueOf(getOperator()) + "\"");
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof operation) {
    	operation o = (operation) obj;
    	return true && java.util.Objects.equals(this.getValue1(), o.getValue1()) && java.util.Objects.equals(this.getValue2(), o.getValue2()) && java.util.Objects.equals(this.getOperator(), o.getOperator());
    } else {
    	return super.equals(obj);
    }
  }

  public operation() {
    {
    	this.setValue1(0);
    	
    	this.setValue2(0);
    	
    	this.setOperator("");
    }
  }

  public operation(final Integer value1, final Integer value2, final String operator) {
    super();
    
    this.setValue1(value1);
    this.setValue2(value2);
    this.setOperator(operator);
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_operation(final Integer value1, final Integer value2, final String operator) {
    return null;
  }
}
