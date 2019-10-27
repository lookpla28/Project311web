package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Payments")
public class Payments {
	@Id
	private String payments_id;
	
	@Column(name="payments_date")
	private Date payments_date;
	
	@Column(name="total_price")
	private double total_price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Opd_Card opd;
	
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payments(String payments_id, Date payments_date, double total_price, Opd_Card opd) {
		super();
		this.payments_id = payments_id;
		this.payments_date = payments_date;
		this.total_price = total_price;
		this.opd = opd;
	}

	public String getPayments_id() {
		return payments_id;
	}
	public void setPayments_id(String payments_id) {
		this.payments_id = payments_id;
	}
	public Date getPayments_date() {
		return payments_date;
	}
	public void setPayments_date(Date payments_date) {
		this.payments_date = payments_date;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public Opd_Card getOpd() {
		return opd;
	}

	public void setOpd(Opd_Card opd) {
		this.opd = opd;
	}
	
	

}
