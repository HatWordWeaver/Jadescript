package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class RefuseProposed implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.RefuseProposed");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof RefuseProposed) {
    	RefuseProposed o = (RefuseProposed) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public RefuseProposed() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_RefuseProposed() {
    return null;
  }
}
