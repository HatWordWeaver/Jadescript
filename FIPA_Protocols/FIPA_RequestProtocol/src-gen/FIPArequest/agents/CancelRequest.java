package FIPArequest.agents;

import FIPArequest.onto.OntologyRequest;
import FIPArequest.onto.compute_request;
import FIPArequest.onto.operation;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class CancelRequest extends OneShotBehaviour<Initiator> {
  private Initiator __theAgent = (FIPArequest.agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static CancelRequest __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.CancelRequest(_agentEnv, new FIPArequest.onto.compute_request(), new FIPArequest.onto.operation());
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

  public OntologyRequest __ontology__FIPArequest_onto_OntologyRequest = (FIPArequest.onto.OntologyRequest) FIPArequest.onto.OntologyRequest.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(FIPArequest.onto.OntologyRequest.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected compute_request data = null;

  public void setData(final compute_request data) {
    this.data = data;
  }

  public compute_request getData() {
    return this.data;
  }

  protected operation operation_requested = null;

  public void setOperation_requested(final operation operation_requested) {
    this.operation_requested = operation_requested;
  }

  public operation getOperation_requested() {
    return this.operation_requested;
  }

  public CancelRequest(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final compute_request data, final operation operation_requested) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 148
    	 * data of this = data
    	 */
    	
    	CancelRequest.this.setData(data);
    	
    	/* 
    	 * Compiled from source statement at line 149
    	 * operation_requested of this = operation_requested
    	 */
    	
    	CancelRequest.this.setOperation_requested(operation_requested);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event3 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement at line 152
      	 * send message cancel(send_request(data, operation_requested)) to "Partecipant"@
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("cancel");
      		
      		java.lang.Object _contentToBeSent1674154646 = (FIPArequest.onto.OntologyRequest.send_request(CancelRequest.this.getData() ,CancelRequest.this.getOperation_requested()));
      		
      		jadescript.core.message.Message _synthesizedMessage1674154646 = new jadescript.core.message.Message(jadescript.core.message.Message.CANCEL);
      		
      		_synthesizedMessage1674154646.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1674154646,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
      		
      		_synthesizedMessage1674154646.setLanguage(__codec.getName());;
      		
      		_synthesizedMessage1674154646.addReceiver(new jade.core.AID(java.lang.String.valueOf("Partecipant"), false));
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1674154646, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1674154646, "cancel"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage1674154646);
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

  private CancelRequest.__Event3 __event3 =  new FIPArequest.agents.CancelRequest.__Event3();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(CancelRequest.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	CancelRequest.this.data = new FIPArequest.onto.compute_request();
    	
    	CancelRequest.this.operation_requested = new FIPArequest.onto.operation();
    }
  }
}
