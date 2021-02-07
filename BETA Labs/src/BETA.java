
public class BETA {

	public static void main(String[] args) {
		// 
		int availablePlaneSeats = 10;
	    double costOfGroceries = 15.10;
	    char middleInitial = 'S';
	    boolean hotOutside = false;
	    String firstName = "sam";
	    String streetAddress = "568 Cherry St";
	    
	    System.out.println("available seats left" + " " +  availablePlaneSeats);
	    System.out.println("The cost of groceries is" + " " + costOfGroceries);
	    System.out.println("My middle initial is" + " " + middleInitial);
	    System.out.println("It is hot outside" + " " + hotOutside);
	    System.out.println("My first name is" + " " + firstName);
	    System.out.println("The street name is" + " " + streetAddress);
	    
	    availablePlaneSeats = availablePlaneSeats - 2;
	    System.out.println("There are this many seats left on the plane" + " " + availablePlaneSeats);
	    costOfGroceries = costOfGroceries + 2.15;
	    System.out.println(costOfGroceries + " " + " is the total for groceries after the candy bar");
	    middleInitial = 'T';
	    System.out.println("The middle initial was changed to" + " " + middleInitial);
	    hotOutside = true;
	    System.out.println(hotOutside);
	    String fullname = firstName + " " + middleInitial + " Hanks";
	    System.out.println(fullname);
	    System.out.println("Hello, my name is" + " " + fullname + " ,I stay at 568 Cherry St");
	    
}
}