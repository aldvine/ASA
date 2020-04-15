package m2;

public class PortComposantRequis extends PortComposant {
	
	private AttachementRequisToFournis attachement;
	private BindingRequis binding;
	private InterfaceComposantRequis interfaceComposantRequis;
	
	public PortComposantRequis() {
		super();
	}
	public AttachementRequisToFournis getAttachement() {
		return attachement;
	}
	public void setAttachement(AttachementRequisToFournis attachement) {
		this.attachement = attachement;
	}
	public BindingRequis getBinding() {
		return binding;
	}
	public void setBinding(BindingRequis binding) {
		this.binding = binding;
	}
	public InterfaceComposantRequis getInterfaceComposantRequis() {
		return interfaceComposantRequis;
	}
	public void setInterfaceComposantRequis(InterfaceComposantRequis interfaceComposantRequis) {
		this.interfaceComposantRequis = interfaceComposantRequis;
	}
	
	
	
}
