package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class Execute implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.Execute");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Execute) {
    	Execute o = (Execute) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public Execute() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_Execute() {
    return null;
  }
}
