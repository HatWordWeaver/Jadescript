package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;
import jadescript.lang.Duration;

@SuppressWarnings("all")
public class ParticipantCost implements JadescriptAction {
  private Integer computeCost;

  public Integer getComputeCost() {
    return this.computeCost;
  }

  public void setComputeCost(final Integer computeCost) {
    this.computeCost = computeCost;
  }

  private Duration computeTime;

  public Duration getComputeTime() {
    return this.computeTime;
  }

  public void setComputeTime(final Duration computeTime) {
    this.computeTime = computeTime;
  }

  private Integer conversation_id;

  public Integer getConversation_id() {
    return this.conversation_id;
  }

  public void setConversation_id(final Integer conversation_id) {
    this.conversation_id = conversation_id;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.ParticipantCost");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getComputeCost()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getComputeTime()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getConversation_id()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof ParticipantCost) {
    	ParticipantCost o = (ParticipantCost) obj;
    	return true && java.util.Objects.equals(this.getComputeCost(), o.getComputeCost()) && java.util.Objects.equals(this.getComputeTime(), o.getComputeTime()) && java.util.Objects.equals(this.getConversation_id(), o.getConversation_id());
    } else {
    	return super.equals(obj);
    }
  }

  public ParticipantCost() {
    {
    	this.setComputeCost(0);
    	
    	this.setComputeTime(new jadescript.lang.Duration());
    	
    	this.setConversation_id(0);
    }
  }

  public ParticipantCost(final Integer computeCost, final Duration computeTime, final Integer conversation_id) {
    super();
    
    this.setComputeCost(computeCost);
    this.setComputeTime(computeTime);
    this.setConversation_id(conversation_id);
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_ParticipantCost(final Integer computeCost, final Duration computeTime, final Integer conversation_id) {
    return null;
  }
}
