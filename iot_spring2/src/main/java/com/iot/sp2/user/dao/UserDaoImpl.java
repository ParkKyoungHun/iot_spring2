package com.iot.sp2.user.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import com.iot.sp2.user.dto.UserInfo;
@Service
public class UserDaoImpl extends SqlSessionDaoSupport  implements UserDao{

	@Override
	public UserInfo selectUser(UserInfo user) {
		return this.getSqlSession().selectOne("userinfo.SELECT_USER2",user);
	}

}
