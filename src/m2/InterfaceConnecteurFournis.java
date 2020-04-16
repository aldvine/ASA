package m2;

import java.util.ArrayList;

public class InterfaceConnecteurFournis extends InterfaceConnecteur {
	private ArrayList<RoleFournis> rolesFournis;
	private Connecteur connecteur;
	
	public InterfaceConnecteurFournis() {
		super();
		this.rolesFournis = new ArrayList<RoleFournis>();
	}

	public Connecteur getConnecteur() {
		return connecteur;
	}

	public void setConnecteur(Connecteur connecteur) {
		this.connecteur = connecteur;
	}

	public ArrayList<RoleFournis> getRolesFournis() {
		return rolesFournis;
	}

	public void setRolesFournis(ArrayList<RoleFournis> rolesFournis) {
		this.rolesFournis = rolesFournis;
	}	
	public void addRolesFournis(RoleFournis rolesFournis) {
		this.rolesFournis.add(rolesFournis);
	}	

}
