package demo.srammy.springbootwithtoken.vo;


import demo.srammy.springbootwithtoken.model.User;

public class ResponseUserToken {
	private String token;
	private User userDetail;

	public ResponseUserToken(String token, User userDetail){
		this.token = token;
		this.userDetail = userDetail;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(User userDetail) {
		this.userDetail = userDetail;
	}
}
