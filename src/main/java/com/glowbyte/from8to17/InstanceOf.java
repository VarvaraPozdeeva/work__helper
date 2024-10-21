package com.glowbyte.from8to17;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {
	public static void main(String[] args) {
		A_test obj1 = new A_test();
		A_test obj2 = new B_test();
		obj1.print();
		obj2.print();

		if (obj2 instanceof /*final*/ B_test newobj) {
			newobj = new C_test();
			newobj.print();
		}

		List<String> list= new ArrayList<>();

		if( list instanceof ArrayList<String> newval){
//		if( list instanceof List<String> newval){

		}
	}
}
