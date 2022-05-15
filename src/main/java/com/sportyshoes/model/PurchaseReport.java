package com.sportyshoes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PurchaseReport {
	public PurchaseReport() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String categoryOfProduct;
	
	private String productName;

	private int priceOfTheProduct;

	private String userWhoBoughtTheProduct;
	
	private String userEmailBoughtTheProduct;

	@Temporal(TemporalType.DATE)
	private Date dateOfProductPurchase;

	public PurchaseReport(String productName, String categoryOfProduct, int priceOfTheProduct, String userWhoBoughtTheProduct, String userEmailBoughtTheProduct, Date dateOfProductPurchase) {
		this.setProductName(productName);
		this.setCategoryOfProduct(categoryOfProduct);
		this.setUserWhoBoughtTheProduct(userWhoBoughtTheProduct);
		this.dateOfProductPurchase = dateOfProductPurchase;
		this.setUserEmailBoughtTheProduct(userEmailBoughtTheProduct);
		this.setPriceOfTheProduct(priceOfTheProduct);
	}

	public String getCategoryOfProduct() {
		return categoryOfProduct;
	}

	public void setCategoryOfProduct(String categoryOfProduct) {
		this.categoryOfProduct = categoryOfProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPriceOfTheProduct() {
		return priceOfTheProduct;
	}

	public void setPriceOfTheProduct(int priceOfTheProduct) {
		this.priceOfTheProduct = priceOfTheProduct;
	}

	public String getUserWhoBoughtTheProduct() {
		return userWhoBoughtTheProduct;
	}

	public void setUserWhoBoughtTheProduct(String userWhoBoughtTheProduct) {
		this.userWhoBoughtTheProduct = userWhoBoughtTheProduct;
	}

	public String getUserEmailBoughtTheProduct() {
		return userEmailBoughtTheProduct;
	}

	public void setUserEmailBoughtTheProduct(String userEmailBoughtTheProduct) {
		this.userEmailBoughtTheProduct = userEmailBoughtTheProduct;
	}

}
