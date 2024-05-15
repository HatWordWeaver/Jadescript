package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class Request implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.Request");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Request) {
    	Request o = (Request) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public Request() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_Request() {
    return null;
  }
}
