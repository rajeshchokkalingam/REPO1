package com.parack.ads.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.parack.ads.dao.UserAccountDAO;
import com.parack.ads.entities.User;
import com.parack.ads.form.UserForm;
import com.parack.ads.service.UserAccountService;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class UserAccountServiceImpl implements UserAccountService
{
	@Autowired
	private UserAccountDAO userAccountDAO;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public UserAccountServiceImpl(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createUsesAccount(String userAccount ) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void updateUserAccount(String userForm) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void deleteUserAccount(String userID) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public UserForm getUserAccount(String userID) {
		// TODO : to implement
		return new UserForm();	
	}
	
	public List<User> getAllUserAccount() {
		return userAccountDAO.getAllUserAccount();
	}
}

