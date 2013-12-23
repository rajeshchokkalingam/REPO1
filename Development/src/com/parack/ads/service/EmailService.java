package com.parack.ads.service;

import org.springframework.transaction.annotation.Transactional;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@Transactional
public  interface EmailService 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean sendEmail(String emailForm) ;
	
	
}

