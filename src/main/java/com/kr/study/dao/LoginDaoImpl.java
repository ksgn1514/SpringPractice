package com.kr.study.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public int loginCheck(String login_id, String login_password) throws ClassNotFoundException, SQLException {

		Connection conn;
	    PreparedStatement ps;
	    ResultSet rs; //select만

	    int result = 0;
	      // DB接続情報
	    String url = "jdbc:mysql://localhost:3306/test";
	    String id = "root";
	    String password = "";
	    // DB CLASS 定義　
	    Class.forName("com.mysql.jdbc.Driver");
	    conn = DriverManager.getConnection(url, id, password);

	    String sql = "SELECT COUNT(*) FROM logininfo WHERE id=? and password=?";
	    ps = conn.prepareStatement(sql);
	    ps.setString(1, login_id);
	    ps.setString(2, login_password);
	    rs = ps.executeQuery();
	    //int num = ps.executeUpdate()

	    if (rs.next()) {

	       result = rs.getInt("COUNT(*)");
	    }
	    System.out.println(result);




		return result;
	}

}
