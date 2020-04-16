package m1;

import java.util.ArrayList;

import m2.Configuration;
import m2.ContrainteTechnique;
import m2.InterfaceComposantFournis;
import m2.InterfaceComposantRequis;
import m2.Propriete;
import m2.Composant;
import m2.ServiceRequis;
import m2.PortComposantRequis;
import m2.ServiceFournis;
import m2.PortComposantFournis;

public class Serveur extends Composant {
	private ArrayList<ContrainteTechnique> contraintesTechniques;
	private InterfaceComposantRequis interfaceRequisServeur;
	private InterfaceComposantFournis interfaceFournisServeur;
	private ArrayList<Propriete> proprietes;
	private Configuration serverDetail;
	public Serveur() {
		super();
		this.contraintesTechniques= new ArrayList<ContrainteTechnique>();
		this.interfaceRequisServeur = new InterfaceComposantRequis();
		this.interfaceFournisServeur = new InterfaceComposantFournis();
		
		this.proprietes = new ArrayList<Propriete>();
	}
	public ArrayList<ContrainteTechnique> getContraintesTechniques() {
		return contraintesTechniques;
	}
	public void setContraintesTechniques(ArrayList<ContrainteTechnique> contraintesTechniques) {
		this.contraintesTechniques = contraintesTechniques;
	}
	public InterfaceComposantRequis getInterfaceRequisServeur() {
		return interfaceRequisServeur;
	}
	public void setInterfaceRequisServeur(InterfaceComposantRequis interfaceRequisServeur) {
		this.interfaceRequisServeur = interfaceRequisServeur;
	}
	public InterfaceComposantFournis getInterfaceFournisServeur() {
		return interfaceFournisServeur;
	}
	public void setInterfaceFournisServeur(InterfaceComposantFournis interfaceFournisServeur) {
		this.interfaceFournisServeur = interfaceFournisServeur;
	}
	public ArrayList<Propriete> getProprietes() {
		return proprietes;
	}
	public void setProprietes(ArrayList<Propriete> proprietes) {
		this.proprietes = proprietes;
	}
	public Configuration getServerDetail() {
		return serverDetail;
	}
	public void setServerDetail(Configuration serverDetail) {
		this.serverDetail = serverDetail;
	}
	public void addCodeSource(Propriete codeSource) {
		this.proprietes.add(codeSource);
	}
	public void addSystemeExploitation(ContrainteTechnique systemeExploitation) {
		this.contraintesTechniques.add(systemeExploitation);
	}
	public void addServiceRequisServeur(ServiceRequis serviceRequisServeur) {
		this.interfaceRequisServeur.addServicesRequis(serviceRequisServeur);
	}
	public void addPortRequisServeur(PortComposantRequis portRequisServeur) {
		this.interfaceRequisServeur.addPortsRequis(portRequisServeur);
	}
	public void addServiceFournisServeur(ServiceFournis serviceFournisServeur) {
		this.interfaceFournisServeur.addServicesFournis(serviceFournisServeur);
	}
	public void addPortFournisServeur(PortComposantFournis portFournisServeur) {
		this.interfaceFournisServeur.addPortsFournis(portFournisServeur);
	}
}
