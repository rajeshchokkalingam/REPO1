package com.parack.ads.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.parack.ads.entities.User;
import com.parack.ads.service.UserAccountService;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@Controller
public class UserAccountController
{
	
	@Autowired
	private UserAccountService userAccountService;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public UserAccountController(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createUserAccount(User userAccount) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void updateUserAccount(User userAccount) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void DeleteUserAccount(String userID) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public User getUserAccount(String userID) {
		// TODO : to implement
		return new User();	
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getAllUsers(Model map){
		map.addAttribute("User",  new User());
		map.addAttribute("Users", userAccountService.getAllUserAccount());
		return "showUsers";
	}
	
}

