package com.vijay.lensmart.product.dao;

public class Product {
	
		private int pid;  
		private String pname;  
		private float pprice;
		private String pdescription;
		
		
		public Product() {}
		
		
		public Product(int pid, String pname, float pprice, String pdescription) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pprice = pprice;
			this.pdescription = pdescription;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public float getPprice() {
			return pprice;
		}
		public void setPprice(float pprice) {
			this.pprice = pprice;
		}
		public String getPdescription() {
			return pdescription;
		}
		public void setPdescription(String pdescription) {
			this.pdescription = pdescription;
		}
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pdescription=" + pdescription
					+ "]";
		}
		
		
		
		}	

