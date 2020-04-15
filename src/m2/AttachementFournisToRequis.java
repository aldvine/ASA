package m2;

public class AttachementFournisToRequis extends Attachement {
	private RoleRequis roleRequis;
	
	public AttachementFournisToRequis() {
		super();
	}

	public RoleRequis getRoleRequis() {
		return roleRequis;
	}

	public void setRoleRequis(RoleRequis roleRequis) {
		this.roleRequis = roleRequis;
	}
	
}
