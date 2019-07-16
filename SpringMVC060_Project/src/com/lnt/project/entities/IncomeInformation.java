package com.lnt.project.entities;

public class IncomeInformation {

	private int NSSnumber;
	private double incomeAmount;
	private String incomeMode;
	private String houseOwnerShipDetails;
	private double rentAmount;
	
	public IncomeInformation() {

	}

	public int getNSSnumber() {
		return NSSnumber;
	}

	public void setNSSnumber(int nSSnumber) {
		NSSnumber = nSSnumber;
	}

	public double getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(double incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public String getIncomeMode() {
		return incomeMode;
	}

	public void setIncomeMode(String incomeMode) {
		this.incomeMode = incomeMode;
	}

	public String getHouseOwnerShipDetails() {
		return houseOwnerShipDetails;
	}

	public void setHouseOwnerShipDetails(String houseOwnerShipDetails) {
		this.houseOwnerShipDetails = houseOwnerShipDetails;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	@Override
	public String toString() {
		return "IncomeInformation [NSSnumber=" + NSSnumber + ", incomeAmount=" + incomeAmount + ", incomeMode="
				+ incomeMode + ", houseOwnerShipDetails=" + houseOwnerShipDetails + ", rentAmount=" + rentAmount + "]";
	}
	
	
}
