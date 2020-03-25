package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.PokeRegister;

public class PokemonRegisterDAO {
    public boolean insertData(PokeRegister pokeregister) {

        Connection conn = null;

        try {

            //JDBCドライバ読み込み
            Class.forName("org.h2.Driver");

            //データベースに接続
            conn = DriverManager.getConnection("jdbc:h2:C:/database/pokemon", "sa", "");

            //INSERT文を準備
            String sql = "INSERT INTO POKEMON (ID, NAME, TYPE, HEIGHT, WEIGHT, CHARACTERISTIC, IMAGE) VALUES (?, ?, ?, ?, ?,?,?)";
            PreparedStatement pStmt = conn.prepareStatement(sql);

            //値をセット
            pStmt.setString(1, pokeregister.getId());
            pStmt.setString(2, pokeregister.getPokename());
            pStmt.setString(3, pokeregister.getType());
            pStmt.setDouble(4, pokeregister.getHeight());
            pStmt.setDouble(5, pokeregister.getWeight());
            pStmt.setString(6, pokeregister.getCharacteristic());
            pStmt.setString(7, pokeregister.getImage());

            //INSERT文を実行
            pStmt.executeUpdate();

            //Pokemonインスタンスに設定
  /*          while(rs.next()){
                String id = rs.getString("ID");
                String pokename = rs.getString("NAME");
                String type = rs.getString("TYPE");
                double height = rs.getDouble("HEIGHT");
                double weight = rs.getDouble("WEIGHT");
                String characteristic = rs.getString("CHARACTERISTIC");
                String image = rs.getString("IMAGE");

            //取得した値をPokemonインスタンスに格納
            pokemon = new Pokemon(id, pokename, type, height, weight, characteristic, image);
            } */
        }
         catch (SQLException e){
             e.printStackTrace();
             return false;
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
             return false;
         } finally {
             //データベース切断
             if(conn != null) {
                 try {
                     conn.close();
                 } catch (SQLException e){
                     e.printStackTrace();
                     return false;
                 }
             }
         }
        return true;
        }
}
