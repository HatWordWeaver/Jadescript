package CNontology;

import jadescript.content.onto.Ontology_Vocabulary;

@SuppressWarnings("all")
public interface ContractNet_Vocabulary extends Ontology_Vocabulary {
  public static final String operationReq = "operationReq";

  public static final String operationReq_value1 = "value1";

  public static final String operationReq_value2 = "value2";

  public static final String operationReq_operation = "operation";

  public static final String Task = "Task";

  public static final String Task_taskOp = "taskOp";

  public static final String Task_condition = "condition";

  public static final String Task_conversation_id = "conversation_id";

  public static final String Task_reply_by = "reply_by";

  public static final String Request = "Request";

  public static final String ParticipantCost = "ParticipantCost";

  public static final String ParticipantCost_computeCost = "computeCost";

  public static final String ParticipantCost_computeTime = "computeTime";

  public static final String ParticipantCost_conversation_id = "conversation_id";

  public static final String CostForMe = "CostForMe";

  public static final String AcceptPropose = "AcceptPropose";

  public static final String TimeExpired = "TimeExpired";

  public static final String NoTime = "NoTime";

  public static final String NoTime_conversation_id = "conversation_id";

  public static final String Failure = "Failure";

  public static final String Failure_conversation_id = "conversation_id";

  public static final String ResultOp = "ResultOp";

  public static final String ResultOp_result = "result";

  public static final String ResultOp_conversation_id = "conversation_id";

  public static final String Execute = "Execute";

  public static final String RefuseProposed = "RefuseProposed";
}
