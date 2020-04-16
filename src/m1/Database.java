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

public class Database extends Composant {
	private ArrayList<ContrainteTechnique> contraintesTechniques;
	private InterfaceComposantRequis interfaceRequisDatabase;
	private InterfaceComposantFournis interfaceFournisDatabase;
	private ArrayList<Propriete> proprietes;
	public Database() {
		super();
		this.contraintesTechniques= new ArrayList<ContrainteTechnique>();
		this.interfaceFournisDatabase= new InterfaceComposantFournis();
		this.interfaceRequisDatabase  =new InterfaceComposantRequis();
		this.proprietes = new ArrayList<Propriete>();
	}
	public ArrayList<ContrainteTechnique> getContraintesTechniques() {
		return contraintesTechniques;
	}
	public void setContraintesTechniques(ArrayList<ContrainteTechnique> contraintesTechniques) {
		this.contraintesTechniques = contraintesTechniques;
	}
	public InterfaceComposantRequis getInterfaceRequisDatabase() {
		return interfaceRequisDatabase;
	}
	public void setInterfaceRequisDatabase(InterfaceComposantRequis interfaceRequisDatabase) {
		this.interfaceRequisDatabase = interfaceRequisDatabase;
	}
	public InterfaceComposantFournis getInterfaceFournisDatabase() {
		return interfaceFournisDatabase;
	}
	public void setInterfaceFournisDatabase(InterfaceComposantFournis interfaceFournisDatabase) {
		this.interfaceFournisDatabase = interfaceFournisDatabase;
	}
	public ArrayList<Propriete> getProprietes() {
		return proprietes;
	}
	public void setProprietes(ArrayList<Propriete> proprietes) {
		this.proprietes = proprietes;
	}
	public void addTable(Propriete table) {
		this.proprietes.add(table);
	}
	public void addTypeDatabase(ContrainteTechnique typeDatabase) {
		this.contraintesTechniques.add(typeDatabase);
	}
	public void addServiceRequisDatabase(ServiceRequis serviceRequisDatabase) {
		this.interfaceRequisDatabase.addServicesRequis(serviceRequisDatabase);
	}
	public void addPortRequisDatabase(PortComposantRequis portRequisDatabase) {
		this.interfaceRequisDatabase.addPortsRequis(portRequisDatabase);
	}
	public void addServiceFournisDatabase(ServiceFournis serviceFournisDatabase) {
		this.interfaceFournisDatabase.addServicesFournis(serviceFournisDatabase);
	}
	public void addPortFournisDatabase(PortComposantFournis portFournisDatabase) {
		this.interfaceFournisDatabase.addPortsFournis(portFournisDatabase);
	}
}
