package com.parack.ads.service;

import org.springframework.transaction.annotation.Transactional;

import com.parack.ads.form.AdvtForm;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@Transactional
public  interface AdvertisementService 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createNewAdvt(AdvtForm advtForm) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void deleteAdvt(AdvtForm advtForm) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void updateAdvt(AdvtForm advtForm) ;
	
	
}

