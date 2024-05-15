package FIPArequest.agents;

import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.Agent;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;
import jadescript.lang.JadescriptGlobalFunction;

@SuppressWarnings("all")
public class executeOperation implements JadescriptGlobalFunction {
  public Ontology __ontology__jadescript_content_onto_Ontology = (jadescript.content.onto.Ontology) jadescript.content.onto.Ontology.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    cm.registerOntology(jadescript.content.onto.Ontology.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  public static Integer executeOperation(final AgentEnv<? extends Agent, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Integer opt1, final Integer opt2, final String comand) {
    jadescript.content.onto.Ontology __ontology__jadescript_content_onto_Ontology = (jadescript.content.onto.Ontology) jadescript.content.onto.Ontology.getInstance();
    {
    	/* 
    	 * Compiled from source statement from line 112 to line 119
    	 * if comand = "ADD" do
    	 *             return opt1 + opt2
    	 *         else if comand = "SUB" do
    	 *             return opt1 - opt2
    	 *         else if comand = "MUL" do
    	 *             return opt1 * opt2
    	 *         else do
    	 *             return opt1 / opt2
    	 */
    	
    	if(java.util.Objects.equals(comand, "ADD")) {
    		/* 
    		 * Compiled from source statement at line 113
    		 * return opt1 + opt2
    		 */
    		
    		return opt1 + opt2;
    	}
    	else if(java.util.Objects.equals(comand, "SUB")) {
    		/* 
    		 * Compiled from source statement at line 115
    		 * return opt1 - opt2
    		 */
    		
    		return opt1 - opt2;
    	}
    	else if(java.util.Objects.equals(comand, "MUL")) {
    		/* 
    		 * Compiled from source statement at line 117
    		 * return opt1 * opt2
    		 */
    		
    		return opt1 * opt2;
    	}
    	else {
    		/* 
    		 * Compiled from source statement at line 119
    		 * return opt1 / opt2
    		 */
    		
    		return opt1 / opt2;
    	}
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(executeOperation.this);
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
