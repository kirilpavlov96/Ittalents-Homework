
public abstract class AbstractNotepad implements INotepad{
	private static final int INT_HAS_PAGE = 1;
	private static final int INT_HAS_NO_PAGE = 0;
	private static final int INT_OUT_OF_RANGE = -1;
	private static final int MAX_PAGES=100;
	
	private Page[] pages;
	
	public AbstractNotepad() {
		this.pages=new Page[MAX_PAGES];
	}
	
	private int checkForPage(int page){
		if(page>MAX_PAGES || page<1) {
			return INT_OUT_OF_RANGE;
		}
		else{
			if(this.pages[page]==null){
				return INT_HAS_NO_PAGE;
			}
			else {
				return INT_HAS_PAGE;
			}
		}
	}
	
	@Override
	public void addTextInPage(String text, int page) {
		switch (this.checkForPage(page)) {
		case INT_OUT_OF_RANGE:
			System.err.println("The page number is too low or high!");
			break;
		case INT_HAS_NO_PAGE:
			this.pages[page-1]=new Page("", text);
			break;
		case INT_HAS_PAGE:
			this.pages[page-1].addText(text);
			break;
		default:
			break;
		}
	}

	@Override
	public void insertTextInPage(String text, int page) {
		switch (this.checkForPage(page)) {
		case INT_OUT_OF_RANGE:
			System.err.println("The page number is too low or high!");
			break;
		case INT_HAS_NO_PAGE:
			this.pages[page-1]=new Page("", text);
			break;
		case INT_HAS_PAGE:
			{
				this.pages[page-1].clearPage();
				this.pages[page-1].addText(text);
			}
			break;
		default:
			break;
		}
		
	}

	@Override
	public void clearPage(int page) {
		switch (this.checkForPage(page)) {
		case INT_OUT_OF_RANGE:
			System.err.println("The page number is too low or high!");
			break;
		case INT_HAS_NO_PAGE:
			break;
		case INT_HAS_PAGE:
			this.pages[page-1].clearPage();
			break;
		default:
			break;
		}
	}

	@Override
	public void printAllPages() {
		for(int i=0;i<MAX_PAGES;i++){
			if(this.pages[i]!=null){
				System.out.println("Page "+(i+1)+" :\n"+this.pages[i].getText());
			}
		}
	}
	
	@Override
	public boolean searchWord(String word){
		for(int i=0;i<MAX_PAGES;i++){
			if(this.pages[i]!=null && this.pages[i].searchWord(word)){
				return true;
			}
		}
		return false;
	}
	@Override
	public void printAllPagesWithDigits(){
		for(int i=0;i<MAX_PAGES;i++){
			if(this.pages[i]!=null && this.pages[i].containsDigits()){
				System.out.println(this.pages[i].getText());
			}
		}
	}
}
