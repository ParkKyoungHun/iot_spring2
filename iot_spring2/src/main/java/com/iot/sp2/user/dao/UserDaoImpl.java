package com.iot.sp2.user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.sp2.user.dto.UserInfo;
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport  implements UserDao{
		
	@Override
	public UserInfo selectUser(UserInfo user) {
		return this.getSqlSession().selectOne("userinfo.SELECT_USER2",user);
	}

	@Override
	public List<UserInfo> selectUserList(Map hm) {
		return this.getSqlSession().selectList("userinfo.SELECT_USER_LIST",hm);
	}
	
}
