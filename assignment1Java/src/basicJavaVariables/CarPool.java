package basicJavaVariables;
//2. Car Pool 

public class CarPool {

	public static void main(String[] args) {
//Declaring variables
		int cars = 100;
		int drivers = 30;
		int passengers = 90;
		int cars_not_driven ;
		int cars_driven;
		double space_in_a_car = 4.0;
		double carpool_capacity ;
		double average_passengers_per_car; 
		double average_miles_driven = 29.2;
		double average_miles_per_gallon =23.6;
		double money_saved;
		double gas_cost_per_gallon = 2.517;
//Calculation--
// 1.[cars_not_driven] should be equal to the difference between [cars] and [drivers]
		cars_not_driven = cars-drivers;
//2. [cars_driven] should be equal to the value of [drivers]
		cars_driven = drivers;
//3.[carpool_capacity] should be equal to the product of [cars_driven] and [space_in_a_car]
		carpool_capacity = cars_driven * space_in_a_car;
//4. [average_passengers_per_car] should be equal to the ratio of [passengers] to [cars_driven]
		average_passengers_per_car = passengers/cars_driven;
// 5.[gas_cost_per_trip] should be equal to ([average_miles_driven] * [gas_cost_per_gallon])/[average_miles_per_gallon]
		double gas_cost_per_trip= ((average_miles_driven)*(gas_cost_per_gallon)/(average_miles_per_gallon));
// 6.[money_saved] should be equal to the difference between ([gas_cost_per_trip] * [cars]) and ([gas_cost_per_trip] * [cars_driven])
		money_saved= ((gas_cost_per_trip )* (cars))-((gas_cost_per_trip)*(cars_driven));

//Output

System.out.println("There are " +cars+ " cars availabe." + '\n' + "There are only " +drivers+ " drivers available." 
+ '\n' + "That means there will be " +cars_not_driven+ " empty cars today! " + '\n' + "We can transport " +carpool_capacity+
" people today." + '\n' + "Out of that, we're transporting " +passengers+ " today." + '\n' + "So we'll need to put about " +average_passengers_per_car+ " in each car." + '\n' + "Long story short, today,"
+ " we'll be saving about $" +money_saved);
	}

}
