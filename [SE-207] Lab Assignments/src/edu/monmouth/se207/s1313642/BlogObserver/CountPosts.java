package edu.monmouth.se207.s1313642.BlogObserver;

public class CountPosts implements NewPostAction {
	
	private int count = 0;
	
	@Override
	public void PerformAction(BlogPost post) {
		// TODO Auto-generated method stub
		count++;
		System.out.println("There are currently " + count + " unread posts.\n");
	}
}
