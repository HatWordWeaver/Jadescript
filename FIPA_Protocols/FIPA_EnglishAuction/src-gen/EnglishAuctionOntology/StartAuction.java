package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class StartAuction implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.StartAuction");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof StartAuction) {
    	StartAuction o = (StartAuction) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public StartAuction() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_StartAuction() {
    return null;
  }
}
