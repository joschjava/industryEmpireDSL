/*
 * generated by Xtext 2.13.0
 */
package org.xtext.industryempire.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.industryempire.ui.internal.IndustryempireActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return IndustryempireActivator.getInstance().getInjector("org.xtext.industryempire.MyDsl");
	}

}