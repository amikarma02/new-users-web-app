package com.sapient.aem.dao;

import java.util.List;

import com.sapient.aem.model.User;

public interface UserDao {

	public abstract List<User> getUsers() throws Exception;
}
