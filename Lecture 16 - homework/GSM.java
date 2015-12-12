import java.io.ObjectInputStream.GetField;

public class GSM {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private float outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
	private float callSum;

	
	GSM(){
		this.model="No model";
		this.hasSimCard=false;
		this.simMobileNumber=null;
		this.outgoingCallsDuration=0;
		this.lastIncomingCall=null;
		this.lastOutgoingCall=null;
		this.callSum=0;
	}
	
	GSM(String model){
		this();
		this.model=model;
	}
	
	public void insertSimCard(final String simMobileNumber) {
		if (simMobileNumber != null) {
			if (simMobileNumber.startsWith("08") && simMobileNumber.length() == 10) {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			}
		}
	}

	public void removeSimCard() {
		if (this.hasSimCard == true) {
			this.simMobileNumber = null;
			this.hasSimCard = false;
		}
	}

	public void call(GSM receiver, final float duration) {
		if (receiver != null) {
			if (duration > 0 && this.hasSimCard && receiver.hasSimCard) {
				if (!this.simMobileNumber.equals(receiver.simMobileNumber)) {
					Call newCall=new Call(this, receiver, duration);
					this.lastOutgoingCall=newCall;
					receiver.lastIncomingCall=newCall;
					this.outgoingCallsDuration+=duration;
					this.callSum+=newCall.getCallPrice();
				}
			}
		}
	}
	
	public String getGsmInfo(){
		if(this.hasSimCard) return "Model:" + this.getModel() + "\n" + "Sim:" + this.getSimMobileNumber();
		else  return "Model:" + this.getModel();
	}
	
	public void printInfoForTheLastOutgoingCall(){
		if(this.lastOutgoingCall!=null){
			this.lastOutgoingCall.printCall();
		}
	}
	public void printInfoForTheLastIncomingCall(){
		if(this.lastIncomingCall!=null){
			this.lastIncomingCall.printCall();
		}
	}
	public float getSumForCall(){
		return this.callSum;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model!=null)
			this.model = model;
	}
	public String getSimMobileNumber() {
		return simMobileNumber;
	}

}
