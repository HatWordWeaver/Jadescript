package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class Acknowledge implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.Acknowledge");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Acknowledge) {
    	Acknowledge o = (Acknowledge) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public Acknowledge() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_Acknowledge() {
    return null;
  }
}
