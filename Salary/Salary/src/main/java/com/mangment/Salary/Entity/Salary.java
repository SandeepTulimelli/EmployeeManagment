package com.mangment.Salary.Entity;


import java.math.BigDecimal;
import java.time.LocalDate;

import com.mangment.employee.Entity.Employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private Integer salaryId;


    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "base_salary")
    private BigDecimal baseSalary;

    @Column(name = "bonuses")
    private BigDecimal bonuses;

    @Column(name = "deductions")
    private BigDecimal deductions;

    @Column(name = "payment_date")
    private LocalDate paymentDate;

	public Integer getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(Integer salaryId) {
		this.salaryId = salaryId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BigDecimal getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(BigDecimal baseSalary) {
		this.baseSalary = baseSalary;
	}

	public BigDecimal getBonuses() {
		return bonuses;
	}

	public void setBonuses(BigDecimal bonuses) {
		this.bonuses = bonuses;
	}

	public BigDecimal getDeductions() {
		return deductions;
	}

	public void setDeductions(BigDecimal deductions) {
		this.deductions = deductions;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(Integer salaryId, Employee employee, BigDecimal baseSalary, BigDecimal bonuses, BigDecimal deductions,
			LocalDate paymentDate) {
		super();
		this.salaryId = salaryId;
		this.employee = employee;
		this.baseSalary = baseSalary;
		this.bonuses = bonuses;
		this.deductions = deductions;
		this.paymentDate = paymentDate;
	}


}
