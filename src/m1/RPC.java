package m1;

import java.util.ArrayList;

import m2.Connecteur;
import m2.Glue;
import m2.RoleRequis;
import m2.RoleFournis;
import m2.InterfaceConnecteurFournis;
import m2.InterfaceConnecteurRequis;

public class RPC extends Connecteur{
	private InterfaceConnecteurRequis interfaceConnecteurRequisRPC;
	private InterfaceConnecteurFournis interfaceConnecteurFournisRPC;
	private ArrayList<Glue> glues;

	public RPC() {
		super();
		this.interfaceConnecteurRequisRPC = new InterfaceConnecteurRequis();
		this.interfaceConnecteurFournisRPC = new InterfaceConnecteurFournis();
		this.glues = new ArrayList<Glue>();
	}
	
	public InterfaceConnecteurRequis getInterfaceConnecteurRequisRPC() {
		return interfaceConnecteurRequisRPC;
	}
	public void setInterfaceConnecteurRequisRPC(InterfaceConnecteurRequis interfaceConnecteurRequisRPC) {
		this.interfaceConnecteurRequisRPC = interfaceConnecteurRequisRPC;
	}
	public InterfaceConnecteurFournis getInterfaceConnecteurFournisRPC() {
		return interfaceConnecteurFournisRPC;
	}
	public void setInterfaceConnecteurFournisRPC(InterfaceConnecteurFournis interfaceConnecteurFournisRPC) {
		this.interfaceConnecteurFournisRPC = interfaceConnecteurFournisRPC;
	}
	public ArrayList<Glue> getGlues() {
		return glues;
	}
	public void setGlues(ArrayList<Glue> glues) {
		this.glues = glues;
	}
	public void addGlueRPC(Glue glueRPC) {
		this.glues.add(glueRPC);
	}
	public void addRolesRequisRPCClient(ArrayList<RoleRequis> rolesRequisRPCClient) {
		this.interfaceConnecteurRequisRPC.setRolesRequis(rolesRequisRPCClient);
	}
	public void addRolesRequisRPCServeur(ArrayList<RoleRequis> rolesRequisRPCServeur) {
		this.interfaceConnecteurRequisRPC.setRolesRequis(rolesRequisRPCServeur);
	}
	public void addRolesFournisRPCClient(ArrayList<RoleFournis> rolesFournisRPCClient) {
		this.interfaceConnecteurFournisRPC.setRolesFournis(rolesFournisRPCClient);
	}
	public void addRolesFournisRPCServeur(ArrayList<RoleFournis> rolesFournisRPCServeur) {
		this.interfaceConnecteurFournisRPC.setRolesFournis(rolesFournisRPCServeur);
	}
}