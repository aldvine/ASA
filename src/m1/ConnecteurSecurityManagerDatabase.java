package m1;

import java.util.ArrayList;

import m2.Connecteur;
import m2.Glue;
import m2.RoleRequis;
import m2.RoleFournis;
import m2.InterfaceConnecteurFournis;
import m2.InterfaceConnecteurRequis;

public class ConnecteurSecurityManagerDatabase extends Connecteur{
	private InterfaceConnecteurRequis interfaceConnecteurRequisCSMD;
	private InterfaceConnecteurFournis interfaceConnecteurFournisCSMD;
	private ArrayList<Glue> glues;

	public ConnecteurSecurityManagerDatabase() {
		super();
		this.interfaceConnecteurRequisCSMD = new InterfaceConnecteurRequis();
		this.interfaceConnecteurFournisCSMD = new InterfaceConnecteurFournis();
		this.glues = new ArrayList<Glue>();
	}
	
	public InterfaceConnecteurRequis getInterfaceConnecteurRequisCSMD() {
		return interfaceConnecteurRequisCSMD;
	}
	public void setInterfaceConnecteurRequisCSMD(InterfaceConnecteurRequis interfaceConnecteurRequisCSMD) {
		this.interfaceConnecteurRequisCSMD = interfaceConnecteurRequisCSMD;
	}
	public InterfaceConnecteurFournis getInterfaceConnecteurFournisCSMD() {
		return interfaceConnecteurFournisCSMD;
	}
	public void setInterfaceConnecteurFournisCSMD(InterfaceConnecteurFournis interfaceConnecteurFournisCSMD) {
		this.interfaceConnecteurFournisCSMD = interfaceConnecteurFournisCSMD;
	}
	public ArrayList<Glue> getGlues() {
		return glues;
	}
	public void setGlues(ArrayList<Glue> glues) {
		this.glues = glues;
	}
	public void addGlueCCMSM(Glue glueCSMD) {
		this.glues.add(glueCSMD);
	}
	public void addRolesRequisCSMDDatabase(ArrayList<RoleRequis> rolesRequisCSMDDatabase) {
		this.interfaceConnecteurRequisCSMD.setRolesRequis(rolesRequisCSMDDatabase);
	}
	public void addRolesRequisCSMDecurityManager(ArrayList<RoleRequis> rolesRequisCSMDecurityManager) {
		this.interfaceConnecteurRequisCSMD.setRolesRequis(rolesRequisCSMDecurityManager);
	}
	public void addRolesFournisCSMDDatabase(ArrayList<RoleFournis> rolesFournisCSMDDatabase) {
		this.interfaceConnecteurFournisCSMD.setRolesFournis(rolesFournisCSMDDatabase);
	}
	public void addRolesFournisCSMDSecurityManager(ArrayList<RoleFournis> rolesFournisCSMDSecurityManager) {
		this.interfaceConnecteurFournisCSMD.setRolesFournis(rolesFournisCSMDSecurityManager);
	}
}