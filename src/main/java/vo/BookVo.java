package vo;

public class BookVo {
	private int bookNo;
	String title;
	String author;
	String company;
	int price;
	String rentaled;
	
	public BookVo()
	{
		super();
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public int getBookNo()
	{
		return bookNo;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public void setRentaled(String rentaled) {
		this.rentaled = rentaled;
	}
	
	public String getRentaled()
	{
		return rentaled;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
}
