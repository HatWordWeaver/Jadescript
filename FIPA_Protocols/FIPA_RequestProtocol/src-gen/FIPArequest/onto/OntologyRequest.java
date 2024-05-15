package FIPArequest.onto;

import jadescript.content.onto.Ontology;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;

@SuppressWarnings("all")
public class OntologyRequest extends Ontology implements OntologyRequest_Vocabulary {
  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(OntologyRequest.this);
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

  private static Ontology __instance = new OntologyRequest();

  public static final String __NAME = "FIPArequest_onto_OntologyRequest";

  public static Ontology getInstance() {
    return __instance;
  }

  public static compute_request compute_request(final Boolean agreed, final Boolean refused, final Boolean notification_necessary, final Integer id_of_message) {
    return new compute_request(agreed, refused, notification_necessary, id_of_message);
  }

  public static operation operation(final Integer value1, final Integer value2, final String operator) {
    return new operation(value1, value2, operator);
  }

  public static send_request send_request(final compute_request data, final operation operation_request) {
    return new send_request(data, operation_request);
  }

  public static request_accepted request_accepted(final Integer id_of_request, final Boolean status) {
    return new request_accepted(id_of_request, status);
  }

  public static NotAccepted NotAccepted() {
    return new NotAccepted();
  }

  public static Accepted Accepted() {
    return new Accepted();
  }

  public static TaskFailed TaskFailed() {
    return new TaskFailed();
  }

  public static TaskSuccess TaskSuccess(final Integer id_of_request) {
    return new TaskSuccess(id_of_request);
  }

  public static TaskSuccessResult TaskSuccessResult(final Integer result, final Integer id_of_request) {
    return new TaskSuccessResult(result, id_of_request);
  }

  public static Acknowledge Acknowledge() {
    return new Acknowledge();
  }

  public static CancelAccepted CancelAccepted(final Integer id_of_request) {
    return new CancelAccepted(id_of_request);
  }

  public static CancelNotAccepted CancelNotAccepted() {
    return new CancelNotAccepted();
  }

  public OntologyRequest() {
    super(__NAME, jadescript.content.onto.Ontology.getInstance(), new jade.content.onto.CFReflectiveIntrospector());
    try {
    	
    	
    	add(new jade.content.schema.ConceptSchema(compute_request), compute_request.class);
    	add(new jade.content.schema.ConceptSchema(operation), operation.class);
    	add(new jade.content.schema.AgentActionSchema(send_request), send_request.class);
    	add(new jade.content.schema.PredicateSchema(request_accepted), request_accepted.class);
    	add(new jade.content.schema.PredicateSchema(NotAccepted), NotAccepted.class);
    	add(new jade.content.schema.PredicateSchema(Accepted), Accepted.class);
    	add(new jade.content.schema.PredicateSchema(TaskFailed), TaskFailed.class);
    	add(new jade.content.schema.PredicateSchema(TaskSuccess), TaskSuccess.class);
    	add(new jade.content.schema.PredicateSchema(TaskSuccessResult), TaskSuccessResult.class);
    	add(new jade.content.schema.PredicateSchema(Acknowledge), Acknowledge.class);
    	add(new jade.content.schema.PredicateSchema(CancelAccepted), CancelAccepted.class);
    	add(new jade.content.schema.PredicateSchema(CancelNotAccepted), CancelNotAccepted.class);
    	
    	
    	
    	
    	jade.content.schema.ConceptSchema _cscompute_request = (jade.content.schema.ConceptSchema) getSchema(compute_request);
    _cscompute_request.add(compute_request_agreed, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    _cscompute_request.add(compute_request_refused, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    _cscompute_request.add(compute_request_notification_necessary, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    _cscompute_request.add(compute_request_id_of_message, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.ConceptSchema _csoperation = (jade.content.schema.ConceptSchema) getSchema(operation);
    _csoperation.add(operation_value1, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _csoperation.add(operation_value2, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _csoperation.add(operation_operator, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.STRING));
    
    	jade.content.schema.AgentActionSchema _assend_request = (jade.content.schema.AgentActionSchema) getSchema(send_request);
    _assend_request.add(send_request_data, (jade.content.schema.ConceptSchema) getSchema(compute_request));
    _assend_request.add(send_request_operation_request, (jade.content.schema.ConceptSchema) getSchema(operation));
    
    	jade.content.schema.PredicateSchema _psrequest_accepted = (jade.content.schema.PredicateSchema) getSchema(request_accepted);
    _psrequest_accepted.add(request_accepted_id_of_request, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psrequest_accepted.add(request_accepted_status, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    
    	jade.content.schema.PredicateSchema _psTaskSuccess = (jade.content.schema.PredicateSchema) getSchema(TaskSuccess);
    _psTaskSuccess.add(TaskSuccess_id_of_request, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.PredicateSchema _psTaskSuccessResult = (jade.content.schema.PredicateSchema) getSchema(TaskSuccessResult);
    _psTaskSuccessResult.add(TaskSuccessResult_result, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psTaskSuccessResult.add(TaskSuccessResult_id_of_request, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.PredicateSchema _psCancelAccepted = (jade.content.schema.PredicateSchema) getSchema(CancelAccepted);
    _psCancelAccepted.add(CancelAccepted_id_of_request, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    } catch (jade.content.onto.OntologyException e) {
    	e.printStackTrace();
    }
  }
}
