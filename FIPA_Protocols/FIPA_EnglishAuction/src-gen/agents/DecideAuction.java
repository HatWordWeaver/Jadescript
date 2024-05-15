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
public class DecideAuction extends OneShotBehaviour<Auctioneer> {
  private Auctioneer __theAgent = (agents.Auctioneer)/*Used as metadata*/null;

  private AgentEnv<Auctioneer, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public DecideAuction(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static DecideAuction __createEmpty(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.DecideAuction(_agentEnv);
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
      	 * Compiled from source statement at line 144
      	 * deactivate Auction
      	 */
      	
      	new agents.Auction(_agentEnv.getAgent().toEnv()).deactivate();
      	
      	/* 
      	 * Compiled from source statement from line 150 to line 156
      	 * if someoneBought = false do
      	 *             activate endAuction
      	 *         # else Auction behaviour is activated, also listOfBoughters is cleared
      	 *         # price will be highter and the cycle re-start
      	 *         else do
      	 *             someoneBought = false
      	 *             activate Auction
      	 */
      	
      	if(java.util.Objects.equals(DecideAuction.this._agentEnv.getAgent().getSomeoneBought(), false)) {
      		/* 
      		 * Compiled from source statement at line 151
      		 * activate endAuction
      		 */
      		
      		DecideAuction.this._agentEnv.getAgent().getEndAuction().activate(_agentEnv.getAgent());
      	}
      	else {
      		/* 
      		 * Compiled from source statement at line 155
      		 * someoneBought = false
      		 */
      		
      		DecideAuction.this._agentEnv.getAgent().setSomeoneBought(false);
      		
      		/* 
      		 * Compiled from source statement at line 156
      		 * activate Auction
      		 */
      		
      		new agents.Auction(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
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

  private DecideAuction.__Event0 __event0 =  new agents.DecideAuction.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(DecideAuction.this);
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
