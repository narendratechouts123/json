package com.knr;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class sample {
	public  ArrayList main( ) throws JSONException, IOException {
		ArrayList alist=new ArrayList();
		Employees al=null;

		// TODO Auto-generated method stub
		request re=new request();
		String s="[";
		s=s+re.knr().toString();
		s=s+"]";
 		JSONArray ar=new JSONArray(s);
		 
		 JSONObject ob=ar.getJSONObject(0);
JSONArray obj= (JSONArray) ob.get("employees");
   for (int i = 0; i < obj.length(); i++) {
	JSONObject ob1=obj.getJSONObject(i);
	String name=ob1.getString("name");
	String dept=ob1.getString("dept");
	int no=ob1.getInt("id");
	al=new Employees(no,dept,name);
	alist.add(al);
	
	
}
   return alist;
 
		}

	 

}
