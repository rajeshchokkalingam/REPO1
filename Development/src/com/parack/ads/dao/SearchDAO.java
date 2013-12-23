package com.parack.ads.dao;
import java.util.Set;
import com.parack.ads.entities.Advertisement;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface SearchDAO 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Advertisement> performSearch(String searchKey) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Advertisement> searchByCategoryString(String category, String subCategory, String keyWord) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Advertisement> searchByCateory(String category, String subCategory) ;
	
	
}

