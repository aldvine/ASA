package m2;

public class AttachementFournisToRequis extends Attachement {
	private RoleRequis roleRequis;
	private PortComposantFournis portComposantFournis;
	
	public AttachementFournisToRequis() {
		super();
	}

	public PortComposantFournis getPortComposantFournis() {
		return portComposantFournis;
	}

	public void setPortComposantFournis(PortComposantFournis portComposantFournis) {
		this.portComposantFournis = portComposantFournis;
	}

	public RoleRequis getRoleRequis() {
		return roleRequis;
	}

	public void setRoleRequis(RoleRequis roleRequis) {
		this.roleRequis = roleRequis;
	}
	
}
