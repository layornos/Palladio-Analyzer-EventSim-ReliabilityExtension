package edu.kit.ipd.sdq.eventsim.reliability.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import edu.kit.ipd.sdq.eventsim.modules.AbstractLaunchContribution;

public class ReliabilityModuleLaunchContribution extends AbstractLaunchContribution {

	@Override
	public void createControl(Composite parent) {
        final Composite container = new Composite(parent, SWT.NONE);
        this.setControl(container);
        container.setLayout(new GridLayout());

        Label message = new Label(container, SWT.NONE);
        message.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, 1, 1));
        message.setText("No configuration options available for chosen module.");
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

}
