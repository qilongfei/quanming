package com.ycmedia.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ycmedia.entity.User;

@Repository
public interface UserDao {

	List<User> loadAllUsers();

	void saveUser(@Param("user") User user);
	Long insert(User user);

	User findUserByName(@Param("username")String username);

}
