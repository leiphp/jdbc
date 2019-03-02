package cn.lxtkj.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DBUtil {
	private static final String URL="jdbc:mysql://127.0.0.1:3306/jdbc";
	private static final String USER="root";
	private static final String PASSWORD="root";
	
	private static Connection conn=null;
	
	static {
		try {
			//1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//2.获得数据库的连接
			 conn=(Connection) DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return conn;
	}
	public static void main(String[] args) throws Exception{
		//1.加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//2.获得数据库的连接
		Connection conn=(Connection) DriverManager.getConnection(URL, USER, PASSWORD);
		//3.操作数据库
		Statement stmt=(Statement) conn.createStatement();
		
		ResultSet rs= stmt.executeQuery("select user_name,age from imooc_goddess");
		
		while(rs.next()) {
			System.out.println(rs.getString("user_name")+","+rs.getInt("age"));
		}
	}
}
