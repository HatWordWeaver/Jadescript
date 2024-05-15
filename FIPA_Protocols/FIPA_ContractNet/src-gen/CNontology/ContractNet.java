package CNontology;

import jadescript.content.onto.Ontology;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.lang.Duration;
import jadescript.lang.Timestamp;

@SuppressWarnings("all")
public class ContractNet extends Ontology implements ContractNet_Vocabulary {
  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(ContractNet.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    }
  }

  private static Ontology _superOntology = null;

  private static Ontology __instance = new ContractNet();

  public static final String __NAME = "CNontology_ContractNet";

  public static Ontology getInstance() {
    return __instance;
  }

  public static operationReq operationReq(final Integer value1, final Integer value2, final String operation) {
    return new operationReq(value1, value2, operation);
  }

  public static Task Task(final operationReq taskOp, final Duration condition, final Integer conversation_id, final Timestamp reply_by) {
    return new Task(taskOp, condition, conversation_id, reply_by);
  }

  public static Request Request() {
    return new Request();
  }

  public static ParticipantCost ParticipantCost(final Integer computeCost, final Duration computeTime, final Integer conversation_id) {
    return new ParticipantCost(computeCost, computeTime, conversation_id);
  }

  public static CostForMe CostForMe() {
    return new CostForMe();
  }

  public static AcceptPropose AcceptPropose() {
    return new AcceptPropose();
  }

  public static TimeExpired TimeExpired() {
    return new TimeExpired();
  }

  public static NoTime NoTime(final Integer conversation_id) {
    return new NoTime(conversation_id);
  }

  public static Failure Failure(final Integer conversation_id) {
    return new Failure(conversation_id);
  }

  public static ResultOp ResultOp(final Integer result, final Integer conversation_id) {
    return new ResultOp(result, conversation_id);
  }

  public static Execute Execute() {
    return new Execute();
  }

  public static RefuseProposed RefuseProposed() {
    return new RefuseProposed();
  }

  public ContractNet() {
    super(__NAME, jadescript.content.onto.Ontology.getInstance(), new jade.content.onto.CFReflectiveIntrospector());
    try {
    	
    	
    	add(new jade.content.schema.ConceptSchema(operationReq), operationReq.class);
    	add(new jade.content.schema.AgentActionSchema(Task), Task.class);
    	add(new jade.content.schema.PredicateSchema(Request), Request.class);
    	add(new jade.content.schema.AgentActionSchema(ParticipantCost), ParticipantCost.class);
    	add(new jade.content.schema.PredicateSchema(CostForMe), CostForMe.class);
    	add(new jade.content.schema.PredicateSchema(AcceptPropose), AcceptPropose.class);
    	add(new jade.content.schema.PredicateSchema(TimeExpired), TimeExpired.class);
    	add(new jade.content.schema.PredicateSchema(NoTime), NoTime.class);
    	add(new jade.content.schema.PredicateSchema(Failure), Failure.class);
    	add(new jade.content.schema.PredicateSchema(ResultOp), ResultOp.class);
    	add(new jade.content.schema.PredicateSchema(Execute), Execute.class);
    	add(new jade.content.schema.PredicateSchema(RefuseProposed), RefuseProposed.class);
    	
    	
    	
    	
    	jade.content.schema.ConceptSchema _csoperationReq = (jade.content.schema.ConceptSchema) getSchema(operationReq);
    _csoperationReq.add(operationReq_value1, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _csoperationReq.add(operationReq_value2, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _csoperationReq.add(operationReq_operation, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.STRING));
    
    	jade.content.schema.AgentActionSchema _asTask = (jade.content.schema.AgentActionSchema) getSchema(Task);
    _asTask.add(Task_taskOp, (jade.content.schema.ConceptSchema) getSchema(operationReq));
    _asTask.add(Task_condition, (jade.content.schema.ConceptSchema) getSchema(jadescript.content.onto.Ontology.DURATION));
    _asTask.add(Task_conversation_id, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _asTask.add(Task_reply_by, (jade.content.schema.ConceptSchema) getSchema(jadescript.content.onto.Ontology.TIMESTAMP));
    
    	jade.content.schema.AgentActionSchema _asParticipantCost = (jade.content.schema.AgentActionSchema) getSchema(ParticipantCost);
    _asParticipantCost.add(ParticipantCost_computeCost, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _asParticipantCost.add(ParticipantCost_computeTime, (jade.content.schema.ConceptSchema) getSchema(jadescript.content.onto.Ontology.DURATION));
    _asParticipantCost.add(ParticipantCost_conversation_id, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.PredicateSchema _psNoTime = (jade.content.schema.PredicateSchema) getSchema(NoTime);
    _psNoTime.add(NoTime_conversation_id, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.PredicateSchema _psFailure = (jade.content.schema.PredicateSchema) getSchema(Failure);
    _psFailure.add(Failure_conversation_id, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.PredicateSchema _psResultOp = (jade.content.schema.PredicateSchema) getSchema(ResultOp);
    _psResultOp.add(ResultOp_result, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psResultOp.add(ResultOp_conversation_id, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    } catch (jade.content.onto.OntologyException e) {
    	e.printStackTrace();
    }
  }
}
