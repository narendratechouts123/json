package com.knr;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;

public class hio {

	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
		 sample s=new sample();
		 ArrayList<Employees> al=s.main();
		  System.out.println(al.size());
		  for(Employees e:al) {
			 System.out.print ("name is  "+e.name+" ");
			 System.out.print("deparatment is "+e.dept+" ");
			 System.out.println("number is "+e.no+" ");
			  System.out.println();
		  }

	}

}
