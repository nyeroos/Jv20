package com.nyeroos.firstlesson.JV20.pr23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<String, String>();
        mp.put("Grishkina", "Kristina");
        mp.put("Minakova", "Elisabeth");
        mp.put("Ponomaryov", "Dima");
        mp.put("Shorin", "Ivan");
        mp.put("Romanov", "Dan");
        mp.put("Belousova", "Elena");
        mp.put("Gromov", "Nico");
        mp.put("Lolov", "Kek");

        System.out.println(mp);

        Map<String, Integer> mpFrequncy = new HashMap<String, Integer>();
        LinkedList<String> keys = new LinkedList<String>(mp.values()); // names

        for (int i = 0; i < keys.size(); i++) {
            if (mpFrequncy.get(keys.get(i)) == null) {
                mpFrequncy.put(keys.get(i), 1); // in first time
            } else {
                mpFrequncy.put(keys.get(i), mpFrequncy.get(keys.get(i)) + 1);
            }
        }

        System.out.println(mpFrequncy);
        keys = new LinkedList<String>(mpFrequncy.keySet());//names
        for (int i = 0; i < keys.size(); i++) {
            if (mpFrequncy.get(keys.get(i)) > 1) {
                HashMap<String, String> copy = new HashMap<String, String>(mp);
                for (Map.Entry<String, String> pair : copy.entrySet()) { // key word
                    if (pair.getValue().equals(keys.get(i)))
                        mp.remove(pair.getKey());
                }
            }
        }
        System.out.println(mp);

        System.out.println();


        Map<String, ArrayList<String>> map = new HashMap();

        Set<City> cities = new HashSet<City>() {
        };
        cities.add(new City("Russia", "Moscow"));
        cities.add(new City("Russia", "Krasnodar"));
        cities.add(new City("USA", "New York"));
        cities.add(new City("Netherlands", "Amsterdam"));
        cities.add(new City("Ukraine", "Kiev"));
        System.out.println(cities);

        Set<String> namesOfCountries = new HashSet<>();
        for (City t : cities
        ) {
            namesOfCountries.add(t.getCountry());
        }
        for (String countryName : namesOfCountries) {
            ArrayList<String> citiesString = new ArrayList<>();
            for (City t : cities) {
                if (t.getCountry() == countryName) citiesString.add(t.getGround());
            }
            map.put(countryName, citiesString);
        }
        System.out.println(map);
    }
}
