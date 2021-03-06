/*
 * generated by Xtext
 */
package php.ware.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import php.ware.entity.Entity;
import php.ware.entity.Feature;
import php.ware.entity.Reference;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class EntityScopeProvider extends AbstractDeclarativeScopeProvider {

    public IScope scope_Reference_opposite(final Reference ref, EReference eRef) {
        EList<Feature> features = ((Entity) ref.getType().getReferenced())
                .getFeatures();
        Iterable<Reference> references = Iterables.filter(features,
                Reference.class);
        references = Iterables.filter(references, new Predicate<Reference>() {
            @Override
            public boolean apply(Reference input) {
                return ref.eContainer().equals(input.getType().getReferenced());
            }
        });
        return scopeFor(references);
    }
}
