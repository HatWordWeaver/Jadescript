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
public class WaitForStart extends CyclicBehaviour<Bidder> {
  private Bidder __theAgent = (agents.Bidder)/*Used as metadata*/null;

  private AgentEnv<Bidder, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WaitForStart(final AgentEnv<? extends Bidder, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static WaitForStart __createEmpty(final AgentEnv<? extends Bidder, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.WaitForStart(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event0.run();
    __event1.run();
    __event2.run();
    __event3.run();
    __event4.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event0.__eventFired && !__event1.__eventFired && !__event2.__eventFired && !__event3.__eventFired && !__event4.__eventFired) __awaitForEvents();
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
      if(WaitForStart.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1776640988 {
      	private final __PatternMatcher1776640988 __PatternMatcher1776640988_obj =  this;
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		EnglishAuctionOntology.StartAuction __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.StartAuction) {
      				__x = (EnglishAuctionOntology.StartAuction) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, EnglishAuctionOntology.EnglishAuction.StartAuction());
      	}
      }
      __PatternMatcher1776640988 __PatternMatcher1776640988_obj = new __PatternMatcher1776640988();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1776640988_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitForStart.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 48
      			 * log "Auction started."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForStart.this.getClass().getName(), WaitForStart.this, "on inform", java.lang.String.valueOf("Auction started."));
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

  private WaitForStart.__Event0 __event0 = null;

  private class __Event1 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForStart.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1017852065 {
      	public java.lang.String nameObject;
      	
      	public java.lang.Integer codeObject;
      	
      	public java.lang.Integer price;
      	
      	public java.lang.String bidderWinning;
      	
      	public jadescript.lang.Timestamp timeExpire;
      	
      	private final __PatternMatcher1017852065 __PatternMatcher1017852065_obj =  this;
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm0(java.lang.Object __objx) {
      		java.lang.String __x;
      		
      		try {
      			if(__objx instanceof java.lang.String) {
      				__x = (java.lang.String) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		nameObject = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm1(java.lang.Object __objx) {
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
      		
      		codeObject = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm2(java.lang.Object __objx) {
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
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm3(java.lang.Object __objx) {
      		java.lang.String __x;
      		
      		try {
      			if(__objx instanceof java.lang.String) {
      				__x = (java.lang.String) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		bidderWinning = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm4(java.lang.Object __objx) {
      		jadescript.lang.Timestamp __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Timestamp) {
      				__x = (jadescript.lang.Timestamp) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		timeExpire = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0(java.lang.Object __objx) {
      		EnglishAuctionOntology.ObjectOnAuction __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.ObjectOnAuction) {
      				__x = (EnglishAuctionOntology.ObjectOnAuction) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_structterm0_structterm0(__x.getName()) && headerMatch_tupleelem0_structterm0_structterm1(__x.getCode()) && headerMatch_tupleelem0_structterm0_structterm2(__x.getRequired()) && headerMatch_tupleelem0_structterm0_structterm3(__x.getWinner()) && headerMatch_tupleelem0_structterm0_structterm4(__x.getExpireTime());
      	}
      	
      	public boolean headerMatch_tupleelem0(java.lang.Object __objx) {
      		EnglishAuctionOntology.AuctionTime __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.AuctionTime) {
      				__x = (EnglishAuctionOntology.AuctionTime) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_structterm0(__x.getObject());
      	}
      	
      	public boolean headerMatch_tupleelem1(java.lang.Object __objx) {
      		EnglishAuctionOntology.StartAuction __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.StartAuction) {
      				__x = (EnglishAuctionOntology.StartAuction) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, EnglishAuctionOntology.EnglishAuction.StartAuction());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.StartAuction> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.StartAuction>) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && __x.getLength() == 2 && headerMatch_tupleelem0(__x.getElement0()) && headerMatch_tupleelem1(__x.getElement1());
      	}
      }
      __PatternMatcher1017852065 __PatternMatcher1017852065_obj = new __PatternMatcher1017852065();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.CFP)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1017852065_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitForStart.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 62 to line 75
      			 * if price <= maxMoney do
      			 *         #if price+incrCost <= maxMoney do  
      			 *             #if bidderWinning ≠ name of agent do
      			 *                 log"bidderWinning: " + bidderWinning + " | I accept: " + price
      			 *                 send message propose(AuctionTime(ObjectOnAuction(nameObject, 
      			 *                                                              codeObject, 
      			 *                                                              price,#+incrCost,
      			 *                                                              name of agent,
      			 *                                                              timeExpire
      			 *                                                              )), Propose) to "Auctioneer"@
      			 * 
      			 *         # if is higher than maxMoney, simply doesn't send message
      			 *         else do
      			 *             log "It's over. Too expensive for us."
      			 */
      			
      			if(__PatternMatcher1017852065_obj.price <= WaitForStart.this._agentEnv.getAgent().getMaxMoney()) {
      				/* 
      				 * Compiled from source statement at line 65
      				 * log"bidderWinning: " + bidderWinning + " | I accept: " + price
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForStart.this.getClass().getName(), WaitForStart.this, "on cfp", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("bidderWinning: ") + java.lang.String.valueOf(__PatternMatcher1017852065_obj.bidderWinning)) + java.lang.String.valueOf(" | I accept: ")) + java.lang.String.valueOf(__PatternMatcher1017852065_obj.price)));
      				
      				/* 
      				 * Compiled from source statement from line 66 to line 71
      				 * send message propose(AuctionTime(ObjectOnAuction(nameObject, 
      				 *                                                              codeObject, 
      				 *                                                              price,#+incrCost,
      				 *                                                              name of agent,
      				 *                                                              timeExpire
      				 *                                                              )), Propose) to "Auctioneer"@
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("propose");
      					
      					java.lang.Object _contentToBeSent1501581833 = new jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose>(EnglishAuctionOntology.EnglishAuction.AuctionTime(EnglishAuctionOntology.EnglishAuction.ObjectOnAuction(__PatternMatcher1017852065_obj.nameObject ,__PatternMatcher1017852065_obj.codeObject ,__PatternMatcher1017852065_obj.price ,WaitForStart.this.getJadescriptAgent().getName() ,__PatternMatcher1017852065_obj.timeExpire)), EnglishAuctionOntology.EnglishAuction.Propose());
      					
      					jadescript.core.message.Message _synthesizedMessage1501581833 = new jadescript.core.message.Message(jadescript.core.message.Message.PROPOSE);
      					
      					_synthesizedMessage1501581833.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1501581833,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
      					
      					_synthesizedMessage1501581833.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1501581833.addReceiver(new jade.core.AID(java.lang.String.valueOf("Auctioneer"), false));
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1501581833, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1501581833, "propose"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1501581833);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 75
      				 * log "It's over. Too expensive for us."
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForStart.this.getClass().getName(), WaitForStart.this, "on cfp", java.lang.String.valueOf("It's over. Too expensive for us."));
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

  private WaitForStart.__Event1 __event1 = null;

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForStart.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1275101558 {
      	public java.lang.String nameObject;
      	
      	public java.lang.Integer codeObject;
      	
      	public java.lang.Integer priceProposed;
      	
      	public java.lang.String bidder;
      	
      	public jadescript.lang.Timestamp timeExpire;
      	
      	private final __PatternMatcher1275101558 __PatternMatcher1275101558_obj =  this;
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm0(java.lang.Object __objx) {
      		java.lang.String __x;
      		
      		try {
      			if(__objx instanceof java.lang.String) {
      				__x = (java.lang.String) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		nameObject = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm1(java.lang.Object __objx) {
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
      		
      		codeObject = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm2(java.lang.Object __objx) {
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
      		
      		priceProposed = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm3(java.lang.Object __objx) {
      		java.lang.String __x;
      		
      		try {
      			if(__objx instanceof java.lang.String) {
      				__x = (java.lang.String) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		bidder = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0_structterm4(java.lang.Object __objx) {
      		jadescript.lang.Timestamp __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Timestamp) {
      				__x = (jadescript.lang.Timestamp) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		timeExpire = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm0(java.lang.Object __objx) {
      		EnglishAuctionOntology.ObjectOnAuction __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.ObjectOnAuction) {
      				__x = (EnglishAuctionOntology.ObjectOnAuction) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_structterm0_structterm0(__x.getName()) && headerMatch_tupleelem0_structterm0_structterm1(__x.getCode()) && headerMatch_tupleelem0_structterm0_structterm2(__x.getRequired()) && headerMatch_tupleelem0_structterm0_structterm3(__x.getWinner()) && headerMatch_tupleelem0_structterm0_structterm4(__x.getExpireTime());
      	}
      	
      	public boolean headerMatch_tupleelem0(java.lang.Object __objx) {
      		EnglishAuctionOntology.AuctionTime __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.AuctionTime) {
      				__x = (EnglishAuctionOntology.AuctionTime) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_structterm0(__x.getObject());
      	}
      	
      	public boolean headerMatch_tupleelem1(java.lang.Object __objx) {
      		EnglishAuctionOntology.AcceptPropose __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.AcceptPropose) {
      				__x = (EnglishAuctionOntology.AcceptPropose) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, EnglishAuctionOntology.EnglishAuction.AcceptPropose());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.AcceptPropose> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.AcceptPropose>) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && __x.getLength() == 2 && headerMatch_tupleelem0(__x.getElement0()) && headerMatch_tupleelem1(__x.getElement1());
      	}
      }
      __PatternMatcher1275101558 __PatternMatcher1275101558_obj = new __PatternMatcher1275101558();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.ACCEPT_PROPOSAL)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1275101558_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitForStart.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 78
      			 * log "Accepted."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForStart.this.getClass().getName(), WaitForStart.this, "on accept_proposal", java.lang.String.valueOf("Accepted."));
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

  private WaitForStart.__Event2 __event2 = null;

  private class __Event3 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForStart.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REJECT_PROPOSAL)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager()));
      jadescript.core.message.Message __receivedMessage = null;
      if(myAgent!=null) {
      	__receivedMessage = jadescript.core.message.Message.wrap(myAgent.receive(__mt));
      }
      if(__receivedMessage != null) {
      	WaitForStart.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 81
      			 * log "Refused."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForStart.this.getClass().getName(), WaitForStart.this, "on reject_proposal", java.lang.String.valueOf("Refused."));
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

  private WaitForStart.__Event3 __event3 = null;

  private class __Event4 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForStart.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher690264880 {
      	private final __PatternMatcher690264880 __PatternMatcher690264880_obj =  this;
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		EnglishAuctionOntology.EndAuctionMessage __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.EndAuctionMessage) {
      				__x = (EnglishAuctionOntology.EndAuctionMessage) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, EnglishAuctionOntology.EnglishAuction.EndAuctionMessage());
      	}
      }
      __PatternMatcher690264880 __PatternMatcher690264880_obj = new __PatternMatcher690264880();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher690264880_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitForStart.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 84
      			 * activate waitResponse
      			 */
      			
      			WaitForStart.this._agentEnv.getAgent().getWaitResponse().activate(_agentEnv.getAgent());
      			
      			/* 
      			 * Compiled from source statement at line 85
      			 * deactivate this
      			 */
      			
      			WaitForStart.this.deactivate();
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

  private WaitForStart.__Event4 __event4 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WaitForStart.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new agents.WaitForStart.__Event0();
    	
    	__event1 = new agents.WaitForStart.__Event1();
    	
    	__event2 = new agents.WaitForStart.__Event2();
    	
    	__event3 = new agents.WaitForStart.__Event3();
    	
    	__event4 = new agents.WaitForStart.__Event4();
    }
  }
}
