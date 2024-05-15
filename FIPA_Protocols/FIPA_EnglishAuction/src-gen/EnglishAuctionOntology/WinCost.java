package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class WinCost implements JadescriptAction {
  private Integer money;

  public Integer getMoney() {
    return this.money;
  }

  public void setMoney(final Integer money) {
    this.money = money;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.WinCost");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getMoney()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof WinCost) {
    	WinCost o = (WinCost) obj;
    	return true && java.util.Objects.equals(this.getMoney(), o.getMoney());
    } else {
    	return super.equals(obj);
    }
  }

  public WinCost() {
    {
    	this.setMoney(0);
    }
  }

  public WinCost(final Integer money) {
    super();
    
    this.setMoney(money);
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_WinCost(final Integer money) {
    return null;
  }
}
