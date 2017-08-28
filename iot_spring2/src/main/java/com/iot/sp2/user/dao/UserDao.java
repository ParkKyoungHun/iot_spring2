package com.iot.sp2.user.dao;
import java.util.List;
import java.util.Map;

import com.iot.sp2.user.dto.UserInfo;

public interface UserDao {
	UserInfo selectUser(UserInfo user);
	List<UserInfo> selectUserList(Map hm);
}
