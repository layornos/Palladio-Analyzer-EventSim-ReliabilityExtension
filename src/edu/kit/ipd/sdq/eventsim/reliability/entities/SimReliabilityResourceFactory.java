package edu.kit.ipd.sdq.eventsim.reliability.entities;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;

import com.google.inject.assistedinject.Assisted;

import de.uka.ipd.sdq.scheduler.IActiveResource;

public interface SimReliabilityResourceFactory {
	SimReliabilityActiveResource createActiveReliabilityResource(IActiveResource resource, String processingRate, int numberOfInstances,
            SchedulingPolicy schedulingPolicy, ProcessingResourceSpecification specification, @Assisted("mttf") double mttf, @Assisted("mttr") double mttr);
}
