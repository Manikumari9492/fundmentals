package com.codegnan.oop;

public class BoxDemo01 {
	double height;
	double width;
	double depth;
// method without parameters and return.
	public void  volume(){
		
		System.out.println("volme is :");
		System.out.println(width *height*depth);
	}
	//withoutpara withreturn
public double vol() {
	return height*depth*width;
}
//withoutpara withreturn
public double setDim(double width,double height,double depth ) {
	return  height*depth*width ;
}
//without return with para
public void setDimesion(double width,double height,double depth ) {
	double volume= height*depth*width;
	System.out.println("volume is :"+volume);
}
	
	public static void main(String[]args) {
		BoxDemo01 b1=new BoxDemo01();
		b1.height=2.0;
		b1.width=3.0;
		b1.depth=5.0;
		b1.volume();
		System.out.println("b1 volume :"+b1.vol());
		System.out.println("box1 volume:"+b1.setDim(4.0,6.0, 2.0));
		b1.setDimesion(-2.0,3.0,4.0);
		
		BoxDemo01 b2=new BoxDemo01();
		b2.height=12.0;
		b2.width=3.0;
		b2.depth=2.0;
		b2.volume();
		System.out.println("b2 volume :"+b2.vol());
		System.out.println("box1 volume:"+b2.setDim(40.0,60.0, 20.0));
		b1.setDimesion(-2.0,3.0,4.0);
	}

}
