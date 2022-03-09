package edu.monmouth.se207.s1313642.BlogObserver;

import java.util.ArrayList;

public class LogPost implements NewPostAction {

	private ArrayList<BlogPost> posts = new ArrayList<>();

	@Override
	public void PerformAction(BlogPost post) {
		// TODO Auto-generated method stub
		posts.add(post);
		System.out.print("The following are the currently logged posts's titles: ");
		StringBuffer buffer = new StringBuffer();
		for (BlogPost p:posts) {
			buffer.append(p.getTitle() + ", ");
		}
		buffer.delete(buffer.length()-2, buffer.length());
		System.out.println(buffer + "\n");
	}
}
