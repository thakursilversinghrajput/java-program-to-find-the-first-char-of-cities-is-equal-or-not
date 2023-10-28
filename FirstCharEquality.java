public class FirstCharEquality { 
    public static void main(String[] args) { 
        // Create an array of cities 
        String[] cities = {"New York", "Los Angeles", "London", "Paris", "Tokyo"}; 
 
        // Find and compare the first characters 
        char firstChar = cities[0].charAt(0); // Get the first character of the first city 
 
        boolean allEqual = true; 
 
        for (String city : cities) { 
            if (city.charAt(0) != firstChar) { 
                allEqual = false; 
                break; 
            } 
        } 
 
        // Display the result 
        if (allEqual) { 
            System.out.println("The first characters of all cities are equal: " + firstChar);
               } else { 
            System.out.println("The first characters of the cities are not all equal."); 
        } 
    } 
} 
 
