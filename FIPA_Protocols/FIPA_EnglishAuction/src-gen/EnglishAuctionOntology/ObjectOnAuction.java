package EnglishAuctionOntology;

import jade.content.onto.Ontology;
import jadescript.content.JadescriptConcept;
import jadescript.lang.Timestamp;

@SuppressWarnings("all")
public class ObjectOnAuction implements JadescriptConcept {
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  private Integer code;

  public Integer getCode() {
    return this.code;
  }

  public void setCode(final Integer code) {
    this.code = code;
  }

  private Integer required;

  public Integer getRequired() {
    return this.required;
  }

  public void setRequired(final Integer required) {
    this.required = required;
  }

  private String winner;

  public String getWinner() {
    return this.winner;
  }

  public void setWinner(final String winner) {
    this.winner = winner;
  }

  private Timestamp expireTime;

  public Timestamp getExpireTime() {
    return this.expireTime;
  }

  public void setExpireTime(final Timestamp expireTime) {
    this.expireTime = expireTime;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("EnglishAuctionOntology.ObjectOnAuction");
    _sb.append("(");
    _sb.append("\"" + java.lang.String.valueOf(getName()) + "\"");
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getCode()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getRequired()));
    _sb.append(", ");
    _sb.append("\"" + java.lang.String.valueOf(getWinner()) + "\"");
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getExpireTime()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof ObjectOnAuction) {
    	ObjectOnAuction o = (ObjectOnAuction) obj;
    	return true && java.util.Objects.equals(this.getName(), o.getName()) && java.util.Objects.equals(this.getCode(), o.getCode()) && java.util.Objects.equals(this.getRequired(), o.getRequired()) && java.util.Objects.equals(this.getWinner(), o.getWinner()) && java.util.Objects.equals(this.getExpireTime(), o.getExpireTime());
    } else {
    	return super.equals(obj);
    }
  }

  public ObjectOnAuction() {
    {
    	this.setName("");
    	
    	this.setCode(0);
    	
    	this.setRequired(0);
    	
    	this.setWinner("");
    	
    	this.setExpireTime(jadescript.lang.Timestamp.now());
    }
  }

  public ObjectOnAuction(final String name, final Integer code, final Integer required, final String winner, final Timestamp expireTime) {
    super();
    
    this.setName(name);
    this.setCode(code);
    this.setRequired(required);
    this.setWinner(winner);
    this.setExpireTime(expireTime);
  }

  public Ontology __getDeclaringOntology() {
    return EnglishAuctionOntology.EnglishAuction.getInstance();
  }

  private EnglishAuctionOntology.EnglishAuction __metadata_EnglishAuctionOntology_ObjectOnAuction(final String name, final Integer code, final Integer required, final String winner, final Timestamp expireTime) {
    return null;
  }
}
