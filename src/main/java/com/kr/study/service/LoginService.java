package com.kr.study.service;

import java.sql.SQLException;

public interface LoginService {

	String loginCheck(String login_id, String login_password) throws ClassNotFoundException, SQLException;

}
