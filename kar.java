import java.util.Scanner;

public class kar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car economy = new Car();
		
	}

}//main class

class Car {
	Scanner scan = new Scanner(System.in);
	private int luxloop =  0;
	private char confRent;
	
	Car(){
		do {
		System.out.println("[1] Luxury [2] Economy [3] Compact [4] SUV [5] Exit");
		System.out.print("Please select a car you want to rent:");
		int ch = scan.nextInt();
		
		if(ch == 1) {
			luxury();
		}
		else if(ch == 2) {
			economy();
		}
		else if(ch == 3) {
			compact();
		}
		else if(ch == 4) {
			suv();
		}
		else if(ch == 5) {
			System.out.println("Please confirm Y[yes] | N[no]");
			char conf = scan.next().charAt(0);
			if(conf == 'N' || conf == 'n') {
				continue;
			}
			else {
				System.out.println("THANK YOU FOR USING OUR SYSTEM \nCOME AGAIN!");
				return;
			}
		}
		else {
			System.out.println("Invalid Input!");
		}
	}while(luxloop != 1);
	}//car end
	
	
	
	public void luxury() {
		do {
		System.out.println("[1]Mercedes-Benz [2]Tesla [3]BMW [4]Back");
		System.out.print("Enter choice: ");
		int luxModel = scan.nextInt();
		switch (luxModel) {
		case 1:
			System.out.println("You have Selected: \nModel: Mercedes-Benz \nYear: 2020 \nMileage: 91,301");
			System.out.print("How many days you want to rent: ");
			rentalRatelux(scan.nextInt());
			System.out.print("Please Confirm Rent YES[y] NO[n]: ");
			confRent = scan.next().charAt(0);
			if(confRent == 'N' || confRent == 'n') {
				continue;
			}
			else {
				System.out.println("RENT CONFIRMED!");
				return;
			}
			
		case 2:
			System.out.println("You have Selected: \nModel: Tesla \nYear: 2022 \nMileage: 5,301");
			System.out.print("How many days you want to rent: ");
			rentalRatelux(scan.nextInt());
			System.out.print("Please Confirm Rent YES[y] NO[n]: ");
			confRent = scan.next().charAt(0);
			if(confRent == 'N' || confRent == 'n') {
				continue;
			}
			else {
				System.out.println("RENT CONFIRMED!");
				return;
			}
			
		case 3: 
			System.out.println("You have Selected: \nModel: BMW \nYear: 2019 \nMileage: 109,301");
			System.out.print("How many days you want to rent: ");
			rentalRatelux(scan.nextInt());
			System.out.print("Please Confirm Rent YES[y] NO[n]: ");
			confRent = scan.next().charAt(0);
			if(confRent == 'N' || confRent == 'n') {
				continue;
			}
			else {
				System.out.println("RENT CONFIRMED!");
				return;
			}
		case 4: 
			System.out.println("Please confirm Y[yes] | N[no]");
			char conf = scan.next().charAt(0);
			if(conf == 'N' || conf == 'n') {
				continue;
			}
			else {
				System.out.println("THANK YOU");
				return;
			}
			
		}//switch case
		}while(luxloop != 1);//loop
	}//end luxury method
	
	public void economy() {
		do {
			System.out.println("[1]Honda Civic [2]Hyundai [3]Kia Forte [4]Back");
			System.out.print("Enter choice: ");
			int luxModel = scan.nextInt();
			switch (luxModel) {
			case 1:
				System.out.println("You have Selected: \nModel: Honda Civiv \nYear: 2019 \nMileage: 2,301");
				System.out.print("How many days you want to rent: ");
				rentalRateeco(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 2:
				System.out.println("You have Selected: \nModel: Hyundai \nYear: 2017 \nMileage: 67,301");
				System.out.print("How many days you want to rent: ");
				rentalRateeco(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 3: 
				System.out.println("You have Selected: \nModel: Kia Forte \nYear: 2017 \nMileage: 19,301");
				System.out.print("How many days you want to rent: ");
				rentalRateeco(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 4: 
				System.out.println("Please confirm Y[yes] | N[no]");
				char conf = scan.next().charAt(0);
				if(conf == 'N' || conf == 'n') {
					continue;
				}
				else {
					System.out.println("THANK YOU");
					return;
				}
			}//switch case
			}while(luxloop != 1);
	}
	public void compact() {
		do {
			System.out.println("[1]Coolray SE [2]Emgrand [3]Okavango [4]Back");
			System.out.print("Enter choice: ");
			int luxModel = scan.nextInt();
			switch (luxModel) {
			case 1:
				System.out.println("You have Selected: \nModel: Coolray SE \nYear: 2019 \nMileage: 21,301");
				System.out.print("How many days you want to rent: ");
				rentalRatecom(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 2:
				System.out.println("You have Selected: \nModel: Emgrand \nYear: 2017 \nMileage: 76,904");
				System.out.print("How many days you want to rent: ");
				rentalRatecom(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 3: 
				System.out.println("You have Selected: \nModel: Okavango \nYear: 2017 \nMileage: 19,356");
				System.out.print("How many days you want to rent: ");
				rentalRatecom(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 4: 
				System.out.println("Please confirm Y[yes] | N[no]");
				char conf = scan.next().charAt(0);
				if(conf == 'N' || conf == 'n') {
					continue;
				}
				else {
					System.out.println("THANK YOU");
					return;
				}
			}//switch case
			}while(luxloop != 1);
	}
	public void suv() {
		do {
			System.out.println("[1]Kia Stonic [2]Toyota Rush [3]Toyota Fortuner [4]Back");
			System.out.print("Enter choice: ");
			int luxModel = scan.nextInt();
			switch (luxModel) {
			case 1:
				System.out.println("You have Selected: \nModel: Kia Stonic \nYear: 2023 \nMileage: 12,394");
				System.out.print("How many days you want to rent: ");
				rentalRatesuv(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 2:
				System.out.println("You have Selected: \nModel: Toyota Rush \nYear: 2020 \nMileage: 69,244");
				System.out.print("How many days you want to rent: ");
				rentalRatesuv(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 3: 
				System.out.println("You have Selected: \nModel: Toyota Fortuner \nYear: 2023 nMileage: 12,326");
				System.out.print("How many days you want to rent: ");
				rentalRatesuv(scan.nextInt());
				System.out.print("Please Confirm Rent YES[y] NO[n]: ");
				confRent = scan.next().charAt(0);
				if(confRent == 'N' || confRent == 'n') {
					continue;
				}
				else {
					System.out.println("RENT CONFIRMED!");
					return;
				}
			case 4: 
				System.out.println("Please confirm Y[yes] | N[no]");
				char conf = scan.next().charAt(0);
				if(conf == 'N' || conf == 'n') {
					continue;
				}
				else {
					System.out.println("THANK YOU");
					return;
				}
				
			}//switch case
			}while(luxloop != 1);
	}
	
	public void rentalRatelux(double rate) {
		double toPay = rate * 800;
		System.out.println("Rental Fee: $" +toPay);
	}
	public void rentalRateeco(double rate) {
		double toPay = rate * 800;
		System.out.println("Rental Fee: $" +toPay);
	}
	public void rentalRatecom(double rate) {
		double toPay = rate * 800;
		System.out.println("Rental Fee: $" +toPay);
	}
	public void rentalRatesuv(double rate) {
		double toPay = rate * 800;
		System.out.println("Rental Fee: $" +toPay);
	}
}//class end