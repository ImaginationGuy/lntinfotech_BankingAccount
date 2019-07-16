package com.lnt.project.services;

import com.lnt.project.entities.IncomeInformation;

public class IncomeInformationServiceImpl implements IncomeInformationService {

	private IncomeInformation dao;
	@Override
	public void setUserNSS(int NSSnumber) {
		
		dao.setNSSnumber(NSSnumber);
	}

	@Override
	public void setUserIncome(double userIncome) {
	
		dao.setIncomeAmount(userIncome);
	}

	@Override
	public void setUserIncomeMode(String userIncomeMode) {

		dao.setIncomeMode(userIncomeMode);
	}

	@Override
	public void setUserHouseOwnershipDetails(String userSelection) {

		dao.setHouseOwnerShipDetails(userSelection);
	}

	@Override
	public void setUserRentAmount(double rentAmount) {

		dao.setRentAmount(rentAmount);
	}

	@Override
	public int getUserNSS() {

		return dao.getNSSnumber();
	}

	@Override
	public double getUserIncome() {
		
		return dao.getIncomeAmount();
	}

	@Override
	public String getUserIncomeMode() {

		return dao.getIncomeMode();
	}

	@Override
	public String getUserHouseOwnershipDetails() {

		return dao.getHouseOwnerShipDetails();
	}

	@Override
	public double getUserRentAmount() {

		return dao.getRentAmount();
	}

}
