package agents;

import CNontology.ContractNet;
import CNontology.Task;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jadescript.content.JadescriptProposition;
import jadescript.core.Agent;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.JadescriptAgentController;
import jadescript.java.SideEffectsFlag;
import jadescript.lang.Duration;

@SuppressWarnings("all")
public class Participant extends Agent {
  private Participant __theAgent = (agents.Participant)/*Used as metadata*/null;

  private AgentEnv<Participant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public ContractNet __ontology__CNontology_ContractNet = (CNontology.ContractNet) CNontology.ContractNet.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(CNontology.ContractNet.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected WaitForRequest waitForRequest = null;

  public void setWaitForRequest(final WaitForRequest waitForRequest) {
    this.waitForRequest = waitForRequest;
  }

  public WaitForRequest getWaitForRequest() {
    return this.waitForRequest;
  }

  protected SendFailure sendFailure = null;

  public void setSendFailure(final SendFailure sendFailure) {
    this.sendFailure = sendFailure;
  }

  public SendFailure getSendFailure() {
    return this.sendFailure;
  }

  protected SendResult sendResult = null;

  public void setSendResult(final SendResult sendResult) {
    this.sendResult = sendResult;
  }

  public SendResult getSendResult() {
    return this.sendResult;
  }

  protected Integer price = null;

  public void setPrice(final Integer price) {
    this.price = price;
  }

  public Integer getPrice() {
    return this.price;
  }

  protected Duration durOp = null;

  public void setDurOp(final Duration durOp) {
    this.durOp = durOp;
  }

  public Duration getDurOp() {
    return this.durOp;
  }

  protected Task toExecute = null;

  public void setToExecute(final Task toExecute) {
    this.toExecute = toExecute;
  }

  public Task getToExecute() {
    return this.toExecute;
  }

  protected AID toContact = null;

  public void setToContact(final AID toContact) {
    this.toContact = toContact;
  }

  public AID getToContact() {
    return this.toContact;
  }

  protected Integer conversation_id = null;

  public void setConversation_id(final Integer conversation_id) {
    this.conversation_id = conversation_id;
  }

  public Integer getConversation_id() {
    return this.conversation_id;
  }

  private void __onCreate() {
    java.lang.Integer price = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[0], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    java.lang.String expectDur = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[1], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT));
    try {
    	/* 
    	 * Compiled from source statement at line 24
    	 * price of this = price
    	 */
    	
    	Participant.this.setPrice(price);
    	
    	/* 
    	 * Compiled from source statement at line 25
    	 * durOp of this = expectDur as duration
    	 */
    	
    	Participant.this.setDurOp(((jadescript.lang.Duration) jadescript.util.types.Converter.convert(expectDur, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
    	
    	/* 
    	 * Compiled from source statement at line 26
    	 * activate waitForRequest
    	 */
    	
    	Participant.this.getWaitForRequest().activate(_agentEnv.getAgent());
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
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Participant.this);
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
    	Participant.this.waitForRequest = agents.WaitForRequest.__createEmpty(_agentEnv);
    	
    	Participant.this.sendFailure = agents.SendFailure.__createEmpty(_agentEnv);
    	
    	Participant.this.sendResult = agents.SendResult.__createEmpty(_agentEnv);
    	
    	Participant.this.price = 0;
    	
    	Participant.this.durOp = new jadescript.lang.Duration();
    	
    	Participant.this.toExecute = new CNontology.Task();
    	
    	Participant.this.toContact = new jade.core.AID();
    	
    	Participant.this.conversation_id = 0;
    }
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Participant __theAgent() {
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

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final Integer price, final String expectDur) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, agents.Participant.class, price, expectDur);
  }
}
