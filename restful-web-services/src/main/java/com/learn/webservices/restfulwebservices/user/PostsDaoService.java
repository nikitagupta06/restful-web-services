package com.learn.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.List;

public class PostsDaoService {

	private static List<Posts> posts = new ArrayList<>();
	static {
		posts.add(new Posts(1, "Fruits", "Apple, Mango and Grapes"));
		posts.add(new Posts(2, "Cars", "Jaguar, BMW and Audi"));
		posts.add(new Posts(3, "Colours", "Red, Yellow and Green"));
	}

	public List<Posts> retreiveAllPosts(int userID) {
		return posts;

	}

	public Posts addPost(Posts post) {
		posts.add(post);
		return post;
	}

	public Posts retriveOnePost(int postID) {
		for (Posts post : posts) {
			if (post.getPostID() == postID) {
				return post;
			}
		}
		return null;
	}

}
