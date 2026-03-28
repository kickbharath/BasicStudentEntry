package web_tut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class StudentService {
	final String DATABASE_URL="jdbc:mysql://localhost:3306/Student";
	final String USER_NAME="root";
	final String PASSWORD="Bharath@365";
	final String DATABASE_DRIVER="com.mysql.cj.jdbc.Driver";
	
	
	List<Student> getStudents() throws ClassNotFoundException, SQLException
	{
	String sql="select * from student";
	System.out.println("HEy");
	List<Student> students=new ArrayList<>();
	try {
		Class.forName(DATABASE_DRIVER);
		Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
		Statement st = con.createStatement();
		ResultSet rset = st.executeQuery(sql);

		while (rset.next()) {
			System.out.println("DB running");
			Student stud = new Student();
			stud.id = rset.getInt("id");
			stud.name = rset.getString("StudentName");
			stud.marks = rset.getInt("Marks");
			students.add(stud);
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("HEy");
	return students;
	}
	
	
	public boolean addStudent(Student stud) throws SQLException
	{
		System.out.println("AddStudents called 1");

		String sql="insert into student(id,StudentName,Marks) values (?,?,?)";
		System.out.println("AddStudents called 1");
		Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
		PreparedStatement preSt=con.prepareStatement(sql);
		
		
		System.out.println("sudent id is : " + stud.id);
		
		preSt.setInt(1, stud.id);
		preSt.setString(2, stud.name);
		preSt.setInt(3, stud.marks);
		
		int row=preSt.executeUpdate();
		return row==1;
	}
	
}

