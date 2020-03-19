package model;

public class TrainerSearch {
    private String trainername;
    private String password;



    //引数をもつコンストラクタ
    public TrainerSearch (String trainername, String password) {
        this.trainername = trainername;
        this.password = password;
    }

  //getter setter
    public  String getTrainername() {
	return trainername;
}

    public void setTrainername(String trainername) {
	this.trainername = trainername;
}

    public String getPassword() {
	return password;
}

    public void setPassword(String pass) {
	this.password = pass;
}

}
