package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="login")
public class Login {
	@Id
	private String username;
	
	@Column(name="password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Doctor  doctor ;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
