package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

@Repository("userDAO") // applicationContext.xml 에서 bean을 주석처리 했기에 의존성을 주입함
public class UserDAO {
	// JDBC 관련 변수
	private Connection conn =null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL 명령어들
	private final String USER_GET = "select * from users where id=? and password=?";
	
	// CRUD 기능의 메소드 구현
	// 로그인 기능
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
/*			System.out.println("===> JDBC로 getUser() 기능 처리");
			conn = JDBCUtil.getConnection();*/
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*JDBCUtil.close(rs, stmt, conn); */
			try {
				if (rs !=null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
			try {
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
		return user;
	}
}
