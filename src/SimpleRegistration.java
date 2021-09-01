

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleRegistration
 */
@WebServlet("/SimpleRegistration")
public class SimpleRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname=request.getParameter("firstname");
		String middlename=request.getParameter("middlename");
		String lastname=request.getParameter("lastname");
		String emailid=request.getParameter("emailid");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		if(firstname.isEmpty()||middlename.isEmpty()||lastname.isEmpty()||emailid.isEmpty()||password.isEmpty()||address.isEmpty()||contact.isEmpty())
        {
           RequestDispatcher req =request.getRequestDispatcher("invalid.jsp");
           req.include(request, response);

        }

     else
       {
  	   RequestDispatcher req =request.getRequestDispatcher("valid.jsp");
           req.forward(request, response);
      }
		
		}	
		
}	    

