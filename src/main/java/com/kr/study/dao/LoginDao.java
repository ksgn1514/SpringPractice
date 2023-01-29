package com.kr.study.dao;

import java.sql.SQLException;

public interface LoginDao {

	int loginCheck(String login_id, String login_password) throws ClassNotFoundException, SQLException;

}
