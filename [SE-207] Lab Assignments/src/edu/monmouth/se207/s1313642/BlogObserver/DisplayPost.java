package edu.monmouth.se207.s1313642.BlogObserver;

public class DisplayPost implements NewPostAction {
	BlogPost post = null;

	@Override
	public void PerformAction(BlogPost post) {
		// TODO Auto-generated method stub
		System.out.println("This is the last unread post: \n" + post + "\n");
		post = null;
	}
}
