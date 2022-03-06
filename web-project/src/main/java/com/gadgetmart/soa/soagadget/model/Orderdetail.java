package com.gadgetmart.soa.soagadget.model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Orderdetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int customer_id;
	private String status;
	@OneToMany(mappedBy = "orderdetail", fetch = FetchType.LAZY)
	private List<Orderproduct> orderItems;

	public Orderdetail() {
		super();
	}

	public Orderdetail(int id, int customer_id, String status, List<Orderproduct> orderItems) {
		this.id = id;
		this.customer_id = customer_id;
		this.status = status;
		this.orderItems = orderItems;
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

	public List<Orderproduct> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Orderproduct> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Orderdetail{" +
				"id=" + id +
				", customer_id=" + customer_id +
				", status='" + status + '\'' +
				", orderItems=" + orderItems +
				'}';
	}
}
