package model;

public class PokeSearch {
	private String Pokename;

    //引数をもつコンストラクタ
    public PokeSearch (String Pokename){
        this.Pokename = Pokename;
    }

    //getter  setter
    public String getPokename() {
		return Pokename;
	}

    public void setPokename(String pokename) {
		Pokename = pokename;
	}

}
