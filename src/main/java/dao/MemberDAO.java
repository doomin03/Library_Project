package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.jdbcUtil;
import vo.MemberVo;

public class MemberDAO {
	public MemberDAO() {}
	
	public MemberVo getMemberData(String id) {
		MemberVo vo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM lib_member WHERE member_id = ?";
		
		try {
			 conn = jdbcUtil.getConnection();
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, id);
			 rs = pstmt.executeQuery();
			 
			 if (rs.next()) {
				 vo = new MemberVo();
				 vo.setMemberId(rs.getString("member_id"));
				 vo.setMemberPwd(rs.getString("member_pwd"));
				 vo.setMemberName(rs.getString("member_name"));
				 vo.setMemberAddr(rs.getString("member_addr"));
				 vo.setMemberAge(rs.getInt("member_age"));
			 }
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("checkLoginUser : sql error");
		} finally {jdbcUtil.close(conn, pstmt, rs);}
		return vo;
	}
	
	public boolean existId(String id) {
		boolean isExist = false;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM lib_member WHERE member_id = ?";
		
		try {
			 conn = jdbcUtil.getConnection();
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, id);
			 rs = pstmt.executeQuery();
			 
			 if (rs.next()) isExist = true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("checkLoginUser : sql error");
		} finally {jdbcUtil.close(conn, pstmt, rs);}
		return isExist;
	}
	
	public int removeMember(String id) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM lib_member WHERE member_id = ?";
		
		try {
			 conn = jdbcUtil.getConnection();
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, id);
			 result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();}
		return result;
	}
	
	public int insertMember(MemberVo data) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO lib_member(member_id, member_pwd, member_name, member_addr, member_age) values(?, ?, ?, ?, ?)";
		
		try {
			 conn = jdbcUtil.getConnection();
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, data.getMemberId());
			 pstmt.setString(2, data.getMemberPwd());
			 pstmt.setString(3, data.getMemberName());
			 pstmt.setString(4, data.getMemberAddr());
			 pstmt.setInt(5, data.getMemberAge());
			 result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();}
		return result;
	}
}