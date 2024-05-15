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
public class Partecipant extends Agent {
  private Partecipant __theAgent = (FIPArequest.agents.Partecipant)/*Used as metadata*/null;

  private AgentEnv<Partecipant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public OntologyRequest __ontology__FIPArequest_onto_OntologyRequest = (FIPArequest.onto.OntologyRequest) FIPArequest.onto.OntologyRequest.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(FIPArequest.onto.OntologyRequest.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  private void __onCreate() {
    try {
    	/* 
    	 * Compiled from source statement at line 25
    	 * log "***Partecipant created.***"
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, Partecipant.this.getClass().getName(), Partecipant.this, "on create", java.lang.String.valueOf("***Partecipant created.***"));
    	
    	/* 
    	 * Compiled from source statement at line 26
    	 * activate WaitForRequest
    	 */
    	
    	new FIPArequest.agents.WaitForRequest(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
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
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Partecipant.this);
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

  public Partecipant __theAgent() {
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

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, FIPArequest.agents.Partecipant.class);
  }
}
