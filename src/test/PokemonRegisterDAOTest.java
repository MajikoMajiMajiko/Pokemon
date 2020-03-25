package test;

import DAO.PokemonRegisterDAO;
import model.PokeRegister;

public class PokemonRegisterDAOTest {

	public static void main(String[] args) {
		testInsertData();

	}

	public static void testInsertData() {
		PokeRegister pokeRegister = new PokeRegister("No.007", "ゼニガメ", "みず", 0.5, 9.0, "げきりゅう", "C:¥Users¥majik¥Pictures¥Pokemon¥zenigame.png");
		PokemonRegisterDAO dao = new PokemonRegisterDAO();
		boolean insertResult = dao.insertData(pokeRegister);

		//登録成功したかのテスト
		if(insertResult == true) {
			System.out.println("せいこう");
		} else {
			System.out.println("しっぱい");
		}
	}

}
