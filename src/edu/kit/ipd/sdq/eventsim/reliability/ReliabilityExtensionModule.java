package edu.kit.ipd.sdq.eventsim.reliability;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import edu.kit.ipd.sdq.eventsim.reliability.entities.ReliabilityRequest;
import edu.kit.ipd.sdq.eventsim.system.entities.Request;
import edu.kit.ipd.sdq.eventsim.system.entities.RequestFactory;

public class ReliabilityExtensionModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		install(new FactoryModuleBuilder().implement(SimActiveResource.class, ReliabilityRequest.class).build(RequestFactory.class));
    }
}
 