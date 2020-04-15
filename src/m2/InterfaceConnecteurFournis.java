package m2;

import java.util.ArrayList;

public class InterfaceConnecteurFournis extends InterfaceConnecteur {
	private ArrayList<RoleFournis> rolesFournis;

	public InterfaceConnecteurFournis() {
		super();
		this.rolesFournis = new ArrayList<RoleFournis>();
	}

	public ArrayList<RoleFournis> getRolesFournis() {
		return rolesFournis;
	}

	public void setRolesFournis(ArrayList<RoleFournis> rolesFournis) {
		this.rolesFournis = rolesFournis;
	}	

}
