package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.PokeSearch;
import model. Pokemon;

public class PokemonDAO {
/*	public List<Pokemon> findAll() {

		Connection conn = null;
		List<Pokemon> pokeList = new ArrayList<Pokemon>();

		try {

			//JDBCドライバ読み込み
			Class.forName("org.h2.Driver");

			//データベースに接続
			conn = DriverManager.getConnection("jdbc:h2:C:/database/test", "sa", "");

			//SELECT文を準備
			String sql = "SELECT ID, NAME, TYPE, HEIGHT, WEIGHT, CHARACTERISTIC FROM POKEMON";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SELECT文を実行し結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//Pokemonインスタンスに設定しArrayListインスタンスに追加
			while(rs.next()){
				int id = rs.getInt("ID");
				String pokename = rs.getString("NAME");
				String type = rs.getString("TYPE");
				double height = rs.getDouble("HEIGHT");
				double weight = rs.getDouble("WEIGHT");
				String characteristic = rs.getString("CHARACTERISTIC");

			//取得した値をPokemonインスタンスに格納
			Pokemon pokemon = new Pokemon(id, pokename, type, height, weight, characteristic);

			//ArrayListインスタンスにPokemonインスタンスを追加
			pokeList.add(pokemon);
			}
		}
		 catch (SQLException e){
			 e.printStackTrace();
			 return null;
		 } catch (ClassNotFoundException e) {
			 e.printStackTrace();
			 return null;
		 } finally {
			 //データベース切断
			 if(conn != null) {
				 try {
					 conn.close();
				 } catch (SQLException e){
					 e.printStackTrace();
					 return null;
				 }
			 }
		 }
		 return pokeList;
		}
*/
		public Pokemon findData(PokeSearch pokeSearch) {

			Connection conn = null;
			Pokemon pokemon= null;

			try {

				//JDBCドライバ読み込み
				Class.forName("org.h2.Driver");

				//データベースに接続
				conn = DriverManager.getConnection("jdbc:h2:C:/database/test", "sa", "");

				//SELECT文を準備
				String sql = "SELECT ID, NAME, TYPE, HEIGHT, WEIGHT, CHARACTERISTIC, IMAGE FROM POKEMONPOKE WHERE NAME = ?";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				pStmt.setString(1, pokeSearch.getPokename());

				//SELECT文を実行し結果表を取得
				ResultSet rs = pStmt.executeQuery();

				//Pokemonインスタンスに設定
				while(rs.next()){
					String id = rs.getString("ID");
					String pokename = rs.getString("NAME");
					String type = rs.getString("TYPE");
					double height = rs.getDouble("HEIGHT");
					double weight = rs.getDouble("WEIGHT");
					String characteristic = rs.getString("CHARACTERISTIC");
					String image = rs.getString("IMAGE");

				//取得した値をPokemonインスタンスに格納
				pokemon = new Pokemon(id, pokename, type, height, weight, characteristic, image);
				}
			}
			 catch (SQLException e){
				 e.printStackTrace();
				 return null;
			 } catch (ClassNotFoundException e) {
				 e.printStackTrace();
				 return null;
			 } finally {
				 //データベース切断
				 if(conn != null) {
					 try {
						 conn.close();
					 } catch (SQLException e){
						 e.printStackTrace();
						 return null;
					 }
				 }
			 }
			 return pokemon;
			}
	}

