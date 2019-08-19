package edu.kit.ipd.sdq.eventsim.reliability.strategies;

import java.util.function.Consumer;

import org.palladiosimulator.pcm.seff.AbstractAction;

import edu.kit.ipd.sdq.eventsim.interpreter.DecoratingSimulationStrategy;
import edu.kit.ipd.sdq.eventsim.interpreter.SimulationStrategy;
import edu.kit.ipd.sdq.eventsim.interpreter.TraversalInstruction;
import edu.kit.ipd.sdq.eventsim.system.entities.Request;

public class ResourceFailureSimulationStrategy implements DecoratingSimulationStrategy<AbstractAction, Request> {

	@Override
	public void simulate(AbstractAction action,
			Request entity,
			Consumer<TraversalInstruction> onFinishCallback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decorate(SimulationStrategy<AbstractAction, Request> decorated) {
		// TODO Auto-generated method stub
		
	}

}
