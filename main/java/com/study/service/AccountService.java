package com.study.service;


import com.study.domain.User;
import com.study.repository.UserRepository;

public class AccountService {
	private static AccountService instance = null;
	
	private AccountService() {}
	
	public static AccountService getInstance() {
		if(instance == null) {
			instance = new AccountService(); 
			}
			return instance;
		}
	
	
	//아이디 중복확인
	public boolean isDuplicateUsername(String username) {
		User user = UserRepository.getInstance().findUserByUsername(username);
		return user !=null; // user가 null아니여야 true
	}
	
	public void register(User user) {
		UserRepository.getInstance().saveUser(user);
	}
	
	public User loadUserByUsername(String username) {
		return UserRepository.getInstance().findUserByUsername(username);
	}
	
	public boolean checkPassword(User user, String password) {
		return user.getPassword().equals(password);
	}
	
}
