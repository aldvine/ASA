package m2;

public class RoleFournis extends Role {
	private AttachementFournisToRequis attachement;
	public RoleFournis() {
		super();
	}
	public AttachementFournisToRequis getAttachement() {
		return attachement;
	}
	public void setAttachement(AttachementFournisToRequis attachement) {
		this.attachement = attachement;
	}
	
}
