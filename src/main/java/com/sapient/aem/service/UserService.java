package com.sapient.aem.service;

import java.util.List;

import com.sapient.aem.model.User;

public interface UserService {
	public abstract List<User> getUsers() throws Exception;
}
