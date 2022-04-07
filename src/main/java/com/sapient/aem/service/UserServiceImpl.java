package com.sapient.aem.service;

import java.util.List;

import com.sapient.aem.dao.UserDao;
import com.sapient.aem.dao.UserDaoImpl;
import com.sapient.aem.model.User;

public class UserServiceImpl implements UserService {
private UserDao userdao=new UserDaoImpl();

@Override
public List<User> getUsers() throws Exception {
	// TODO Auto-generated method stub
	return userdao.getUsers();
}


}
