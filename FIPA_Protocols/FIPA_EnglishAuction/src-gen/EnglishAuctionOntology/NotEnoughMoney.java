package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class NotEnoughMoney implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.NotEnoughMoney");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof NotEnoughMoney) {
    	NotEnoughMoney o = (NotEnoughMoney) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public NotEnoughMoney() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_NotEnoughMoney() {
    return null;
  }
}
