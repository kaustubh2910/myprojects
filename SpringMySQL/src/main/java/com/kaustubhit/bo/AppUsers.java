package com.kaustubhit.bo;

import javax.persistence.*;

@Entity
@Table(name = "product_master")
public class AppUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int pm_id;
	@Column(name="pm_name")
	public String pm_name;
	@Column(name="pm_price")
	public String pm_price;
	
	public AppUsers(String pm_name, String pm_price) {
		super();
		this.pm_name = pm_name;
		this.pm_price = pm_price;				
	}
	
	public AppUsers() {
		
	}
	public int getPm_id() {
		return pm_id;
	}

	public void setPm_id(int pm_id) {
		this.pm_id = pm_id;
	}

	public String getPm_name() {
		return pm_name;
	}

	public void setPm_name(String pm_name) {
		this.pm_name = pm_name;
	}

	public String getPm_price() {
		return pm_price;
	}

	public void setPm_price(String pm_price) {
		this.pm_price = pm_price;
	}	

}
