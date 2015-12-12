
public class Call {
	static float priceForAMinute=0.30f;
	private GSM caller;
	private GSM receiver;
	private float duration;
	
	Call(final GSM caller,final GSM receiver,final float duration){
		this.caller=caller;
		this.duration=duration;
		this.receiver=receiver;
	}
	
	public float getCallPrice(){
		return this.priceForAMinute*this.duration;
	}
	
	public void printCall(){
		System.out.println("Caller:\n" + this.caller.getGsmInfo());
		System.out.println("Receiver:\n" + this.receiver.getGsmInfo());
		System.out.println("duration:" + this.duration);
	}
	
}
