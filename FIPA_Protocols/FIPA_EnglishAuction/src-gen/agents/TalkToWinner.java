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
public class TalkToWinner extends OneShotBehaviour<Auctioneer> {
  private Auctioneer __theAgent = (agents.Auctioneer)/*Used as metadata*/null;

  private AgentEnv<Auctioneer, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public TalkToWinner(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static TalkToWinner __createEmpty(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.TalkToWinner(_agentEnv);
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
      	 * Compiled from source statement from line 172 to line 178
      	 * if baseCost-incrCost > minCost do
      	 *                 log "Yayyy, someone bought it! " + name of bidderLastProp + " congratulations!"
      	 *                 log "Sold for: " + (baseCost-incrCost)
      	 *                 send message request(WinCost(baseCost-incrCost)) to bidderLastProp
      	 *         else do
      	 *                 log "Can't sold it, offer is too low."
      	 *                 send message inform(NotEnoughMoney) to bidderLastProp
      	 */
      	
      	if(TalkToWinner.this._agentEnv.getAgent().getBaseCost() - TalkToWinner.this._agentEnv.getAgent().getIncrCost() > TalkToWinner.this._agentEnv.getAgent().getMinCost()) {
      		/* 
      		 * Compiled from source statement at line 173
      		 * log "Yayyy, someone bought it! " + name of bidderLastProp + " congratulations!"
      		 */
      		
      		jadescript.core.Agent.doLog(jade.util.Logger.INFO, TalkToWinner.this.getClass().getName(), TalkToWinner.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Yayyy, someone bought it! ") + java.lang.String.valueOf(TalkToWinner.this._agentEnv.getAgent().getBidderLastProp().getName())) + java.lang.String.valueOf(" congratulations!")));
      		
      		/* 
      		 * Compiled from source statement at line 174
      		 * log "Sold for: " + (baseCost-incrCost)
      		 */
      		
      		jadescript.core.Agent.doLog(jade.util.Logger.INFO, TalkToWinner.this.getClass().getName(), TalkToWinner.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf("Sold for: ") + java.lang.String.valueOf((TalkToWinner.this._agentEnv.getAgent().getBaseCost() - TalkToWinner.this._agentEnv.getAgent().getIncrCost()))));
      		
      		/* 
      		 * Compiled from source statement at line 175
      		 * send message request(WinCost(baseCost-incrCost)) to bidderLastProp
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("request");
      			
      			java.lang.Object _contentToBeSent516125796 = (EnglishAuctionOntology.EnglishAuction.WinCost(TalkToWinner.this._agentEnv.getAgent().getBaseCost() - TalkToWinner.this._agentEnv.getAgent().getIncrCost()));
      			
      			jadescript.core.message.Message _synthesizedMessage516125796 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      			
      			_synthesizedMessage516125796.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent516125796,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
      			
      			_synthesizedMessage516125796.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage516125796.addReceiver(TalkToWinner.this._agentEnv.getAgent().getBidderLastProp());
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage516125796, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent516125796, "request"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage516125796);
      		}
      		catch(java.lang.Throwable _t) {
      			throw jadescript.core.exception.JadescriptException.wrap(_t);
      		}
      	}
      	else {
      		/* 
      		 * Compiled from source statement at line 177
      		 * log "Can't sold it, offer is too low."
      		 */
      		
      		jadescript.core.Agent.doLog(jade.util.Logger.INFO, TalkToWinner.this.getClass().getName(), TalkToWinner.this, "on execute", java.lang.String.valueOf("Can't sold it, offer is too low."));
      		
      		/* 
      		 * Compiled from source statement at line 178
      		 * send message inform(NotEnoughMoney) to bidderLastProp
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("inform");
      			
      			java.lang.Object _contentToBeSent335032496 = (EnglishAuctionOntology.EnglishAuction.NotEnoughMoney());
      			
      			jadescript.core.message.Message _synthesizedMessage335032496 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      			
      			_synthesizedMessage335032496.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent335032496,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
      			
      			_synthesizedMessage335032496.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage335032496.addReceiver(TalkToWinner.this._agentEnv.getAgent().getBidderLastProp());
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage335032496, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent335032496, "inform"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage335032496);
      		}
      		catch(java.lang.Throwable _t) {
      			throw jadescript.core.exception.JadescriptException.wrap(_t);
      		}
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

  private TalkToWinner.__Event0 __event0 =  new agents.TalkToWinner.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(TalkToWinner.this);
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
