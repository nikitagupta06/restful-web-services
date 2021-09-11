package com.learn.webservices.restfulwebservices.user;

public class Posts {

	private int postID;
	private String title;
	private String body;
	private User user;

	public Posts(int postID, String body, String title) {
		super();
		this.title = title;
		this.body = body;
		this.postID = postID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Posts [postID=" + postID + ", title=" + title + ", body=" + body + "]";
	}

}
