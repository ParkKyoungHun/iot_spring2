package com.iot.sp2.user.dao;

import com.iot.sp2.user.dto.UserInfo;

public interface UserDao {
	UserInfo selectUser(UserInfo user);
}
