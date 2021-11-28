


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		//getting input values from jsp page
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String author = request.getParameter("author");


		Connection con = null;
 		String url = "jdbc:mysql://localhost:3306/Library"; //MySQL URL and followed by the database name
 		String username = "universityDB0033"; //MySQL username
 		String password = "Pranav@108"; //MySQL password
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 		System.out.println("Printing connection object "+con);

		//Prepared Statement to add student data
		PreparedStatement st = con .prepareStatement("INSERT INTO book VALUES(?, ?,?,?)");
 		st.setInt(1,id);
		st.setString(2,name);
		st.setString(3,category);
		st.setString(4,author);
		int result=st.executeUpdate();

		//Checks if insert is successful.If yes,then redirects to Result.jsp page 
		if(result>0)
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("AddResult.jsp");
			rd.forward(request, response);
		}

		}
		 catch (Exception e) 
 		{
			RequestDispatcher rd = request.getRequestDispatcher("AddError.jsp");
			rd.forward(request, response);
			e.printStackTrace();
 		}

	
	}


}


