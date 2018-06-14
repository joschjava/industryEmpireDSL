/*
 * generated by Xtext 2.13.0
 */
package org.xtext.industryempire.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.industryempire.myDsl.Element
import org.xtext.industryempire.myDsl.Resources

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.toIterable.filter(typeof(Element)).compile(fsa)
	}
	
	def void compile(Iterable<Element> elements, IFileSystemAccess2 fsa){
		elements.filter(Resources).compileResource(fsa)		
	}
	
	def void compileResource(Iterable<Resources> resources, IFileSystemAccess2 fsa){
		fsa.generateFile('''game/Resources.java''',
		'''
		«generateHeader("Resources")»
		
		'''
		)
	}
	
	def generateHeader(String clazzName) {
		'''
		package game;
		
		public class «clazzName» {
		
		'''
	}
	
}
