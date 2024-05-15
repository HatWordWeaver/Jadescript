package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class Propose implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.Propose");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Propose) {
    	Propose o = (Propose) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public Propose() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_Propose() {
    return null;
  }
}
