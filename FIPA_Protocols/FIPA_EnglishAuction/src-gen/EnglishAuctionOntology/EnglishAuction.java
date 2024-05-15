package EnglishAuctionOntology;

import jadescript.content.onto.Ontology;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.lang.Timestamp;

@SuppressWarnings("all")
public class EnglishAuction extends Ontology implements EnglishAuction_Vocabulary {
  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(EnglishAuction.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    }
  }

  private static Ontology _superOntology = null;

  private static Ontology __instance = new EnglishAuction();

  public static final String __NAME = "EnglishAuctionOntology_EnglishAuction";

  public static Ontology getInstance() {
    return __instance;
  }

  public static Partecipating Partecipating() {
    return new Partecipating();
  }

  public static StartAuction StartAuction() {
    return new StartAuction();
  }

  public static Propose Propose() {
    return new Propose();
  }

  public static AcceptPropose AcceptPropose() {
    return new AcceptPropose();
  }

  public static RefusePropose RefusePropose() {
    return new RefusePropose();
  }

  public static EndAuctionMessage EndAuctionMessage() {
    return new EndAuctionMessage();
  }

  public static WinCost WinCost(final Integer money) {
    return new WinCost(money);
  }

  public static NotEnoughMoney NotEnoughMoney() {
    return new NotEnoughMoney();
  }

  public static ObjectOnAuction ObjectOnAuction(final String name, final Integer code, final Integer required, final String winner, final Timestamp expireTime) {
    return new ObjectOnAuction(name, code, required, winner, expireTime);
  }

  public static AuctionTime AuctionTime(final ObjectOnAuction object) {
    return new AuctionTime(object);
  }

  public EnglishAuction() {
    super(__NAME, jadescript.content.onto.Ontology.getInstance(), new jade.content.onto.CFReflectiveIntrospector());
    try {
    	
    	
    	add(new jade.content.schema.PredicateSchema(Partecipating), Partecipating.class);
    	add(new jade.content.schema.PredicateSchema(StartAuction), StartAuction.class);
    	add(new jade.content.schema.PredicateSchema(Propose), Propose.class);
    	add(new jade.content.schema.PredicateSchema(AcceptPropose), AcceptPropose.class);
    	add(new jade.content.schema.PredicateSchema(RefusePropose), RefusePropose.class);
    	add(new jade.content.schema.PredicateSchema(EndAuctionMessage), EndAuctionMessage.class);
    	add(new jade.content.schema.AgentActionSchema(WinCost), WinCost.class);
    	add(new jade.content.schema.PredicateSchema(NotEnoughMoney), NotEnoughMoney.class);
    	add(new jade.content.schema.ConceptSchema(ObjectOnAuction), ObjectOnAuction.class);
    	add(new jade.content.schema.AgentActionSchema(AuctionTime), AuctionTime.class);
    	
    	
    	
    	
    	jade.content.schema.AgentActionSchema _asWinCost = (jade.content.schema.AgentActionSchema) getSchema(WinCost);
    _asWinCost.add(WinCost_money, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.ConceptSchema _csObjectOnAuction = (jade.content.schema.ConceptSchema) getSchema(ObjectOnAuction);
    _csObjectOnAuction.add(ObjectOnAuction_name, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.STRING));
    _csObjectOnAuction.add(ObjectOnAuction_code, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _csObjectOnAuction.add(ObjectOnAuction_required, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _csObjectOnAuction.add(ObjectOnAuction_winner, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.STRING));
    _csObjectOnAuction.add(ObjectOnAuction_expireTime, (jade.content.schema.ConceptSchema) getSchema(jadescript.content.onto.Ontology.TIMESTAMP));
    
    	jade.content.schema.AgentActionSchema _asAuctionTime = (jade.content.schema.AgentActionSchema) getSchema(AuctionTime);
    _asAuctionTime.add(AuctionTime_object, (jade.content.schema.ConceptSchema) getSchema(ObjectOnAuction));
    
    } catch (jade.content.onto.OntologyException e) {
    	e.printStackTrace();
    }
  }
}
