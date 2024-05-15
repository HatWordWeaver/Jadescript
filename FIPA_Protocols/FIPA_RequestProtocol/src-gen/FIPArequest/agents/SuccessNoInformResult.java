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
public class SuccessNoInformResult extends OneShotBehaviour<Partecipant> {
  private Partecipant __theAgent = (FIPArequest.agents.Partecipant)/*Used as metadata*/null;

  private AgentEnv<Partecipant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static SuccessNoInformResult __createEmpty(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new FIPArequest.agents.SuccessNoInformResult(_agentEnv, new jade.core.AID(), 0);
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

  protected AID who_sent = null;

  public void setWho_sent(final AID who_sent) {
    this.who_sent = who_sent;
  }

  public AID getWho_sent() {
    return this.who_sent;
  }

  protected Integer id_of_message = null;

  public void setId_of_message(final Integer id_of_message) {
    this.id_of_message = id_of_message;
  }

  public Integer getId_of_message() {
    return this.id_of_message;
  }

  public SuccessNoInformResult(final AgentEnv<? extends Partecipant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final AID who_sent, final Integer id_of_message) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 154
    	 * who_sent of this = who_sent
    	 */
    	
    	SuccessNoInformResult.this.setWho_sent(who_sent);
    	
    	/* 
    	 * Compiled from source statement at line 155
    	 * id_of_message of this = id_of_message
    	 */
    	
    	SuccessNoInformResult.this.setId_of_message(id_of_message);
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
      	 * Compiled from source statement at line 158
      	 * send message inform(TaskSuccess(id_of_message)) to who_sent
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("inform");
      		
      		java.lang.Object _contentToBeSent1135304298 = (FIPArequest.onto.OntologyRequest.TaskSuccess(SuccessNoInformResult.this.getId_of_message()));
      		
      		jadescript.core.message.Message _synthesizedMessage1135304298 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      		
      		_synthesizedMessage1135304298.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1135304298,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
      		
      		_synthesizedMessage1135304298.setLanguage(__codec.getName());;
      		
      		_synthesizedMessage1135304298.addReceiver(SuccessNoInformResult.this.getWho_sent());
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1135304298, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1135304298, "inform"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage1135304298);
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

  private SuccessNoInformResult.__Event3 __event3 =  new FIPArequest.agents.SuccessNoInformResult.__Event3();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(SuccessNoInformResult.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	SuccessNoInformResult.this.who_sent = new jade.core.AID();
    	
    	SuccessNoInformResult.this.id_of_message = 0;
    }
  }
}
