package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.PokeDelete;

public class PokemonDeleteDAO {
    public boolean deleteData(PokeDelete pokedelete) {

        Connection conn = null;

        try {

            //JDBCドライバ読み込み
            Class.forName("org.h2.Driver");

            //データベースに接続
            conn = DriverManager.getConnection("jdbc:h2:C:/database/pokemon", "sa", "");

            //DELETE文を準備
            String sql = "DELETE FROM POKEMON WHERE NAME = ?";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, pokedelete.getPokename());

            //DELETE文を実行
            pStmt.executeUpdate();

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
