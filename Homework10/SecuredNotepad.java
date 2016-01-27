import java.util.Scanner;

public class SecuredNotepad extends AbstractNotepad{

	private String password;
	
	public SecuredNotepad() {
		super();
		this.setPassword();
	}
	
	private void setPassword() {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Please insert password for the SecuredNotepad!");
			String pass=sc.nextLine();
			boolean hasUpper=false,hasLower=false,hasDigit=false;
			for(int i=0;i<=pass.length()-1;i++){
				if(pass.charAt(i)>='A' && pass.charAt(i)<='Z') hasUpper=true;
				if(pass.charAt(i)>='a' && pass.charAt(i)<='z') hasLower=true;
				if(pass.charAt(i)>='1' && pass.charAt(i)<='9') hasDigit=true;
				if(hasDigit && hasLower && hasUpper) break;
			}
			if(pass.length()>=5 && hasDigit && hasLower && hasUpper){
				this.password=pass;
				System.out.println("The password is set!");
				return;
			}
			else{
				System.out.println("Invalid password!Please make sure that the pass has at least one digit,one Uppercase letter and one Lowercase letter!");
			}
			
		}
	}

	private boolean inputPassword(){
		System.out.println("Please enter your password!");
		String s=new Scanner(System.in).nextLine();
		if(s.equals(this.password)) {
			System.out.println("The password is correct!");
			return true;
		}
		else {
			System.out.println("Incorrect password");
			return false;
		}
	}
	
	@Override
	public void addTextInPage(String text, int page) {
		System.out.println("Password is needed when adding text in a page!");
		if(this.inputPassword()){
			super.addTextInPage(text, page);
		}
	}

	@Override
	public void insertTextInPage(String text, int page) {
		System.out.println("Password is needed when inserting text in a page!");
		if(this.inputPassword()){
			super.insertTextInPage(text, page);
		}
	}

	@Override
	public void clearPage(int page) {
		System.out.println("Password is needed when clearing a page!");
		if(this.inputPassword()){
			super.clearPage(page);
		}
	}

	@Override
	public void printAllPages() {
		System.out.println("Password is needed to print all pages!");
		if(this.inputPassword()){
			super.printAllPages();
		}
	}
	
	@Override
	public boolean searchWord(String word){
		System.out.println("Password is needed to print all pages!");
		if(this.inputPassword()){
			return super.searchWord(word);
		}
		else return false;
	}
	
	@Override
	public void printAllPagesWithDigits(){
		System.out.println("Password is needed to print all pages!");
		if(this.inputPassword()){
			super.printAllPagesWithDigits();
		}
	}
	
}
