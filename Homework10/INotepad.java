
public interface INotepad {
	void addTextInPage(String text,int page);
	void insertTextInPage(String text,int page);
	void clearPage(int page);
	void printAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();

}
