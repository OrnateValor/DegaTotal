package mini.dto;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	private int cmtNum;
	private String userId;
	private String userNm;
	private String userCmt;
	private String postId;
	private Date regDate;

	public Comment() {
		
	}

	public Comment(HttpServletRequest request) {
		setUserId(request.getParameter("userId"));
		setUserNm(request.getParameter("userNm"));
		setUserCmt(request.getParameter("userCmt"));
		setPostId(request.getParameter("postId"));
	}

	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String getUserNm() {
		return userNm;
	}
	
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	
	public int getCmtNum() {
		return cmtNum;
	}

	public void setCmtNum(int cmtNum) {
		this.cmtNum = cmtNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserCmt() {
		return userCmt;
	}

	public void setUserCmt(String userCmt) {
		this.userCmt = userCmt;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

}
