package edu.monmouth.se207.s1313642.BlogObserver;

import java.util.ArrayList;
import java.util.Objects;

public class LogMessage implements NewPostAction {
	
	ArrayList<BlogPost> posts = new ArrayList<>();
	
	@Override
	public void PerformAction(BlogPost post) {
		// TODO Auto-generated method stub
		posts.add(post);
	}

}
