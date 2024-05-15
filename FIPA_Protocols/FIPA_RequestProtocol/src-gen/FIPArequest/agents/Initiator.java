package FIPArequest.agents;

import FIPArequest.onto.OntologyRequest;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jadescript.content.JadescriptProposition;
import jadescript.core.Agent;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.JadescriptAgentController;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class Initiator extends Agent {
  private Initiator __theAgent = (FIPArequest.agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public OntologyRequest __ontology__FIPArequest_onto_OntologyRequest = (FIPArequest.onto.OntologyRequest) FIPArequest.onto.OntologyRequest.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(FIPArequest.onto.OntologyRequest.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  private void __onCreate() {
    java.lang.Boolean notification = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[0], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN));
    java.lang.Integer conversation_id = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[1], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    java.lang.Integer value1 = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[2], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    java.lang.Integer value2 = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[3], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    java.lang.String operator = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[4], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT));
    try {
    	/* 
    	 * Compiled from source statement at line 23
    	 * log "*** Initiator created. ***"
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, Initiator.this.getClass().getName(), Initiator.this, "on create", java.lang.String.valueOf("*** Initiator created. ***"));
    	
    	/* 
    	 * Compiled from source statement at line 29
    	 * sent = compute_request(false, false, notification, conversation_id)
    	 */
    	
    	FIPArequest.onto.compute_request sent = FIPArequest.onto.OntologyRequest.compute_request(false ,false ,notification ,conversation_id);
    	
    	/* 
    	 * Compiled from source statement at line 30
    	 * sent_op = operation(value1, value2, operator)
    	 */
    	
    	FIPArequest.onto.operation sent_op = FIPArequest.onto.OntologyRequest.operation(value1 ,value2 ,operator);
    	
    	/* 
    	 * Compiled from source statement at line 34
    	 * send message request send_request(sent, sent_op) to "Partecipant"@
    	 */
    	
    	try {
    		jadescript.util.SendMessageUtils.validatePerformative("request");
    		
    		java.lang.Object _contentToBeSent542461545 = FIPArequest.onto.OntologyRequest.send_request(sent ,sent_op);
    		
    		jadescript.core.message.Message _synthesizedMessage542461545 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
    		
    		_synthesizedMessage542461545.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent542461545,FIPArequest.onto.OntologyRequest.getInstance(),FIPArequest.onto.OntologyRequest.getInstance()).getName());;
    		
    		_synthesizedMessage542461545.setLanguage(__codec.getName());;
    		
    		_synthesizedMessage542461545.addReceiver(new jade.core.AID(java.lang.String.valueOf("Partecipant"), false));
    		
    		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage542461545, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent542461545, "request"));
    		
    		_agentEnv.getAgent().send(_synthesizedMessage542461545);
    	}
    	catch(java.lang.Throwable _t) {
    		throw jadescript.core.exception.JadescriptException.wrap(_t);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 36 to line 39
    	 * if notification = false do
    	 *                 activate WaitForResult(conversation_id)
    	 *             else do
    	 *                 activate WaitForResponse(conversation_id)
    	 */
    	
    	if(java.util.Objects.equals(notification, false)) {
    		/* 
    		 * Compiled from source statement at line 37
    		 * activate WaitForResult(conversation_id)
    		 */
    		
    		new FIPArequest.agents.WaitForResult(_agentEnv.getAgent().toEnv() ,conversation_id).activate(_agentEnv.getAgent());
    	}
    	else {
    		/* 
    		 * Compiled from source statement at line 39
    		 * activate WaitForResponse(conversation_id)
    		 */
    		
    		new FIPArequest.agents.WaitForResponse(_agentEnv.getAgent().toEnv() ,conversation_id).activate(_agentEnv.getAgent());
    	}
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Initiator.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  public void __handleBehaviourFailure(final jadescript.core.behaviours.Behaviour<?> __behaviour, final JadescriptProposition __reason) {
    boolean __handled = false;
    if(!__handled) {
    	jadescript.core.Agent.doLog(java.util.logging.Level.INFO, this.getClass().getName(), this, "<behaviour failure dispatcher>", "Behaviour " + __behaviour + " failed with reason: " + __reason);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    }
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Initiator __theAgent() {
    return this;
  }

  protected void setup() {
    super.setup();
    __initializeAgentEnv();
    __initializeProperties();
    this.__onCreate();
  }

  protected void __registerCodecs(final ContentManager cm) {
    super.__registerCodecs(cm);
    cm.registerLanguage(__codec);
  }

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final Boolean notification, final Integer conversation_id, final Integer value1, final Integer value2, final String operator) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, FIPArequest.agents.Initiator.class, notification, conversation_id, value1, value2, operator);
  }
}
