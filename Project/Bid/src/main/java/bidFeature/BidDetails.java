package bidFeature;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BidDetails
 */
public class BidDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  /*  public BidDetails() {
        super();
        // TODO Auto-generated constructor stub
    } */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("welcome inside do get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		System.out.println("welcome inside do post");
		String username=request.getParameter("username");
		String email = request.getParameter("email");
		//int phone = Integer.parseInt(request.getParameter("phone"));
		long phone = Long.parseLong(request.getParameter("phone"));
		String address = request.getParameter("address");
		int bvalue = Integer.parseInt(request.getParameter("bvalue"));
		String itemName = request.getParameter("itemName");
		System.out.println("Item name :"+itemName);
		Users user = new Users();
		HttpSession bidSession = request.getSession();
		ArrayList<Users> usersList = (ArrayList<Users>)bidSession.getAttribute("ProductsInCart");
		
		//ArrayList<Users> usersList = new ArrayList<>();
		
		user.setName(username);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);
		user.setMaxbid(bvalue);
		user.setItemName(itemName);
		if ( null != usersList) { 
		usersList.add(user); 
		
		
			bidSession.setAttribute("ProductsInCart", usersList);
			
		}
		 else {
			 ArrayList<Users> usersList1 = new ArrayList<>();
			 usersList1.add(user);
				
				bidSession.setAttribute("ProductsInCart", usersList1);
			}
		// Item name 
		System.out.println("!!!!!!!!!!!!! item name !!!!!!!!!!!!!");
		System.out.println(itemName);
		

	//	bidSession.setAttribute("ProductsInCart", usersList);
		
		

		//Read the attribute:

		//HttpSession session2 = request.getSession();

		//List<Users> userclass = (List<Users>)session2.getAttribute("ProductsInCart");
		
		//System.out.println(userclass);
		System.out.println("username: " + username);
		System.out.println("Bid value: " + bvalue);
		
		boolean valid = username != null && email.length()>0;
		
		
	//	System.out.println(user);
		RequestDispatcher dispatcher = null;

		if(valid) {		
			System.out.println("valid user");
			
			dispatcher = getServletContext().getRequestDispatcher("/Welcome.jsp");
		} else {
			System.out.println("invalid user");
			dispatcher = getServletContext().getRequestDispatcher("/Error.html");
		}
		
		dispatcher.forward(request, response);
      //  System.out.println("email: " + email);
	}

}
