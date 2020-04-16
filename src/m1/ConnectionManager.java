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

public class ConnectionManager extends Composant {
	private ArrayList<ContrainteTechnique> contraintesTechniques;
	private InterfaceComposantRequis interfaceRequisConnectionManager;
	private InterfaceComposantFournis interfaceFournisConnectionManager;
	private ArrayList<Propriete> proprietes;
	public ConnectionManager() {
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
	public InterfaceComposantRequis getInterfaceRequisConnectionManager() {
		return interfaceRequisConnectionManager;
	}
	public void setInterfaceRequisConnectionManager(InterfaceComposantRequis interfaceRequisConnectionManager) {
		this.interfaceRequisConnectionManager = interfaceRequisConnectionManager;
	}
	public InterfaceComposantFournis getInterfaceFournisConnectionManager() {
		return interfaceFournisConnectionManager;
	}
	public void setInterfaceFournisConnectionManager(InterfaceComposantFournis interfaceFournisConnectionManager) {
		this.interfaceFournisConnectionManager = interfaceFournisConnectionManager;
	}
	public ArrayList<Propriete> getProprietes() {
		return proprietes;
	}
	public void setProprietes(ArrayList<Propriete> proprietes) {
		this.proprietes = proprietes;
	}
	public void addConnexion(Propriete connection) {
		this.proprietes.add(connection);
	}
	public void addSystemeExploitation(ContrainteTechnique systemeExploitation) {
		this.contraintesTechniques.add(systemeExploitation);
	}
	public void addServiceRequisConnectionManager(ArrayList<ServiceRequis> serviceRequisConnectionManager) {
		this.interfaceRequisConnectionManager.setServicesRequis(serviceRequisConnectionManager);
	}
	public void addPortRequisConnectionManager(ArrayList<PortComposantRequis> portRequisConnectionManager) {
		this.interfaceRequisConnectionManager.setPortsRequis(portRequisConnectionManager);
	}
	public void addServiceFournisConnectionManager(ArrayList<ServiceFournis> serviceFournisConnectionManager) {
		this.interfaceFournisConnectionManager.setServicesFournis(serviceFournisConnectionManager);
	}
	public void addPortFournisConnectionManager(ArrayList<PortComposantFournis> portFournisConnectionManager) {
		this.interfaceFournisConnectionManager.setPortsFournis(portFournisConnectionManager);
	}
}
