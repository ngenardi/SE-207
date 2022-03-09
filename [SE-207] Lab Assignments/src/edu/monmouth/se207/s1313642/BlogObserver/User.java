package edu.monmouth.se207.s1313642.BlogObserver;

public class User implements Observer{

	private int numOfBlogsPosted = 0;
	private String uniqueID;
	private NewPostAction action;
	private Blog blog;

	User(String email, NewPostAction action, Blog blog){
		setUniqueID(email);	
		this.action = action;
		this.blog = blog;
		if (blog!=null) {
			blog.registerObserver(this);
		}
	}
	
	public void postBlog(String title, String message) {
		numOfBlogsPosted++;
		blog.postNewArticle(new BlogPost(this,title,message));
	}
	
	public void setUniqueID(String id){
		uniqueID = id;
	}
	
	public int getNumOfBlogsPosted() {
		return numOfBlogsPosted;
	}

	@Override
	public void acceptBlog(BlogPost post) {
		// TODO Auto-generated method stub
		action.PerformAction(post);
	}
}