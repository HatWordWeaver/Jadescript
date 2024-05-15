package agents;

import CNontology.ContractNet;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class SendFailure extends OneShotBehaviour<Participant> {
  private Participant __theAgent = (agents.Participant)/*Used as metadata*/null;

  private AgentEnv<Participant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public SendFailure(final AgentEnv<? extends Participant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static SendFailure __createEmpty(final AgentEnv<? extends Participant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.SendFailure(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event0.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event0.__eventFired) __awaitForEvents();
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
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement at line 109
      	 * send message failure(toExecute, Failure(conversation_id)) to toContact
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("failure");
      		
      		java.lang.Object _contentToBeSent1537580261 = new jadescript.lang.Tuple.Tuple2<CNontology.Task, CNontology.Failure>(SendFailure.this._agentEnv.getAgent().getToExecute(), CNontology.ContractNet.Failure(SendFailure.this._agentEnv.getAgent().getConversation_id()));
      		
      		jadescript.core.message.Message _synthesizedMessage1537580261 = new jadescript.core.message.Message(jadescript.core.message.Message.FAILURE);
      		
      		_synthesizedMessage1537580261.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1537580261,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      		
      		_synthesizedMessage1537580261.setLanguage(__codec.getName());;
      		
      		_synthesizedMessage1537580261.addReceiver(SendFailure.this._agentEnv.getAgent().getToContact());
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1537580261, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1537580261, "failure"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage1537580261);
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

  private SendFailure.__Event0 __event0 =  new agents.SendFailure.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(SendFailure.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    }
  }
}
