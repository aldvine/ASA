package m0;

import java.util.ArrayList;

import m1.*;
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
		ArrayList<Attachement> attachements = new ArrayList<Attachement>();
		AttachementFournisToRequis clientToRpc = new AttachementFournisToRequis();
		clientToRpc.setPortComposantFournis(send_request);
		send_request.setAttachement(clientToRpc);
		AttachementRequisToFournis serverToRpc = new AttachementRequisToFournis();
		serverToRpc.setPortComposantRequis(receive_request);
		receive_request.setAttachement(serverToRpc);
		
		// ajout des elements à la configuration simpleCS
		simpleCS.addElements(client);
		simpleCS.addElements(server);
		simpleCS.addElements(rpc);
		
		// ajout de la configuration server_detail au composant server
		
		ServerDetail server_detail = new ServerDetail();
		
		// ajout du composant connection Manager et de ses ports
		ConnectionManager connectionManager = new ConnectionManager();
		
		PortComposantFournis externalSocket = new PortComposantFournis();
		connectionManager.addPortFournisConnectionManager(externalSocket);

		
		
	}
}
