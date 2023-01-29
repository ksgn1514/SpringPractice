package com.kr.study.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.study.dao.LoginDao;

@Service
public class LoginServicImpl implements LoginService {

	@Autowired
	LoginDao dao;

	@Override
	public String loginCheck(String login_id, String login_password) throws ClassNotFoundException, SQLException {

		int result = dao.loginCheck(login_id, login_password);

		String msg = "";

		if(result==1) {

			msg = login_id + "님 환영합니다.";
		}else {

			msg = "로그인을 실패했습니다.";
		}


		return msg;
	}

}
