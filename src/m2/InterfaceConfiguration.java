package m2;

import java.util.ArrayList;

public class InterfaceConfiguration extends Interface {

	private ArrayList<PortConfigurationFournis> portsFournis;
	private ArrayList<PortConfigurationRequis> portsRequis;
	private Configuration configuration;
	
	public InterfaceConfiguration() {
		super();
		this.portsFournis = new ArrayList<PortConfigurationFournis>();
		this.portsRequis = new ArrayList<PortConfigurationRequis>();
		this.configuration = new Configuration();
	}
	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public ArrayList<PortConfigurationFournis> getPortsFournis() {
		return portsFournis;
	}
	public void setPortsFournis(ArrayList<PortConfigurationFournis> portsFournis) {
		this.portsFournis = portsFournis;
	}
	public void addPortsFournis(PortConfigurationFournis portFournis) {
		this.portsFournis.add(portFournis);
	}
	public ArrayList<PortConfigurationRequis> getPortsRequis() {
		return portsRequis;
	}
	public void setPortsRequis(ArrayList<PortConfigurationRequis> portsRequis) {
		this.portsRequis = portsRequis;
	}
	public void addPortsRequis(PortConfigurationRequis portRequis) {
		this.portsRequis.add(portRequis);
	}
	
}
