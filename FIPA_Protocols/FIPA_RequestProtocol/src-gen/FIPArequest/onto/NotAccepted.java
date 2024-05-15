package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class NotAccepted implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.NotAccepted");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof NotAccepted) {
    	NotAccepted o = (NotAccepted) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public NotAccepted() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_NotAccepted() {
    return null;
  }
}
