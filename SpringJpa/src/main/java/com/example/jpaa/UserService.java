package com.example.jpaa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository Repository;
	public user insertData(user u) {
		return u //UserRepository.save(u)
				;
	}
	
//	public user getuserById(int id) {
//	      return Repository.findById(id).get();
//	   }
//	   public List<user> getAllusers(){
//	      List<user> user = new ArrayList<user>();
//	      Repository.findAll().forEach(user -> user.add(user));
//	      return user;
//	   }
//	   public void saveOrUpdate(user user) {
//	      Repository.save(user);
//	   }
//	   public void deleteuserById(int id) {
//	      Repository.deleteById(id);
//	   }
	


}

