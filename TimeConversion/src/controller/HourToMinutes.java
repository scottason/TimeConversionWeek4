package controller;
import model.HoursConverter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HourToMinutes
 */
@WebServlet("/HourToMinutes")
public class HourToMinutes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HourToMinutes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			String userHour = request.getParameter("userHours");
			HoursConverter userMinutes = new HoursConverter(Integer.parseInt(userHour));
			
			request.setAttribute("hoursToMinutes",  userMinutes);
			getServletContext().getRequestDispatcher("/hourResults.jsp").forward(request, response);
	}

}
