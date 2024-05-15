package FIPArequest.agents;

import FIPArequest.onto.OntologyRequest;
import FIPArequest.onto.compute_request;
import FIPArequest.onto.operation;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class WaitForRequest extends CyclicBehaviour<Partecipant> {
  private Partecipant __theAgent = (FIPArequest.agents.Partecipant)/*Used as metadata*/null;

  private AgentEnv<Partecipant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WaitForRequest(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static WaitForRequest __createEmpty(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.WaitForRequest(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event4.run();
    __event5.run();
    __event6.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event4.__eventFired && !__event5.__eventFired && !__event6.__eventFired) __awaitForEvents();
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

  /**
   * FIPArequest.agents.WaitForRequest doOnActivate
   */
  public void doOnActivate() {
    super.doOnActivate();
    try {
    	/* 
    	 * Compiled from source statement at line 35
    	 * log "***WaitForRequest behaviour activated.***"
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, WaitForRequest.this.getClass().getName(), WaitForRequest.this, "on activate", java.lang.String.valueOf("***WaitForRequest behaviour activated.***"));
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  protected compute_request data = null;

  public void setData(final compute_request data) {
    this.data = data;
  }

  public compute_request getData() {
    return this.data;
  }

  protected operation op_req = null;

  public void setOp_req(final operation op_req) {
    this.op_req = op_req;
  }

  public operation getOp_req() {
    return this.op_req;
  }

  protected AID who_sent = null;

  public void setWho_sent(final AID who_sent) {
    this.who_sent = who_sent;
  }

  public AID getWho_sent() {
    return this.who_sent;
  }

  private class __Event4 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForRequest.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher424661740 {
      	public FIPArequest.onto.compute_request sent;
      	
      	public FIPArequest.onto.operation operations;
      	
      	private final __PatternMatcher424661740 __PatternMatcher424661740_obj =  this;
      	
      	public boolean headerMatch_structterm0(java.lang.Object __objx) {
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
      		
      		sent = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm1(java.lang.Object __objx) {
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
      		
      		operations = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
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
      		
      		return true && headerMatch_structterm0(__x.getData()) && headerMatch_structterm1(__x.getOperation_request());
      	}
      }
      __PatternMatcher424661740 __PatternMatcher424661740_obj = new __PatternMatcher424661740();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher424661740_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      			 * Compiled from source statement from line 44 to line 47
      			 * do evaluateRequest with 
      			 *             sent, 
      			 *             sender of message,
      			 *             operations
      			 */
      			
      			WaitForRequest.this.evaluateRequest(_agentEnv.getAgent().toEnv() ,__PatternMatcher424661740_obj.sent ,((jadescript.core.message.RequestMessage<FIPArequest.onto.send_request>) __receivedMessage).getSender() ,__PatternMatcher424661740_obj.operations);
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

  private WaitForRequest.__Event4 __event4 = null;

  private class __Event5 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForRequest.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1987718895 {
      	public FIPArequest.onto.compute_request data_sent;
      	
      	public FIPArequest.onto.operation operation_sent;
      	
      	private final __PatternMatcher1987718895 __PatternMatcher1987718895_obj =  this;
      	
      	public boolean headerMatch__paren_structterm0(java.lang.Object __objx) {
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
      	
      	public boolean headerMatch__paren_structterm1(java.lang.Object __objx) {
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
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
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
      		
      		return true && headerMatch__paren_structterm0(__x.getData()) && headerMatch__paren_structterm1(__x.getOperation_request());
      	}
      }
      __PatternMatcher1987718895 __PatternMatcher1987718895_obj = new __PatternMatcher1987718895();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.CANCEL)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher1987718895_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher1987718895_obj.data_sent.getId_of_message(), WaitForRequest.this.getData().getId_of_message()));
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
      			 * Compiled from source statement at line 51
      			 * send message inform(CancelAccepted(id_of_message of data)) to sender of message
      			 */
      			
      			try {
      				jadescript.util.SendMessageUtils.validatePerformative("inform");
      				
      				java.lang.Object _contentToBeSent1632534636 = (FIPArequest.onto.OntologyRequest.CancelAccepted(WaitForRequest.this.getData().getId_of_message()));
      				
      				jadescript.core.message.Message _synthesizedMessage1632534636 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      				
      				_synthesizedMessage1632534636.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1632534636,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
      				
      				_synthesizedMessage1632534636.setLanguage(__codec.getName());;
      				
      				_synthesizedMessage1632534636.addReceiver(((jadescript.core.message.CancelMessage<FIPArequest.onto.send_request>) __receivedMessage).getSender());
      				
      				_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1632534636, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1632534636, "inform"));
      				
      				_agentEnv.getAgent().send(_synthesizedMessage1632534636);
      			}
      			catch(java.lang.Throwable _t) {
      				throw jadescript.core.exception.JadescriptException.wrap(_t);
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

  private WaitForRequest.__Event5 __event5 = null;

  private class __Event6 {
    Boolean __eventFired = false;

    public void run() {
      if(WaitForRequest.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1055802103 {
      	private final __PatternMatcher1055802103 __PatternMatcher1055802103_obj =  this;
      	
      	public boolean headerMatch__paren(java.lang.Object __objx) {
      		FIPArequest.onto.Acknowledge __x;
      		
      		try {
      			if(__objx instanceof FIPArequest.onto.Acknowledge) {
      				__x = (FIPArequest.onto.Acknowledge) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, FIPArequest.onto.OntologyRequest.Acknowledge());
      	}
      }
      __PatternMatcher1055802103 __PatternMatcher1055802103_obj = new __PatternMatcher1055802103();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1055802103_obj.headerMatch__paren(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      			 * Compiled from source statement at line 57
      			 * do compute with data, op_req, who_sent
      			 */
      			
      			WaitForRequest.this.compute(_agentEnv.getAgent().toEnv() ,WaitForRequest.this.getData() ,WaitForRequest.this.getOp_req() ,WaitForRequest.this.getWho_sent());
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

  private WaitForRequest.__Event6 __event6 = null;

  public void compute(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final compute_request data, final operation op_req, final AID who_sent) {
    {
    	/* 
    	 * Compiled from source statement from line 66 to line 78
    	 * if value2 of op_req = 0 or value1 of op_req = 0 do
    	 *             # we can't divide by zero so we return a message failure
    	 *             if operator of op_req = "DIV" and value2 of op_req = 0 do
    	 *                 activate RequestFailed(data, who_sent, op_req)after "PT3S" as duration
    	 *             # in this case isn't necessary to perform the operation
    	 *             else if operator of op_req = "ADD" or operator of op_req = "SUB" do
    	 *                 activate SuccessNoInformResult(who_sent, id_of_message of data) after "PT3S" as duration
    	 *             else if operator of op_req = "DIV" or operator of op_req = "MUL" do
    	 *                 activate SuccessWithInformResult(who_sent, 0, id_of_message of data) after "PT3S" as duration
    	 *         # in any other case we perform the operation and send a message with the value
    	 *         else do
    	 *               result = executeOperation(value1 of op_req, value2 of op_req, operator of  op_req)
    	 *               activate SuccessWithInformResult(who_sent, result, id_of_message of data) after "PT3S" as duration
    	 */
    	
    	if(java.util.Objects.equals(op_req.getValue2(), 0) || java.util.Objects.equals(op_req.getValue1(), 0)) {
    		/* 
    		 * Compiled from source statement from line 68 to line 74
    		 * if operator of op_req = "DIV" and value2 of op_req = 0 do
    		 *                 activate RequestFailed(data, who_sent, op_req)after "PT3S" as duration
    		 *             # in this case isn't necessary to perform the operation
    		 *             else if operator of op_req = "ADD" or operator of op_req = "SUB" do
    		 *                 activate SuccessNoInformResult(who_sent, id_of_message of data) after "PT3S" as duration
    		 *             else if operator of op_req = "DIV" or operator of op_req = "MUL" do
    		 *                 activate SuccessWithInformResult(who_sent, 0, id_of_message of data) after "PT3S" as duration
    		 */
    		
    		if(java.util.Objects.equals(op_req.getOperator(), "DIV") && java.util.Objects.equals(op_req.getValue2(), 0)) {
    			/* 
    			 * Compiled from source statement at line 69
    			 * activate RequestFailed(data, who_sent, op_req)after "PT3S" as duration
    			 */
    			
    			new FIPArequest.agents.RequestFailed(_agentEnv.getAgent().toEnv() ,data ,who_sent ,op_req).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT3S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
    		}
    		else if(java.util.Objects.equals(op_req.getOperator(), "ADD") || java.util.Objects.equals(op_req.getOperator(), "SUB")) {
    			/* 
    			 * Compiled from source statement at line 72
    			 * activate SuccessNoInformResult(who_sent, id_of_message of data) after "PT3S" as duration
    			 */
    			
    			new FIPArequest.agents.SuccessNoInformResult(_agentEnv.getAgent().toEnv() ,who_sent ,data.getId_of_message()).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT3S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
    		}
    		else if(java.util.Objects.equals(op_req.getOperator(), "DIV") || java.util.Objects.equals(op_req.getOperator(), "MUL")) {
    			/* 
    			 * Compiled from source statement at line 74
    			 * activate SuccessWithInformResult(who_sent, 0, id_of_message of data) after "PT3S" as duration
    			 */
    			
    			new FIPArequest.agents.SuccessWithInformResult(_agentEnv.getAgent().toEnv() ,who_sent ,0 ,data.getId_of_message()).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT3S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
    		}
    	}
    	else {
    		/* 
    		 * Compiled from source statement at line 77
    		 * result = executeOperation(value1 of op_req, value2 of op_req, operator of  op_req)
    		 */
    		
    		java.lang.Integer result = FIPArequest.agents.executeOperation.executeOperation(_agentEnv.getAgent().toEnv() ,op_req.getValue1() ,op_req.getValue2() ,op_req.getOperator());
    		
    		/* 
    		 * Compiled from source statement at line 78
    		 * activate SuccessWithInformResult(who_sent, result, id_of_message of data) after "PT3S" as duration
    		 */
    		
    		new FIPArequest.agents.SuccessWithInformResult(_agentEnv.getAgent().toEnv() ,who_sent ,result ,data.getId_of_message()).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT3S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
    	}
    }
  }

  public void evaluateRequest(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final compute_request req, final AID who_sent, final operation op_req) {
    {
    	/* 
    	 * Compiled from source statement at line 89
    	 * data of this = req
    	 */
    	
    	WaitForRequest.this.setData(req);
    	
    	/* 
    	 * Compiled from source statement at line 90
    	 * who_sent of this = who_sent
    	 */
    	
    	WaitForRequest.this.setWho_sent(who_sent);
    	
    	/* 
    	 * Compiled from source statement at line 91
    	 * op_req of this = op_req
    	 */
    	
    	WaitForRequest.this.setOp_req(op_req);
    	
    	/* 
    	 * Compiled from source statement at line 93
    	 * symbol = operator of op_req
    	 */
    	
    	java.lang.String symbol = op_req.getOperator();
    	
    	/* 
    	 * Compiled from source statement from line 97 to line 107
    	 * if symbol = "ADD" or symbol = "SUB" or symbol = "MUL" or symbol = "DIV" do          
    	 *             # setting the value "agree" in the message as true
    	 *             agreed of req = true
    	 *             # if the Initiator request a notification, the Partecipant send it
    	 *             if notification_necessary of req = true do
    	 *                 send message agree(send_request(req, op_req), Accepted) to who_sent
    	 *             else do
    	 *                 do compute with data, op_req, who_sent
    	 *         else do
    	 *             refused of req = true
    	 *             send message refuse(send_request(req, op_req), NotAccepted) to who_sent
    	 */
    	
    	if(java.util.Objects.equals(symbol, "ADD") || java.util.Objects.equals(symbol, "SUB") || java.util.Objects.equals(symbol, "MUL") || java.util.Objects.equals(symbol, "DIV")) {
    		/* 
    		 * Compiled from source statement at line 99
    		 * agreed of req = true
    		 */
    		
    		req.setAgreed(true);
    		
    		/* 
    		 * Compiled from source statement from line 101 to line 104
    		 * if notification_necessary of req = true do
    		 *                 send message agree(send_request(req, op_req), Accepted) to who_sent
    		 *             else do
    		 *                 do compute with data, op_req, who_sent
    		 */
    		
    		if(java.util.Objects.equals(req.getNotification_necessary(), true)) {
    			/* 
    			 * Compiled from source statement at line 102
    			 * send message agree(send_request(req, op_req), Accepted) to who_sent
    			 */
    			
    			try {
    				jadescript.util.SendMessageUtils.validatePerformative("agree");
    				
    				java.lang.Object _contentToBeSent228476114 = new jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.Accepted>(FIPArequest.onto.OntologyRequest.send_request(req ,op_req), FIPArequest.onto.OntologyRequest.Accepted());
    				
    				jadescript.core.message.Message _synthesizedMessage228476114 = new jadescript.core.message.Message(jadescript.core.message.Message.AGREE);
    				
    				_synthesizedMessage228476114.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent228476114,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
    				
    				_synthesizedMessage228476114.setLanguage(__codec.getName());;
    				
    				_synthesizedMessage228476114.addReceiver(who_sent);
    				
    				_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage228476114, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent228476114, "agree"));
    				
    				_agentEnv.getAgent().send(_synthesizedMessage228476114);
    			}
    			catch(java.lang.Throwable _t) {
    				throw jadescript.core.exception.JadescriptException.wrap(_t);
    			}
    		}
    		else {
    			/* 
    			 * Compiled from source statement at line 104
    			 * do compute with data, op_req, who_sent
    			 */
    			
    			WaitForRequest.this.compute(_agentEnv.getAgent().toEnv() ,WaitForRequest.this.getData() ,op_req ,who_sent);
    		}
    	}
    	else {
    		/* 
    		 * Compiled from source statement at line 106
    		 * refused of req = true
    		 */
    		
    		req.setRefused(true);
    		
    		/* 
    		 * Compiled from source statement at line 107
    		 * send message refuse(send_request(req, op_req), NotAccepted) to who_sent
    		 */
    		
    		try {
    			jadescript.util.SendMessageUtils.validatePerformative("refuse");
    			
    			java.lang.Object _contentToBeSent1109000569 = new jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.NotAccepted>(FIPArequest.onto.OntologyRequest.send_request(req ,op_req), FIPArequest.onto.OntologyRequest.NotAccepted());
    			
    			jadescript.core.message.Message _synthesizedMessage1109000569 = new jadescript.core.message.Message(jadescript.core.message.Message.REFUSE);
    			
    			_synthesizedMessage1109000569.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1109000569,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
    			
    			_synthesizedMessage1109000569.setLanguage(__codec.getName());;
    			
    			_synthesizedMessage1109000569.addReceiver(who_sent);
    			
    			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1109000569, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1109000569, "refuse"));
    			
    			_agentEnv.getAgent().send(_synthesizedMessage1109000569);
    		}
    		catch(java.lang.Throwable _t) {
    			throw jadescript.core.exception.JadescriptException.wrap(_t);
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
    	WaitForRequest.this.data = new FIPArequest.onto.compute_request();
    	
    	WaitForRequest.this.op_req = new FIPArequest.onto.operation();
    	
    	WaitForRequest.this.who_sent = new jade.core.AID();
    	
    	__event4 = new FIPArequest.agents.WaitForRequest.__Event4();
    	
    	__event5 = new FIPArequest.agents.WaitForRequest.__Event5();
    	
    	__event6 = new FIPArequest.agents.WaitForRequest.__Event6();
    }
  }
}
