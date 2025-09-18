package com.codegnan.oop;

public class Box {

	
		double width;
		double height;
		double depth;
		public Box(double width, double height, double depth) {
			super();
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
	//copy  constructor -copies diamions from other box Object
		public Box (Box obj) {
			width=obj.width;
			height=obj.height;
			depth=obj.depth;
			
		}
		 
}
