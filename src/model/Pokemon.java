package model;

import java.io.Serializable;

public class Pokemon implements Serializable{
	private String id;
	private String pokename;
	private String type;
	private double height;
	private double weight;
	private String characteristic;
	private String image;

	//引数なしのコンストラクタ
	public Pokemon() {}

	//引数をもつコンストラクタ
	public Pokemon(String id, String pokename,String type, double height,  double weight, String characteristic, String image) {
		this.id = id;
		this.pokename = pokename;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.characteristic = characteristic;
		this.image = image;
	}

	//getter  setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPokename() {
		return pokename;
	}

	public void setPokename(String pokename) {
		this.pokename = pokename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
