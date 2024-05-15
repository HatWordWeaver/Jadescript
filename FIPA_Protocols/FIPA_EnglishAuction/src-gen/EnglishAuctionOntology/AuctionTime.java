package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class AuctionTime implements JadescriptAction {
  private ObjectOnAuction object;

  public ObjectOnAuction getObject() {
    return this.object;
  }

  public void setObject(final ObjectOnAuction object) {
    this.object = object;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.AuctionTime");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getObject()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof AuctionTime) {
    	AuctionTime o = (AuctionTime) obj;
    	return true && java.util.Objects.equals(this.getObject(), o.getObject());
    } else {
    	return super.equals(obj);
    }
  }

  public AuctionTime() {
    {
    	this.setObject(new EnglishAuctionOntology.ObjectOnAuction());
    }
  }

  public AuctionTime(final ObjectOnAuction object) {
    super();
    
    this.setObject(object);
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_AuctionTime(final ObjectOnAuction object) {
    return null;
  }
}
