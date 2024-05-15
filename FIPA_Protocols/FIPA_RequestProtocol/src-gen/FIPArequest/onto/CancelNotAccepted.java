package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class CancelNotAccepted implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.CancelNotAccepted");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof CancelNotAccepted) {
    	CancelNotAccepted o = (CancelNotAccepted) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public CancelNotAccepted() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_CancelNotAccepted() {
    return null;
  }
}
