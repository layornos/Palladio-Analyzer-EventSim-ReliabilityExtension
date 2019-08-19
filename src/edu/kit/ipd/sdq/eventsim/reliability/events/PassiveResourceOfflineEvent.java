package edu.kit.ipd.sdq.eventsim.reliability.events;

import edu.kit.ipd.sdq.eventsim.api.IPassiveResource;
import edu.kit.ipd.sdq.eventsim.api.events.AbstractSimulationEvent;

public class PassiveResourceOfflineEvent extends AbstractSimulationEvent {
	
	private IPassiveResource pr;
	
	public PassiveResourceOfflineEvent(IPassiveResource pr) {
		this.pr = pr;
	}
	
	public IPassiveResource getPassiveResource() {
		return pr;
	}
}
