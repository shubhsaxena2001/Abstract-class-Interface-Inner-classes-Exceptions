package exceptionHandlingAssignment;

public class Tester {
    public static void main(String[] args) throws CityNotFoundException {
        City c = new City();

        c.addCity(462016, "Bhopal");
        c.addCity(700012, "Kolkata");
        c.addCity(452020, "Indore");
        
        String ans = c.findCityByZipCode(462016);
        System.out.println(ans);
    }
}
