package com.knr;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

/**
 * Servlet implementation class Viewdata
 */
@WebServlet("/Viewdata")
public class Viewdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request re=new request();
		 String deptname=request.getParameter("dept");
		 PrintWriter out=response.getWriter();
		try {
			 sample s=new sample();
			 ArrayList<Employees> al=s.main();
			  System.out.println(al.size());
			  for(Employees e:al) {
				  if(e.dept.equalsIgnoreCase(deptname)) {
					  out.print ("name is  "+e.name+" ");
					 out.print("deparatment is "+e.dept+" ");
					 out.println("number is "+e.no+" ");
					   out.println();
				  }
				  }
		}catch (Exception e) {
			System.out.println(e);
		}
 
	}

}
