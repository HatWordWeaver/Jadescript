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
public class WaitResponse extends CyclicBehaviour<Bidder> {
  private Bidder __theAgent = (agents.Bidder)/*Used as metadata*/null;

  private AgentEnv<Bidder, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WaitResponse(final AgentEnv<? extends Bidder, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static WaitResponse __createEmpty(final AgentEnv<? extends Bidder, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.WaitResponse(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event1.run();
    __event2.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event1.__eventFired && !__event2.__eventFired) __awaitForEvents();
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

  /**
   * agents.WaitResponse doOnActivate
   */
  public void doOnActivate() {
    super.doOnActivate();
    try {
    	/* 
    	 * Compiled from source statement at line 93
    	 * log "Waiting for response..."
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitResponse.this.getClass().getName(), WaitResponse.this, "on activate", java.lang.String.valueOf("Waiting for response..."));
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event1 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitResponse.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1487335199 {
      	public java.lang.Integer price;
      	
      	private final __PatternMatcher1487335199 __PatternMatcher1487335199_obj =  this;
      	
      	public boolean headerMatch__paren_structterm0(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		price = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		EnglishAuctionOntology.WinCost __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.WinCost) {
      				__x = (EnglishAuctionOntology.WinCost) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch__paren_structterm0(__x.getMoney());
      	}
      }
      __PatternMatcher1487335199 __PatternMatcher1487335199_obj = new __PatternMatcher1487335199();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1487335199_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitResponse.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 96
      			 * log "Just won with price of " + price
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitResponse.this.getClass().getName(), WaitResponse.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf("Just won with price of ") + java.lang.String.valueOf(__PatternMatcher1487335199_obj.price)));
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

  private WaitResponse.__Event1 __event1 = null;

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitResponse.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1570955391 {
      	private final __PatternMatcher1570955391 __PatternMatcher1570955391_obj =  this;
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		EnglishAuctionOntology.NotEnoughMoney __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.NotEnoughMoney) {
      				__x = (EnglishAuctionOntology.NotEnoughMoney) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, EnglishAuctionOntology.EnglishAuction.NotEnoughMoney());
      	}
      }
      __PatternMatcher1570955391 __PatternMatcher1570955391_obj = new __PatternMatcher1570955391();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1570955391_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitResponse.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 99
      			 * log "Unlucky, not enought money proposed."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitResponse.this.getClass().getName(), WaitResponse.this, "on inform", java.lang.String.valueOf("Unlucky, not enought money proposed."));
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

  private WaitResponse.__Event2 __event2 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WaitResponse.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event1 = new agents.WaitResponse.__Event1();
    	
    	__event2 = new agents.WaitResponse.__Event2();
    }
  }
}
