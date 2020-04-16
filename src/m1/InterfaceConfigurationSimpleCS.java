package m1;

import java.util.ArrayList;

import m2.Configuration;
import m2.PortConfigurationFournis;
import m2.PortConfigurationRequis;
import m2.InterfaceConfiguration;

public class InterfaceConfigurationSimpleCS extends InterfaceConfiguration {

	private ArrayList<PortConfigurationFournis> portConfigurationFournisSimpleCS;
	private ArrayList<PortConfigurationRequis> portConfigurationRequisSimpleCS;
	private Configuration configuration;
	
	public InterfaceConfigurationSimpleCS() {
		super();
		this.portConfigurationFournisSimpleCS = new ArrayList<PortConfigurationFournis>();
		this.portConfigurationRequisSimpleCS= new ArrayList<PortConfigurationRequis>();
	}
	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public ArrayList<PortConfigurationFournis> getPortConfigurationFournisSimpleCS() {
		return portConfigurationFournisSimpleCS;
	}
	public void setPortConfigurationFournisSimpleCS(ArrayList<PortConfigurationFournis> portConfigurationFournisSimpleCS) {
		this.portConfigurationFournisSimpleCS = portConfigurationFournisSimpleCS;
	}
	public ArrayList<PortConfigurationRequis> getPortConfigurationRequisSimpleCS() {
		return portConfigurationRequisSimpleCS;
	}
	public void setPortConfigurationRequisSimpleCS(ArrayList<PortConfigurationRequis> portConfigurationRequisSimpleCS) {
		this.portConfigurationRequisSimpleCS = portConfigurationRequisSimpleCS;
	}
	
}
