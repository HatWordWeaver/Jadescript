package agents;

import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jadescript.content.JadescriptProposition;
import jadescript.content.onto.Ontology;
import jadescript.core.Agent;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.JadescriptAgentController;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class Bidder extends Agent {
  private Bidder __theAgent = (agents.Bidder)/*Used as metadata*/null;

  private AgentEnv<Bidder, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public Ontology __ontology__jadescript_content_onto_Ontology = (jadescript.content.onto.Ontology) jadescript.content.onto.Ontology.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(jadescript.content.onto.Ontology.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected Integer maxMoney = null;

  public void setMaxMoney(final Integer maxMoney) {
    this.maxMoney = maxMoney;
  }

  public Integer getMaxMoney() {
    return this.maxMoney;
  }

  protected WaitForStart waitForStart = null;

  public void setWaitForStart(final WaitForStart waitForStart) {
    this.waitForStart = waitForStart;
  }

  public WaitForStart getWaitForStart() {
    return this.waitForStart;
  }

  protected WaitResponse waitResponse = null;

  public void setWaitResponse(final WaitResponse waitResponse) {
    this.waitResponse = waitResponse;
  }

  public WaitResponse getWaitResponse() {
    return this.waitResponse;
  }

  private void __onCreate() {
    java.lang.Integer money = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[0], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    try {
    	/* 
    	 * Compiled from source statement at line 23
    	 * maxMoney = money
    	 */
    	
    	Bidder.this.setMaxMoney(money);
    	
    	/* 
    	 * Compiled from source statement at line 24
    	 * activate SendPresenceAuction
    	 */
    	
    	new agents.SendPresenceAuction(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 25
    	 * activate waitForStart
    	 */
    	
    	Bidder.this.getWaitForStart().activate(_agentEnv.getAgent());
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
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Bidder.this);
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
    	Bidder.this.maxMoney = 0;
    	
    	Bidder.this.waitForStart = agents.WaitForStart.__createEmpty(_agentEnv);
    	
    	Bidder.this.waitResponse = agents.WaitResponse.__createEmpty(_agentEnv);
    }
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Bidder __theAgent() {
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

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final Integer money) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, agents.Bidder.class, money);
  }
}
