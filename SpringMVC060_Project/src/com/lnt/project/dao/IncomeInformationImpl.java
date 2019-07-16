package com.lnt.project.dao;

import com.lnt.project.entities.IncomeInformation;

public class IncomeInformationImpl implements IncomeInformationDao {

	private IncomeInformation userValue;
	
	@Override
	public void setUserNSS(int NSSnumber) {
		
		userValue.setNSSnumber(NSSnumber);
	}

	@Override
	public void setUserIncome(double userIncome) {
		userValue.setIncomeAmount(userIncome);
	}

	@Override
	public void setUserIncomeMode(String userIncomeMode) {
		userValue.setIncomeMode(userIncomeMode);
	}

	@Override
	public void setUserHouseOwnershipDetails(String userSelection) {

		userValue.setHouseOwnerShipDetails(userSelection);
	}

	@Override
	public void setUserRentAmount(double rentAmount) {

		userValue.setRentAmount(rentAmount);
	}

	@Override
	public int getUserNSS() {

		return userValue.getNSSnumber();
	}

	@Override
	public double getUserIncome() {

		return userValue.getIncomeAmount();
	}

	@Override
	public String getUserIncomeMode() {

		return userValue.getIncomeMode();
	}

	@Override
	public String getUserHouseOwnershipDetails() {

		return userValue.getHouseOwnerShipDetails();
	}

	@Override
	public double getUserRentAmount() {

		return userValue.getRentAmount();
	}

}
