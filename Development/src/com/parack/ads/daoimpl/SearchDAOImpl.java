package com.parack.ads.daoimpl;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.parack.ads.dao.SearchDAO;
import com.parack.ads.entities.Advertisement;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@Repository
public class SearchDAOImpl implements SearchDAO
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SearchDAOImpl(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Advertisement> searchByCategoryString(String category, String subCategory, String keyWord) {
		// TODO : to implement
		return null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Advertisement> searchByCateory(String category, String subCategory) {
		// TODO : to implement
		return null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Advertisement> performSearch(String searchKey) {
		// TODO : to implement
		return null;	
	}
	
}

