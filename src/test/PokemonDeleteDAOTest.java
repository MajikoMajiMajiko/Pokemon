package test;

import DAO.PokemonDeleteDAO;
import model.PokeDelete;

public class PokemonDeleteDAOTest {

	public static void main(String[] args) {
		testDeleteData();

	}

	public static void testDeleteData() {
		PokeDelete pokeDelete = new PokeDelete("ゼニガメ");
		PokemonDeleteDAO dao = new PokemonDeleteDAO();
		boolean deleteResult = dao.deleteData(pokeDelete);

		//deleteResultの結果によって処理を分岐
		if(deleteResult) {
			System.out.println("せいこう");
		} else {
			System.out.println("しっぱい");
		}


	}

}
