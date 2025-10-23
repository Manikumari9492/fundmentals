package com.codegnan.collections;

import java.util.Comparator;

public class MyComparator  implements Comparator{
	public  int compare(Object obj1,Object obj2) {
		String  s1=obj1.toString();
		String s2=obj2.toString();
		//Integer i1=(Integer) obj1;
		//Integer i2=(Integer) obj2;
		/*if(i1<i2) {
			return -100;
			
		}else {
			if(i1>i2) {
				return +1;
			}else {*/
				//return i1.compareTo(i2);
			//}
	return -s1.compareTo(s2);
		}

	}

//}
