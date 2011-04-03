
package php.ware;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EntityStandaloneSetup extends EntityStandaloneSetupGenerated{

	public static void doSetup() {
		new EntityStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

