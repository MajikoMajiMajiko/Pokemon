package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PokemonRegisterDAO;
import model.PokeRegister;

/**
 * Servlet implementation class PokemonRegisterServlet
 */
@WebServlet("/PokemonRegisterServlet")
public class PokemonRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PokemonRegisterServlet() {
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
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String  height = request.getParameter("height");
		String weight = request.getParameter("weight");
		String  characteristic = request.getParameter("characteristic");
		String  image = request.getParameter("image");

		//データを登録する処理
		PokeRegister pokeRegister = new PokeRegister(id, name, type, Double.parseDouble(height), Double.parseDouble(weight), characteristic, image);
		PokemonRegisterDAO dao = new PokemonRegisterDAO();
		boolean insertResult = dao.insertData(pokeRegister);

		//insertResultの中身によって処理を分岐
		if(insertResult == true) {
			//登録成功画面へ遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/RegisterSccess.jsp");
		dispatcher.forward (request, response);
		} else {
			//登録失敗画面へ遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/RegisterFailed.jsp");
		dispatcher.forward (request, response);
		}



	}

}
