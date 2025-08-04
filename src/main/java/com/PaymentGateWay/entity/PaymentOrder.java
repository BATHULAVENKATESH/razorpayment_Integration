
/*
package com.PaymentGateWay.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_orders")


public class PaymentOrder {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer orderID;
	
	private String name;
	
	private String email;
	private String phno;
	
	private String course;
	
	private Integer amount;
	
	private String orderStatus ;
	
	private String raazorpayOrderId;

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	@Override
	public String toString() {
		return "PaymentOrder [orderID=" + orderID + ", name=" + name + ", email=" + email + ", phno=" + phno
				+ ", course=" + course + ", amount=" + amount + ", orderStatus=" + orderStatus + ", raazorpayOrderId="
				+ raazorpayOrderId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getRaazorpayOrderId() {
		return raazorpayOrderId;
	}

	public void setRaazorpayOrderId(String raazorpayOrderId) {
		this.raazorpayOrderId = raazorpayOrderId;
	}

	
} */

package com.PaymentGateWay.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_orders")
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // database primary key

    private String name;
    private String email;
    private String phno;
    private String course;
    private Integer amount; // stored in paise
    private String currency;
    private String orderStatus;
    private String razorpayOrderId;

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhno() { return phno; }
    public void setPhno(String phno) { this.phno = phno; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public Integer getAmount() { return amount; }
    public void setAmount(Integer amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    public String getRazorpayOrderId() { return razorpayOrderId; }
    public void setRazorpayOrderId(String razorpayOrderId) { this.razorpayOrderId = razorpayOrderId; }
}



























