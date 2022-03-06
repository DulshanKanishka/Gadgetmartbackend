package com.gadgetmart.soa.soagadget.dto;

public class OrderproductDTO {
	private int id;
	private int order_id;
	private int product_id;
	private int product_quantity;
	
	public OrderproductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderproductDTO(int id, int order_id, int product_id, int product_quantity) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.product_quantity = product_quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	@Override
	public String toString() {
		return "orderproductDTO [id=" + id + ", order_id=" + order_id + ", product_id=" + product_id
				+ ", product_quantity=" + product_quantity + "]";
	}



}
