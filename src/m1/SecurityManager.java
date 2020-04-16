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

public class SecurityManager extends Composant {
	private ArrayList<ContrainteTechnique> contraintesTechniques;
	private InterfaceComposantRequis interfaceRequisSecurityManager;
	private InterfaceComposantFournis interfaceFournisSecurityManager;
	private ArrayList<Propriete> proprietes;
	public SecurityManager() {
		super();
		this.contraintesTechniques= new ArrayList<ContrainteTechnique>();
		this.interfaceFournisSecurityManager = new InterfaceComposantFournis();
		this.interfaceRequisSecurityManager =  new InterfaceComposantRequis();
		this.proprietes = new ArrayList<Propriete>();
	}
	public ArrayList<ContrainteTechnique> getContraintesTechniques() {
		return contraintesTechniques;
	}
	public void setContraintesTechniques(ArrayList<ContrainteTechnique> contraintesTechniques) {
		this.contraintesTechniques = contraintesTechniques;
	}
	public InterfaceComposantRequis getInterfaceRequisSecurityManager() {
		return interfaceRequisSecurityManager;
	}
	public void setInterfaceRequisSecurityManager(InterfaceComposantRequis interfaceRequisSecurityManager) {
		this.interfaceRequisSecurityManager = interfaceRequisSecurityManager;
	}
	public InterfaceComposantFournis getInterfaceFournisSecurityManager() {
		return interfaceFournisSecurityManager;
	}
	public void setInterfaceFournisSecurityManager(InterfaceComposantFournis interfaceFournisSecurityManager) {
		this.interfaceFournisSecurityManager = interfaceFournisSecurityManager;
	}
	public ArrayList<Propriete> getProprietes() {
		return proprietes;
	}
	public void setProprietes(ArrayList<Propriete> proprietes) {
		this.proprietes = proprietes;
	}
	public void addParFeu(Propriete parFeu) {
		this.proprietes.add(parFeu);
	}
	public void addTypeSecurityManager(ContrainteTechnique typeSecurityManager) {
		this.contraintesTechniques.add(typeSecurityManager);
	}
	public void addServiceRequisSecurityManager(ServiceRequis serviceRequisSecurityManager) {
		this.interfaceRequisSecurityManager.addServicesRequis(serviceRequisSecurityManager);
	}
	public void addPortRequisSecurityManager(PortComposantRequis portRequisSecurityManager) {
		this.interfaceRequisSecurityManager.addPortsRequis(portRequisSecurityManager);
	}
	public void addServiceFournisSecurityManager(ServiceFournis serviceFournisSecurityManager) {
		this.interfaceFournisSecurityManager.addServicesFournis(serviceFournisSecurityManager);
	}
	public void addPortFournisSecurityManager(PortComposantFournis portFournisSecurityManager) {
		this.interfaceFournisSecurityManager.addPortsFournis(portFournisSecurityManager);
	}
}
