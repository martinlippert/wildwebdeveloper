/*******************************************************************************
 * Copyright (c) 2022 Red Hat Inc. and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Angelo ZERR (Red Hat Inc.) - initial implementation
 *******************************************************************************/
package org.eclipse.wildwebdeveloper.jsts.ui.preferences.typescript;

import static org.eclipse.wildwebdeveloper.ui.preferences.Settings.isMatchSection;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.wildwebdeveloper.Activator;
import org.eclipse.wildwebdeveloper.ui.preferences.Settings;

/**
 * TypeScript preference server constants.
 *
 */
public class TypeScriptPreferenceServerConstants {

	public static final String TYPESCRIPT_SECTION = "typescript";

	// Inlay Hint settings
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_ENUM_MEMBER_VALUE_HINTS = "typescript.inlayHints.includeInlayEnumMemberValueHints";
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_FUNCTION_LIKE_RETURN_TYPE_HINTS = "typescript.inlayHints.includeInlayFunctionLikeReturnTypeHints";
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_FUNCTION_PARAMETER_TYPE_HINTS = "typescript.inlayHints.includeInlayFunctionParameterTypeHints";
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PARAMETER_NAME_HINTS = "typescript.inlayHints.includeInlayParameterNameHints";
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PARAMETER_NAME_HINTS_WHEN_ARGUMENT_MATCHES_NAME = "typescript.inlayHints.includeInlayParameterNameHintsWhenArgumentMatchesName";
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PROPERTY_DECLARATION_TYPE_HINTS = "typescript.inlayHints.includeInlayPropertyDeclarationTypeHints";
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_VARIABLE_TYPE_HINTS = "typescript.inlayHints.includeInlayVariableTypeHints";
	public static final String TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_VARIABLE_TYPE_HINTS_WHEN_TYPE_MATCHES_NAME = "typescript.inlayHints.includeInlayVariableTypeHintsWhenTypeMatchesName";

	public static Settings getGlobalSettings() {
		Settings settings = new Settings(Activator.getDefault().getPreferenceStore());

		// Inlay Hint settings
		settings.fillAsBoolean(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_ENUM_MEMBER_VALUE_HINTS);
		settings.fillAsBoolean(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_FUNCTION_LIKE_RETURN_TYPE_HINTS);
		settings.fillAsBoolean(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_FUNCTION_PARAMETER_TYPE_HINTS);
		settings.fillAsString(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PARAMETER_NAME_HINTS);
		settings.fillAsBoolean(
				TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PARAMETER_NAME_HINTS_WHEN_ARGUMENT_MATCHES_NAME);
		settings.fillAsBoolean(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PROPERTY_DECLARATION_TYPE_HINTS);
		settings.fillAsBoolean(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_VARIABLE_TYPE_HINTS);
		settings.fillAsBoolean(
				TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_VARIABLE_TYPE_HINTS_WHEN_TYPE_MATCHES_NAME);
		return settings;
	}

	public static void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		// Server settings

		// - Inlay Hint
		store.setDefault(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PARAMETER_NAME_HINTS, false);
		store.setDefault(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_FUNCTION_LIKE_RETURN_TYPE_HINTS, false);
		store.setDefault(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_FUNCTION_PARAMETER_TYPE_HINTS, false);
		store.setDefault(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PARAMETER_NAME_HINTS, "none"); // 'none' |
																											// 'literals'
																											// | 'all'
		store.setDefault(
				TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PARAMETER_NAME_HINTS_WHEN_ARGUMENT_MATCHES_NAME,
				false);
		store.setDefault(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_PROPERTY_DECLARATION_TYPE_HINTS, false);
		store.setDefault(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_VARIABLE_TYPE_HINTS, false);
		store.setDefault(TYPESCRIPT_PREFERENCES_INLAY_HINTS_INCLUDE_INLAY_VARIABLE_TYPE_HINTS_WHEN_TYPE_MATCHES_NAME,
				false);
	}

	/**
	 * Returns true if the given section matches TypeScript settings and false
	 * otherwise.
	 * 
	 * @param section the section to check.
	 * 
	 * @return true if the given section matches TypeScript settings and false
	 *         otherwise.
	 */
	public static boolean isMatchTypeScriptSection(String section) {
		return isMatchSection(section, TYPESCRIPT_SECTION);
	}
}
