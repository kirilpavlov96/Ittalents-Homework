
public class NotepadDemo {

	public static void main(String[] args) {
		SecuredNotepad s=new SecuredNotepad();
		s.addTextInPage("What is this?", 1);
		s.printAllPages();
		
		Page p=new Page("Header","Body");
		p.addText("newLine");
		System.out.println(p.getText());
		
		SimplePad sp=new SimplePad();
		sp.addTextInPage("New Page", 1);
		sp.printAllPages();
	}

}
