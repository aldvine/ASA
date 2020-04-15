package m2;

import java.util.ArrayList;

public class InterfaceComposantFournis extends InterfaceComposant {
	
	private ArrayList<ServiceFournis> servicesFournis;
	private ArrayList<PortComposantFournis> portsFournis;
	private Composant composant;
	public InterfaceComposantFournis() {
		super();
		this.servicesFournis = new ArrayList<ServiceFournis>();
		this.portsFournis = new ArrayList<PortComposantFournis>();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<ServiceFournis> getServicesFournis() {
		return servicesFournis;
	}
	public void setServicesFournis(ArrayList<ServiceFournis> servicesFournis) {
		this.servicesFournis = servicesFournis;
	}
	public ArrayList<PortComposantFournis> getPortsFournis() {
		return portsFournis;
	}
	public void setPortsFournis(ArrayList<PortComposantFournis> portsFournis) {
		this.portsFournis = portsFournis;
	}
	public Composant getComposant() {
		return composant;
	}
	public void setComposant(Composant composant) {
		this.composant = composant;
	}
	
}
