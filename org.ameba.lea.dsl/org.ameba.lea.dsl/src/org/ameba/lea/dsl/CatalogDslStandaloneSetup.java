/*
 * generated by Xtext
 */
package org.ameba.lea.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CatalogDslStandaloneSetup extends CatalogDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CatalogDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
