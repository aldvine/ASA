package m0;

import java.util.ArrayList;

import javafx.scene.chart.PieChart.Data;
import m1.*;
import m1.SecurityManager;
import m2.*;

public class Main {


	public static void main(String[] args) {
		
		// System SimpleCS = {
		SimpleCS simpleCS = new SimpleCS();
		
		// Component Client = { Port Send_Request }
		Client client = new Client();
		
		PortComposantFournis send_request = new PortComposantFournis();
		client.addPortFournisClient(send_request);
		
		//Connector RPC = { Roles { Caller, Called } 
		RPC rpc = new RPC();
		Glue glueRPC =  new Glue();
		rpc.addGlueRPC(glueRPC);
		RoleRequis rolesRequisRPCClient = new RoleRequis();
		rpc.addRolesRequisRPCClient(rolesRequisRPCClient);
		RoleFournis rolesFournisRPCServeur = new RoleFournis();
		rpc.addRolesFournisRPCServeur(rolesFournisRPCServeur);

		//Component Server = { Port Receive_Request }
		Serveur server= new Serveur();
		PortComposantRequis receive_request  = new PortComposantRequis();
		server.addPortRequisServeur(receive_request);
		
		//	Attachements : {
		//		Client.SendRequest to RPC.caller,
		//		Server.Receive_Request to RPC.called
		//	}
		ArrayList<Attachement> attachementsSimpleCS = new ArrayList<Attachement>();
		
		AttachementFournisToRequis clientToRpc = new AttachementFournisToRequis();
		clientToRpc.setPortComposantFournis(send_request);
		attachementsSimpleCS.add(clientToRpc);
		send_request.setAttachement(clientToRpc);
		AttachementRequisToFournis serverToRpc = new AttachementRequisToFournis();
		serverToRpc.setPortComposantRequis(receive_request);
		attachementsSimpleCS.add(serverToRpc);
		receive_request.setAttachement(serverToRpc);
		
		// ajout des elements à la configuration simpleCS
		simpleCS.addElements(client);
		simpleCS.addElements(server);
		simpleCS.addElements(rpc);
		
		// ajout de la configuration server_detail au composant server
		ServerDetail server_detail = new ServerDetail();
		server.setServerDetail(server_detail);
		InterfaceConfiguration interfaceConfigurationServerDetail = server_detail.getInterfaceConfigurationServerDetail();
		interfaceConfigurationServerDetail.setConfiguration(server_detail);
		
		
		// ajout du composant connection Manager et de ses ports
		ConnectionManager connectionManager = new ConnectionManager();
		PortComposantRequis externalSocket = new PortComposantRequis();
		connectionManager.addPortRequisConnectionManager(externalSocket);
		
		// ajout du binding entre le portRequisConnectionManager et le portConfigurationRequisServerDetail
		BindingRequis bindingRequisConnectionManager = new BindingRequis();
		externalSocket.setBinding(bindingRequisConnectionManager);
		
		PortConfigurationRequis portConfigurationRequisServerDetail = new PortConfigurationRequis();
		portConfigurationRequisServerDetail.setBinding(bindingRequisConnectionManager);
		portConfigurationRequisServerDetail.setInterfaceConfiguration(interfaceConfigurationServerDetail);
		
		interfaceConfigurationServerDetail.addPortsRequis(portConfigurationRequisServerDetail);
		server_detail.setInterfaceConfigurationServerDetail(interfaceConfigurationServerDetail);
		
		bindingRequisConnectionManager.setPortConfiguration(portConfigurationRequisServerDetail);
		bindingRequisConnectionManager.setPortComposant(externalSocket);
		
		PortComposantFournis securityCheck = new PortComposantFournis();
		connectionManager.addPortFournisConnectionManager(securityCheck);
		PortComposantRequis db_query = new PortComposantRequis();
		connectionManager.addPortRequisConnectionManager(db_query);
		
		// ajout du composant SecurityManager et de ses ports
		SecurityManager securityManager = new SecurityManager();
		PortComposantRequis security_authentification = new PortComposantRequis();
		securityManager.addPortRequisSecurityManager(security_authentification);
		PortComposantFournis check_query = new PortComposantFournis();
		securityManager.addPortFournisSecurityManager(check_query);
		
		
		// ajout du composant Database et de ses ports
		Database database = new Database();
		PortComposantRequis security_management = new PortComposantRequis();
		database.addPortRequisDatabase(security_management);
		PortComposantFournis query_interrogation = new PortComposantFournis();
		database.addPortFournisDatabase(query_interrogation);
	
		// Ajout du connecteur ConnectionManagerSecurityManager et de ses roles
		ConnecteurConnectionManagerSecurityManager connectionManagerSecurityManager = new ConnecteurConnectionManagerSecurityManager();
		Glue glueCCMSM =  new Glue();
		connectionManagerSecurityManager.addGlueCCMSM(glueCCMSM);
		RoleRequis roleRequisCCMSMC = new RoleRequis();
		connectionManagerSecurityManager.addRolesRequisCCMSMConnectionManager(roleRequisCCMSMC);
		RoleFournis roleFournisCCMSMC = new RoleFournis();
		connectionManagerSecurityManager.addRolesFournisCCMSMSecurityManager(roleFournisCCMSMC);
		
		// Ajout du connecteur SecurityManagerDatabase et de ses roles
		ConnecteurSecurityManagerDatabase securityManagerDatabase = new ConnecteurSecurityManagerDatabase();
		Glue glueCSMD =  new Glue();
		securityManagerDatabase.addGlueCSMD(glueCSMD);
		RoleRequis roleRequisCSMD = new RoleRequis();
		securityManagerDatabase.addRolesRequisCSMDSecurityManager(roleRequisCSMD);
		RoleFournis roleFournisCSMD = new RoleFournis();
		securityManagerDatabase.addRolesFournisCSMDDatabase(roleFournisCSMD);
		
		// Ajout du connecteur DatabaseConnectionManager et de ses roles
		ConnecteurConnectionManagerDatabase connectionManagerDatabase = new ConnecteurConnectionManagerDatabase();
		Glue glueCCMD =  new Glue();
		connectionManagerDatabase.addGlueCCMD(glueCCMD);
		RoleRequis roleRequisCCMD = new RoleRequis();
		connectionManagerDatabase.addRolesRequisCCMDDatabase(roleRequisCCMD);
		RoleFournis roleFournisCCMD = new RoleFournis();
		connectionManagerDatabase.addRolesFournisCCMDConnectionManager(roleFournisCCMD);
		
		// ajout des attachements de la configuration server_detail
		ArrayList<Attachement> attachementsServerDetail = new ArrayList<Attachement>();
		
		//		Attachements : {
		//		ConnectionManager.SecurityCheck 
		//		to ConnectionManagerSecurityManager.caller,
		//		SecurityManager.Security_Authentification 
		//		to ConnectionManagerSecurityManager.called,
		//	}
		AttachementFournisToRequis connectionManagerToConnectionManagerSecurityManager = new AttachementFournisToRequis();
		connectionManagerToConnectionManagerSecurityManager.setPortComposantFournis(securityCheck);
		attachementsServerDetail.add(connectionManagerToConnectionManagerSecurityManager);
		securityCheck.setAttachement(connectionManagerToConnectionManagerSecurityManager);
		AttachementRequisToFournis connectionManagerSecurityManagerToSecurityCheck = new AttachementRequisToFournis();
		connectionManagerSecurityManagerToSecurityCheck.setPortComposantRequis(security_authentification);
		attachementsServerDetail.add(connectionManagerSecurityManagerToSecurityCheck);
		security_authentification.setAttachement(connectionManagerSecurityManagerToSecurityCheck);

		
		//		Attachements : {
		//		SecurityManager.Check_Query 
		//		to SecurityManagerDatabase.caller,
		//		Database.Security_Authentification 
		//		to SecurityManagerDatabase.called,
		//	}
		AttachementFournisToRequis securityManagerToSecurityManagerDatabase  = new AttachementFournisToRequis();
		securityManagerToSecurityManagerDatabase.setPortComposantFournis(check_query);
		attachementsServerDetail.add(securityManagerToSecurityManagerDatabase);
		check_query.setAttachement(securityManagerToSecurityManagerDatabase);
		AttachementRequisToFournis securityManagerDatabaseToDatabase = new AttachementRequisToFournis();
		securityManagerDatabaseToDatabase.setPortComposantRequis(security_management);
		attachementsServerDetail.add(securityManagerDatabaseToDatabase);
		security_management.setAttachement(securityManagerDatabaseToDatabase);

		
		//		Attachements : {
		//		Database.Query_Interrogation 
		//		to DatabaseConnectionManager.caller,
		//		ConnectionManager.DB_Query 
		//		to DatabaseConnectionManager.called
		//	}
		AttachementFournisToRequis databaseToConnectionManagerDatabase   = new AttachementFournisToRequis();
		databaseToConnectionManagerDatabase.setPortComposantFournis(query_interrogation);
		attachementsServerDetail.add(databaseToConnectionManagerDatabase);
		query_interrogation.setAttachement(databaseToConnectionManagerDatabase);
		AttachementRequisToFournis connectionManagerDatabaseToConnectionManager = new AttachementRequisToFournis();
		connectionManagerDatabaseToConnectionManager.setPortComposantRequis(db_query);
		attachementsServerDetail.add(connectionManagerDatabaseToConnectionManager);
		db_query.setAttachement(connectionManagerDatabaseToConnectionManager);
		
	}
}
