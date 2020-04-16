package m1;

import java.util.ArrayList;

import m2.Element;
import m2.InterfaceConfiguration;
import m2.Configuration;

public class SimpleCS extends Configuration{
	private ArrayList<Element> elements; 
	private InterfaceConfiguration interfaceConfigurationSimpleCS;
	
	public SimpleCS() {
		super();
		this.elements = new ArrayList<Element>();
		this.interfaceConfigurationSimpleCS = new InterfaceConfiguration();
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
	}
	
	public void addElements(Element element) {
		this.elements.add(element);
	}

	public InterfaceConfiguration getInterfaceConfigurationSimpleCS() {
		return interfaceConfigurationSimpleCS;
	}

	public void setInterfaceConfigurationSimpleCS(InterfaceConfiguration interfaceConfigurationSimpleCS) {
		this.interfaceConfigurationSimpleCS = interfaceConfigurationSimpleCS;
	}
}
