package m2;

public class PortComposantRequis extends PortComposant {
	
	private AttachementRequisToFournis attachement;
	private BindingRequis binding;
	
	
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
	
	
	
}
