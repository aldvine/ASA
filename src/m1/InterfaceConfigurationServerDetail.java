package m1;

import java.util.ArrayList;

import m2.Configuration;
import m2.PortConfigurationFournis;
import m2.PortConfigurationRequis;
import m2.InterfaceConfiguration;

public class InterfaceConfigurationServerDetail extends InterfaceConfiguration {

	private ArrayList<PortConfigurationFournis> portConfigurationFournisServerDetail;
	private ArrayList<PortConfigurationRequis> portConfigurationRequisServerDetail;
	private Configuration configuration;
	
	public InterfaceConfigurationServerDetail() {
		super();
		this.portConfigurationFournisServerDetail = new ArrayList<PortConfigurationFournis>();
		this.portConfigurationRequisServerDetail= new ArrayList<PortConfigurationRequis>();
	}
	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public ArrayList<PortConfigurationFournis> getPortConfigurationFournisServerDetail() {
		return portConfigurationFournisServerDetail;
	}
	public void setPortConfigurationFournisServerDetail(ArrayList<PortConfigurationFournis> portConfigurationFournisServerDetail) {
		this.portConfigurationFournisServerDetail = portConfigurationFournisServerDetail;
	}
	public ArrayList<PortConfigurationRequis> getPortConfigurationRequisServerDetail() {
		return portConfigurationRequisServerDetail;
	}
	public void setPortConfigurationRequisServerDetail(ArrayList<PortConfigurationRequis> portConfigurationRequisServerDetail) {
		this.portConfigurationRequisServerDetail = portConfigurationRequisServerDetail;
	}
}
