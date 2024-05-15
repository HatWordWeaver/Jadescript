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
public class WaitForResult extends CyclicBehaviour<Initiator> {
  private Initiator __theAgent = (FIPArequest.agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static WaitForResult __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.WaitForResult(_agentEnv, 0);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event2.run();
    __event3.run();
    __event4.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event2.__eventFired && !__event3.__eventFired && !__event4.__eventFired) __awaitForEvents();
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

  public WaitForResult(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Integer conversation_id) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 118
    	 * conversation_id of this = conversation_id
    	 */
    	
    	WaitForResult.this.setConversation_id(conversation_id);
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
      if(WaitForResult.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1910324456 {
      	public java.lang.Integer result;
      	
      	public java.lang.Integer id_of_message;
      	
      	private final __PatternMatcher1910324456 __PatternMatcher1910324456_obj =  this;
      	
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
      		
      		result = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch__paren_structterm1(java.lang.Object __objx) {
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
      		
      		id_of_message = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		FIPArequest.onto.TaskSuccessResult __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.TaskSuccessResult) {
      				__x = (FIPArequest.onto.TaskSuccessResult) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch__paren_structterm0(__x.getResult()) && headerMatch__paren_structterm1(__x.getId_of_request());
      	}
      }
      __PatternMatcher1910324456 __PatternMatcher1910324456_obj = new __PatternMatcher1910324456();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher1910324456_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher1910324456_obj.id_of_message, WaitForResult.this.getConversation_id()));
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
      	WaitForResult.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 122
      			 * log "Result: " + result + "."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResult.this.getClass().getName(), WaitForResult.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Result: ") + java.lang.String.valueOf(__PatternMatcher1910324456_obj.result)) + java.lang.String.valueOf(".")));
      			
      			/* 
      			 * Compiled from source statement at line 123
      			 * deactivate this
      			 */
      			
      			WaitForResult.this.deactivate();
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

  private WaitForResult.__Event2 __event2 = null;

  private class __Event3 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForResult.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1975828680 {
      	public FIPArequest.onto.compute_request response_message;
      	
      	public FIPArequest.onto.operation response_op;
      	
      	private final __PatternMatcher1975828680 __PatternMatcher1975828680_obj =  this;
      	
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
      		FIPArequest.onto.TaskFailed __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.TaskFailed) {
      				__x = (FIPArequest.onto.TaskFailed) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, FIPArequest.onto.OntologyRequest.TaskFailed());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.TaskFailed> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.TaskFailed>) __objx;
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
      __PatternMatcher1975828680 __PatternMatcher1975828680_obj = new __PatternMatcher1975828680();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.FAILURE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher1975828680_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher1975828680_obj.response_message.getId_of_message(), WaitForResult.this.getConversation_id()));
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
      	WaitForResult.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 127
      			 * log "Failure occurred."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResult.this.getClass().getName(), WaitForResult.this, "on failure", java.lang.String.valueOf("Failure occurred."));
      			
      			/* 
      			 * Compiled from source statement at line 128
      			 * deactivate this
      			 */
      			
      			WaitForResult.this.deactivate();
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

  private WaitForResult.__Event3 __event3 = null;

  private class __Event4 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForResult.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher78880413 {
      	public java.lang.Integer id_of_message;
      	
      	private final __PatternMatcher78880413 __PatternMatcher78880413_obj =  this;
      	
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
      		
      		id_of_message = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		FIPArequest.onto.TaskSuccess __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.TaskSuccess) {
      				__x = (FIPArequest.onto.TaskSuccess) __objx;
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
      __PatternMatcher78880413 __PatternMatcher78880413_obj = new __PatternMatcher78880413();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher78880413_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher78880413_obj.id_of_message, WaitForResult.this.getConversation_id()));
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
      	WaitForResult.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 132
      			 * log "Task completed."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResult.this.getClass().getName(), WaitForResult.this, "on inform", java.lang.String.valueOf("Task completed."));
      			
      			/* 
      			 * Compiled from source statement at line 133
      			 * deactivate this
      			 */
      			
      			WaitForResult.this.deactivate();
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

  private WaitForResult.__Event4 __event4 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WaitForResult.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	WaitForResult.this.conversation_id = 0;
    	
    	__event2 = new FIPArequest.agents.WaitForResult.__Event2();
    	
    	__event3 = new FIPArequest.agents.WaitForResult.__Event3();
    	
    	__event4 = new FIPArequest.agents.WaitForResult.__Event4();
    }
  }
}
