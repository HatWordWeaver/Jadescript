package agents;

import EnglishAuctionOntology.EnglishAuction;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;
import jadescript.lang.Timestamp;

@SuppressWarnings("all")
public class Auction extends CyclicBehaviour<Auctioneer> {
  private Auctioneer __theAgent = (agents.Auctioneer)/*Used as metadata*/null;

  private AgentEnv<Auctioneer, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static Auction __createEmpty(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.Auction(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event3.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event3.__eventFired) __awaitForEvents();
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

  protected Timestamp nextTimeOut = null;

  public void setNextTimeOut(final Timestamp nextTimeOut) {
    this.nextTimeOut = nextTimeOut;
  }

  public Timestamp getNextTimeOut() {
    return this.nextTimeOut;
  }

  public Auction(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	//do nothing;
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  /**
   * agents.Auction doOnActivate
   */
  public void doOnActivate() {
    super.doOnActivate();
    try {
    	/* 
    	 * Compiled from source statement at line 87
    	 * do sendProposeAuction
    	 */
    	
    	Auction.this.sendProposeAuction(_agentEnv.getAgent().toEnv());
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event3 {
    Boolean __eventFired = false;

    public void run() {
      if(Auction.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1638009858 {
      	public java.lang.String namePropose;
      	
      	public java.lang.Integer codePropose;
      	
      	public java.lang.Integer priceProposed;
      	
      	public java.lang.String bidder;
      	
      	public jadescript.lang.Timestamp timeExpire;
      	
      	private final __PatternMatcher1638009858 __PatternMatcher1638009858_obj =  this;
      	
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
      		
      		namePropose = __x;
      		
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
      		
      		codePropose = __x;
      		
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
      		EnglishAuctionOntology.Propose __x;
      		
      		try {
      			if(__objx instanceof EnglishAuctionOntology.Propose) {
      				__x = (EnglishAuctionOntology.Propose) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, EnglishAuctionOntology.EnglishAuction.Propose());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose>) __objx;
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
      __PatternMatcher1638009858 __PatternMatcher1638009858_obj = new __PatternMatcher1638009858();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.PROPOSE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher1638009858_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher1638009858_obj.codePropose, Auction.this._agentEnv.getAgent().getCodeObject()) && java.util.Objects.equals(__PatternMatcher1638009858_obj.namePropose, Auction.this._agentEnv.getAgent().getNameObject()));
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
      	Auction.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 100
      			 * log "Received from " + name of sender of message + " offer of: " + priceProposed
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, Auction.this.getClass().getName(), Auction.this, "on propose", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Received from ") + java.lang.String.valueOf(((jadescript.core.message.ProposeMessage<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose>) __receivedMessage).getSender().getName())) + java.lang.String.valueOf(" offer of: ")) + java.lang.String.valueOf(__PatternMatcher1638009858_obj.priceProposed)));
      			
      			/* 
      			 * Compiled from source statement from line 101 to line 119
      			 * if priceProposed = baseCost do
      			 *             send message accept_proposal(AuctionTime(ObjectOnAuction(namePropose, 
      			 *                                                            codePropose, 
      			 *                                                            priceProposed, 
      			 *                                                            name of sender of message, 
      			 *                                                            timeExpire
      			 *                                                            )), AcceptPropose) to sender of message
      			 *             bidderLastProp = sender of message
      			 *             someoneBought = true
      			 *             baseCost = priceProposed + incrCost
      			 *             log "New cost: " + baseCost
      			 *             do sendProposeAuction
      			 *         else do
      			 *             send message reject_proposal(AuctionTime(ObjectOnAuction(namePropose, 
      			 *                                                             codePropose, 
      			 *                                                             priceProposed, 
      			 *                                                             name of bidderLastProp, 
      			 *                                                             timeExpire
      			 *                                                             )), RefusePropose) to sender of message
      			 */
      			
      			if(java.util.Objects.equals(__PatternMatcher1638009858_obj.priceProposed, Auction.this._agentEnv.getAgent().getBaseCost())) {
      				/* 
      				 * Compiled from source statement from line 102 to line 107
      				 * send message accept_proposal(AuctionTime(ObjectOnAuction(namePropose, 
      				 *                                                            codePropose, 
      				 *                                                            priceProposed, 
      				 *                                                            name of sender of message, 
      				 *                                                            timeExpire
      				 *                                                            )), AcceptPropose) to sender of message
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("accept_proposal");
      					
      					java.lang.Object _contentToBeSent1485939589 = new jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.AcceptPropose>(EnglishAuctionOntology.EnglishAuction.AuctionTime(EnglishAuctionOntology.EnglishAuction.ObjectOnAuction(__PatternMatcher1638009858_obj.namePropose ,__PatternMatcher1638009858_obj.codePropose ,__PatternMatcher1638009858_obj.priceProposed ,((jadescript.core.message.ProposeMessage<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose>) __receivedMessage).getSender().getName() ,__PatternMatcher1638009858_obj.timeExpire)), EnglishAuctionOntology.EnglishAuction.AcceptPropose());
      					
      					jadescript.core.message.Message _synthesizedMessage1485939589 = new jadescript.core.message.Message(jadescript.core.message.Message.ACCEPT_PROPOSAL);
      					
      					_synthesizedMessage1485939589.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1485939589,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
      					
      					_synthesizedMessage1485939589.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1485939589.addReceiver(((jadescript.core.message.ProposeMessage<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose>) __receivedMessage).getSender());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1485939589, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1485939589, "accept_proposal"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1485939589);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 108
      				 * bidderLastProp = sender of message
      				 */
      				
      				Auction.this._agentEnv.getAgent().setBidderLastProp(((jadescript.core.message.ProposeMessage<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose>) __receivedMessage).getSender());
      				
      				/* 
      				 * Compiled from source statement at line 109
      				 * someoneBought = true
      				 */
      				
      				Auction.this._agentEnv.getAgent().setSomeoneBought(true);
      				
      				/* 
      				 * Compiled from source statement at line 110
      				 * baseCost = priceProposed + incrCost
      				 */
      				
      				Auction.this._agentEnv.getAgent().setBaseCost(__PatternMatcher1638009858_obj.priceProposed + Auction.this._agentEnv.getAgent().getIncrCost());
      				
      				/* 
      				 * Compiled from source statement at line 111
      				 * log "New cost: " + baseCost
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, Auction.this.getClass().getName(), Auction.this, "on propose", java.lang.String.valueOf(java.lang.String.valueOf("New cost: ") + java.lang.String.valueOf(Auction.this._agentEnv.getAgent().getBaseCost())));
      				
      				/* 
      				 * Compiled from source statement at line 112
      				 * do sendProposeAuction
      				 */
      				
      				Auction.this.sendProposeAuction(_agentEnv.getAgent().toEnv());
      			}
      			else {
      				/* 
      				 * Compiled from source statement from line 114 to line 119
      				 * send message reject_proposal(AuctionTime(ObjectOnAuction(namePropose, 
      				 *                                                             codePropose, 
      				 *                                                             priceProposed, 
      				 *                                                             name of bidderLastProp, 
      				 *                                                             timeExpire
      				 *                                                             )), RefusePropose) to sender of message
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("reject_proposal");
      					
      					java.lang.Object _contentToBeSent189214597 = new jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.RefusePropose>(EnglishAuctionOntology.EnglishAuction.AuctionTime(EnglishAuctionOntology.EnglishAuction.ObjectOnAuction(__PatternMatcher1638009858_obj.namePropose ,__PatternMatcher1638009858_obj.codePropose ,__PatternMatcher1638009858_obj.priceProposed ,Auction.this._agentEnv.getAgent().getBidderLastProp().getName() ,__PatternMatcher1638009858_obj.timeExpire)), EnglishAuctionOntology.EnglishAuction.RefusePropose()).<jadescript.content.onto.basic.True>add(/*default value*/jadescript.content.onto.Ontology.True());
      					
      					jadescript.core.message.Message _synthesizedMessage189214597 = new jadescript.core.message.Message(jadescript.core.message.Message.REJECT_PROPOSAL);
      					
      					_synthesizedMessage189214597.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent189214597,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
      					
      					_synthesizedMessage189214597.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage189214597.addReceiver(((jadescript.core.message.ProposeMessage<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.Propose>) __receivedMessage).getSender());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage189214597, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent189214597, "reject_proposal"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage189214597);
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

  private Auction.__Event3 __event3 = null;

  public void sendProposeAuction(final AgentEnv<? extends Auctioneer, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    {
    	/* 
    	 * Compiled from source statement at line 125
    	 * nextTimeOut = now + timeOut
    	 */
    	
    	Auction.this.setNextTimeOut(jadescript.lang.Timestamp.plus(jadescript.lang.Timestamp.now(), Auction.this._agentEnv.getAgent().getTimeOut()));
    	
    	/* 
    	 * Compiled from source statement at line 126
    	 * log"nextTimeOut: " + nextTimeOut
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, Auction.this.getClass().getName(), Auction.this, "sendProposeAuction", java.lang.String.valueOf(java.lang.String.valueOf("nextTimeOut: ") + java.lang.String.valueOf(Auction.this.getNextTimeOut())));
    	
    	/* 
    	 * Compiled from source statement from line 127 to line 132
    	 * send message cfp(AuctionTime(ObjectOnAuction(nameObject, 
    	 *                                                      codeObject, 
    	 *                                                      baseCost, 
    	 *                                                      name of bidderLastProp, 
    	 *                                                      nextTimeOut
    	 *                                                      )), StartAuction) to bidders
    	 */
    	
    	try {
    		jadescript.util.SendMessageUtils.validatePerformative("cfp");
    		
    		java.lang.Object _contentToBeSent2071797344 = new jadescript.lang.Tuple.Tuple2<EnglishAuctionOntology.AuctionTime, EnglishAuctionOntology.StartAuction>(EnglishAuctionOntology.EnglishAuction.AuctionTime(EnglishAuctionOntology.EnglishAuction.ObjectOnAuction(Auction.this._agentEnv.getAgent().getNameObject() ,Auction.this._agentEnv.getAgent().getCodeObject() ,Auction.this._agentEnv.getAgent().getBaseCost() ,Auction.this._agentEnv.getAgent().getBidderLastProp().getName() ,Auction.this.getNextTimeOut())), EnglishAuctionOntology.EnglishAuction.StartAuction());
    		
    		jadescript.core.message.Message _synthesizedMessage2071797344 = new jadescript.core.message.Message(jadescript.core.message.Message.CFP);
    		
    		_synthesizedMessage2071797344.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent2071797344,EnglishAuctionOntology.EnglishAuction.getInstance(),EnglishAuctionOntology.EnglishAuction.getInstance()).getName());;
    		
    		_synthesizedMessage2071797344.setLanguage(__codec.getName());;
    		
    		jadescript.util.JadescriptSet<jade.core.AID> __receiversList2 = Auction.this._agentEnv.getAgent().getBidders();
    		
    		for ( jade.core.AID __receiver : __receiversList2) {
    			_synthesizedMessage2071797344.addReceiver(__receiver);
    		}
    		
    		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage2071797344, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent2071797344, "cfp"));
    		
    		_agentEnv.getAgent().send(_synthesizedMessage2071797344);
    	}
    	catch(java.lang.Throwable _t) {
    		throw jadescript.core.exception.JadescriptException.wrap(_t);
    	}
    	
    	/* 
    	 * Compiled from source statement at line 133
    	 * activate decideAuction after timeOut
    	 */
    	
    	Auction.this._agentEnv.getAgent().getDecideAuction().activate_after(_agentEnv.getAgent(), Auction.this._agentEnv.getAgent().getTimeOut());
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Auction.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	Auction.this.nextTimeOut = jadescript.lang.Timestamp.now();
    	
    	__event3 = new agents.Auction.__Event3();
    }
  }
}
