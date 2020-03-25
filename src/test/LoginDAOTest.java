package test;

import DAO.LoginDAO;
import model.Trainer;
import model.TrainerSearch;

public class LoginDAOTest {

	public static void main(String[] args) {
		testFindByLogin();
	}

	public static void testFindByLogin() {
		TrainerSearch trainerSearch = new TrainerSearch("サトシ", "pikachu");
		LoginDAO dao = new LoginDAO();
		Trainer result = dao.findByLogin(trainerSearch);

		//データが存在するかのテスト
		if(result != null &&
		result.getId().equals("No.001")  &&
		result.getTrainername().equals ("サトシ") &&
		result.getPassword().equals ("pikachu"))
		{
			System.out.println("データ見つかりました");

		} else {
			System.out.println("なんもないよ");
			}
		}

}
