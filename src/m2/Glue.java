package m2;

public class Glue {
	private InterfaceConnecteurRequis interfaceRequis;
	private InterfaceConnecteurFournis interfaceFournis;
	
	public Glue() {
		super();
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
