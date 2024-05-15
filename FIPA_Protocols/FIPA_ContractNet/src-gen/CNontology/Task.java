package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;
import jadescript.lang.Duration;
import jadescript.lang.Timestamp;

@SuppressWarnings("all")
public class Task implements JadescriptAction {
  private operationReq taskOp;

  public operationReq getTaskOp() {
    return this.taskOp;
  }

  public void setTaskOp(final operationReq taskOp) {
    this.taskOp = taskOp;
  }

  private Duration condition;

  public Duration getCondition() {
    return this.condition;
  }

  public void setCondition(final Duration condition) {
    this.condition = condition;
  }

  private Integer conversation_id;

  public Integer getConversation_id() {
    return this.conversation_id;
  }

  public void setConversation_id(final Integer conversation_id) {
    this.conversation_id = conversation_id;
  }

  private Timestamp reply_by;

  public Timestamp getReply_by() {
    return this.reply_by;
  }

  public void setReply_by(final Timestamp reply_by) {
    this.reply_by = reply_by;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.Task");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getTaskOp()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getCondition()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getConversation_id()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getReply_by()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Task) {
    	Task o = (Task) obj;
    	return true && java.util.Objects.equals(this.getTaskOp(), o.getTaskOp()) && java.util.Objects.equals(this.getCondition(), o.getCondition()) && java.util.Objects.equals(this.getConversation_id(), o.getConversation_id()) && java.util.Objects.equals(this.getReply_by(), o.getReply_by());
    } else {
    	return super.equals(obj);
    }
  }

  public Task() {
    {
    	this.setTaskOp(new CNontology.operationReq());
    	
    	this.setCondition(new jadescript.lang.Duration());
    	
    	this.setConversation_id(0);
    	
    	this.setReply_by(jadescript.lang.Timestamp.now());
    }
  }

  public Task(final operationReq taskOp, final Duration condition, final Integer conversation_id, final Timestamp reply_by) {
    super();
    
    this.setTaskOp(taskOp);
    this.setCondition(condition);
    this.setConversation_id(conversation_id);
    this.setReply_by(reply_by);
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_Task(final operationReq taskOp, final Duration condition, final Integer conversation_id, final Timestamp reply_by) {
    return null;
  }
}
