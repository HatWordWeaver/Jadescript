package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class TaskFailed implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.TaskFailed");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof TaskFailed) {
    	TaskFailed o = (TaskFailed) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public TaskFailed() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_TaskFailed() {
    return null;
  }
}
