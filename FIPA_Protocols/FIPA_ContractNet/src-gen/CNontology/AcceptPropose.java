package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class AcceptPropose implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.AcceptPropose");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof AcceptPropose) {
    	AcceptPropose o = (AcceptPropose) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public AcceptPropose() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_AcceptPropose() {
    return null;
  }
}
