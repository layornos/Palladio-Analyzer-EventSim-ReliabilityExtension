package edu.kit.ipd.sdq.eventsim.reliability.entities;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationModel;
import edu.kit.ipd.sdq.eventsim.resources.entities.SimActiveResource;

public class SimReliabilityActiveResource extends SimActiveResource {
	private double mttf;

	private double mttr;
	
	@Inject
    public SimReliabilityActiveResource(ISimulationModel model, 
    		@Assisted IActiveResource resource,
            @Assisted String processingRate, 
            @Assisted int numberOfInstances,
            @Assisted SchedulingPolicy schedulingStrategy, 
            @Assisted ProcessingResourceSpecification specification,
            @Assisted double mttf, 
            @Assisted double mttr) {
        super(model, resource, processingRate, numberOfInstances, schedulingStrategy, specification);
        this.mttf = mttf;
        this.mttr = mttr;    
    }
	
    public double getMTTF() {
    	return this.mttf;
    }
    
    public double getMTTR() {
    	return this.mttr;
    }

}
