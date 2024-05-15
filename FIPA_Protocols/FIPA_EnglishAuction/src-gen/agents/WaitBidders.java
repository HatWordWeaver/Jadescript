package agents;

import EnglishAuctionOntology.EnglishAuction;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class WaitBidders extends CyclicBehaviour<Auctioneer> {
  private Auctioneer __theAgent = (agents.Auctioneer)/*Used as metadata*/null;

  private AgentEnv<Auctioneer, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WaitBidders(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static WaitBidders __createEmpty(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.WaitBidders(_agentEnv);
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
    Boolean __eventFired = false;

    public void run() {
      if(WaitBidders.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1087961424 {
      	private final __PatternMatcher1087961424 __PatternMatcher1087961424_obj =  this;
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		EnglishAuctionOntology.Partecipating __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.Partecipating) {
      				__x = (EnglishAuctionOntology.Partecipating) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, EnglishAuctionOntology.EnglishAuction.Partecipating());
      	}
      }
      __PatternMatcher1087961424 __PatternMatcher1087961424_obj = new __PatternMatcher1087961424();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1087961424_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
      	}
      	catch(java.lang.Throwable _e) {
      		_e.printStackTrace();
      		
      		return false;
      	}
      }
      }))));
      jadescript.core.message.Message __receivedMessage = null;
      if(myAgent!=null) {
      	__receivedMessage = jadescript.core.message.Message.wrap(myAgent.receive(__mt));
      }
      if(__receivedMessage != null) {
      	WaitBidders.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 59
      			 * add sender of message to bidders
      			 */
      			
      			WaitBidders.this._agentEnv.getAgent().getBidders().add(((jadescript.core.message.InformMessage<EnglishAuctionOntology.Partecipating>) __receivedMessage).getSender());
      			
      			/* 
      			 * Compiled from source statement at line 60
      			 * log "senders: " + bidders
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitBidders.this.getClass().getName(), WaitBidders.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf("senders: ") + java.lang.String.valueOf(WaitBidders.this._agentEnv.getAgent().getBidders())));
      			
      			/* 
      			 * Compiled from source statement from line 61 to line 65
      			 * if size of bidders = maxPartecipants do
      			 *             log "Max number of partecipants reached (" + size of bidders + "). Starting auction..."
      			 *             do informBidders
      			 *             activate Auction
      			 *             deactivate this
      			 */
      			
      			if(java.util.Objects.equals(WaitBidders.this._agentEnv.getAgent().getBidders().size(), WaitBidders.this._agentEnv.getAgent().getMaxPartecipants())) {
      				/* 
      				 * Compiled from source statement at line 62
      				 * log "Max number of partecipants reached (" + size of bidders + "). Starting auction..."
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitBidders.this.getClass().getName(), WaitBidders.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Max number of partecipants reached (") + java.lang.String.valueOf(WaitBidders.this._agentEnv.getAgent().getBidders().size())) + java.lang.String.valueOf("). Starting auction...")));
      				
      				/* 
      				 * Compiled from source statement at line 63
      				 * do informBidders
      				 */
      				
      				WaitBidders.this.informBidders(_agentEnv.getAgent().toEnv());
      				
      				/* 
      				 * Compiled from source statement at line 64
      				 * activate Auction
      				 */
      				
      				new agents.Auction(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      				
      				/* 
      				 * Compiled from source statement at line 65
      				 * deactivate this
      				 */
      				
      				WaitBidders.this.deactivate();
      			}
      		}
      		catch(jadescript.core.exception.JadescriptException __throwable) {
      			__handleJadescriptException(__throwable);
      		}
      		catch(java.lang.Throwable __throwable) {
      			__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
      		}
      		
      		__receivedMessage = null;
      	}
      	catch(Exception _e) {
      		_e.printStackTrace();
      	}
      }
      else {
      	this.__eventFired = false;
      }
    }
  }

  private WaitBidders.__Event0 __event0 = null;

  public void informBidders(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    {
    	/* 
    	 * Compiled from source statement at line 69
    	 * send message inform(StartAuction) to bidders
    	 */
    	
    	try {
    		jadescript.util.SendMessageUtils.validatePerformative("inform");
    		
    		java.lang.Object _contentToBeSent2018886476 = (EnglishAuctionOntology.EnglishAuction.StartAuction());
    		
    		jadescript.core.message.Message _synthesizedMessage2018886476 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
    		
    		_synthesizedMessage2018886476.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent2018886476,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
    		
    		_synthesizedMessage2018886476.setLanguage(__codec.getName());;
    		
    		jadescript.util.JadescriptSet<jade.core.AID> __receiversList0 = WaitBidders.this._agentEnv.getAgent().getBidders();
    		
    		for ( jade.core.AID __receiver : __receiversList0) {
    			_synthesizedMessage2018886476.addReceiver(__receiver);
    		}
    		
    		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage2018886476, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent2018886476, "inform"));
    		
    		_agentEnv.getAgent().send(_synthesizedMessage2018886476);
    	}
    	catch(java.lang.Throwable _t) {
    		throw jadescript.core.exception.JadescriptException.wrap(_t);
    	}
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WaitBidders.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new agents.WaitBidders.__Event0();
    }
  }
}
