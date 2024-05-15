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
public class EndAuction extends OneShotBehaviour<Auctioneer> {
  private Auctioneer __theAgent = (agents.Auctioneer)/*Used as metadata*/null;

  private AgentEnv<Auctioneer, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public EndAuction(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static EndAuction __createEmpty(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.EndAuction(_agentEnv);
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
      	 * Compiled from source statement at line 163
      	 * send message inform(EndAuctionMessage) to bidders
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("inform");
      		
      		java.lang.Object _contentToBeSent223263333 = (EnglishAuctionOntology.EnglishAuction.EndAuctionMessage());
      		
      		jadescript.core.message.Message _synthesizedMessage223263333 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      		
      		_synthesizedMessage223263333.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent223263333,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
      		
      		_synthesizedMessage223263333.setLanguage(__codec.getName());;
      		
      		jadescript.util.JadescriptSet<jade.core.AID> __receiversList0 = EndAuction.this._agentEnv.getAgent().getBidders();
      		
      		for ( jade.core.AID __receiver : __receiversList0) {
      			_synthesizedMessage223263333.addReceiver(__receiver);
      		}
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage223263333, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent223263333, "inform"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage223263333);
      	}
      	catch(java.lang.Throwable _t) {
      		throw jadescript.core.exception.JadescriptException.wrap(_t);
      	}
      	
      	/* 
      	 * Compiled from source statement at line 164
      	 * log "Auction ended."
      	 */
      	
      	jadescript.core.Agent.doLog(jade.util.Logger.INFO, EndAuction.this.getClass().getName(), EndAuction.this, "on execute", java.lang.String.valueOf("Auction ended."));
      	
      	/* 
      	 * Compiled from source statement at line 165
      	 * activate talkToWinner after "PT2S" as duration
      	 */
      	
      	EndAuction.this._agentEnv.getAgent().getTalkToWinner().activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT2S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
      }
      catch(jadescript.core.exception.JadescriptException __throwable) {
      	__handleJadescriptException(__throwable);
      }
      catch(java.lang.Throwable __throwable) {
      	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
      }
    }
  }

  private EndAuction.__Event0 __event0 =  new agents.EndAuction.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(EndAuction.this);
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
