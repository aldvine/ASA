package m2;

import java.util.ArrayList;

public class InterfaceComposantRequis extends InterfaceComposant {
	private ArrayList<ServiceRequis> servicesRequis;
	private Composant composant;
	private ArrayList<PortComposantRequis> portsRequis;
	public InterfaceComposantRequis() {
		super();
		this.servicesRequis = new ArrayList<ServiceRequis>();
		this.portsRequis=new ArrayList<PortComposantRequis>();
	}
	
	public ArrayList<PortComposantRequis> getPortsRequis() {
		return portsRequis;
	}

	public void setPortsRequis(ArrayList<PortComposantRequis> portsRequis) {
		this.portsRequis = portsRequis;
	}
	public void addPortsRequis(PortComposantRequis portsRequis) {
		this.portsRequis.add(portsRequis);
	}

	public ArrayList<ServiceRequis> getServicesRequis() {
		return servicesRequis;
	}
	public void setServicesRequis(ArrayList<ServiceRequis> servicesRequis) {
		this.servicesRequis = servicesRequis;
	}
	public void addServicesRequis(ServiceRequis servicesRequis) {
		this.servicesRequis.add(servicesRequis);
	}
	public Composant getComposant() {
		return composant;
	}
	public void setComposant(Composant composant) {
		this.composant = composant;
	}
}
