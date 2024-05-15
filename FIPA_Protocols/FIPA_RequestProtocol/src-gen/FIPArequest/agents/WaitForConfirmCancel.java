package FIPArequest.agents;

import FIPArequest.onto.OntologyRequest;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class WaitForConfirmCancel extends CyclicBehaviour<Initiator> {
  private Initiator __theAgent = (FIPArequest.agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static WaitForConfirmCancel __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.WaitForConfirmCancel(_agentEnv, 0);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event2.run();
    __event3.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event2.__eventFired && !__event3.__eventFired) __awaitForEvents();
  }

  public Boolean __hasStaleMessageHandler() {
    return false;
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public OntologyRequest __ontology__FIPArequest_onto_OntologyRequest = (FIPArequest.onto.OntologyRequest) FIPArequest.onto.OntologyRequest.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(FIPArequest.onto.OntologyRequest.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected Integer conversation_id = null;

  public void setConversation_id(final Integer conversation_id) {
    this.conversation_id = conversation_id;
  }

  public Integer getConversation_id() {
    return this.conversation_id;
  }

  public WaitForConfirmCancel(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Integer conversation_id) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 94
    	 * conversation_id of this = conversation_id
    	 */
    	
    	WaitForConfirmCancel.this.setConversation_id(conversation_id);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForConfirmCancel.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher29007283 {
      	public java.lang.Integer id_of_request;
      	
      	private final __PatternMatcher29007283 __PatternMatcher29007283_obj =  this;
      	
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
      		
      		id_of_request = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		FIPArequest.onto.CancelAccepted __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.CancelAccepted) {
      				__x = (FIPArequest.onto.CancelAccepted) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch__paren_structterm0(__x.getId_of_request());
      	}
      }
      __PatternMatcher29007283 __PatternMatcher29007283_obj = new __PatternMatcher29007283();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher29007283_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher29007283_obj.id_of_request, WaitForConfirmCancel.this.getConversation_id()));
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
      	WaitForConfirmCancel.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 98
      			 * log "Request deleted by Partecipant."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForConfirmCancel.this.getClass().getName(), WaitForConfirmCancel.this, "on inform", java.lang.String.valueOf("Request deleted by Partecipant."));
      			
      			/* 
      			 * Compiled from source statement at line 99
      			 * deactivate this
      			 */
      			
      			WaitForConfirmCancel.this.deactivate();
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

  private WaitForConfirmCancel.__Event2 __event2 = null;

  private class __Event3 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForConfirmCancel.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher398132349 {
      	public FIPArequest.onto.compute_request data_sent;
      	
      	public FIPArequest.onto.operation operation_sent;
      	
      	private final __PatternMatcher398132349 __PatternMatcher398132349_obj =  this;
      	
      	public boolean headerMatch_tupleelem0_structterm0(java.lang.Object __objx) {
      		FIPArequest.onto.compute_request __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.compute_request) {
      				__x = (FIPArequest.onto.compute_request) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		data_sent = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm1(java.lang.Object __objx) {
      		FIPArequest.onto.operation __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.operation) {
      				__x = (FIPArequest.onto.operation) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		operation_sent = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0(java.lang.Object __objx) {
      		FIPArequest.onto.send_request __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.send_request) {
      				__x = (FIPArequest.onto.send_request) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_structterm0(__x.getData()) && headerMatch_tupleelem0_structterm1(__x.getOperation_request());
      	}
      	
      	public boolean headerMatch_tupleelem1(java.lang.Object __objx) {
      		FIPArequest.onto.CancelNotAccepted __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.CancelNotAccepted) {
      				__x = (FIPArequest.onto.CancelNotAccepted) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, FIPArequest.onto.OntologyRequest.CancelNotAccepted());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.CancelNotAccepted> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.CancelNotAccepted>) __objx;
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
      __PatternMatcher398132349 __PatternMatcher398132349_obj = new __PatternMatcher398132349();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.FAILURE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher398132349_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher398132349_obj.data_sent.getId_of_message(), WaitForConfirmCancel.this.getConversation_id()));
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
      	WaitForConfirmCancel.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 103
      			 * log "Partecipant cant delete the request."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForConfirmCancel.this.getClass().getName(), WaitForConfirmCancel.this, "on failure", java.lang.String.valueOf("Partecipant cant delete the request."));
      			
      			/* 
      			 * Compiled from source statement at line 104
      			 * send message inform(Acknowledge) to "Partecipant"@
      			 */
      			
      			try {
      				jadescript.util.SendMessageUtils.validatePerformative("inform");
      				
      				java.lang.Object _contentToBeSent285123192 = (FIPArequest.onto.OntologyRequest.Acknowledge());
      				
      				jadescript.core.message.Message _synthesizedMessage285123192 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      				
      				_synthesizedMessage285123192.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent285123192,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
      				
      				_synthesizedMessage285123192.setLanguage(__codec.getName());;
      				
      				_synthesizedMessage285123192.addReceiver(new jade.core.AID(java.lang.String.valueOf("Partecipant"), false));
      				
      				_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage285123192, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent285123192, "inform"));
      				
      				_agentEnv.getAgent().send(_synthesizedMessage285123192);
      			}
      			catch(java.lang.Throwable _t) {
      				throw jadescript.core.exception.JadescriptException.wrap(_t);
      			}
      			
      			/* 
      			 * Compiled from source statement at line 106
      			 * activate WaitForResult(conversation_id)
      			 */
      			
      			new FIPArequest.agents.WaitForResult(_agentEnv.getAgent().toEnv() ,WaitForConfirmCancel.this.getConversation_id()).activate(_agentEnv.getAgent());
      			
      			/* 
      			 * Compiled from source statement at line 107
      			 * deactivate this
      			 */
      			
      			WaitForConfirmCancel.this.deactivate();
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

  private WaitForConfirmCancel.__Event3 __event3 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WaitForConfirmCancel.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	WaitForConfirmCancel.this.conversation_id = 0;
    	
    	__event2 = new FIPArequest.agents.WaitForConfirmCancel.__Event2();
    	
    	__event3 = new FIPArequest.agents.WaitForConfirmCancel.__Event3();
    }
  }
}
