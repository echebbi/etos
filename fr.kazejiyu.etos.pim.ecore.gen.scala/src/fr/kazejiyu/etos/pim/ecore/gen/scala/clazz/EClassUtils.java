/**
 * 		Copyright 2017 Emmanuel CHEBBI
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.kazejiyu.etos.pim.ecore.gen.scala.clazz;

import java.util.Optional;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;

/**
 * Utility methods related to {@link EClass} that can be called from Acceleo templates.
 * 
 * @author Emmanuel CHEBBI
 */
public class EClassUtils {
	
	private static Optional <String> getAnnotatedDocumentation(EModelElement anEStructuralFeature) {
		for( EAnnotation aEAnnotation : anEStructuralFeature.getEAnnotations() )
			if( aEAnnotation.getDetails().get("documentation") instanceof String )
				return Optional.of(aEAnnotation.getDetails().get("documentation"));
		
		return Optional.empty();
	}
	
	/**
	 * Returns whether {@code aGenClass} owns an {@link EAnnotation} that has a detail called "documentation".
	 * 
	 * @param anEStructuralFeature
	 * 			The class to inspect.
	 * 
	 * @return whether {@code aGenClass} owns an {@link EAnnotation} that has a detail called "documentation".
	 */
	public static boolean hasAnnotatedDocumentation(EModelElement anEStructuralFeature) {
		return getAnnotatedDocumentation(anEStructuralFeature).isPresent();
	}

	public static String genAnnotatedDocumentation(EModelElement anEStructuralFeature) {
		return getAnnotatedDocumentation(anEStructuralFeature).orElse("");
	}
}
