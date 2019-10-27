package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Opd_Card")
public class Opd_Card {
	
	@Id
	private String Opd_id;
	
	@Column(name="Opd_date")
	private Date Opd_date;
	
	@Column(name="initial_symptoms")
	private String initial_symptoms;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Employee employee ;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="doctor_id")
	private Doctor doctor ;
	
	public Opd_Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Opd_Card(String Opd_id, Date Opd_date, String initial_symptoms, Employee employee, Patient patient,
			Doctor doctor) {
		super();
		this.Opd_id = Opd_id;
		this.Opd_date = Opd_date;
		this.initial_symptoms = initial_symptoms;
		this.employee = employee;
		this.patient = patient;
		this.doctor = doctor;
	}

	
	public String getOpd_id() {
		return Opd_id;
	}


	public void setOpd_id(String opd_id) {
		Opd_id = opd_id;
	}


	public Date getOpd_date() {
		return Opd_date;
	}


	public void setOpd_date(Date opd_date) {
		Opd_date = opd_date;
	}


	public String getInitial_symptoms() {
		return initial_symptoms;
	}
	public void setInitial_symptoms(String initial_symptoms) {
		this.initial_symptoms = initial_symptoms;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
	

}
