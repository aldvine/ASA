package m2;

public class PortConfigurationFournis extends PortConfiguration {
	 private BindingFournis binding;
	 private InterfaceConfiguration interfaceConfiguration;
	 
	public PortConfigurationFournis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterfaceConfiguration getInterfaceConfiguration() {
		return interfaceConfiguration;
	}

	public void setInterfaceConfiguration(InterfaceConfiguration interfaceConfiguration) {
		this.interfaceConfiguration = interfaceConfiguration;
	}

	public BindingFournis getBinding() {
		return binding;
	}

	public void setBinding(BindingFournis binding) {
		this.binding = binding;
	}
	 
}