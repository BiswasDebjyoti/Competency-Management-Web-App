package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class newEmploye
 */
@WebServlet("/newEmploye")
public class newEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String employeeName = (String) request.getAttribute("employeeName");
		String employeeRole = (String) request.getAttribute("employeeRole");
		String skills = (String) request.getAttribute("employeeSkills");
		System.out.println(skills);
		ArrayList<String> employeeSkills = new ArrayList<String>(Arrays.asList(((String) request.getAttribute("employeeSkills")).split(",")));
		ArrayList<String> employeeCertificates = new ArrayList<String>(Arrays.asList(((String) request.getAttribute("employeeCertificates")).split(",")));
		Employee employee = new Employee(employeeName,employeeRole,employeeSkills,employeeCertificates);
		HttpSession hs = request.getSession();
		hs.setAttribute("employee", employee);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
