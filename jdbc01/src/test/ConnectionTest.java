package test;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DBConnecter;

public class ConnectionTest {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnecter.getConnection();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
