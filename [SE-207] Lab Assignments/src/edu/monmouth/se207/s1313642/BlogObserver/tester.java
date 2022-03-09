package edu.monmouth.se207.s1313642.BlogObserver;

public class tester {
	
	public static void main(String[] args) {
		Blog randomBlog = new Blog();
		User countUser = new User("Counter@test", new CountPosts(), randomBlog);
		User logUser = new User("Logger@test", new LogPost(), randomBlog);
		User displayUser = new User("Displayer@test", new DisplayPost(), randomBlog);
		
		System.out.println("Count User Posting:");
		countUser.postBlog("Testing1", "Testing count user");
		
		System.out.println("Log User Posting:");
		logUser.postBlog("Testing2", "Testing log user");
		
		System.out.println("Display User Posting:");
		displayUser.postBlog("Testing3", "Testing display user");
	}
}