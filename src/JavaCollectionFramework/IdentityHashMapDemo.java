package JavaCollectionFramework;
import java.util.*;
public class IdentityHashMapDemo {
	public static void main(String[] args) {
		String key1 = new String("Key");
		String key2 = new String("Key");
		IdentityHashMap<String,Integer> Ihm = new IdentityHashMap<>();
		Ihm.put(key2, 1);
		Ihm.put(key1, 2);
		System.out.println(Ihm);
		
	}
}
