/*
 * generated by Xtext
 */
package php.ware;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.scoping.IScopeProvider;

import php.ware.scoping.EntityScopeProvider;
import php.ware.valueconverter.EntityValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class EntityRuntimeModule extends php.ware.AbstractEntityRuntimeModule {

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return EntityScopeProvider.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return EntityValueConverterService.class;
	}
}
