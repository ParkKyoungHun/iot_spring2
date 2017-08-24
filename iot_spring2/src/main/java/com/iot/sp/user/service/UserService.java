package com.iot.sp.user.service;

import java.util.List;
import java.util.Map;

import com.iot.sp.user.dto.User;

public interface UserService {

	public User getUserPwd(Map paramMap);

	public int insertUser(Map paramMap);
	
	public List memlist();
	
	public List memrole();	
	
	public int memdel(Map paramMap);
	
	public int saveDeleteUser(Map paramMap);
}
