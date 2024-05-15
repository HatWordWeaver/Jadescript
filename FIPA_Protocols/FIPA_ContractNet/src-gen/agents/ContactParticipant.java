package agents;

import CNontology.ContractNet;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;
import jadescript.lang.Duration;

@SuppressWarnings("all")
public class ContactParticipant extends OneShotBehaviour<Initiator> {
  private Initiator __theAgent = (agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public ContactParticipant(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static ContactParticipant __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.ContactParticipant(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event1.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event1.__eventFired) __awaitForEvents();
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

  protected Duration time = null;

  public void setTime(final Duration time) {
    this.time = time;
  }

  public Duration getTime() {
    return this.time;
  }

  private class __Event1 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement at line 45
      	 * shutdown_time = now + "PT10S" as duration
      	 */
      	
      	ContactParticipant.this._agentEnv.getAgent().setShutdown_time(jadescript.lang.Timestamp.plus(jadescript.lang.Timestamp.now(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT10S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION)))));
      	
      	/* 
      	 * Compiled from source statement at line 46
      	 * send message cfp(Task(taskRequested, time, conversation_id, shutdown_time), Request) to toContact
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("cfp");
      		
      		java.lang.Object _contentToBeSent1874511259 = new jadescript.lang.Tuple.Tuple2<CNontology.Task, CNontology.Request>(CNontology.ContractNet.Task(ContactParticipant.this._agentEnv.getAgent().getTaskRequested() ,ContactParticipant.this.getTime() ,ContactParticipant.this._agentEnv.getAgent().getConversation_id() ,ContactParticipant.this._agentEnv.getAgent().getShutdown_time()), CNontology.ContractNet.Request());
      		
      		jadescript.core.message.Message _synthesizedMessage1874511259 = new jadescript.core.message.Message(jadescript.core.message.Message.CFP);
      		
      		_synthesizedMessage1874511259.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1874511259,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      		
      		_synthesizedMessage1874511259.setLanguage(__codec.getName());;
      		
      		jadescript.util.JadescriptList<jade.core.AID> __receiversList1 = ContactParticipant.this._agentEnv.getAgent().getToContact();
      		
      		for ( jade.core.AID __receiver : __receiversList1) {
      			_synthesizedMessage1874511259.addReceiver(__receiver);
      		}
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1874511259, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1874511259, "cfp"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage1874511259);
      	}
      	catch(java.lang.Throwable _t) {
      		throw jadescript.core.exception.JadescriptException.wrap(_t);
      	}
      	
      	/* 
      	 * Compiled from source statement at line 47
      	 * activate waitForResponse
      	 */
      	
      	ContactParticipant.this._agentEnv.getAgent().getWaitForResponse().activate(_agentEnv.getAgent());
      }
      catch(jadescript.core.exception.JadescriptException __throwable) {
      	__handleJadescriptException(__throwable);
      }
      catch(java.lang.Throwable __throwable) {
      	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
      }
    }
  }

  private ContactParticipant.__Event1 __event1 =  new agents.ContactParticipant.__Event1();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(ContactParticipant.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	ContactParticipant.this.time = ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT5S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION)));
    }
  }
}
