package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Trainer;
import model.TrainerSearch;

public class LoginDAO {
    public Trainer findByLogin(TrainerSearch trainerSearch) {

        Connection conn = null;
        Trainer trainer= null;

        try {

            //JDBCドライバ読み込み
            Class.forName("org.h2.Driver");

            //データベースに接続
            conn = DriverManager.getConnection("jdbc:h2:C:/database/pokemon", "sa", "");

            //SELECT文を準備
            String sql = "SELECT ID, NAME, PASS FROM TRAINER WHERE NAME = ? AND PASS =?";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, trainerSearch.getTrainername());
            pStmt.setString(2, trainerSearch.getPassword());

            //SELECT文を実行し結果表を取得
            ResultSet rs = pStmt.executeQuery();

            //Trainerインスタンスに設定
            while(rs.next()){
                String id = rs.getString("ID");
                String trainername = rs.getString("NAME");
                String password = rs.getString("PASS");

            //取得した値をTrainerインスタンスに格納
            trainer = new Trainer(id, trainername, password);
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
         return trainer;
        }
}
