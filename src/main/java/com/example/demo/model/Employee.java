package com.example.demo.model;

public class Employee {

	
		private Integer employeeId;
		private String fristname;
		private String lastname;
		private Integer salary;
		
		
		
		public Employee() {
			super();
		}


		public Employee(Integer employeeId, String fristname, String lastname, Integer salary) {
			super();
			this.employeeId = employeeId;
			this.fristname = fristname;
			this.lastname = lastname;
			this.salary = salary;
		}
		
		
		public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public String getFristname() {
			return fristname;
		}
		public void setFristname(String fristname) {
			this.fristname = fristname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		
}
