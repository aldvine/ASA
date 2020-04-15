package m2;

public class RoleFournis extends Role {
	private AttachementFournisToRequis attachement;
	private InterfaceConnecteurFournis interfaceFournis;
	
	public RoleFournis() {
		super();
	}
	
	public InterfaceConnecteurFournis getInterfaceFournis() {
		return interfaceFournis;
	}

	public void setInterfaceFournis(InterfaceConnecteurFournis interfaceFournis) {
		this.interfaceFournis = interfaceFournis;
	}

	public AttachementFournisToRequis getAttachement() {
		return attachement;
	}
	public void setAttachement(AttachementFournisToRequis attachement) {
		this.attachement = attachement;
	}
	
}
