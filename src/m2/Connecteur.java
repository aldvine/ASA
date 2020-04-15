package m2;

import java.util.ArrayList;

public class Connecteur implements Element{
	private ArrayList<InterfaceConnecteurRequis> interfacesRequis;
	private ArrayList<InterfaceConnecteurFournis> interfacesFournis;
	private ArrayList<Glue> glues;

	public Connecteur() {
		super();
		this.interfacesRequis = new ArrayList<InterfaceConnecteurRequis>();
		this.interfacesFournis = new ArrayList<InterfaceConnecteurFournis>();
		this.glues = new ArrayList<Glue>();
	}
	public ArrayList<InterfaceConnecteurRequis> getInterfacesRequis() {
		return interfacesRequis;
	}
	public void setInterfacesRequis(ArrayList<InterfaceConnecteurRequis> interfacesRequis) {
		this.interfacesRequis = interfacesRequis;
	}
	public ArrayList<InterfaceConnecteurFournis> getInterfacesFournis() {
		return interfacesFournis;
	}
	public void setInterfacesFournis(ArrayList<InterfaceConnecteurFournis> interfacesFournis) {
		this.interfacesFournis = interfacesFournis;
	}
	public ArrayList<Glue> getGlues() {
		return glues;
	}
	public void setGlues(ArrayList<Glue> glues) {
		this.glues = glues;
	}

	
}
