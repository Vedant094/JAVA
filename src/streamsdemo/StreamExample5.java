package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 12, 2025
 * Time    : 10:33:25 AM
 * Project : AdvancedJava

 */

public class StreamExample5 {

	private static List<MusicalInstruments> musicalInstruments=new ArrayList<>();
	static {
		musicalInstruments.add(new MusicalInstruments("Trumpet","brass",299.99));
		musicalInstruments.add(new MusicalInstruments("Tuba","brass",1149.0));
		musicalInstruments.add(new MusicalInstruments("Timpani","percussion",2339.0));
		musicalInstruments.add(new MusicalInstruments("Snare drum","percussion",325.00));
		musicalInstruments.add(new MusicalInstruments("Piano","keyboard",5179.99));
		musicalInstruments.add(new MusicalInstruments("Trombone","brass",775.79));
	}
	public static void main(String[] args) {


		System.out.println("*********** Musical Instruments in Collection ***************");

		musicalInstruments.stream().forEach(i->System.out.println(i.getName()+" "+
				i.getType()+" "+i.getPrice()));

		System.out.println("************ Group Instruments by Type: *********************");
		Map<String,List<MusicalInstruments>> typeMap= musicalInstruments.stream()
				.collect(Collectors.groupingBy(MusicalInstruments::getType));

		typeMap.forEach((key,value) -> {
			System.out.println(key);
			value.forEach(i->System.out.println(i.getName()+" "+
					i.getType()+" "+i.getPrice()));
		});

		System.out.println("************ Partition Instruments by Price: *********************");
		Map<Boolean,List<MusicalInstruments>> priceMap= musicalInstruments.stream()
				.collect(Collectors.partitioningBy(mi ->mi.getPrice() > 500.0));
		
		priceMap.forEach((key,value)-> { 
			System.out.println((key ? "Expensive":"Affordable"));
			value.forEach(i->System.out.println(i.getName()+" "+
					i.getType()+" "+i.getPrice())); 
		});
	}

}
