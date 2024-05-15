package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptPredicate;

@SuppressWarnings("all")
public class NoTime implements JadescriptPredicate {
  private Integer conversation_id;

  public Integer getConversation_id() {
    return this.conversation_id;
  }

  public void setConversation_id(final Integer conversation_id) {
    this.conversation_id = conversation_id;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.NoTime");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getConversation_id()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof NoTime) {
    	NoTime o = (NoTime) obj;
    	return true && java.util.Objects.equals(this.getConversation_id(), o.getConversation_id());
    } else {
    	return super.equals(obj);
    }
  }

  public NoTime() {
    {
    	this.setConversation_id(0);
    }
  }

  public NoTime(final Integer conversation_id) {
    super();
    
    this.setConversation_id(conversation_id);
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_NoTime(final Integer conversation_id) {
    return null;
  }
}
