package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Remedy")
public class Remedy {
	@Id
	private String remedy_id;
	
	@Column(name="remedy_date")
	private Date remedy_date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Opd_id")
	private Opd_Card opd ;
	
	public Remedy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Remedy(String remedy_id, Date remedy_date, Opd_Card opd) {
		super();
		this.remedy_id = remedy_id;
		this.remedy_date = remedy_date;
		this.opd = opd;
	}

	public String getRemedy_id() {
		return remedy_id;
	}
	public void setRemedy_id(String remedy_id) {
		this.remedy_id = remedy_id;
	}
	public Date getRemedy_date() {
		return remedy_date;
	}
	public void setRemedy_date(Date remedy_date) {
		this.remedy_date = remedy_date;
	}

	public Opd_Card getOpd() {
		return opd;
	}

	public void setOpd(Opd_Card opd) {
		this.opd = opd;
	}
	
	
	

}
