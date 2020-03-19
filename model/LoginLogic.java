package model;

import dao.LoginDAO;

public class LoginLogic {
	public boolean execute(TrainerSearch trainerSearch) {
		LoginDAO dao = new LoginDAO();
		Trainer trainer = dao.findByLogin(trainerSearch);
		return trainer !=null;
	}
}
