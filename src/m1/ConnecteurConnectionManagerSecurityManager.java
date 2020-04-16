package m1;

import java.util.ArrayList;

import m2.Connecteur;
import m2.Glue;
import m2.RoleRequis;
import m2.RoleFournis;
import m2.InterfaceConnecteurFournis;
import m2.InterfaceConnecteurRequis;

public class ConnecteurConnectionManagerSecurityManager extends Connecteur{
	private InterfaceConnecteurRequis interfaceConnecteurRequisCCMSM;
	private InterfaceConnecteurFournis interfaceConnecteurFournisCCMSM;
	private ArrayList<Glue> glues;

	public ConnecteurConnectionManagerSecurityManager() {
		super();
		this.interfaceConnecteurRequisCCMSM = new InterfaceConnecteurRequis();
		this.interfaceConnecteurFournisCCMSM = new InterfaceConnecteurFournis();
		this.glues = new ArrayList<Glue>();
	}
	
	public InterfaceConnecteurRequis getInterfaceConnecteurRequisCCMSM() {
		return interfaceConnecteurRequisCCMSM;
	}
	public void setInterfaceConnecteurRequisCCMSM(InterfaceConnecteurRequis interfaceConnecteurRequisCCMSM) {
		this.interfaceConnecteurRequisCCMSM = interfaceConnecteurRequisCCMSM;
	}
	public InterfaceConnecteurFournis getInterfaceConnecteurFournisCCMSM() {
		return interfaceConnecteurFournisCCMSM;
	}
	public void setInterfaceConnecteurFournisCCMSM(InterfaceConnecteurFournis interfaceConnecteurFournisCCMSM) {
		this.interfaceConnecteurFournisCCMSM = interfaceConnecteurFournisCCMSM;
	}
	public ArrayList<Glue> getGlues() {
		return glues;
	}
	public void setGlues(ArrayList<Glue> glues) {
		this.glues = glues;
	}
	public void addGlueCCMSM(Glue glueCCMSM) {
		this.glues.add(glueCCMSM);
	}
	public void addRolesRequisCCMSMConnectionManager(RoleRequis rolesRequisCCMSMConnectionManager) {
		this.interfaceConnecteurRequisCCMSM.addRolesRequis(rolesRequisCCMSMConnectionManager);
	}
	public void addRolesRequisCCMSMSecurityManager(RoleRequis rolesRequisCCMSMSecurityManager) {
		this.interfaceConnecteurRequisCCMSM.addRolesRequis(rolesRequisCCMSMSecurityManager);
	}
	public void addRolesFournisCCMSMConnectionManager(RoleFournis rolesFournisCCMSMConnectionManager) {
		this.interfaceConnecteurFournisCCMSM.addRolesFournis(rolesFournisCCMSMConnectionManager);
	}
	public void addRolesFournisCCMSMSecurityManager(RoleFournis rolesFournisCCMSMSecurityManager) {
		this.interfaceConnecteurFournisCCMSM.addRolesFournis(rolesFournisCCMSMSecurityManager);
	}
}