package com.gadgetmart.soa.soagadget.dto;

public class OrderdetailDTO {
	private int id;
	private int customer_id;
	private String status;
	public OrderdetailDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderdetailDTO(int id, int customer_id, String status) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "orderDTO [id=" + id + ", customer_id=" + customer_id + ", status=" + status + "]";
	}
	
	

}
