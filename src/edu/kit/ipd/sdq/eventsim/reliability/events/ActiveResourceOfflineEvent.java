package edu.kit.ipd.sdq.eventsim.reliability.events;

import edu.kit.ipd.sdq.eventsim.api.IActiveResource;
import edu.kit.ipd.sdq.eventsim.api.events.AbstractSimulationEvent;

public class ActiveResourceOfflineEvent extends AbstractSimulationEvent {
	
	private IActiveResource ar;
	
	public ActiveResourceOfflineEvent(IActiveResource ar) {
		this.ar = ar;
	}
	
	public IActiveResource getIActiveResoucre() {
		return ar;
	}

}
