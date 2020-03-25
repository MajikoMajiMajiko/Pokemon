package servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PokemonDAO;
import model.PokeSearch;
import model.Pokemon;

/**
 * Servlet implementation class PokeMain
 */
@WebServlet("/PokeMainServlet")
public class PokeMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PokeMainServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		String name = request.getParameter("pokename");

		//データを持ってくる処理

		PokeSearch pokeSearch = new PokeSearch(name);
		PokemonDAO dao = new PokemonDAO();
		Pokemon result = dao.findData(pokeSearch);

		//データの有無で条件分岐
		if(result != null) {
			//リクエストスコープにデータを保存
			Pokemon pokemon = result;
			request.setAttribute("pokemon", pokemon);
			//ずかん画面へ遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/JSP/PicturebookResult.jsp");
		dispatcher.forward (request, response);
		} else {
			//エラー画面へ遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/JSP/PicturebookResultError.jsp");
		dispatcher.forward (request, response);
		}


	}

}
