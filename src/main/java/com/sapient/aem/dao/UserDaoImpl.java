package com.sapient.aem.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sapient.aem.model.User;

public class UserDaoImpl implements UserDao{

	
	@Override
	public List<User> getUsers() throws Exception {
		List<User> users=new ArrayList<User>();

		Context envContext = null;
		try {
			envContext = (Context) new InitialContext().lookup("java:comp/env");
		} catch (NamingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}		
		DataSource dataSource = null;
		try {
			dataSource = (DataSource) envContext.lookup("jdbc/assesmentDB");
		} catch (NamingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		System.out.println("===connection establidshed ===========");
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  
		String query="SELECT * FROM registered_users";
		
		System.out.println("===query ==========="+query);
		
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		try {
			rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		User user = null;
		try {
			user = new User(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3));
			users.add(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return users;		
              
	
	}

}
