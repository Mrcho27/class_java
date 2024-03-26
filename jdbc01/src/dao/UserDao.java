package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.UserDto;

public class UserDao {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	아이디 중복검사
	public boolean checkId(String loginId) {
		String query = "SELECT USER_ID FROM TBL_USER WHERE LOGIN_ID = ?";

		try {
			// 우리가 만든 DBConnecter에서 커넥션 객체를 얻어온다.(DB와 연결 완료)
			connection = DBConnecter.getConnection();

			// 쿼리를 날리기위한 preparedStatement 객체를 커넥션 객체에서 가져온다.
			preparedStatement = connection.prepareStatement(query);

			// 우리가 문자열로 작성한 쿼리는 preparedStatement에 들어가서 sql명령어로 사용된다.
			// 하지만 쿼리에 ?가 있다.(미완성된 상태)
			// ?를 매개변수로 받은 loginId로 바꿔야한다.
			// preparedStatement의 기능으로 완성시켜준다.
			// set자료형(물음표의 순서, 넣을 값);
			preparedStatement.setString(1, loginId);

			// 완성된 쿼리를 실행시키는 방법
			// 1. executeQuery()
			// SELECT 할 때 반환되는 결과 값을 받기위해 사용
			// 2. executeUpdate()
			// SELECT를 제외하고 반환되는 값이 없으면 사용

			// executeQuery()의 반환 타입은 ResultSet이다.
			resultSet = preparedStatement.executeQuery();

			// resultSet은 쿼리의 결과(테이블)를 저장하고 있다.
			// 각 데이터에 접근하는 방식은 Iterator와 동일하게 커서를 사용한다.
			// next() : 현재 커서 다음에 데이터가 존재하는지를 true/false로 반환,커서를 다음 행으로 이동
			// get자료형(칼럼번호) : 커서의 현재 위치에서 해당 칼럼의 값을 자료형에 맞게 가져온다.

			if (resultSet.next()) {
				return false;
			}
			
			
		} catch (SQLException e) {
			System.out.println("checkId() SQL 오류!!");
			e.printStackTrace();
		}finally {
//			jdbc에서 제공하는 객체들은 사용 후 닫아줘야 한다.
//			오류 여부와 상관없이 반드시 닫아야하므로 finally에 작성한다.
//			닫을 때는 여는 순서와 반대로 닫는다.
			
			try {
				
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

		return true;
	}

//	회원가입
	public void join(UserDto userDto) {
		String query = "INSERT INTO TBL_USER(USER_ID, LOGIN_ID, PASSWORD, NAME, AGE, GENDER, BIRTH)"
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?)";
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userDto.getLoginId());
			preparedStatement.setString(2, userDto.getPassword());
			preparedStatement.setString(3, userDto.getName());
			preparedStatement.setInt(4, userDto.getAge());
			preparedStatement.setString(5, userDto.getGender());
			preparedStatement.setString(6, userDto.getBirth());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("join() SQL오류!!");
			e.printStackTrace();
		} finally {
			try {
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
//	로그인
	public int login(String loginId, String password) {
		String query = "SELECT USER_ID FROM TBL_USER"
				+ " WHERE LOGIN_ID = ? AND PASSWORD = ?";
		int userId = -1;
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, password);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userId = resultSet.getInt(1);
			}
			
		} catch (SQLException e) {
			System.out.println("login() SQL오류!!");
			e.printStackTrace();
		}finally {
			
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return userId;
	}
	
//	아이디 찾기(이름과 생일로 찾기, 결과가 2개 이상일 수 있다.)
	public List<String> findLoginId(String name, String birth){
		String query = """
				SELECT LOGIN_ID FROM TBL_USER
				WHERE NAME = ? AND BIRTH = ?
				""";
		String loginId = null;
		List<String> loginIdList = new ArrayList<String>();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, birth);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				loginId = resultSet.getString(1);
				loginIdList.add(loginId);
			}
			
			
		} catch (SQLException e) {
			System.out.println("findLoginId() SQL 오류!!");
			e.printStackTrace();
		} finally {
			
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		return loginIdList;
		
	}
	
//	회원 전체 정보 수정
	public void update(UserDto userDto) {
		String query = """
				UPDATE TBL_USER
				SET LOGIN_ID=?, PASSWORD=?, NAME=?, AGE=?, GENDER=?, BIRTH=?
				WHERE USER_ID=?
				""";
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userDto.getLoginId());
			preparedStatement.setString(2, userDto.getPassword());
			preparedStatement.setString(3, userDto.getName());
			preparedStatement.setInt(4, userDto.getAge());
			preparedStatement.setString(5, userDto.getGender());
			preparedStatement.setString(6, userDto.getBirth());
			preparedStatement.setInt(7, userDto.getUserId());
			preparedStatement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			System.out.println("update() SQL 오류!!");
			e.printStackTrace();
		} finally {
			try {
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
//	회원 1명 전체 정보 조회
	public UserDto findById(int userId) {
//		가능하면 *을 사용하지 않는다. (명시해야 순서보기 좋다.)
		String query = """
				SELECT USER_ID, LOGIN_ID, PASSWORD, NAME, AGE, GENDER, 
				TO_CHAR(BIRTH, 'YYYY-MM-DD')
				FROM TBL_USER
				WHERE USER_ID = ?
				""";
		UserDto userDto = null;
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userDto = new UserDto();
				
				userDto.setUserId(userId);
				userDto.setLoginId(resultSet.getString(2));
				userDto.setPassword(resultSet.getString(3));
				userDto.setName(resultSet.getString(4));
				userDto.setAge(resultSet.getInt(5));
				userDto.setGender(resultSet.getString(6));
				userDto.setBirth(resultSet.getString(7));

			}
			
		} catch (SQLException e) {
			System.out.println("findById() SQL 오류!!!");
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return userDto;
	
	}
	
//	회원 탈퇴
	public boolean delete(int userId) {
		String query = """
				DELETE FROM TBL_USER
				WHERE USER_ID = ?
				""";
		
		int updatedRows = 0;
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, userId);
			updatedRows = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete() SQL오류!!");
			e.printStackTrace();
		}finally {
			try {
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return updatedRows > 0 ;
		
	}
	
	
}






















