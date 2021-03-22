package com.knr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;

 
public class request {
static String s;
	static	BufferedReader br;
	static StringBuilder sb=new StringBuilder();
	public  StringBuilder knr( ) throws IOException {
		
		URL url=new URL("https://run.mocky.io/v3/661facaf-0648-45a6-8d3e-5d6c0742ad38");
 		HttpURLConnection connect=(HttpURLConnection) url.openConnection();
 		connect.setRequestMethod("GET");
 		int status=connect.getResponseCode();
 		//System.out.println(status);
 		br=new BufferedReader(new InputStreamReader(connect.getInputStream()));
 		while((s=br.readLine())!=null) {
 	sb.append(s+"\n");
  		}
 	//  System.out.println(sb);
 		return sb;
	} 
	 

}
