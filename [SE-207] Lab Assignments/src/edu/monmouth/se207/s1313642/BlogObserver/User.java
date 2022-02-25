package edu.monmouth.se207.s1313642.BlogObserver;

public class User implements Observer{

	private int blogsPosted = 0;
	private String uniqueID;
	NewPostAction action;

	User(String email, NewPostAction action){
		setUniqueID(email);	
		this.action = action;
	}
	
	public void increaseBlogsPosted() {
		blogsPosted++;
	}
	
	public void setUniqueID(String id){
		uniqueID = id;
	}

	@Override
	public void acceptBlog() {
		// TODO Auto-generated method stub
		
	}

}