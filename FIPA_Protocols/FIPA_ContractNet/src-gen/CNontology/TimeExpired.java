package CNontology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class TimeExpired implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("CNontology.TimeExpired");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof TimeExpired) {
    	TimeExpired o = (TimeExpired) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public TimeExpired() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return CNontology.ContractNet.getInstance();
  }

  private ContractNet __metadata_CNontology_TimeExpired() {
    return null;
  }
}
