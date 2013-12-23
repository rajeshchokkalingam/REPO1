package com.parack.ads.daoimpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parack.ads.dao.UserAccountDAO;
import com.parack.ads.entities.User;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@Repository
public class UserAccountDAOImpl implements UserAccountDAO
{
	@Autowired
    private SessionFactory sessionFactory;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public UserAccountDAOImpl(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void getUserAccount(User userEnitity) {
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
	
	public void createUserAccount(User userEntity) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void updatedUserAccount(String userID) {
		// TODO : to implement	
	}

	@Override
	public List<User> getAllUserAccount() {
		return this.sessionFactory.getCurrentSession().createQuery("from User").list();
	}
	
}

