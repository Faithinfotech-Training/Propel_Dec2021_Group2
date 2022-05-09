package com.coolascode.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="medicineprescription")
public class MedicinePrescription {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicineprescription_id")
	private int medicineprescriptionId;
	
	@Column(name="prescription_id")
	private int prescriptionId;
	
	@ManyToOne
	@JoinColumn(name="prescription_id", insertable=false,updatable=false)
	private Prescription prescription;
	

	
	@Column(name="medicine_id")
	private int medicineId;
	@OneToOne
	@JoinColumn(name="medicine_id", insertable=false,updatable=false)
	private Medicine medicine;
	
	@Column(name="medicine_interval")
	private int medicineInterval;
	
	@Column(name="course")
	private String course;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	public MedicinePrescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMedicineprescriptionId() {
		return medicineprescriptionId;
	}

	public void setMedicineprescriptionId(int medicineprescriptionId) {
		this.medicineprescriptionId = medicineprescriptionId;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public int getMedicineInterval() {
		return medicineInterval;
	}

	public void setMedicineInterval(int medicineInterval) {
		this.medicineInterval = medicineInterval;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
}
