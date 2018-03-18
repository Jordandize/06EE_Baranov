package ua.edu.constantine.relations.data;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="Lectures")
public class Lecture {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "full_name")
	private String name;
	
	private double credits;
	
	public Lecture() {
		this("", -1.0);
	}
	
	public Lecture(String name, double credits) {
		this(-1, name, credits);
	}
	
	private Lecture(long id, String name, double credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	public String toString() {
		return id + " " + name + " " + credits;
	}

}
