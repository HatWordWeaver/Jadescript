package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class CostForMe implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.CostForMe");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof CostForMe) {
    	CostForMe o = (CostForMe) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public CostForMe() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_CostForMe() {
    return null;
  }
}
