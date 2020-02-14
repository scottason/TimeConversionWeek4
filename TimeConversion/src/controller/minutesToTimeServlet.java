package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MinutesConvert;

/**
 * Servlet implementation class minutesToTimeServlet
 */
@WebServlet("/minutesToTimeServlet")
public class minutesToTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public minutesToTimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userMinutes = request.getParameter("userMinutes");
		MinutesConvert userTime = new MinutesConvert(Integer.parseInt(userMinutes));
		
		request.setAttribute("userTime",  userTime);
		getServletContext().getRequestDispatcher("/minutesToTime.jsp").forward(request, response);
	}

}
