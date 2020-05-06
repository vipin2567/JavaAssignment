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
public class sellerItems extends HttpServlet {
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
	//	System.out.println("welcome inside do get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		System.out.println("welcome inside do post");
		// login details
		String user = request.getParameter("user");
		//String sellerRoute = request.getParameter("user")
		if ( user!=null && user.equals("login")) {
		String sellername=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session = request.getSession();

		ArrayList<SellerDetails> sellerCartDetails = (ArrayList<SellerDetails>)session.getAttribute("SellerCart");
		
		RequestDispatcher dispatcherlogin = null; 
		for (int i = 0; i < sellerCartDetails.size(); i++) {
			SellerDetails sellerLoginDetail = new SellerDetails();
			sellerLoginDetail = sellerCartDetails.get(i);
			if (sellerLoginDetail.getUsername().equals(sellername) && sellerLoginDetail.getPassword().equals(password)) {
				
				dispatcherlogin = getServletContext().getRequestDispatcher("/sellerItemsList.jsp");
			}
			else {
				dispatcherlogin = getServletContext().getRequestDispatcher("/Error.html");
			}
			dispatcherlogin.forward(request, response); 
		}
	//	System.out.println(sellername);
	//	System.out.println(password);
		
} else if (  user!=null && user.equals("signUp")){
		
		// sign up details 
		String name=request.getParameter("sellername");
		String username=request.getParameter("username");
		String sellerpassword=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		
		SellerDetails sellerdetail = new SellerDetails();
		ArrayList<SellerDetails> sellerList = new ArrayList<>();
		
		
		sellerdetail.setName(name);
		sellerdetail.setUsername(username);
		sellerdetail.setPassword(sellerpassword);
		sellerdetail.setEmail(email);
		sellerdetail.setAddress(address);
		
		sellerList.add(sellerdetail);
		HttpSession bidSession = request.getSession();

		bidSession.setAttribute("SellerCart", sellerList);
		RequestDispatcher dispatchersignup = null; 
		dispatchersignup = getServletContext().getRequestDispatcher("/sellerItemsList.jsp");
		dispatchersignup.forward(request, response); 

} else if (user!=null && user.equals("addNewItem")) {
	
	RequestDispatcher dispatchersignup = null; 
	dispatchersignup = getServletContext().getRequestDispatcher("/addNewItem.jsp");
	dispatchersignup.forward(request, response); 
}
		
else if (user!=null && user.equals("displayItem")) {
	
	String itemName=request.getParameter("sellerItemName");
	String username = request.getParameter("username");
	SellerItemDetails sellerItemDetails = new SellerItemDetails();
	sellerItemDetails.setSellerItem(itemName);
	sellerItemDetails.setSellerUsername(username);
	HttpSession bidSession = request.getSession();
	ArrayList<SellerItemDetails> sellerItemsList = (ArrayList<SellerItemDetails>)bidSession.getAttribute("SellerItems");
	if ( null != sellerItemsList) {
	//ArrayList<SellerItemDetails> sellerItemsList = new ArrayList<>();
	sellerItemsList.add(sellerItemDetails);
	bidSession.setAttribute("SellerItems", sellerItemsList);
	} else {
		ArrayList<SellerItemDetails> sellerItemsList1 = new ArrayList<>();
		bidSession.setAttribute("SellerItems", sellerItemsList1);
	}
	
	
	
	
	
	
	RequestDispatcher dispatchersignup = null; 
	dispatchersignup = getServletContext().getRequestDispatcher("/sellerItemsList.jsp");
	dispatchersignup.forward(request, response); 
	
	
	for(SellerItemDetails sellerItemDetails1 : sellerItemsList) {
		
		
	}
	
} 
		
else if (user!=null && user.equals("closebid")) {
	String winnerName = "";
		int max = 0;
	HttpSession bidSession = request.getSession();
	ArrayList<Users> usersList = (ArrayList<Users>)bidSession.getAttribute("ProductsInCart");
	if (null != usersList) {
		int maxIndex = 0;
		
		for (int i = 0; i < usersList.size(); i++) {
			//max = usersList.get(i).getMaxbid();
			if (usersList.get(i).getMaxbid() > max ) {
				max = usersList.get(i).getMaxbid();
				winnerName = usersList.get(i).getName();
			}
				
			}
			
		}
		 
	//ArrayList<SellerItemDetails> sellerItemsList = (ArrayList<SellerItemDetails>)bidSession.getAttribute("SellerItems");
	//sellerItemsList.removeAll(sellerItemsList);
	ArrayList<SellerItemDetails> sellerItemsList1 = new ArrayList<>();
	bidSession.setAttribute("SellerItems", sellerItemsList1);
	
	
	
	RequestDispatcher dispatchersignup = null; 
	dispatchersignup = getServletContext().getRequestDispatcher("/maximumBid.jsp?max="+max+"&winnerName="+winnerName);
	dispatchersignup.forward(request, response);
}
		

		
	
		
		
		
	/*	String email = request.getParameter("email");
		long phone = Integer.parseInt(request.getParameter("phone"));
		String address = request.getParameter("address");
		int bvalue = Integer.parseInt(request.getParameter("bvalue"));
		String itemName = request.getParameter("itemName");
		System.out.println("Item name :"+itemName);
		Users user = new Users();
		user.setName(username);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);
		user.setMaxbid(bvalue);
		user.setItemName(itemName);
		// Item name 
		System.out.println("!!!!!!!!!!!!! item name !!!!!!!!!!!!!");
		System.out.println(itemName);
		HttpSession bidSession = request.getSession();

		bidSession.setAttribute("ProductsInCart", user);

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
		
		dispatcher.forward(request, response); */
      //  System.out.println("email: " + email);
	}

}
