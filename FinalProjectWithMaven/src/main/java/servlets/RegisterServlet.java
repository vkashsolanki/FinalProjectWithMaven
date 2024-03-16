package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import dto.Register;
import dto.RegisterBean;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 		
	 		String name=request.getParameter("name");
	 		String email=request.getParameter("email");
	 		String mobile=request.getParameter("mobile");
	 		String pass=request.getParameter("password");
	 		
	 		PrintWriter printWriter=response.getWriter();
	 		
	 		Register bean=new Register();
	 		bean.setName(name);
	 		bean.setEmail(email);
	 		bean.setMobile(mobile);
	 		bean.setPassword(pass);
	 		
	 		
	 		RegisterDao dao=new RegisterDao();
	 		String msg=dao.userRegister(bean);
	 		
	 		switch (msg) 
	 		{
			case "success":
			printWriter.println("user register successffllyyy");	
			break;
			
			case "exist":
				printWriter.println("user existttt...");	

				break;

				
			case "fail":
				printWriter.println("kuch issue hai");	

				break;
				
			
			default:
				break;
			}
	 		
	 		
	 		
	 		 
	}

}
