package Activities;

public class Car {

		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
		
		Car() {
			this.tyres = 4; 
			this.doors = 4;
		}
		public void displayCharacteristics() {
			System.out.println("Colour of Car: " +color);
			System.out.println("Make of Car: " +make);
			System.out.println("Transmission  of Car: " +tyres);
			System.out.println("Number of Tyers: " +tyres);
			System.out.println("Number of Doors: " +doors);
		}
		
		public void accelarate() {
			System.out.println("Car is moving forward.");
		}
		
		public void brake() {
			System.out.println("Cars has stoppped");
		}

}
