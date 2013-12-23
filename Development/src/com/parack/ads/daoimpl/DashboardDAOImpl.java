package com.parack.ads.daoimpl;
import org.springframework.stereotype.Repository;

import com.parack.ads.dao.DashboardDao;
import com.parack.ads.holder.CategoryHolder;
import com.parack.ads.holder.LocationHolder;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@Repository
public class DashboardDAOImpl implements DashboardDao
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DashboardDAOImpl(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public LocationHolder loadLocations() {
		// TODO : to implement
		return new LocationHolder();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getRandomThought() {
		// TODO : to implement
		return "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public CategoryHolder loadBasicCategories() {
		// TODO : to implement
		return new CategoryHolder();	
	}
	
}

