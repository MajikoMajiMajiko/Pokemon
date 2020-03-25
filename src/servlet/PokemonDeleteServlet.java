package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PokemonDeleteDAO;
import model.PokeDelete;

/**
 * Servlet implementation class PokemonDeleteServlet
 */
@WebServlet("/PokemonDeleteServlet")
public class PokemonDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PokemonDeleteServlet() {
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
		String pokename = request.getParameter("name");

		//データの削除処理
		PokeDelete pokeDelete = new PokeDelete(pokename);
		PokemonDeleteDAO dao = new PokemonDeleteDAO();
		boolean deleteResult = dao.deleteData(pokeDelete);

		//deleteResultの中身によって処理を分岐
		if(deleteResult) {
			//成功画面へ遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/PokemonDeleteSccess.jsp");
		dispatcher.forward (request, response);
		} else {
			//失敗画面へ遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/PokemonDeleteFailed.jsp");
		dispatcher.forward (request, response);
		}
	}

}
