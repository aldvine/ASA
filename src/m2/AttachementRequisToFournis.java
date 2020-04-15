package m2;

public class AttachementRequisToFournis extends Attachement {
	private RoleFournis roleFournis;
	private PortComposantRequis portComposantRequis;
	
	public AttachementRequisToFournis() {
		super();
	}

	public PortComposantRequis getPortComposantRequis() {
		return portComposantRequis;
	}

	public void setPortComposantRequis(PortComposantRequis portComposantRequis) {
		this.portComposantRequis = portComposantRequis;
	}

	public RoleFournis getRoleFournis() {
		return roleFournis;
	}

	public void setRoleFournis(RoleFournis roleFournis) {
		this.roleFournis = roleFournis;
	}
	
	
}
