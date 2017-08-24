package com.iot.sp2.user.service;

import java.util.List;
import java.util.Map;

import com.iot.sp2.user.dto.UserInfo;

public interface UserService {

	public UserInfo getUserPwd(Map paramMap);

	public int insertUser(Map paramMap);
	
	public List memlist();
	
	public List memrole();	
	
	public int memdel(Map paramMap);
	
	public int saveDeleteUser(Map paramMap);
	
	public UserInfo getUser(UserInfo pUser);
}
