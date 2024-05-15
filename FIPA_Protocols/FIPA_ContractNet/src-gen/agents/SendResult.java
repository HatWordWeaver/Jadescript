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
public class SendResult extends OneShotBehaviour<Participant> {
  private Participant __theAgent = (agents.Participant)/*Used as metadata*/null;

  private AgentEnv<Participant, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static SendResult __createEmpty(final AgentEnv<? extends Participant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.SendResult(_agentEnv, 0, "");
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

  public ContractNet __ontology__CNontology_ContractNet = (CNontology.ContractNet) CNontology.ContractNet.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(CNontology.ContractNet.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected Integer result = null;

  public void setResult(final Integer result) {
    this.result = result;
  }

  public Integer getResult() {
    return this.result;
  }

  protected String method = null;

  public void setMethod(final String method) {
    this.method = method;
  }

  public String getMethod() {
    return this.method;
  }

  public SendResult(final AgentEnv<? extends Participant, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Integer result, final String method) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 95
    	 * result of this = result
    	 */
    	
    	SendResult.this.setResult(result);
    	
    	/* 
    	 * Compiled from source statement at line 96
    	 * method of this = method
    	 */
    	
    	SendResult.this.setMethod(method);
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
      	 * Compiled from source statement from line 99 to line 102
      	 * if method = "res" do
      	 *             send message inform(ResultOp(result, conversation_id)) to toContact
      	 *         else do
      	 *             send message inform(Execute) to toContact
      	 */
      	
      	if(java.util.Objects.equals(SendResult.this.getMethod(), "res")) {
      		/* 
      		 * Compiled from source statement at line 100
      		 * send message inform(ResultOp(result, conversation_id)) to toContact
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("inform");
      			
      			java.lang.Object _contentToBeSent627011692 = (CNontology.ContractNet.ResultOp(SendResult.this.getResult() ,SendResult.this._agentEnv.getAgent().getConversation_id()));
      			
      			jadescript.core.message.Message _synthesizedMessage627011692 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      			
      			_synthesizedMessage627011692.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent627011692,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      			
      			_synthesizedMessage627011692.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage627011692.addReceiver(SendResult.this._agentEnv.getAgent().getToContact());
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage627011692, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent627011692, "inform"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage627011692);
      		}
      		catch(java.lang.Throwable _t) {
      			throw jadescript.core.exception.JadescriptException.wrap(_t);
      		}
      	}
      	else {
      		/* 
      		 * Compiled from source statement at line 102
      		 * send message inform(Execute) to toContact
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("inform");
      			
      			java.lang.Object _contentToBeSent131510658 = (CNontology.ContractNet.Execute());
      			
      			jadescript.core.message.Message _synthesizedMessage131510658 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      			
      			_synthesizedMessage131510658.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent131510658,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      			
      			_synthesizedMessage131510658.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage131510658.addReceiver(SendResult.this._agentEnv.getAgent().getToContact());
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage131510658, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent131510658, "inform"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage131510658);
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

  private SendResult.__Event3 __event3 =  new agents.SendResult.__Event3();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(SendResult.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	SendResult.this.result = 0;
    	
    	SendResult.this.method = "";
    }
  }
}
