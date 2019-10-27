package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Queue")
public class Queue {
	@Id
	private String queue_id;
	
	@Column(name="queue_date")
	private Date queue_date;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Opd_Card opd;
	
	public Queue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Queue(String queue_id, Date queue_date, Opd_Card opd) {
		super();
		this.queue_id = queue_id;
		this.queue_date = queue_date;
		this.opd = opd;
	}

	public String getQueue_id() {
		return queue_id;
	}
	public void setQueue_id(String queue_id) {
		this.queue_id = queue_id;
	}
	public Date getQueue_date() {
		return queue_date;
	}
	public void setQueue_date(Date queue_date) {
		this.queue_date = queue_date;
	}

	public Opd_Card getOpd() {
		return opd;
	}

	public void setOpd(Opd_Card opd) {
		this.opd = opd;
	}
	
	

}
