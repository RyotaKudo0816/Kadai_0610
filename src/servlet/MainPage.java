package servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PostBean;
import dao.PostDao;

/**
 * Servlet implementation class MainPage
 */
@WebServlet("/MainPage")
public class MainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		ArrayList<PostBean> postList = new ArrayList<PostBean>();

		String name = request.getParameter("name");
		String content = request.getParameter("content");
		String mailadd = request.getParameter("mailadd");

		long millis = System.currentTimeMillis();
		Timestamp posttime = new Timestamp(millis);
//		DateTime posttime = new DateTime();


//		String posttime = posttime1.toString();

		PostBean result = new PostBean(name, mailadd, content, (posttime.toString()));

		request.setAttribute("post", result);

		PostDao.newPost(result);

		ArrayList<PostBean> allPost = PostDao.searchAllDao(postList);

		request.setAttribute("posts", allPost);

		String view = "/MainPage.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
