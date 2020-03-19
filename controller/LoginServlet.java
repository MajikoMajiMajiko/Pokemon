package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.TrainerSearch;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//パラメータの取得
		request.setCharacterEncoding("UTF-8");  //文字コード指定
		String trainername = request.getParameter("name");
		String password = request.getParameter("pass");

		//ログイン処理
		TrainerSearch trainerSearch = new TrainerSearch(trainername, password);
		LoginLogic login = new LoginLogic();
		boolean result = login.execute(trainerSearch);

	//データの有無で条件分岐
		if(result) {
			//セッションスコープにデータを保存
			HttpSession session = request.getSession();
			session.setAttribute("trainername", trainername);
			//トップページへ遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/JSP/Picturebook.jsp");
		dispatcher.forward (request, response);
		} else {
			//エラー画面へ遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/JSP/LoginResultError.jsp");
		dispatcher.forward (request, response);
		}


	}

}


