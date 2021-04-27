package com.wolken.wolkenapp.dto;

public class MobileDTO {
	// private data members
	private int serialNo;
	private int mobileId;
	private String modelName;
private double price;
	private int memory;
	private String brandName;
	private int noOfCameras;
	
	
	public MobileDTO() { 
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+ "Object created");
	}
// getters and setters
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getNoOfCameras() {
		return noOfCameras;
	}

	public void setNoOfCamera(int noOfCameras) {
		this.noOfCameras = noOfCameras;
	}


	
}
