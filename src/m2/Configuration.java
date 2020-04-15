package m2;

import java.util.ArrayList;

public class Configuration implements Element {

	private ArrayList<Element> composants;
	
	public Configuration() {
		this.composants = new ArrayList<Element>();
	}

	public ArrayList<Element> getComposants() {
		return composants;
	}

	public void setComposants(ArrayList<Element> composants) {
		this.composants = composants;
	}
}
