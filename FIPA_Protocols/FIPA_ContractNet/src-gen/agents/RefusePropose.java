package agents;

import CNontology.ContractNet;
import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class RefusePropose extends CyclicBehaviour<Initiator> {
  private Initiator __theAgent = (agents.Initiator)/*Used as metadata*/null;

  private AgentEnv<Initiator, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public RefusePropose(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static RefusePropose __createEmpty(final AgentEnv<? extends Initiator, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new agents.RefusePropose(_agentEnv);
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
    Boolean __eventFired = false;

    public void run() {
      if(RefusePropose.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher495961734 {
      	public java.lang.Integer cost;
      	
      	public jadescript.lang.Duration time;
      	
      	public java.lang.Integer message_id;
      	
      	private final __PatternMatcher495961734 __PatternMatcher495961734_obj =  this;
      	
      	public boolean headerMatch_tupleelem0_structterm0(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		cost = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm1(java.lang.Object __objx) {
      		jadescript.lang.Duration __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Duration) {
      				__x = (jadescript.lang.Duration) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		time = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0_structterm2(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		message_id = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_tupleelem0(java.lang.Object __objx) {
      		CNontology.ParticipantCost __x;
      		
      		try {
      			if(__objx instanceof CNontology.ParticipantCost) {
      				__x = (CNontology.ParticipantCost) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_tupleelem0_structterm0(__x.getComputeCost()) && headerMatch_tupleelem0_structterm1(__x.getComputeTime()) && headerMatch_tupleelem0_structterm2(__x.getConversation_id());
      	}
      	
      	public boolean headerMatch_tupleelem1(java.lang.Object __objx) {
      		CNontology.CostForMe __x;
      		
      		try {
      			if(__objx instanceof CNontology.CostForMe) {
      				__x = (CNontology.CostForMe) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x, CNontology.ContractNet.CostForMe());
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.CostForMe> __x;
      		
      		try {
      			if(__objx instanceof jadescript.lang.Tuple.Tuple2) {
      				__x = (jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.CostForMe>) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && __x.getLength() == 2 && headerMatch_tupleelem0(__x.getElement0()) && headerMatch_tupleelem1(__x.getElement1());
      	}
      }
      __PatternMatcher495961734 __PatternMatcher495961734_obj = new __PatternMatcher495961734();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.PROPOSE)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return (__PatternMatcher495961734_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()))) && (java.util.Objects.equals(__PatternMatcher495961734_obj.message_id, RefusePropose.this._agentEnv.getAgent().getConversation_id()));
      	}
      	catch(java.lang.Throwable _e) {
      		_e.printStackTrace();
      		
      		return false;
      	}
      }
      }))));
      jadescript.core.message.Message __receivedMessage = null;
      if(myAgent!=null) {
      	__receivedMessage = jadescript.core.message.Message.wrap(myAgent.receive(__mt));
      }
      if(__receivedMessage != null) {
      	RefusePropose.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 54
      			 * send message reject_proposal(ParticipantCost(cost, time, message_id), TimeExpired) to sender of message
      			 */
      			
      			try {
      				jadescript.util.SendMessageUtils.validatePerformative("reject_proposal");
      				
      				java.lang.Object _contentToBeSent1150238189 = new jadescript.lang.Tuple.Tuple2<CNontology.ParticipantCost, CNontology.TimeExpired>(CNontology.ContractNet.ParticipantCost(__PatternMatcher495961734_obj.cost ,__PatternMatcher495961734_obj.time ,__PatternMatcher495961734_obj.message_id), CNontology.ContractNet.TimeExpired()).<jadescript.content.onto.basic.True>add(/*default value*/jadescript.content.onto.Ontology.True());
      				
      				jadescript.core.message.Message _synthesizedMessage1150238189 = new jadescript.core.message.Message(jadescript.core.message.Message.REJECT_PROPOSAL);
      				
      				_synthesizedMessage1150238189.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1150238189,CNontology.ContractNet.getInstance(),CNontology.ContractNet.getInstance()).getName());;
      				
      				_synthesizedMessage1150238189.setLanguage(__codec.getName());;
      				
      				_synthesizedMessage1150238189.addReceiver(((jadescript.core.message.ProposeMessage<CNontology.ParticipantCost, CNontology.CostForMe>) __receivedMessage).getSender());
      				
      				_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1150238189, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1150238189, "reject_proposal"));
      				
      				_agentEnv.getAgent().send(_synthesizedMessage1150238189);
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
      		
      		__receivedMessage = null;
      	}
      	catch(Exception _e) {
      		_e.printStackTrace();
      	}
      }
      else {
      	this.__eventFired = false;
      }
    }
  }

  private RefusePropose.__Event0 __event0 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(RefusePropose.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new agents.RefusePropose.__Event0();
    }
  }
}
