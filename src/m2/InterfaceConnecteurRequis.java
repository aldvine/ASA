package m2;

import java.util.ArrayList;

public class InterfaceConnecteurRequis extends InterfaceConnecteur {

	
	private ArrayList<RoleRequis> rolesRequis;

	public InterfaceConnecteurRequis() {
		super();
		this.rolesRequis = new ArrayList<RoleRequis>();
	}

	public ArrayList<RoleRequis> getRolesRequis() {
		return rolesRequis;
	}

	public void setRolesRequis(ArrayList<RoleRequis> rolesRequis) {
		this.rolesRequis = rolesRequis;
	}

	
	
}
