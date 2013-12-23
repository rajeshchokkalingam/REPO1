package com.parack.ads.service;

import org.springframework.transaction.annotation.Transactional;

import com.parack.ads.form.SearchResultsForm;


/**
 * To load required Deatils for Dashboard<div><br></div>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@Transactional
public  interface SearchService 
{
	/**
	 * it should accept var args<div><br></div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public SearchResultsForm performSearch(String keyword) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public SearchResultsForm searchByCategory(String category, String subCategory) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public SearchResultsForm searchByCategoryString(String category, String subCategory, String keyword) ;
	
	
}

