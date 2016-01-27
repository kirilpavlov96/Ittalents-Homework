
public class Page {
	private String header;
	private String text;
	
	public Page(){
		this.header=new String("");
		this.text=new String("");
	}
	
	public Page(String header,String text){
		if(header==null) this.header=new String("");
		else this.header=header;
		if(text==null) this.text=new String("");
		else this.text=text;
	}
	
	public void addText(String text){
		this.text+="\n"+text;
	}
	
	public void clearPage(){
		this.text=null;
	}
	
	public String getText(){
		return "Header:\n"+this.header+"\n"+"Body:\n"+this.text;
	}
	
	public boolean searchWord(String word){
		if(this.text==null) return false;
		return this.text.contains(word);
	}
	
	public boolean containsDigits(){
		if(this.text==null) return false;
		for(int i=0;i<this.text.length();i++){
			if(this.text.charAt(i)>='0' && this.text.charAt(i)<='9') return true;
		}
		return false;
	}

}
