package model;

import DAO.LoginDAO;

public class LoginLogic {
	public boolean execute(TrainerSearch trainerSearch) {
		LoginDAO dao = new LoginDAO();
		Trainer trainer = dao.findByLogin(trainerSearch);
		return trainer !=null;
	}
}
