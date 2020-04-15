package m2;

import java.util.ArrayList;

public class Configuration implements Element {


	private ArrayList<Element> elements; 
	private InterfaceConfiguration interfaceConfiguration;
	
	public Configuration() {
		this.elements = new ArrayList<Element>();
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
	}

	public InterfaceConfiguration getInterfaceConfiguration() {
		return interfaceConfiguration;
	}

	public void setInterfaceConfiguration(InterfaceConfiguration interfaceConfiguration) {
		this.interfaceConfiguration = interfaceConfiguration;
	}

	
}
