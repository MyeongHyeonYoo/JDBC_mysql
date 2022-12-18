package ch20.mysql.sec09.exam01;

import lombok.Data;

@Data 	// Constructor, Getter, Setter, hashCode(), equals(), toString() 자동생성
public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
	
//	public User(String userId, String userName, String userPassword, int userAge, String userEmail) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		this.userPassword = userPassword;
//		this.userAge = userAge;
//		this.userEmail = userEmail;
//	}
//	private int userAge;
//	private String userEmail;
//	
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getUserPassword() {
//		return userPassword;
//	}
//	public void setUserPassword(String userPassword) {
//		this.userPassword = userPassword;
//	}
//	public int getUserAge() {
//		return userAge;
//	}
//	public void setUserAge(int userAge) {
//		this.userAge = userAge;
//	}
//	public String getUserEmail() {
//		return userEmail;
//	}
//	public void setUserEmail(String userEmail) {
//		this.userEmail = userEmail;
//	}
//	public String toString() {
//		return userEmail.toString();
//	}
}
