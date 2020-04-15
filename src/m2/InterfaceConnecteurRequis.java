package m2;

import java.util.ArrayList;

public class InterfaceConnecteurRequis extends InterfaceConnecteur {

	
	private ArrayList<RoleRequis> rolesRequis;
	private Connecteur connecteur;
	public InterfaceConnecteurRequis() {
		super();
		this.rolesRequis = new ArrayList<RoleRequis>();
	}

	public Connecteur getConnecteur() {
		return connecteur;
	}

	public void setConnecteur(Connecteur connecteur) {
		this.connecteur = connecteur;
	}

	public ArrayList<RoleRequis> getRolesRequis() {
		return rolesRequis;
	}

	public void setRolesRequis(ArrayList<RoleRequis> rolesRequis) {
		this.rolesRequis = rolesRequis;
	}

	
	
}
