class Book
{
	private int bookId;
	private String name;
	private String authorName;
	
	public int getBookId(){
		this.bookId=bookId;
	}
	public int setBookId(int bookId)
	{
		this.bookId=bookId;
		System.out.print("This is setther method");
	}
	public int getAuthorName(){
		this.authorName=authorName;
	}
	public int setBookId(int authorName)
	{
		this.authorName=authorName;
		System.out.print("This is setther method");
	}
}