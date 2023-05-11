package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

public static void main(String[] args) {

	Connection conn = null;

	try {

		// JDBD Driver 등록

		Class.forName("oracle.jdbc.driver.OracleDriver");

		
		// 연결하기

		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
											"java",
											"12345");
		System.out.println("연결 성공");

	} catch (ClassNotFoundException e) {
		e.printStackTrace();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if(conn != null) {

			try {

				// 연결 끊기
				conn.close();
				System.out.println("연결 끊기");

			} catch (SQLException e2) {

			}

		}
	}

}


}