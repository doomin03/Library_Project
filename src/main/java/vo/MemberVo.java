package vo;

public class MemberVo {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberAddr;
	private int memberAge;
	
	public MemberVo()
	{
		super();
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberId()
	{
		return memberId;
	}
	
	public void setMemberPwd(String memberPwd)
	{
		this.memberPwd = memberPwd;
	}
	
	public String getMemberPwd()
	{
		return memberPwd;
	}
	
	public void setMemberName(String memberName)
	{
		this.memberName = memberName;
	}
	
	public String getMemberName()
	{
		return memberName;
	}
	
	public void setMemberAddr(String memberAddr)
	{
		this.memberAddr = memberAddr;
	}
	
	public String getMemberAddr()
	{
		return memberAddr;
	}
	
	public void setMemberAge(int memberAge)
	{
		this.memberAge = memberAge;
	}
	
	public int getMemberAge()
	{
		return memberAge;
	}
}