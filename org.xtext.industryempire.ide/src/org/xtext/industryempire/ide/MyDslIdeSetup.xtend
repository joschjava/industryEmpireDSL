/*
 * generated by Xtext 2.13.0
 */
package org.xtext.industryempire.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.industryempire.MyDslRuntimeModule
import org.xtext.industryempire.MyDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MyDslIdeSetup extends MyDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule, new MyDslIdeModule))
	}
	
}