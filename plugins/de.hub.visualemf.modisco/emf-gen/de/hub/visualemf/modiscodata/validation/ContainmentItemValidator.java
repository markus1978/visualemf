/**
 *
 * $Id$
 */
package de.hub.visualemf.modiscodata.validation;

import de.hub.visualemf.modiscodata.ContainmentItem;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.hub.visualemf.modiscodata.ContainmentItem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContainmentItemValidator {
	boolean validate();

	boolean validateChildren(EList<ContainmentItem> value);
}
