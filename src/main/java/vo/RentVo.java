package vo;

public class RentVo {
	private int rentNo;
	private String memberId;
	private int bookNo;
	private String memberName;
	private String bookTitle;
	
	public RentVo()
	{
		
	}
	
	public void setRentNo(int rentNo) {
		this.rentNo = rentNo;
	}
	
	public int getRentNo()
	{
		return rentNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public int getBookNo()
	{
		return bookNo;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberId()
	{
		return memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberName()
	{
		return memberName;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
}
