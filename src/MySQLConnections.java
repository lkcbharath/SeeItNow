/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.List;


/**
 *
 * @author Bharath
 */
public class MySQLConnections {
    public static Connection getCon(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false","admin","admin123");
		}
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
		return con;
	}
    //views,sdldsa
}
