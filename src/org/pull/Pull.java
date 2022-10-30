package org.pull;

public class Pull {
	private void empName() {
		System.out.println("EmpNmae: Mathi");
	}

	private void empId() {
		System.out.println("EmpId:2563");
	}
	private void empEmail() {
		System.out.println("EmpEmail:smathisankar@gamil.com");
	}

	public static void main(String[] args) {
		Pull p = new Pull();
		p.empName();
		p.empId();
		p.empEmail();
	}

}
