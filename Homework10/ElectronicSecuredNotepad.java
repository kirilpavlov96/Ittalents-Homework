
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{

	private boolean isStarted;
	
	public ElectronicSecuredNotepad(String password) {
		super();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void addTextInPage(String text, int page) {
		if(this.isStarted) {
			super.addTextInPage(text, page);
		}
	}

	@Override
	public void insertTextInPage(String text, int page) {
		if(this.isStarted){
			super.insertTextInPage(text, page);
		}
	}

	@Override
	public void clearPage(int page) {
		if(this.isStarted){
			super.clearPage(page);
		}
	}

	@Override
	public void printAllPages() {
		if(this.isStarted){
			super.printAllPages();
		}
	}
	
	@Override
	public boolean searchWord(String word){
		if(this.isStarted){
			return super.searchWord(word);
		}
		else return false;
	}
	
	@Override
	public void printAllPagesWithDigits(){
		if(this.isStarted){
			super.printAllPagesWithDigits();
		}
	}
	
}
