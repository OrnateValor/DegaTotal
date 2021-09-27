package mini.dto;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	// variable
	private int postId;
	private String postThumb;
	private String postSub;
	private String content;
	private Date regDate;

	// constructor
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(HttpServletRequest request) {
		System.out.println("postSub : " + request.getParameter("postSub"));
		System.out.println("postThumb : " + request.getParameter("postThumb"));
		System.out.println("content : " + request.getParameter("content"));
		// .substring(12)
		if (request.getParameter("postId") != null) {
			setPostId(Integer.parseInt(request.getParameter("postId")));
		}
		setPostSub(request.getParameter("postSub"));
		setContent(request.getParameter("content"));

		// 이미지 세팅 처리
		if (request.getParameter("postThumb") != "") {
			setPostThumb(request.getParameter("postThumb"));
		} else {
			setPostThumb(request.getParameter("_postThumb"));
		}
	}

	// getter & setter
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostSub() {
		return postSub;
	}

	public void setPostSub(String postSub) {
		this.postSub = postSub;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getPostThumb() {
		return postThumb;
	}

	public void setPostThumb(String postThumb) {
		this.postThumb = postThumb;
	}

}
