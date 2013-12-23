package com.parack.ads.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.parack.ads.entities.User;
import com.parack.ads.form.UserForm;


/**
 * Transactional UserAccout Service
 */
@Transactional
public  interface UserAccountService 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createUsesAccount(String userAccount ) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void deleteUserAccount(String userID) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public UserForm getUserAccount(String userID) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void updateUserAccount(String userForm) ;
	
	public List<User> getAllUserAccount();
}

