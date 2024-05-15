package FIPArequest.agents;

import FIPArequest.onto.OntologyRequest;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class SuccessWithInformResult extends OneShotBehaviour<Partecipant> {
  private Partecipant __theAgent = (FIPArequest.agents.Partecipant)/*Used as metadata*/null;

  private AgentEnv<Partecipant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static SuccessWithInformResult __createEmpty(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.SuccessWithInformResult(_agentEnv, new jade.core.AID(), 0, 0);
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

  protected AID who_sent = null;

  public void setWho_sent(final AID who_sent) {
    this.who_sent = who_sent;
  }

  public AID getWho_sent() {
    return this.who_sent;
  }

  protected Integer result = null;

  public void setResult(final Integer result) {
    this.result = result;
  }

  public Integer getResult() {
    return this.result;
  }

  protected Integer id_of_message = null;

  public void setId_of_message(final Integer id_of_message) {
    this.id_of_message = id_of_message;
  }

  public Integer getId_of_message() {
    return this.id_of_message;
  }

  public SuccessWithInformResult(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final AID who_sent, final Integer result, final Integer id_of_message) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 174
    	 * who_sent of this = who_sent
    	 */
    	
    	SuccessWithInformResult.this.setWho_sent(who_sent);
    	
    	/* 
    	 * Compiled from source statement at line 175
    	 * result of this = result
    	 */
    	
    	SuccessWithInformResult.this.setResult(result);
    	
    	/* 
    	 * Compiled from source statement at line 176
    	 * id_of_message of this = id_of_message
    	 */
    	
    	SuccessWithInformResult.this.setId_of_message(id_of_message);
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
      	 * Compiled from source statement at line 179
      	 * send message inform(TaskSuccessResult(result, id_of_message)) to who_sent
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("inform");
      		
      		java.lang.Object _contentToBeSent760166928 = (FIPArequest.onto.OntologyRequest.TaskSuccessResult(SuccessWithInformResult.this.getResult() ,SuccessWithInformResult.this.getId_of_message()));
      		
      		jadescript.core.message.Message _synthesizedMessage760166928 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      		
      		_synthesizedMessage760166928.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent760166928,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
      		
      		_synthesizedMessage760166928.setLanguage(__codec.getName());;
      		
      		_synthesizedMessage760166928.addReceiver(SuccessWithInformResult.this.getWho_sent());
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage760166928, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent760166928, "inform"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage760166928);
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

  private SuccessWithInformResult.__Event4 __event4 =  new FIPArequest.agents.SuccessWithInformResult.__Event4();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(SuccessWithInformResult.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	SuccessWithInformResult.this.who_sent = new jade.core.AID();
    	
    	SuccessWithInformResult.this.result = 0;
    	
    	SuccessWithInformResult.this.id_of_message = 0;
    }
  }
}
