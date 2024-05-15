package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class operationReq implements JadescriptConcept {
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

  private String operation;

  public String getOperation() {
    return this.operation;
  }

  public void setOperation(final String operation) {
    this.operation = operation;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.operationReq");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getValue1()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getValue2()));
    _sb.append(", ");
    _sb.append("\"" + java.lang.String.valueOf(getOperation()) + "\"");
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof operationReq) {
    	operationReq o = (operationReq) obj;
    	return true && java.util.Objects.equals(this.getValue1(), o.getValue1()) && java.util.Objects.equals(this.getValue2(), o.getValue2()) && java.util.Objects.equals(this.getOperation(), o.getOperation());
    } else {
    	return super.equals(obj);
    }
  }

  public operationReq() {
    {
    	this.setValue1(0);
    	
    	this.setValue2(0);
    	
    	this.setOperation("");
    }
  }

  public operationReq(final Integer value1, final Integer value2, final String operation) {
    super();
    
    this.setValue1(value1);
    this.setValue2(value2);
    this.setOperation(operation);
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_operationReq(final Integer value1, final Integer value2, final String operation) {
    return null;
  }
}
