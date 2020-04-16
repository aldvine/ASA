package m1;

import java.util.ArrayList;

import m2.Connecteur;
import m2.Glue;
import m2.RoleRequis;
import m2.RoleFournis;
import m2.InterfaceConnecteurFournis;
import m2.InterfaceConnecteurRequis;

public class ConnecteurConnectionManagerDatabase extends Connecteur{
	private InterfaceConnecteurRequis interfaceConnecteurRequisCCMD;
	private InterfaceConnecteurFournis interfaceConnecteurFournisCCMD;
	private ArrayList<Glue> glues;

	public ConnecteurConnectionManagerDatabase() {
		super();
		this.interfaceConnecteurRequisCCMD = new InterfaceConnecteurRequis();
		this.interfaceConnecteurFournisCCMD = new InterfaceConnecteurFournis();
		this.glues = new ArrayList<Glue>();
	}
	
	public InterfaceConnecteurRequis getInterfaceConnecteurRequisCCMD() {
		return interfaceConnecteurRequisCCMD;
	}
	public void setInterfaceConnecteurRequisCCMD(InterfaceConnecteurRequis interfaceConnecteurRequisCCMD) {
		this.interfaceConnecteurRequisCCMD = interfaceConnecteurRequisCCMD;
	}
	public InterfaceConnecteurFournis getInterfaceConnecteurFournisCCMD() {
		return interfaceConnecteurFournisCCMD;
	}
	public void setInterfaceConnecteurFournisCCMD(InterfaceConnecteurFournis interfaceConnecteurFournisCCMD) {
		this.interfaceConnecteurFournisCCMD = interfaceConnecteurFournisCCMD;
	}
	public ArrayList<Glue> getGlues() {
		return glues;
	}
	public void setGlues(ArrayList<Glue> glues) {
		this.glues = glues;
	}
	public void addGlueCCMD(Glue glueCCMD) {
		this.glues.add(glueCCMD);
	}
	public void addRolesRequisCCMDConnectionManager(RoleRequis rolesRequisCCMDConnectionManager) {
		this.interfaceConnecteurRequisCCMD.addRolesRequis(rolesRequisCCMDConnectionManager);
	}
	public void addRolesRequisCCMDDatabase(RoleRequis rolesRequisCCMDDatabase) {
		this.interfaceConnecteurRequisCCMD.addRolesRequis(rolesRequisCCMDDatabase);
	}
	public void addRolesFournisCCMDConnectionManager(RoleFournis rolesFournisCCMDConnectionManager) {
		this.interfaceConnecteurFournisCCMD.addRolesFournis(rolesFournisCCMDConnectionManager);
	}
	public void addRolesFournisCCMDDatabase(RoleFournis rolesFournisCCMDDatabase) {
		this.interfaceConnecteurFournisCCMD.addRolesFournis(rolesFournisCCMDDatabase);
	}
}