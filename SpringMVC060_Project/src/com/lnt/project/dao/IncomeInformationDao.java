package com.lnt.project.dao;

public interface IncomeInformationDao {
	
	public void setUserNSS(int NSSnumber);
	public void setUserIncome(double userIncome);
	public void setUserIncomeMode(String userIncomeMode);
	public void setUserHouseOwnershipDetails(String userSelection);
	public void setUserRentAmount(double rentAmount);
	public int getUserNSS();
	public double getUserIncome();
	public String getUserIncomeMode();
	public String getUserHouseOwnershipDetails();
	public double getUserRentAmount();
}