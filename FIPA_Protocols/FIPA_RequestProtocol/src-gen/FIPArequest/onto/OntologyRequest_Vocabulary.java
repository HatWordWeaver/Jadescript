package FIPArequest.onto;

import jadescript.content.onto.Ontology_Vocabulary;

@SuppressWarnings("all")
public interface OntologyRequest_Vocabulary extends Ontology_Vocabulary {
  public static final String compute_request = "compute_request";

  public static final String compute_request_agreed = "agreed";

  public static final String compute_request_refused = "refused";

  public static final String compute_request_notification_necessary = "notification_necessary";

  public static final String compute_request_id_of_message = "id_of_message";

  public static final String operation = "operation";

  public static final String operation_value1 = "value1";

  public static final String operation_value2 = "value2";

  public static final String operation_operator = "operator";

  public static final String send_request = "send_request";

  public static final String send_request_data = "data";

  public static final String send_request_operation_request = "operation_request";

  public static final String request_accepted = "request_accepted";

  public static final String request_accepted_id_of_request = "id_of_request";

  public static final String request_accepted_status = "status";

  public static final String NotAccepted = "NotAccepted";

  public static final String Accepted = "Accepted";

  public static final String TaskFailed = "TaskFailed";

  public static final String TaskSuccess = "TaskSuccess";

  public static final String TaskSuccess_id_of_request = "id_of_request";

  public static final String TaskSuccessResult = "TaskSuccessResult";

  public static final String TaskSuccessResult_result = "result";

  public static final String TaskSuccessResult_id_of_request = "id_of_request";

  public static final String Acknowledge = "Acknowledge";

  public static final String CancelAccepted = "CancelAccepted";

  public static final String CancelAccepted_id_of_request = "id_of_request";

  public static final String CancelNotAccepted = "CancelNotAccepted";
}
