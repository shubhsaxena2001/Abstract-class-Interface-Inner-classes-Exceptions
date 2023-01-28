package exceptionHandlingAssignment;

import java.util.*;

public class City {
    HashMap<Integer, String> mp = new HashMap<>();

    public void addCity(int zipCode, String cityName){
        mp.put(zipCode, cityName);
    }

    public String findCityByZipCode(int zipCode) throws CityNotFoundException {
        try{
            if (mp.containsKey(zipCode)) {

                String cityName = mp.get(zipCode);
                return cityName;
                
            } else {
                throw new CityNotFoundException("City not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }
}
