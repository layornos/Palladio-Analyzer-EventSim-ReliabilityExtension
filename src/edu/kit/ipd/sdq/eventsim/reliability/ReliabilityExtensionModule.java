package edu.kit.ipd.sdq.eventsim.reliability;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import edu.kit.ipd.sdq.eventsim.resources.entities.SimActiveResource;
import edu.kit.ipd.sdq.eventsim.reliability.entities.SimReliabilityActiveResource;
import edu.kit.ipd.sdq.eventsim.reliability.entities.SimReliabilityResourceFactory;

public class ReliabilityExtensionModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		install(new FactoryModuleBuilder().implement(
				SimActiveResource.class, 
				SimReliabilityActiveResource.class).build(SimReliabilityResourceFactory.class));
    }
}
 