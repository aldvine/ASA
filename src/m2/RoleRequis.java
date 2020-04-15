package m2;

public class RoleRequis extends Role {
	private AttachementFournisToRequis attachement;

	public RoleRequis() {
		super();
	}
	
	public AttachementFournisToRequis getAttachement() {
		return attachement;
	}

	public void setAttachement(AttachementFournisToRequis attachement) {
		this.attachement = attachement;
	}

	
}
