package m2;

public class PortComposantFournis extends PortComposant {
	private AttachementFournisToRequis attachement;
	private BindingFournis binding;
	public PortComposantFournis() {
		super();
	}
	public AttachementFournisToRequis getAttachement() {
		return attachement;
	}
	public void setAttachement(AttachementFournisToRequis attachement) {
		this.attachement = attachement;
	}
	public BindingFournis getBinding() {
		return binding;
	}
	public void setBinding(BindingFournis binding) {
		this.binding = binding;
	}
	
}
