package FIPArequest.onto;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class Accepted implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("FIPArequest.onto.Accepted");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Accepted) {
    	Accepted o = (Accepted) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public Accepted() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return FIPArequest.onto.OntologyRequest.getInstance();
  }

  private FIPArequest.onto.OntologyRequest __metadata_FIPArequest_onto_Accepted() {
    return null;
  }
}
