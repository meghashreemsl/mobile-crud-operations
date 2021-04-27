package com.wolken.wolkenapp.mobile;
import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;

public class Mobile {
	
	public MobileDTO[] mobileDTO;
	public int index;
	
	public Mobile(int size) {
		mobileDTO = new MobileDTO[size];
	}
	//1  boolean add
	public void addMobiles(MobileDTO mobileDTO) throws MobileException {
		Boolean check = true;
		System.out.println("adding mobiles");
		if(mobileDTO!=null) {
			if (mobileDTO.getPrice() > 0) {
				check = true;
				System.out.println("mobiles are added");
				System.out.println(check);
				this.mobileDTO[index++]=mobileDTO;
			}else {
				throw new MobileException();
			}
		}
		else {
			System.out.println("mobile object is null..cannot add");
			check = false;
		}
	}
		
		// 2 getAll
		public void getMobileDetails() {
			System.out.println("getting mobile details");
			for(int i=0; i < mobileDTO.length; i++) {
				if(mobileDTO[i] != null) {
					System.out.println(mobileDTO[i].getMobileId()+" "+
												mobileDTO[i].getSerialNo()+" "+
											    mobileDTO[i].getBrandName()+" "+
												mobileDTO[i].getMemory()+" "+
											    mobileDTO[i].getModelName()+" "+
												mobileDTO[i].getNoOfCameras()+" "+
											    mobileDTO[i].getPrice());
					
				} 
				else {
					System.out.println("details not found");
				}
			}
		}
		
		public void checkPrice() throws MobileException {
			System.out.println("checking price");
			for(int i=0; i < mobileDTO.length; i++) {
				if(mobileDTO[i] != null) {
					if(mobileDTO[i].getPrice() <0) {
						throw new MobileException();
					}else {
						System.out.println("price is valid");
					}
				} 
				else {
					System.out.println("details not found");
				}
			}
		}
		 // 3 update by serial no

			  public MobileDTO updateNameBySerialNo(String modelName,int serialNo) {
				  System.out.println("updating model name by serial no");
			  MobileDTO mobileDTO = null; 
			  for(int i=0;i<this.mobileDTO.length;i++) {
				  if(this.mobileDTO[i] != null) {
					  System.out.println("Update by serial no");
				  if(this.mobileDTO[i].getSerialNo()==(serialNo)) {
					  this.mobileDTO[i].setModelName(modelName);
					  mobileDTO=this.mobileDTO[i];
					  System.out.println(mobileDTO);
					  }
				  else
				  {
					  System.out.println("data is equal to null..please enter proper data");
			       } 
			  }
				  else
				  {
					  System.out.println("mobile not found");
					  }
				  }
			  return mobileDTO;
			  }
			 
		 
		 //4 get all by brand name 
		 public MobileDTO  getAllByBrandName(String brandName) {
			 System.out.println("getting details by brandname");
			 MobileDTO mobileDTO = null;
			 for(int i=0;i<this.mobileDTO.length;i++) {
				 if(this.mobileDTO[i]!=null) {
					 System.out.println("Get all the details by brand name ");
					 if(this.mobileDTO[i].getBrandName().equals(brandName)) {
						 mobileDTO=this.mobileDTO[i];
						 System.out.println(mobileDTO);
					 }
					 else {
						 System.out.println(" data is equal to null..please enter proper data");
					 }
				 }
				 else {
					 System.out.println("brand name not found");
				 }
		 }
		 return mobileDTO;
	}
		 
		 
		// 5 get delete by mobile id
		 public void deleteByMobileId(int mobileId) {
			 
			 System.out.println("deleting by mobile id ");
			 for(int i=0; i< mobileDTO.length;i++) {
				 if(this.mobileDTO[i]!=null) {
					 System.out.println("Delete by mobile Id");
					 if(this.mobileDTO[i].getMobileId() == mobileId) {
						 this.mobileDTO[i] = null;
						 System.out.println("The data is deleted");
					 }
					 else {
						 System.out.println("data is equal to null ...enter proper data");
					 }
				 }
				 else {
					 System.out.println("No mobiles found");
				 }
			 }
		 }
			
}



