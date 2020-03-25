package test;

import DAO.PokemonDAO;
import model.PokeSearch;
import model.Pokemon;

public class PokemonDAOTest {

	public static void main(String[] args) {
		testFindData();
	}

	public static void testFindData() {
		PokeSearch pokeSearch = new PokeSearch("フシギダネ");
		PokemonDAO dao = new PokemonDAO();
		Pokemon result = dao.findData(pokeSearch);

		//データが存在するかのテスト
		if(result != null &&
		result.getId().equals("No.001")  &&
		result.getPokename().equals ("フシギダネ") &&
		result.getType().equals ("くさ・どく") &&
		result.getHeight() == 0.7 &&
		result.getWeight() == 6.9 &&
		result.getCharacteristic().equals ("しんりょく") &&
		result.getImage().equals ("C:\\Users\\majik\\Pictures\\Pokemon\\hushigidane"))
		{
			System.out.println("データ見つかりました");

		} else {
			System.out.println("なんもないよ");
			}
		}
	}


