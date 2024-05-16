/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.globaltype.globaljade.ide.contentassist.antlr.internal.InternalGlobalJadeParser;
import org.xtext.globaltype.globaljade.services.GlobalJadeGrammarAccess;

public class GlobalJadeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GlobalJadeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GlobalJadeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getProtocolsAccess().getGroup(), "rule__Protocols__Group__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getModelAccess().getProtocolsAssignment(), "rule__Model__ProtocolsAssignment");
			builder.put(grammarAccess.getProtocolsAccess().getNameAssignment_2(), "rule__Protocols__NameAssignment_2");
			builder.put(grammarAccess.getProtocolsAccess().getRolesAssignment_4(), "rule__Protocols__RolesAssignment_4");
			builder.put(grammarAccess.getRoleAccess().getRoleAssignment_1(), "rule__Role__RoleAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GlobalJadeGrammarAccess grammarAccess;

	@Override
	protected InternalGlobalJadeParser createParser() {
		InternalGlobalJadeParser result = new InternalGlobalJadeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GlobalJadeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GlobalJadeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
