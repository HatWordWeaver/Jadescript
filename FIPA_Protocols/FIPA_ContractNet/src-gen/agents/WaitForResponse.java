package agents;

import CNontology.ContractNet;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class WaitForResponse extends CyclicBehaviour<Initiator> {
  private Initiator __theAgent = (agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WaitForResponse(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static WaitForResponse __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.WaitForResponse(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event1.run();
    __event2.run();
    __event3.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event1.__eventFired && !__event2.__eventFired && !__event3.__eventFired) __awaitForEvents();
  }

  public Boolean __hasStaleMessageHandler() {
    return false;
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public ContractNet __ontology__CNontology_ContractNet = (CNontology.ContractNet) CNontology.ContractNet.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(CNontology.ContractNet.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected Integer counter = null;

  public void setCounter(final Integer counter) {
    this.counter = counter;
  }

  public Integer getCounter() {
    return this.counter;
  }

  private class __Event1 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement from line 64 to line 72
      	 * if now ≥ shutdown_time do
      	 *             log "Time for proposed expired."
      	 *             activate RefusePropose
      	 *             if counter ≠ 0 do
      	 *                 activate waitForInform
      	 *                 deactivate this
      	 *             else do
      	 *                 log "Nobody accepted. Shutting down..."
      	 *                 deactivate this
      	 */
      	
      	if(jadescript.lang.Timestamp.compare(jadescript.lang.Timestamp.now(), WaitForResponse.this._agentEnv.getAgent().getShutdown_time()) >= 0) {
      		/* 
      		 * Compiled from source statement at line 65
      		 * log "Time for proposed expired."
      		 */
      		
      		jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on execute", java.lang.String.valueOf("Time for proposed expired."));
      		
      		/* 
      		 * Compiled from source statement at line 66
      		 * activate RefusePropose
      		 */
      		
      		new agents.RefusePropose(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      		
      		/* 
      		 * Compiled from source statement from line 67 to line 72
      		 * if counter ≠ 0 do
      		 *                 activate waitForInform
      		 *                 deactivate this
      		 *             else do
      		 *                 log "Nobody accepted. Shutting down..."
      		 *                 deactivate this
      		 */
      		
      		if(!java.util.Objects.equals(WaitForResponse.this.getCounter(), 0)) {
      			/* 
      			 * Compiled from source statement at line 68
      			 * activate waitForInform
      			 */
      			
      			WaitForResponse.this._agentEnv.getAgent().getWaitForInform().activate(_agentEnv.getAgent());
      			
      			/* 
      			 * Compiled from source statement at line 69
      			 * deactivate this
      			 */
      			
      			WaitForResponse.this.deactivate();
      		}
      		else {
      			/* 
      			 * Compiled from source statement at line 71
      			 * log "Nobody accepted. Shutting down..."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on execute", java.lang.String.valueOf("Nobody accepted. Shutting down..."));
      			
      			/* 
      			 * Compiled from source statement at line 72
      			 * deactivate this
      			 */
      			
      			WaitForResponse.this.deactivate();
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

  private WaitForResponse.__Event1 __event1 =  new agents.WaitForResponse.__Event1();

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForResponse.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1185798346 {
      	public java.lang.Integer cost;
      	
      	public jadescript.lang.Duration time;
      	
      	public java.lang.Integer message_id;
      	
      	private final __PatternMatcher1185798346 __PatternMatcher1185798346_obj =  this;
      	
      	public boolean headerMatch_tupleelem0_structterm0(java.lang.Object __objx) {
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
      		
      		cost = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm1(java.lang.Object __objx) {
      		jadescript.lang.Duration __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Duration) {
      				__x = (jadescript.lang.Duration) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		time = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm2(java.lang.Object __objx) {
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
      		
      		message_id = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0(java.lang.Object __objx) {
      		CNontology.ParticipantCost __x;
      		
      		try {
      			if(__objx instanceof CNontology.ParticipantCost) {
      				__x = (CNontology.ParticipantCost) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_structterm0(__x.getComputeCost()) && headerMatch_tupleelem0_structterm1(__x.getComputeTime()) && headerMatch_tupleelem0_structterm2(__x.getConversation_id());
      	}
      	
      	public boolean headerMatch_tupleelem1(java.lang.Object __objx) {
      		CNontology.CostForMe __x;
      		
      		try {
      			if(__objx instanceof CNontology.CostForMe) {
      				__x = (CNontology.CostForMe) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, CNontology.ContractNet.CostForMe());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.CostForMe> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.CostForMe>) __objx;
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
      __PatternMatcher1185798346 __PatternMatcher1185798346_obj = new __PatternMatcher1185798346();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.PROPOSE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher1185798346_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher1185798346_obj.message_id, WaitForResponse.this._agentEnv.getAgent().getConversation_id()));
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
      			 * Compiled from source statement at line 78
      			 * log "Proposed by " + name of sender + " : \nCosto: " + cost + "\nTempo: " + time
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on propose", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Proposed by ") + java.lang.String.valueOf(__receivedMessage.getSender().getName())) + java.lang.String.valueOf(" : \nCosto: ")) + java.lang.String.valueOf(__PatternMatcher1185798346_obj.cost)) + java.lang.String.valueOf("\nTempo: ")) + java.lang.String.valueOf(__PatternMatcher1185798346_obj.time)));
      			
      			/* 
      			 * Compiled from source statement from line 79 to line 85
      			 * if cost < 10 do
      			 *             log"sending message of accept to " + sender of message
      			 *             activate SendResponse(cost, time, message_id, "accept", sender of message) at shutdown_time
      			 *             counter = counter + 1
      			 *         else do
      			 *             log"sending message of refuse to " + sender of message
      			 *             activate SendResponse(cost, time, message_id, "refuse", sender of message) at shutdown_time
      			 */
      			
      			if(__PatternMatcher1185798346_obj.cost < 10) {
      				/* 
      				 * Compiled from source statement at line 80
      				 * log"sending message of accept to " + sender of message
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on propose", java.lang.String.valueOf(java.lang.String.valueOf("sending message of accept to ") + java.lang.String.valueOf(((jadescript.core.message.ProposeMessage<CNontology.ParticipantCost, CNontology.CostForMe>) __receivedMessage).getSender())));
      				
      				/* 
      				 * Compiled from source statement at line 81
      				 * activate SendResponse(cost, time, message_id, "accept", sender of message) at shutdown_time
      				 */
      				
      				new agents.SendResponse(_agentEnv.getAgent().toEnv() ,__PatternMatcher1185798346_obj.cost ,__PatternMatcher1185798346_obj.time ,__PatternMatcher1185798346_obj.message_id ,"accept" ,((jadescript.core.message.ProposeMessage<CNontology.ParticipantCost, CNontology.CostForMe>) __receivedMessage).getSender()).activate_at(_agentEnv.getAgent(), WaitForResponse.this._agentEnv.getAgent().getShutdown_time());
      				
      				/* 
      				 * Compiled from source statement at line 82
      				 * counter = counter + 1
      				 */
      				
      				WaitForResponse.this.setCounter(WaitForResponse.this.getCounter() + 1);
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 84
      				 * log"sending message of refuse to " + sender of message
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on propose", java.lang.String.valueOf(java.lang.String.valueOf("sending message of refuse to ") + java.lang.String.valueOf(((jadescript.core.message.ProposeMessage<CNontology.ParticipantCost, CNontology.CostForMe>) __receivedMessage).getSender())));
      				
      				/* 
      				 * Compiled from source statement at line 85
      				 * activate SendResponse(cost, time, message_id, "refuse", sender of message) at shutdown_time
      				 */
      				
      				new agents.SendResponse(_agentEnv.getAgent().toEnv() ,__PatternMatcher1185798346_obj.cost ,__PatternMatcher1185798346_obj.time ,__PatternMatcher1185798346_obj.message_id ,"refuse" ,((jadescript.core.message.ProposeMessage<CNontology.ParticipantCost, CNontology.CostForMe>) __receivedMessage).getSender()).activate_at(_agentEnv.getAgent(), WaitForResponse.this._agentEnv.getAgent().getShutdown_time());
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

  private WaitForResponse.__Event2 __event2 = null;

  private class __Event3 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForResponse.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1926475561 {
      	public CNontology.Task received;
      	
      	public java.lang.Integer message_id;
      	
      	private final __PatternMatcher1926475561 __PatternMatcher1926475561_obj =  this;
      	
      	public boolean headerMatch_tupleelem0_typecast0(java.lang.Object __objx) {
      		CNontology.Task __x;
      		
      		try {
      			if(__objx instanceof CNontology.Task) {
      				__x = (CNontology.Task) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		received = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0(java.lang.Object __objx) {
      		CNontology.Task __x;
      		
      		try {
      			if(__objx instanceof CNontology.Task) {
      				__x = (CNontology.Task) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_typecast0(__x);
      	}
      	
      	public boolean headerMatch_tupleelem1_structterm0(java.lang.Object __objx) {
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
      		
      		message_id = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem1(java.lang.Object __objx) {
      		CNontology.NoTime __x;
      		
      		try {
      			if(__objx instanceof CNontology.NoTime) {
      				__x = (CNontology.NoTime) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem1_structterm0(__x.getConversation_id());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<CNontology.Task, CNontology.NoTime> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<CNontology.Task, CNontology.NoTime>) __objx;
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
      __PatternMatcher1926475561 __PatternMatcher1926475561_obj = new __PatternMatcher1926475561();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REFUSE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher1926475561_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher1926475561_obj.message_id, WaitForResponse.this._agentEnv.getAgent().getConversation_id()));
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
      			 * Compiled from source statement at line 88
      			 * log "Refused."
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForResponse.this.getClass().getName(), WaitForResponse.this, "on refuse", java.lang.String.valueOf("Refused."));
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

  private WaitForResponse.__Event3 __event3 = null;

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
    	WaitForResponse.this.counter = 0;
    	
    	__event2 = new agents.WaitForResponse.__Event2();
    	
    	__event3 = new agents.WaitForResponse.__Event3();
    }
  }
}
