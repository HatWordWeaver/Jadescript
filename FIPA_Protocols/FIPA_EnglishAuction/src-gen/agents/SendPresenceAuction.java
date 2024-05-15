package agents;

import EnglishAuctionOntology.EnglishAuction;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class SendPresenceAuction extends OneShotBehaviour<Bidder> {
  private Bidder __theAgent = (agents.Bidder)/*Used as metadata*/null;

  private AgentEnv<Bidder, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public SendPresenceAuction(final AgentEnv<? extends Bidder, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static SendPresenceAuction __createEmpty(final AgentEnv<? extends Bidder, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.SendPresenceAuction(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event0.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event0.__eventFired) __awaitForEvents();
  }

  public Boolean __hasStaleMessageHandler() {
    return false;
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public EnglishAuction __ontology__EnglishAuctionOntology_EnglishAuction = (EnglishAuctionOntology.EnglishAuction) EnglishAuctionOntology.EnglishAuction.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(EnglishAuctionOntology.EnglishAuction.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  private class __Event0 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement at line 35
      	 * log "sending message to auctioneer"
      	 */
      	
      	jadescript.core.Agent.doLog(jade.util.Logger.INFO, SendPresenceAuction.this.getClass().getName(), SendPresenceAuction.this, "on execute", java.lang.String.valueOf("sending message to auctioneer"));
      	
      	/* 
      	 * Compiled from source statement at line 36
      	 * send message inform(Partecipating) to "Auctioneer"@
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("inform");
      		
      		java.lang.Object _contentToBeSent1919072109 = (EnglishAuctionOntology.EnglishAuction.Partecipating());
      		
      		jadescript.core.message.Message _synthesizedMessage1919072109 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      		
      		_synthesizedMessage1919072109.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1919072109,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
      		
      		_synthesizedMessage1919072109.setLanguage(__codec.getName());;
      		
      		_synthesizedMessage1919072109.addReceiver(new jade.core.AID(java.lang.String.valueOf("Auctioneer"), false));
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1919072109, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1919072109, "inform"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage1919072109);
      	}
      	catch(java.lang.Throwable _t) {
      		throw jadescript.core.exception.JadescriptException.wrap(_t);
      	}
      }
      catch(jadescript.core.exception.JadescriptException __throwable) {
      	__handleJadescriptException(__throwable);
      }
      catch(java.lang.Throwable __throwable) {
      	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
      }
    }
  }

  private SendPresenceAuction.__Event0 __event0 =  new agents.SendPresenceAuction.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(SendPresenceAuction.this);
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
}
