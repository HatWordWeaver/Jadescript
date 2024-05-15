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
public class WaitForResponse extends CyclicBehaviour<Initiator> {
  private Initiator __theAgent = (FIPArequest.agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static WaitForResponse __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.WaitForResponse(_agentEnv, 0);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event4.run();
    __event5.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event4.__eventFired && !__event5.__eventFired) __awaitForEvents();
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

  protected Integer abort = null;

  public void setAbort(final Integer abort) {
    this.abort = abort;
  }

  public Integer getAbort() {
    return this.abort;
  }

  public WaitForResponse(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Integer conversation_id) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 58
    	 * conversation_id of this = conversation_id
    	 */
    	
    	WaitForResponse.this.setConversation_id(conversation_id);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  /**
   * FIPArequest.agents.WaitForResponse doOnActivate
   */
  public void doOnActivate() {
    super.doOnActivate();
    try {
    	/* 
    	 * Compiled from source statement at line 62
    	 * log "*** Wait for response activated. ***"
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on activate", java.lang.String.valueOf("*** Wait for response activated. ***"));
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event4 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForResponse.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher842675141 {
      	public FIPArequest.onto.compute_request response_message;
      	
      	public FIPArequest.onto.operation response_op;
      	
      	private final __PatternMatcher842675141 __PatternMatcher842675141_obj =  this;
      	
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
      		
      		response_message = __x;
      		
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
      		
      		response_op = __x;
      		
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
      		FIPArequest.onto.NotAccepted __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.NotAccepted) {
      				__x = (FIPArequest.onto.NotAccepted) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, FIPArequest.onto.OntologyRequest.NotAccepted());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.NotAccepted> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.NotAccepted>) __objx;
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
      __PatternMatcher842675141 __PatternMatcher842675141_obj = new __PatternMatcher842675141();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REFUSE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher842675141_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitForResponse.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 66
      			 * log "Request refused by Partecipant."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on refuse", java.lang.String.valueOf("Request refused by Partecipant."));
      			
      			/* 
      			 * Compiled from source statement at line 67
      			 * deactivate this
      			 */
      			
      			WaitForResponse.this.deactivate();
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

  private WaitForResponse.__Event4 __event4 = null;

  private class __Event5 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForResponse.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1910222363 {
      	public FIPArequest.onto.compute_request response_message;
      	
      	public FIPArequest.onto.operation response_op;
      	
      	private final __PatternMatcher1910222363 __PatternMatcher1910222363_obj =  this;
      	
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
      		
      		response_message = __x;
      		
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
      		
      		response_op = __x;
      		
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
      		FIPArequest.onto.Accepted __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.Accepted) {
      				__x = (FIPArequest.onto.Accepted) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, FIPArequest.onto.OntologyRequest.Accepted());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.Accepted> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.Accepted>) __objx;
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
      __PatternMatcher1910222363 __PatternMatcher1910222363_obj = new __PatternMatcher1910222363();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.AGREE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher1910222363_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher1910222363_obj.response_message.getId_of_message(), WaitForResponse.this.getConversation_id()));
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
      	WaitForResponse.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 72
      			 * log "Request accepted by Partecipant."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on agree", java.lang.String.valueOf("Request accepted by Partecipant."));
      			
      			/* 
      			 * Compiled from source statement from line 74 to line 82
      			 * if abort = 0 do
      			 *                 #send message cancel(send_request(response_message, response_op)) to "Partecipant"@
      			 *                 activate CancelRequest(response_message, response_op) after "PT1S" as duration
      			 *                 activate WaitForConfirmCancel(conversation_id)
      			 *                 deactivate this
      			 *             else do
      			 *                 send message inform(Acknowledge) to "Partecipant"@
      			 *                 activate WaitForResult(conversation_id)
      			 *                 deactivate this
      			 */
      			
      			if(java.util.Objects.equals(WaitForResponse.this.getAbort(), 0)) {
      				/* 
      				 * Compiled from source statement at line 76
      				 * activate CancelRequest(response_message, response_op) after "PT1S" as duration
      				 */
      				
      				new FIPArequest.agents.CancelRequest(_agentEnv.getAgent().toEnv() ,__PatternMatcher1910222363_obj.response_message ,__PatternMatcher1910222363_obj.response_op).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT1S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
      				
      				/* 
      				 * Compiled from source statement at line 77
      				 * activate WaitForConfirmCancel(conversation_id)
      				 */
      				
      				new FIPArequest.agents.WaitForConfirmCancel(_agentEnv.getAgent().toEnv() ,WaitForResponse.this.getConversation_id()).activate(_agentEnv.getAgent());
      				
      				/* 
      				 * Compiled from source statement at line 78
      				 * deactivate this
      				 */
      				
      				WaitForResponse.this.deactivate();
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 80
      				 * send message inform(Acknowledge) to "Partecipant"@
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("inform");
      					
      					java.lang.Object _contentToBeSent118449788 = (FIPArequest.onto.OntologyRequest.Acknowledge());
      					
      					jadescript.core.message.Message _synthesizedMessage118449788 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      					
      					_synthesizedMessage118449788.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent118449788,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
      					
      					_synthesizedMessage118449788.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage118449788.addReceiver(new jade.core.AID(java.lang.String.valueOf("Partecipant"), false));
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage118449788, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent118449788, "inform"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage118449788);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 81
      				 * activate WaitForResult(conversation_id)
      				 */
      				
      				new FIPArequest.agents.WaitForResult(_agentEnv.getAgent().toEnv() ,WaitForResponse.this.getConversation_id()).activate(_agentEnv.getAgent());
      				
      				/* 
      				 * Compiled from source statement at line 82
      				 * deactivate this
      				 */
      				
      				WaitForResponse.this.deactivate();
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

  private WaitForResponse.__Event5 __event5 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WaitForResponse.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	WaitForResponse.this.conversation_id = 0;
    	
    	WaitForResponse.this.abort = ((java.lang.Integer) jadescript.util.types.Converter.convert(1, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	__event4 = new FIPArequest.agents.WaitForResponse.__Event4();
    	
    	__event5 = new FIPArequest.agents.WaitForResponse.__Event5();
    }
  }
}
