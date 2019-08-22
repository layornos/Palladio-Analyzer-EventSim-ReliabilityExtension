package edu.kit.ipd.sdq.eventsim.reliability.strategies;

import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.seff.AbstractAction;

import com.google.inject.Inject;

import edu.kit.ipd.sdq.eventsim.api.IActiveResource;
import edu.kit.ipd.sdq.eventsim.api.IPassiveResource;
import edu.kit.ipd.sdq.eventsim.interpreter.DecoratingSimulationStrategy;
import edu.kit.ipd.sdq.eventsim.interpreter.SimulationStrategy;
import edu.kit.ipd.sdq.eventsim.interpreter.TraversalInstruction;
import edu.kit.ipd.sdq.eventsim.reliability.entities.SimReliabilityActiveResource;

public class ResourceFailureDecoratingSimulationStrategy
		implements DecoratingSimulationStrategy<AbstractAction, SimReliabilityActiveResource> {

	private static final Logger logger = Logger.getLogger(ResourceFailureDecoratingSimulationStrategy.class);

	private SimulationStrategy<AbstractAction, SimReliabilityActiveResource> decorated;

	@Override
	public void simulate(AbstractAction action, SimReliabilityActiveResource entity,
			Consumer<TraversalInstruction> onFinishCallback) {
		/////////////////////////////////////////////////////////
        // do something *before* decorated simulation strategy //
        /////////////////////////////////////////////////////////
		logger.debug("MTTF: " + entity.getMTTR());
		logger.debug("MTTR: " + entity.getMTTF());
		logger.fatal("in simulate method of ResourceFailureDecoratingSimulationStrategy");
		
		decorated.simulate(action, entity, traversalInstruction -> {
            ////////////////////////////////////////////////////////
            // do something *after* decorated simulation strategy //
            ////////////////////////////////////////////////////////
			logger.fatal("is decorated.simulate of ResourceFailureDecoratingSimulationStrategy");
            // pass-though traversal instruction returned by decorated strategy
            onFinishCallback.accept(traversalInstruction);
        });
	}

	@Override
	public void decorate(SimulationStrategy<AbstractAction, SimReliabilityActiveResource> decorated) {
		// TODO Auto-generated method stub
		
	}

}
