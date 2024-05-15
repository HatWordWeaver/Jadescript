package agents;

import CNontology.ContractNet;
import CNontology.operationReq;
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
import jadescript.lang.Timestamp;
import jadescript.util.JadescriptList;

@SuppressWarnings("all")
public class Initiator extends Agent {
  private Initiator __theAgent = (agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public ContractNet __ontology__CNontology_ContractNet = (CNontology.ContractNet) CNontology.ContractNet.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(CNontology.ContractNet.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected ContactParticipant contactParticipant = null;

  public void setContactParticipant(final ContactParticipant contactParticipant) {
    this.contactParticipant = contactParticipant;
  }

  public ContactParticipant getContactParticipant() {
    return this.contactParticipant;
  }

  protected WaitForResponse waitForResponse = null;

  public void setWaitForResponse(final WaitForResponse waitForResponse) {
    this.waitForResponse = waitForResponse;
  }

  public WaitForResponse getWaitForResponse() {
    return this.waitForResponse;
  }

  protected WaitForInform waitForInform = null;

  public void setWaitForInform(final WaitForInform waitForInform) {
    this.waitForInform = waitForInform;
  }

  public WaitForInform getWaitForInform() {
    return this.waitForInform;
  }

  protected String nameParticipant = null;

  public void setNameParticipant(final String nameParticipant) {
    this.nameParticipant = nameParticipant;
  }

  public String getNameParticipant() {
    return this.nameParticipant;
  }

  protected operationReq taskRequested = null;

  public void setTaskRequested(final operationReq taskRequested) {
    this.taskRequested = taskRequested;
  }

  public operationReq getTaskRequested() {
    return this.taskRequested;
  }

  protected JadescriptList<AID> toContact = null;

  public void setToContact(final JadescriptList<AID> toContact) {
    this.toContact = toContact;
  }

  public JadescriptList<AID> getToContact() {
    return this.toContact;
  }

  protected Integer numberOfContact = null;

  public void setNumberOfContact(final Integer numberOfContact) {
    this.numberOfContact = numberOfContact;
  }

  public Integer getNumberOfContact() {
    return this.numberOfContact;
  }

  protected Integer conversation_id = null;

  public void setConversation_id(final Integer conversation_id) {
    this.conversation_id = conversation_id;
  }

  public Integer getConversation_id() {
    return this.conversation_id;
  }

  protected Timestamp shutdown_time = null;

  public void setShutdown_time(final Timestamp shutdown_time) {
    this.shutdown_time = shutdown_time;
  }

  public Timestamp getShutdown_time() {
    return this.shutdown_time;
  }

  private void __onCreate() {
    jadescript.util.JadescriptList<jade.core.AID> toContact = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[0], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.LIST, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID)));
    java.lang.Integer firstNumber = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[1], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    java.lang.Integer secondNumber = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[2], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    java.lang.String opReq = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[3], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT));
    java.lang.Integer conversation_id = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[4], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER));
    try {
    	/* 
    	 * Compiled from source statement at line 32
    	 * toContact of this = toContact
    	 */
    	
    	Initiator.this.setToContact(toContact);
    	
    	/* 
    	 * Compiled from source statement at line 33
    	 * numberOfContact of this = length of toContact
    	 */
    	
    	Initiator.this.setNumberOfContact(toContact.size());
    	
    	/* 
    	 * Compiled from source statement at line 34
    	 * conversation_id of this = conversation_id
    	 */
    	
    	Initiator.this.setConversation_id(conversation_id);
    	
    	/* 
    	 * Compiled from source statement at line 35
    	 * taskRequested = operationReq(firstNumber, secondNumber, opReq)
    	 */
    	
    	Initiator.this.setTaskRequested(CNontology.ContractNet.operationReq(firstNumber ,secondNumber ,opReq));
    	
    	/* 
    	 * Compiled from source statement at line 36
    	 * activate contactParticipant
    	 */
    	
    	Initiator.this.getContactParticipant().activate(_agentEnv.getAgent());
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
    	Initiator.this.contactParticipant = agents.ContactParticipant.__createEmpty(_agentEnv);
    	
    	Initiator.this.waitForResponse = agents.WaitForResponse.__createEmpty(_agentEnv);
    	
    	Initiator.this.waitForInform = agents.WaitForInform.__createEmpty(_agentEnv);
    	
    	Initiator.this.nameParticipant = "";
    	
    	Initiator.this.taskRequested = new CNontology.operationReq();
    	
    	Initiator.this.toContact = new jadescript.util.JadescriptList<jade.core.AID>();
    	
    	Initiator.this.numberOfContact = 0;
    	
    	Initiator.this.conversation_id = 0;
    	
    	Initiator.this.shutdown_time = jadescript.lang.Timestamp.now();
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

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final JadescriptList<AID> toContact, final Integer firstNumber, final Integer secondNumber, final String opReq, final Integer conversation_id) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, agents.Initiator.class, toContact, firstNumber, secondNumber, opReq, conversation_id);
  }
}
