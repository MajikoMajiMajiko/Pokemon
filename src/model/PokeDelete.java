package model;

import java.io.Serializable;

public class PokeDelete implements Serializable {
	private String pokename;

	//引数をもたないコンストラクタ
	public  PokeDelete() {}

	//引数をもつコンストラクタ
	public  PokeDelete(String pokename) {
		this.pokename = pokename;
	}

	//getter setter
	public String getPokename() {
		return pokename;
	}

	public void setPokename(String pokename) {
		this.pokename = pokename;
	}
}
