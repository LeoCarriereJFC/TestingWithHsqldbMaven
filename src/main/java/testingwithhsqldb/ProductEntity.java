/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithhsqldb;

/**
 * Correspond à un enregistrement de la table Product
 */
public class ProductEntity {
	// TODO : ajouter les autres propriétés
	private int productId;
	private String name;
	private double price;

	public ProductEntity(int productId, String name, double price ) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	/**
	 * Get the value of productId
	 *
	 * @return the value of productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * Get the value of name
	 *
	 * @return the value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the value of price
	 *
	 * @return the value of price
	 */
	public double getPrice() {
		return price;
	}
}

