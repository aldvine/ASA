package m2;

public class RoleRequis extends Role {
	private AttachementFournisToRequis attachement;
	private InterfaceConnecteurRequis interfaceRequis;
	public RoleRequis() {
		super();
	}
	
	public InterfaceConnecteurRequis getInterfaceRequis() {
		return interfaceRequis;
	}

	public void setInterfaceRequis(InterfaceConnecteurRequis interfaceRequis) {
		this.interfaceRequis = interfaceRequis;
	}

	public AttachementFournisToRequis getAttachement() {
		return attachement;
	}

	public void setAttachement(AttachementFournisToRequis attachement) {
		this.attachement = attachement;
	}

	
}
