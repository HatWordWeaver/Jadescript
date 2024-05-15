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
public class WaitForRequest extends CyclicBehaviour<Participant> {
  private Participant __theAgent = (agents.Participant)/*Used as metadata*/null;

  private AgentEnv<Participant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WaitForRequest(final AgentEnv<? extends Participant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static WaitForRequest __createEmpty(final AgentEnv<? extends Participant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.WaitForRequest(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event0.run();
    __event1.run();
    __event2.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event0.__eventFired && !__event1.__eventFired && !__event2.__eventFired) __awaitForEvents();
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

  private class __Event0 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForRequest.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher201185140 {
      	public CNontology.Task received;
      	
      	private final __PatternMatcher201185140 __PatternMatcher201185140_obj =  this;
      	
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
      	
      	public boolean headerMatch_tupleelem1(java.lang.Object __objx) {
      		CNontology.Request __x;
      		
      		try {
      			if(__objx instanceof CNontology.Request) {
      				__x = (CNontology.Request) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, CNontology.ContractNet.Request());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<CNontology.Task, CNontology.Request> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<CNontology.Task, CNontology.Request>) __objx;
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
      __PatternMatcher201185140 __PatternMatcher201185140_obj = new __PatternMatcher201185140();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.CFP)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher201185140_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	WaitForRequest.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 34
      			 * log "Received!"
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForRequest.this.getClass().getName(), WaitForRequest.this, "on cfp", java.lang.String.valueOf("Received!"));
      			
      			/* 
      			 * Compiled from source statement at line 35
      			 * log "Task: " + received
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForRequest.this.getClass().getName(), WaitForRequest.this, "on cfp", java.lang.String.valueOf(java.lang.String.valueOf("Task: ") + java.lang.String.valueOf(__PatternMatcher201185140_obj.received)));
      			
      			/* 
      			 * Compiled from source statement at line 36
      			 * cond = condition of received
      			 */
      			
      			jadescript.lang.Duration cond = __PatternMatcher201185140_obj.received.getCondition();
      			
      			/* 
      			 * Compiled from source statement at line 37
      			 * toContact = sender of message
      			 */
      			
      			WaitForRequest.this._agentEnv.getAgent().setToContact(((jadescript.core.message.CFPMessage<CNontology.Task, CNontology.Request>) __receivedMessage).getSender());
      			
      			/* 
      			 * Compiled from source statement at line 38
      			 * conversation_id = conversation_id of received
      			 */
      			
      			WaitForRequest.this._agentEnv.getAgent().setConversation_id(__PatternMatcher201185140_obj.received.getConversation_id());
      			
      			/* 
      			 * Compiled from source statement at line 39
      			 * operation_required = operation of taskOp of received
      			 */
      			
      			java.lang.String operation_required = __PatternMatcher201185140_obj.received.getTaskOp().getOperation();
      			
      			/* 
      			 * Compiled from source statement at line 40
      			 * toAccept = operation_required = "ADD" or operation_required = "SUB" or operation_required = "MUL" or operation_required = "DIV"
      			 */
      			
      			java.lang.Boolean toAccept = java.util.Objects.equals(operation_required, "ADD") || java.util.Objects.equals(operation_required, "SUB") || java.util.Objects.equals(operation_required, "MUL") || java.util.Objects.equals(operation_required, "DIV");
      			
      			/* 
      			 * Compiled from source statement from line 41 to line 46
      			 * if cond > durOp as duration and toAccept do
      			 *             log "I can do it!"
      			 *             toExecute = received
      			 *             send message propose(ParticipantCost(price, durOp, conversation_id), CostForMe) to toContact
      			 *         else do
      			 *             send message refuse(received, NoTime(conversation_id)) to toContact
      			 */
      			
      			if(jadescript.lang.Duration.compare(cond, ((jadescript.lang.Duration) jadescript.util.types.Converter.convert(WaitForRequest.this._agentEnv.getAgent().getDurOp(), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION)))) > 0 && toAccept) {
      				/* 
      				 * Compiled from source statement at line 42
      				 * log "I can do it!"
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForRequest.this.getClass().getName(), WaitForRequest.this, "on cfp", java.lang.String.valueOf("I can do it!"));
      				
      				/* 
      				 * Compiled from source statement at line 43
      				 * toExecute = received
      				 */
      				
      				WaitForRequest.this._agentEnv.getAgent().setToExecute(__PatternMatcher201185140_obj.received);
      				
      				/* 
      				 * Compiled from source statement at line 44
      				 * send message propose(ParticipantCost(price, durOp, conversation_id), CostForMe) to toContact
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("propose");
      					
      					java.lang.Object _contentToBeSent1692844352 = new jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.CostForMe>(CNontology.ContractNet.ParticipantCost(WaitForRequest.this._agentEnv.getAgent().getPrice() ,WaitForRequest.this._agentEnv.getAgent().getDurOp() ,WaitForRequest.this._agentEnv.getAgent().getConversation_id()), CNontology.ContractNet.CostForMe());
      					
      					jadescript.core.message.Message _synthesizedMessage1692844352 = new jadescript.core.message.Message(jadescript.core.message.Message.PROPOSE);
      					
      					_synthesizedMessage1692844352.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1692844352,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      					
      					_synthesizedMessage1692844352.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1692844352.addReceiver(WaitForRequest.this._agentEnv.getAgent().getToContact());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1692844352, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1692844352, "propose"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1692844352);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 46
      				 * send message refuse(received, NoTime(conversation_id)) to toContact
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("refuse");
      					
      					java.lang.Object _contentToBeSent1322199090 = new jadescript.lang.Tuple.Tuple2<CNontology.Task, CNontology.NoTime>(__PatternMatcher201185140_obj.received, CNontology.ContractNet.NoTime(WaitForRequest.this._agentEnv.getAgent().getConversation_id()));
      					
      					jadescript.core.message.Message _synthesizedMessage1322199090 = new jadescript.core.message.Message(jadescript.core.message.Message.REFUSE);
      					
      					_synthesizedMessage1322199090.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1322199090,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      					
      					_synthesizedMessage1322199090.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1322199090.addReceiver(WaitForRequest.this._agentEnv.getAgent().getToContact());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1322199090, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1322199090, "refuse"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1322199090);
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

  private WaitForRequest.__Event0 __event0 = null;

  private class __Event1 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForRequest.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher387444962 {
      	public java.lang.Integer cost;
      	
      	public jadescript.lang.Duration time;
      	
      	public java.lang.Integer message_id;
      	
      	private final __PatternMatcher387444962 __PatternMatcher387444962_obj =  this;
      	
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
      		CNontology.AcceptPropose __x;
      		
      		try {
      			if(__objx instanceof CNontology.AcceptPropose) {
      				__x = (CNontology.AcceptPropose) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, CNontology.ContractNet.AcceptPropose());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.AcceptPropose> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.AcceptPropose>) __objx;
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
      __PatternMatcher387444962 __PatternMatcher387444962_obj = new __PatternMatcher387444962();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.ACCEPT_PROPOSAL)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher387444962_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher387444962_obj.message_id, WaitForRequest.this._agentEnv.getAgent().getConversation_id()));
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
      	WaitForRequest.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 49
      			 * do EvalueRequest with value1 of taskOp of toExecute, value2 of taskOp of toExecute, operation of taskOp of toExecute
      			 */
      			
      			WaitForRequest.this.EvalueRequest(_agentEnv.getAgent().toEnv() ,WaitForRequest.this._agentEnv.getAgent().getToExecute().getTaskOp().getValue1() ,WaitForRequest.this._agentEnv.getAgent().getToExecute().getTaskOp().getValue2() ,WaitForRequest.this._agentEnv.getAgent().getToExecute().getTaskOp().getOperation());
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

  private WaitForRequest.__Event1 __event1 = null;

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForRequest.this.__ignoreMessageHandlers) {
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
      	WaitForRequest.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			//do nothing;
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

  private WaitForRequest.__Event2 __event2 = null;

  public void EvalueRequest(final AgentEnv<? extends Participant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Integer value1, final Integer value2, final String operation) {
    {
    	/* 
    	 * Compiled from source statement at line 55
    	 * log"value1: " + value1 + " value2: " + value2 + " operation: " + operation
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForRequest.this.getClass().getName(), WaitForRequest.this, "EvalueRequest", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("value1: ") + java.lang.String.valueOf(value1)) + java.lang.String.valueOf(" value2: ")) + java.lang.String.valueOf(value2)) + java.lang.String.valueOf(" operation: ")) + java.lang.String.valueOf(operation)));
    	
    	/* 
    	 * Compiled from source statement from line 57 to line 85
    	 * if operation = "ADD" do
    	 *             if value1 = 0 do
    	 *                 activate SendResult(0, "done")
    	 *             else if value2 = 0 do
    	 *                 activate SendResult(0, "done")
    	 *             else do
    	 *                 activate SendResult(value1+value2, "res")
    	 *                 
    	 *         else if operation = "SUB" do
    	 *             if value1 = 0 do
    	 *                 activate SendResult(value2, "done")
    	 *             else if value2 = 0 do
    	 *                 activate SendResult(-value1, "res")
    	 *             else do
    	 *                 activate SendResult(value1-value2, "res")
    	 *     
    	 *         else if operation = "MUL" do
    	 *             if value1 = 0 or value2 = 0 do
    	 *                 activate SendResult(0, "done")
    	 *             else do
    	 *                 activate SendResult(value1*value2, "res")
    	 *                 
    	 *         else if operation = "DIV" do
    	 *             if value2 = 0 do
    	 *                 activate SendFailure
    	 *             else if value1 = 0 do
    	 *                 activate SendResult(0, "done")
    	 *             else do
    	 *                 activate SendResult(value1/value2, "res")
    	 */
    	
    	if(java.util.Objects.equals(operation, "ADD")) {
    		/* 
    		 * Compiled from source statement from line 58 to line 63
    		 * if value1 = 0 do
    		 *                 activate SendResult(0, "done")
    		 *             else if value2 = 0 do
    		 *                 activate SendResult(0, "done")
    		 *             else do
    		 *                 activate SendResult(value1+value2, "res")
    		 */
    		
    		if(java.util.Objects.equals(value1, 0)) {
    			/* 
    			 * Compiled from source statement at line 59
    			 * activate SendResult(0, "done")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,0 ,"done").activate(_agentEnv.getAgent());
    		}
    		else if(java.util.Objects.equals(value2, 0)) {
    			/* 
    			 * Compiled from source statement at line 61
    			 * activate SendResult(0, "done")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,0 ,"done").activate(_agentEnv.getAgent());
    		}
    		else {
    			/* 
    			 * Compiled from source statement at line 63
    			 * activate SendResult(value1+value2, "res")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,value1 + value2 ,"res").activate(_agentEnv.getAgent());
    		}
    	}
    	else if(java.util.Objects.equals(operation, "SUB")) {
    		/* 
    		 * Compiled from source statement from line 66 to line 71
    		 * if value1 = 0 do
    		 *                 activate SendResult(value2, "done")
    		 *             else if value2 = 0 do
    		 *                 activate SendResult(-value1, "res")
    		 *             else do
    		 *                 activate SendResult(value1-value2, "res")
    		 */
    		
    		if(java.util.Objects.equals(value1, 0)) {
    			/* 
    			 * Compiled from source statement at line 67
    			 * activate SendResult(value2, "done")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,value2 ,"done").activate(_agentEnv.getAgent());
    		}
    		else if(java.util.Objects.equals(value2, 0)) {
    			/* 
    			 * Compiled from source statement at line 69
    			 * activate SendResult(-value1, "res")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() , - value1 ,"res").activate(_agentEnv.getAgent());
    		}
    		else {
    			/* 
    			 * Compiled from source statement at line 71
    			 * activate SendResult(value1-value2, "res")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,value1 - value2 ,"res").activate(_agentEnv.getAgent());
    		}
    	}
    	else if(java.util.Objects.equals(operation, "MUL")) {
    		/* 
    		 * Compiled from source statement from line 74 to line 77
    		 * if value1 = 0 or value2 = 0 do
    		 *                 activate SendResult(0, "done")
    		 *             else do
    		 *                 activate SendResult(value1*value2, "res")
    		 */
    		
    		if(java.util.Objects.equals(value1, 0) || java.util.Objects.equals(value2, 0)) {
    			/* 
    			 * Compiled from source statement at line 75
    			 * activate SendResult(0, "done")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,0 ,"done").activate(_agentEnv.getAgent());
    		}
    		else {
    			/* 
    			 * Compiled from source statement at line 77
    			 * activate SendResult(value1*value2, "res")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,value1 * value2 ,"res").activate(_agentEnv.getAgent());
    		}
    	}
    	else if(java.util.Objects.equals(operation, "DIV")) {
    		/* 
    		 * Compiled from source statement from line 80 to line 85
    		 * if value2 = 0 do
    		 *                 activate SendFailure
    		 *             else if value1 = 0 do
    		 *                 activate SendResult(0, "done")
    		 *             else do
    		 *                 activate SendResult(value1/value2, "res")
    		 */
    		
    		if(java.util.Objects.equals(value2, 0)) {
    			/* 
    			 * Compiled from source statement at line 81
    			 * activate SendFailure
    			 */
    			
    			new agents.SendFailure(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    		}
    		else if(java.util.Objects.equals(value1, 0)) {
    			/* 
    			 * Compiled from source statement at line 83
    			 * activate SendResult(0, "done")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,0 ,"done").activate(_agentEnv.getAgent());
    		}
    		else {
    			/* 
    			 * Compiled from source statement at line 85
    			 * activate SendResult(value1/value2, "res")
    			 */
    			
    			new agents.SendResult(_agentEnv.getAgent().toEnv() ,value1 / value2 ,"res").activate(_agentEnv.getAgent());
    		}
    	}
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WaitForRequest.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new agents.WaitForRequest.__Event0();
    	
    	__event1 = new agents.WaitForRequest.__Event1();
    	
    	__event2 = new agents.WaitForRequest.__Event2();
    }
  }
}
