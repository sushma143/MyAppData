class Book
{
	private int bookId;
	private String name;
	
	public int getBookId(){
		this.bookId=bookId;
	}
	public int setBookId(int bookId)
	{
		this.bookId=bookId;
		System.out.print("This is setther method");
	}
}