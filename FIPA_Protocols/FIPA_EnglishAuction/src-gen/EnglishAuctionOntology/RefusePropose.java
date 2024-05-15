package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class RefusePropose implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.RefusePropose");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof RefusePropose) {
    	RefusePropose o = (RefusePropose) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public RefusePropose() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_RefusePropose() {
    return null;
  }
}
