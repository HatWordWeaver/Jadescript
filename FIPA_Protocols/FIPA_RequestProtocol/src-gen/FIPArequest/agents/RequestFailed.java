package FIPArequest.agents;

import FIPArequest.onto.OntologyRequest;
import FIPArequest.onto.compute_request;
import FIPArequest.onto.operation;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class RequestFailed extends OneShotBehaviour<Partecipant> {
  private Partecipant __theAgent = (FIPArequest.agents.Partecipant)/*Used as metadata*/null;

  private AgentEnv<Partecipant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static RequestFailed __createEmpty(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.RequestFailed(_agentEnv, new FIPArequest.onto.compute_request(), new jade.core.AID(), new FIPArequest.onto.operation());
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event4.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event4.__eventFired) __awaitForEvents();
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

  protected compute_request requested = null;

  public void setRequested(final compute_request requested) {
    this.requested = requested;
  }

  public compute_request getRequested() {
    return this.requested;
  }

  protected AID who_sent = null;

  public void setWho_sent(final AID who_sent) {
    this.who_sent = who_sent;
  }

  public AID getWho_sent() {
    return this.who_sent;
  }

  protected operation op_req = null;

  public void setOp_req(final operation op_req) {
    this.op_req = op_req;
  }

  public operation getOp_req() {
    return this.op_req;
  }

  public RequestFailed(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final compute_request requested, final AID who_sent, final operation op_req) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 135
    	 * requested of this = requested
    	 */
    	
    	RequestFailed.this.setRequested(requested);
    	
    	/* 
    	 * Compiled from source statement at line 136
    	 * who_sent of this = who_sent
    	 */
    	
    	RequestFailed.this.setWho_sent(who_sent);
    	
    	/* 
    	 * Compiled from source statement at line 137
    	 * op_req of this = op_req
    	 */
    	
    	RequestFailed.this.setOp_req(op_req);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event4 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement at line 140
      	 * send message failure(send_request(requested, op_req), TaskFailed) to who_sent
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("failure");
      		
      		java.lang.Object _contentToBeSent325862978 = new jadescript.lang.Tuple.Tuple2<FIPArequest.onto.send_request, FIPArequest.onto.TaskFailed>(FIPArequest.onto.OntologyRequest.send_request(RequestFailed.this.getRequested() ,RequestFailed.this.getOp_req()), FIPArequest.onto.OntologyRequest.TaskFailed());
      		
      		jadescript.core.message.Message _synthesizedMessage325862978 = new jadescript.core.message.Message(jadescript.core.message.Message.FAILURE);
      		
      		_synthesizedMessage325862978.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent325862978,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
      		
      		_synthesizedMessage325862978.setLanguage(__codec.getName());;
      		
      		_synthesizedMessage325862978.addReceiver(RequestFailed.this.getWho_sent());
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage325862978, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent325862978, "failure"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage325862978);
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
    }
  }

  private RequestFailed.__Event4 __event4 =  new FIPArequest.agents.RequestFailed.__Event4();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(RequestFailed.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	RequestFailed.this.requested = new FIPArequest.onto.compute_request();
    	
    	RequestFailed.this.who_sent = new jade.core.AID();
    	
    	RequestFailed.this.op_req = new FIPArequest.onto.operation();
    }
  }
}
