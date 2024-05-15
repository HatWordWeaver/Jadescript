package agents;

import EnglishAuctionOntology.EnglishAuction;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jadescript.content.JadescriptProposition;
import jadescript.core.Agent;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.JadescriptAgentController;
import jadescript.java.SideEffectsFlag;
import jadescript.lang.Duration;
import jadescript.util.JadescriptSet;

@SuppressWarnings("all")
public class Auctioneer extends Agent {
  private Auctioneer __theAgent = (agents.Auctioneer)/*Used as metadata*/null;

  private AgentEnv<Auctioneer, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public EnglishAuction __ontology__EnglishAuctionOntology_EnglishAuction = (EnglishAuctionOntology.EnglishAuction) EnglishAuctionOntology.EnglishAuction.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(EnglishAuctionOntology.EnglishAuction.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected WaitBidders waiting = null;

  public void setWaiting(final WaitBidders waiting) {
    this.waiting = waiting;
  }

  public WaitBidders getWaiting() {
    return this.waiting;
  }

  protected DecideAuction decideAuction = null;

  public void setDecideAuction(final DecideAuction decideAuction) {
    this.decideAuction = decideAuction;
  }

  public DecideAuction getDecideAuction() {
    return this.decideAuction;
  }

  protected EndAuction endAuction = null;

  public void setEndAuction(final EndAuction endAuction) {
    this.endAuction = endAuction;
  }

  public EndAuction getEndAuction() {
    return this.endAuction;
  }

  protected TalkToWinner talkToWinner = null;

  public void setTalkToWinner(final TalkToWinner talkToWinner) {
    this.talkToWinner = talkToWinner;
  }

  public TalkToWinner getTalkToWinner() {
    return this.talkToWinner;
  }

  protected JadescriptSet<AID> bidders = null;

  public void setBidders(final JadescriptSet<AID> bidders) {
    this.bidders = bidders;
  }

  public JadescriptSet<AID> getBidders() {
    return this.bidders;
  }

  protected AID bidderLastProp = null;

  public void setBidderLastProp(final AID bidderLastProp) {
    this.bidderLastProp = bidderLastProp;
  }

  public AID getBidderLastProp() {
    return this.bidderLastProp;
  }

  protected Integer maxPartecipants = null;

  public void setMaxPartecipants(final Integer maxPartecipants) {
    this.maxPartecipants = maxPartecipants;
  }

  public Integer getMaxPartecipants() {
    return this.maxPartecipants;
  }

  protected String nameObject = null;

  public void setNameObject(final String nameObject) {
    this.nameObject = nameObject;
  }

  public String getNameObject() {
    return this.nameObject;
  }

  protected Integer codeObject = null;

  public void setCodeObject(final Integer codeObject) {
    this.codeObject = codeObject;
  }

  public Integer getCodeObject() {
    return this.codeObject;
  }

  protected Integer baseCost = null;

  public void setBaseCost(final Integer baseCost) {
    this.baseCost = baseCost;
  }

  public Integer getBaseCost() {
    return this.baseCost;
  }

  protected Integer minCost = null;

  public void setMinCost(final Integer minCost) {
    this.minCost = minCost;
  }

  public Integer getMinCost() {
    return this.minCost;
  }

  protected Integer incrCost = null;

  public void setIncrCost(final Integer incrCost) {
    this.incrCost = incrCost;
  }

  public Integer getIncrCost() {
    return this.incrCost;
  }

  protected Duration timeOut = null;

  public void setTimeOut(final Duration timeOut) {
    this.timeOut = timeOut;
  }

  public Duration getTimeOut() {
    return this.timeOut;
  }

  protected Boolean someoneBought = null;

  public void setSomeoneBought(final Boolean someoneBought) {
    this.someoneBought = someoneBought;
  }

  public Boolean getSomeoneBought() {
    return this.someoneBought;
  }

  private void __onCreate() {
    java.lang.String nameObject = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[0], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT));
    java.lang.Integer codeObject = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[1], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    try {
    	/* 
    	 * Compiled from source statement at line 44
    	 * nameObject of this = nameObject
    	 */
    	
    	Auctioneer.this.setNameObject(nameObject);
    	
    	/* 
    	 * Compiled from source statement at line 45
    	 * codeObject of this = codeObject
    	 */
    	
    	Auctioneer.this.setCodeObject(codeObject);
    	
    	/* 
    	 * Compiled from source statement at line 46
    	 * activate waiting
    	 */
    	
    	Auctioneer.this.getWaiting().activate(_agentEnv.getAgent());
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Auctioneer.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  public void __handleBehaviourFailure(final jadescript.core.behaviours.Behaviour<?> __behaviour, final JadescriptProposition __reason) {
    boolean __handled = false;
    if(!__handled) {
    	jadescript.core.Agent.doLog(java.util.logging.Level.INFO, this.getClass().getName(), this, "<behaviour failure dispatcher>", "Behaviour " + __behaviour + " failed with reason: " + __reason);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	Auctioneer.this.waiting = agents.WaitBidders.__createEmpty(_agentEnv);
    	
    	Auctioneer.this.decideAuction = agents.DecideAuction.__createEmpty(_agentEnv);
    	
    	Auctioneer.this.endAuction = agents.EndAuction.__createEmpty(_agentEnv);
    	
    	Auctioneer.this.talkToWinner = agents.TalkToWinner.__createEmpty(_agentEnv);
    	
    	Auctioneer.this.bidders = new jadescript.util.JadescriptSet<jade.core.AID>();
    	
    	Auctioneer.this.bidderLastProp = new jade.core.AID();
    	
    	Auctioneer.this.maxPartecipants = 4;
    	
    	Auctioneer.this.nameObject = "";
    	
    	Auctioneer.this.codeObject = 0;
    	
    	Auctioneer.this.baseCost = 15;
    	
    	Auctioneer.this.minCost = 50;
    	
    	Auctioneer.this.incrCost = 4;
    	
    	Auctioneer.this.timeOut = ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT10S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION)));
    	
    	Auctioneer.this.someoneBought = false;
    }
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Auctioneer __theAgent() {
    return this;
  }

  protected void setup() {
    super.setup();
    __initializeAgentEnv();
    __initializeProperties();
    this.__onCreate();
  }

  protected void __registerCodecs(final ContentManager cm) {
    super.__registerCodecs(cm);
    cm.registerLanguage(__codec);
  }

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final String nameObject, final Integer codeObject) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, agents.Auctioneer.class, nameObject, codeObject);
  }
}
