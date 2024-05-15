package agents;

import CNontology.ContractNet;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;
import jadescript.lang.Duration;

@SuppressWarnings("all")
public class SendResponse extends OneShotBehaviour<Initiator> {
  private Initiator __theAgent = (agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static SendResponse __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.SendResponse(_agentEnv, 0, new jadescript.lang.Duration(), 0, "", new jade.core.AID());
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event6.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event6.__eventFired) __awaitForEvents();
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

  protected Integer cost = null;

  public void setCost(final Integer cost) {
    this.cost = cost;
  }

  public Integer getCost() {
    return this.cost;
  }

  protected Duration time = null;

  public void setTime(final Duration time) {
    this.time = time;
  }

  public Duration getTime() {
    return this.time;
  }

  protected Integer message_id = null;

  public void setMessage_id(final Integer message_id) {
    this.message_id = message_id;
  }

  public Integer getMessage_id() {
    return this.message_id;
  }

  protected String choice = null;

  public void setChoice(final String choice) {
    this.choice = choice;
  }

  public String getChoice() {
    return this.choice;
  }

  protected AID sender = null;

  public void setSender(final AID sender) {
    this.sender = sender;
  }

  public AID getSender() {
    return this.sender;
  }

  public SendResponse(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Integer cost, final Duration time, final Integer message_id, final String choice, final AID sender) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 107
    	 * cost of this = cost
    	 */
    	
    	SendResponse.this.setCost(cost);
    	
    	/* 
    	 * Compiled from source statement at line 108
    	 * time of this = time
    	 */
    	
    	SendResponse.this.setTime(time);
    	
    	/* 
    	 * Compiled from source statement at line 109
    	 * message_id of this = message_id
    	 */
    	
    	SendResponse.this.setMessage_id(message_id);
    	
    	/* 
    	 * Compiled from source statement at line 110
    	 * choice of this = choice
    	 */
    	
    	SendResponse.this.setChoice(choice);
    	
    	/* 
    	 * Compiled from source statement at line 111
    	 * sender of this = sender
    	 */
    	
    	SendResponse.this.setSender(sender);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event6 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement from line 114 to line 117
      	 * if choice = "accept" do
      	 *             send message accept_proposal(ParticipantCost(cost, time, message_id), AcceptPropose) to sender
      	 *         else do
      	 *             send message reject_proposal(ParticipantCost(cost, time, message_id), RefuseProposed) to sender
      	 */
      	
      	if(java.util.Objects.equals(SendResponse.this.getChoice(), "accept")) {
      		/* 
      		 * Compiled from source statement at line 115
      		 * send message accept_proposal(ParticipantCost(cost, time, message_id), AcceptPropose) to sender
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("accept_proposal");
      			
      			java.lang.Object _contentToBeSent1473580007 = new jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.AcceptPropose>(CNontology.ContractNet.ParticipantCost(SendResponse.this.getCost() ,SendResponse.this.getTime() ,SendResponse.this.getMessage_id()), CNontology.ContractNet.AcceptPropose());
      			
      			jadescript.core.message.Message _synthesizedMessage1473580007 = new jadescript.core.message.Message(jadescript.core.message.Message.ACCEPT_PROPOSAL);
      			
      			_synthesizedMessage1473580007.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1473580007,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      			
      			_synthesizedMessage1473580007.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage1473580007.addReceiver(SendResponse.this.getSender());
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1473580007, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1473580007, "accept_proposal"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage1473580007);
      		}
      		catch(java.lang.Throwable _t) {
      			throw jadescript.core.exception.JadescriptException.wrap(_t);
      		}
      	}
      	else {
      		/* 
      		 * Compiled from source statement at line 117
      		 * send message reject_proposal(ParticipantCost(cost, time, message_id), RefuseProposed) to sender
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("reject_proposal");
      			
      			java.lang.Object _contentToBeSent1975556638 = new jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.RefuseProposed>(CNontology.ContractNet.ParticipantCost(SendResponse.this.getCost() ,SendResponse.this.getTime() ,SendResponse.this.getMessage_id()), CNontology.ContractNet.RefuseProposed()).<jadescript.content.onto.basic.True>add(/*default value*/jadescript.content.onto.Ontology.True());
      			
      			jadescript.core.message.Message _synthesizedMessage1975556638 = new jadescript.core.message.Message(jadescript.core.message.Message.REJECT_PROPOSAL);
      			
      			_synthesizedMessage1975556638.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1975556638,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      			
      			_synthesizedMessage1975556638.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage1975556638.addReceiver(SendResponse.this.getSender());
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1975556638, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1975556638, "reject_proposal"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage1975556638);
      		}
      		catch(java.lang.Throwable _t) {
      			throw jadescript.core.exception.JadescriptException.wrap(_t);
      		}
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

  private SendResponse.__Event6 __event6 =  new agents.SendResponse.__Event6();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(SendResponse.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	SendResponse.this.cost = 0;
    	
    	SendResponse.this.time = new jadescript.lang.Duration();
    	
    	SendResponse.this.message_id = 0;
    	
    	SendResponse.this.choice = "";
    	
    	SendResponse.this.sender = new jade.core.AID();
    }
  }
}
