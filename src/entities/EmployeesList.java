package entities;

public class EmployeesList {

		private int numberId;
		private String name;
		private double salary;
		
		public EmployeesList(int numberId, String name, double salary) {
			this.numberId = numberId;
			this.name = name;
			this.salary = salary;
		}		
		
		public int getNumberId() {
			return numberId;
		}
		
		public void setNumberId(int numberId) {
			this.numberId = numberId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public void increaseSalary(double percentege) {
			salary += (salary * percentege / 100.0);
		}
		
		public String toString() {
			// return "EmployeesList [numberId=" + numberId + ", name=" + name + ", salary=" + salary + "]";			
			return numberId + ", " + name + ", " + String.format("%.2f", salary);
		}		

	}


