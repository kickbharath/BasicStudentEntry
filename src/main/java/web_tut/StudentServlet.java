package web_tut;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet{
	StudentService studService=new StudentService();
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		
		List<Student> listOfStudents=new ArrayList<>();
		System.out.println("HEy");
		try {
			listOfStudents=studService.getStudents();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("students", listOfStudents);
		RequestDispatcher rd=req.getRequestDispatcher("displaystudents.jsp");
		rd.forward(req, res);
		System.out.println("HEy");
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Student stud=new Student();
		System.out.println("doPost called 1");
		if(req.getParameter("studentName")!=null)
		stud.name=req.getParameter("studentName");
		
		if(req.getParameter("studentId")!=null)
		stud.id=Integer.parseInt(req.getParameter("studentId"));
		
		if(req.getParameter("marks")!=null)
		stud.marks=Integer.parseInt(req.getParameter("marks"));
		
		try {
			
			boolean isAdded=studService.addStudent(stud);
			if(isAdded)
			{
				res.sendRedirect("StudentServlet");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

