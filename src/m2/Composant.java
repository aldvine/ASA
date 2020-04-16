package m2;

import java.util.ArrayList;

public class Composant implements Element {
	private ArrayList<ContrainteTechnique> contraintesTechniques;
	private InterfaceComposantRequis interfacesRequis;
	private InterfaceComposantFournis interfacesFournis;
	private ArrayList<Propriete> proprietes;
	private Configuration configuration;
	public Composant() {
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
	public InterfaceComposantRequis getInterfacesRequis() {
		return interfacesRequis;
	}
	public void setInterfacesRequis(InterfaceComposantRequis interfacesRequis) {
		this.interfacesRequis = interfacesRequis;
	}
	public InterfaceComposantFournis getInterfacesFournis() {
		return interfacesFournis;
	}
	public void setInterfacesFournis(InterfaceComposantFournis interfacesFournis) {
		this.interfacesFournis = interfacesFournis;
	}
	public ArrayList<Propriete> getProprietes() {
		return proprietes;
	}
	public void setProprietes(ArrayList<Propriete> proprietes) {
		this.proprietes = proprietes;
	}
	public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}
