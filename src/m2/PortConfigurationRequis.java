package m2;

public class PortConfigurationRequis extends PortConfiguration {
	
	private BindingRequis binding;
	private InterfaceConfiguration interfaceConfiguration;
	public PortConfigurationRequis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterfaceConfiguration getInterfaceConfiguration() {
		return interfaceConfiguration;
	}

	public void setInterfaceConfiguration(InterfaceConfiguration interfaceConfiguration) {
		this.interfaceConfiguration = interfaceConfiguration;
	}

	public BindingRequis getBinding() {
		return binding;
	}

	public void setBinding(BindingRequis binding) {
		this.binding = binding;
	}
	
}
