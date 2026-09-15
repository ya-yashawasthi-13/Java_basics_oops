import java.util.Scanner;

interface Vehicle {
	double calcCost();
}

class Car implements Vehicle {
	final int mile;
	final int dist;
	final int fuel;

	Car(int mileage, int distance, int fuelPrice) {
		this.mile = mileage;
		this.dist = distance;
		this.fuel = fuelPrice;
	}

	public double calcCost() {
		return (dist / mile) * fuel;
	}
}

class Bike implements Vehicle {
	final int mile;
	final int dist;
	final int fuel;

	Bike(int mileage, int distance, int fuelPrice) {
		this.mile =  mileage;
		this.dist = distance;
		this.fuel = fuelPrice;
	}

	public double calcCost() {
		return (dist / mile) * fuel;
	}
}

class Truck implements Vehicle {
	final int mile;
	final int dist;
	final int fuel;

	Truck(int mileage, int distance, int fuelPrice) {
		this.mile = mileage;
		this.dist = distance;
		this.fuel = fuelPrice;
	}

	public double calcCost() {
		return (dist / mile) * fuel;
	}
}

class Ass6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("mileage of car: ");
		int carMile = scanner.nextInt();
		System.out.print("distance travelled by car: ");
		int carDist = scanner.nextInt();
		System.out.print("fuel price: ");
		int carFuel = scanner.nextInt();

		System.out.print("mileage of bike: ");
		int bikeMile = scanner.nextInt();
		System.out.print("distance travelled by bike: ");
		int bikeDist = scanner.nextInt();
		System.out.print("fuel price: ");
		int bikeFuel = scanner.nextInt();

		System.out.print("mileage of truck: ");
		int truckMile = scanner.nextInt();
		System.out.print("distance travelled by truck: ");
		int truckDist = scanner.nextInt();
		System.out.print("fuel price: ");
		int truckFuel = scanner.nextInt();

		Vehicle car = new Car(carMile, carDist, carFuel);
		Vehicle bike = new Bike(bikeMile, bikeDist, bikeFuel);
		Vehicle truck = new Truck(truckMile, truckDist, truckFuel);

		System.out.printf("Cost for car: %.2f\n", car.calcCost());
		System.out.printf("Cost for bike : %.2f\n", bike.calcCost());
		System.out.printf("Cost for truck: %.2f\n", truck.calcCost());

	}
}
