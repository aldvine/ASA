package m1;

import java.util.ArrayList;

import m2.Element;
import m2.InterfaceConfiguration;
import m2.Configuration;

public class ServerDetail extends Configuration{
	private ArrayList<Element> elements; 
	private InterfaceConfiguration interfaceConfigurationServerDetail;
	
	public ServerDetail() {
		super();
		this.elements = new ArrayList<Element>();
		this.interfaceConfigurationServerDetail = new InterfaceConfiguration();
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
	}

	public InterfaceConfiguration getInterfaceConfigurationServerDetail() {
		return interfaceConfigurationServerDetail;
	}

	public void setInterfaceConfigurationServerDetail(InterfaceConfiguration interfaceConfigurationServerDetail) {
		this.interfaceConfigurationServerDetail = interfaceConfigurationServerDetail;
	}
}
