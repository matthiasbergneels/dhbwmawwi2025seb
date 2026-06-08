package lecture.chapter9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

  static void main() {
    Map<Integer, String> cities = new HashMap<Integer, String>();

    cities.put(Integer.valueOf(69190), "Walldorf");
    cities.put(68165, "Mannheim");
    cities.put(69488, "Weinheim");
    cities.put(69168, "Wiesloch");

    System.out.println("Stadt: " + cities.get(69190));

    cities.put(69190, "Neu Walldorf");

    System.out.println("Stadt: " + cities.get(69190));

    Set<Integer> keys = cities.keySet();
    for (int key : keys) {
      System.out.println(key + ": " + cities.get(key));
    }

    Collection<String> values = cities.values();
    for(String value : values) {
      System.out.println(value);
    }
  }
}
