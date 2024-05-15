package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class EndAuctionMessage implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.EndAuctionMessage");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof EndAuctionMessage) {
    	EndAuctionMessage o = (EndAuctionMessage) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public EndAuctionMessage() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_EndAuctionMessage() {
    return null;
  }
}
