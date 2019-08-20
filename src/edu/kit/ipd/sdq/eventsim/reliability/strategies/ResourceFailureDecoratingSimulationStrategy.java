package edu.kit.ipd.sdq.eventsim.reliability.strategies;

import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.seff.AbstractAction;

import com.google.inject.Inject;

import edu.kit.ipd.sdq.eventsim.api.ISimulationConfiguration;
import edu.kit.ipd.sdq.eventsim.api.ISimulationMiddleware;
import edu.kit.ipd.sdq.eventsim.interpreter.DecoratingSimulationStrategy;
import edu.kit.ipd.sdq.eventsim.interpreter.SimulationStrategy;
import edu.kit.ipd.sdq.eventsim.interpreter.TraversalInstruction;
import edu.kit.ipd.sdq.eventsim.system.entities.Request;

public class ResourceFailureDecoratingSimulationStrategy
		implements DecoratingSimulationStrategy<AbstractAction, Request> {

	private static final Logger logger = Logger.getLogger(ResourceFailureDecoratingSimulationStrategy.class);
	
    @Inject
    private ISimulationConfiguration configuration;

    @Inject
    private ISimulationMiddleware middleware;

	private SimulationStrategy<AbstractAction, Request> decorated;

	@Override
	public void decorate(SimulationStrategy<AbstractAction, Request> decorated) {
		this.decorated = decorated;
	}

	@Override
	public void simulate(AbstractAction action, Request entity, Consumer<TraversalInstruction> onFinishCallback) {
        /////////////////////////////////////////////////////////
        // do something *before* decorated simulation strategy //
        /////////////////////////////////////////////////////////
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

}
