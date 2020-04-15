package m2;

import java.util.ArrayList;

public class Connecteur implements Element{
	private InterfaceConnecteurRequis interfacesRequis;
	private InterfaceConnecteurFournis interfacesFournis;
	private ArrayList<Glue> glues;

	public Connecteur() {
		super();
		this.glues = new ArrayList<Glue>();
	}

	public InterfaceConnecteurRequis getInterfacesRequis() {
		return interfacesRequis;
	}

	public void setInterfacesRequis(InterfaceConnecteurRequis interfacesRequis) {
		this.interfacesRequis = interfacesRequis;
	}

	public InterfaceConnecteurFournis getInterfacesFournis() {
		return interfacesFournis;
	}

	public void setInterfacesFournis(InterfaceConnecteurFournis interfacesFournis) {
		this.interfacesFournis = interfacesFournis;
	}

	public ArrayList<Glue> getGlues() {
		return glues;
	}

	public void setGlues(ArrayList<Glue> glues) {
		this.glues = glues;
	}


	
}
