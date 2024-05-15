package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class Partecipating implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.Partecipating");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Partecipating) {
    	Partecipating o = (Partecipating) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public Partecipating() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_Partecipating() {
    return null;
  }
}
