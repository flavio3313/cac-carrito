package cn.flavio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://bwyfvyfy4zvrv42zljz3-mysql.services.clever-cloud.com:3306/bwyfvyfy4zvrv42zljz3","ub1vmi1i5l4cvaev","rVzovaVIvhFb6wLoBi3V");
            System.out.print("connected");
        }
        return connection;
    }
}
