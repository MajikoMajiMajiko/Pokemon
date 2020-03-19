package model;

import java.io.Serializable;

public class Trainer implements Serializable{
    private String id;
    private String trainername;
    private String password;

    //コンストラクタ
    public  Trainer() {}

    //引数をもつコンストラクタ
    public Trainer(String id, String trainername, String password) {
	    this.id = id;
	    this.trainername = trainername;
	    this.password = password;
    }

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTrainername() {
	return trainername;
}
public void setTrainername(String trainername) {
	this.trainername = trainername;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
