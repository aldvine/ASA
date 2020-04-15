package m2;

public class Glue {
	private InterfaceConnecteurRequis interfaceRequis;
	private InterfaceConnecteurFournis interfaceFournis;
	private Connecteur connecteur;
	public Glue() {
		super();
	}
	
	public Connecteur getConnecteur() {
		return connecteur;
	}

	public void setConnecteur(Connecteur connecteur) {
		this.connecteur = connecteur;
	}

	public InterfaceConnecteurRequis getInterfaceRequis() {
		return interfaceRequis;
	}
	public void setInterfaceRequis(InterfaceConnecteurRequis interfaceRequis) {
		this.interfaceRequis = interfaceRequis;
	}
	public InterfaceConnecteurFournis getInterfaceFournis() {
		return interfaceFournis;
	}
	public void setInterfaceFournis(InterfaceConnecteurFournis interfaceFournis) {
		this.interfaceFournis = interfaceFournis;
	}
	
	
}
