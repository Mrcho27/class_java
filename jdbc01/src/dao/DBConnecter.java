package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {

	public static Connection getConnection() {
		Connection conn = null;

		String userName = "hr";
		String password = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			// 드라이버 로드 (오라클 드라이버 클래스 사용준비를 한다.)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 커넥션 객체를 드라이버 매니저를 통해 얻어온다.
			conn = DriverManager.getConnection(url, userName, password);
			
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 오류!");
			e.printStackTrace();
		}

		return conn;
	}

}






















