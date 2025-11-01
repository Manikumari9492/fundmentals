package com.codegnan.utilStreams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomObjectProcessMeechasnism {

	public static void main(String[] args) {
		List<Person>persons=Arrays.asList(
			new Person(1,"Subba","naidu@gmail.com",27),
			new Person(5,"Mani","kumari@gmail.com",22),
			new Person(3,"chinna","naidu@gmail.com",32),
			new Person(7,"Nithin","Michial@gmail.com",42)
			);
				List<Person>ageAbove30=persons.stream().filter(e->e.age>30)
						.collect(Collectors.toList());
				System.out.println("Person with Age above 30:"+ageAbove30);
				
				System.out.println("Person nameslength greater 4 count"
						+persons.stream().filter(p->p.name.length()>4).count());
				
				System.out.println("person with id in assending order."+
				persons.stream().sorted((e1,e2)->Integer.compare(e1.id, e2.id))
				. collect(Collectors.toList()));
				System.out.println("person with email in desecnding order"
					+persons.stream().sorted((p1,p2)->-p1.email.compareTo(p2.email))
							.collect(Collectors.toList()));
				
				System.out.println("person with email indesending order in min element"
				+persons.stream().min((p1,p2)->-p1.email.compareTo(p2.email)).get());
				
				System.out.println("person with email in desending order in max element"
						+persons.stream().max((p1,p2)->-p1.email.compareTo(p2.email)).get());
				
	}

}
