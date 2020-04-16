package m1;

import java.util.ArrayList;

import m2.ContrainteTechnique;
import m2.InterfaceComposantFournis;
import m2.InterfaceComposantRequis;
import m2.Propriete;
import m2.Composant;
import m2.ServiceRequis;
import m2.PortComposantRequis;
import m2.ServiceFournis;
import m2.PortComposantFournis;

public class Client extends Composant {
	private ArrayList<ContrainteTechnique> contraintesTechniques;
	private InterfaceComposantRequis interfaceRequisClient;
	private InterfaceComposantFournis interfaceFournisClient;
	private ArrayList<Propriete> proprietes;
	public Client() {
		super();
		this.contraintesTechniques= new ArrayList<ContrainteTechnique>();
		this.proprietes = new ArrayList<Propriete>();
	}
	public ArrayList<ContrainteTechnique> getContraintesTechniques() {
		return contraintesTechniques;
	}
	public void setContraintesTechniques(ArrayList<ContrainteTechnique> contraintesTechniques) {
		this.contraintesTechniques = contraintesTechniques;
	}
	public InterfaceComposantRequis getInterfaceRequisClient() {
		return interfaceRequisClient;
	}
	public void setInterfaceRequisClient(InterfaceComposantRequis interfaceRequisClient) {
		this.interfaceRequisClient = interfaceRequisClient;
	}
	public InterfaceComposantFournis getInterfaceFournisClient() {
		return interfaceFournisClient;
	}
	public void setInterfaceFournisClient(InterfaceComposantFournis interfaceFournisClient) {
		this.interfaceFournisClient = interfaceFournisClient;
	}
	public ArrayList<Propriete> getProprietes() {
		return proprietes;
	}
	public void setProprietes(ArrayList<Propriete> proprietes) {
		this.proprietes = proprietes;
	}
	public void addCodeSource(Propriete codeSource) {
		this.proprietes.add(codeSource);
	}
	public void addSystemeExploitation(ContrainteTechnique systemeExploitation) {
		this.contraintesTechniques.add(systemeExploitation);
	}
	public void addServiceRequisClient(ArrayList<ServiceRequis> serviceRequisClient) {
		this.interfaceRequisClient.setServicesRequis(serviceRequisClient);
	}
	public void addPortRequisClient(ArrayList<PortComposantRequis> portRequisClient) {
		this.interfaceRequisClient.setPortsRequis(portRequisClient);
	}
	public void addServiceFournisClient(ArrayList<ServiceFournis> serviceFournisClient) {
		this.interfaceFournisClient.setServicesFournis(serviceFournisClient);
	}
	public void addPortFournisClient(ArrayList<PortComposantFournis> portFournisClient) {
		this.interfaceFournisClient.setPortsFournis(portFournisClient);
	}
}
