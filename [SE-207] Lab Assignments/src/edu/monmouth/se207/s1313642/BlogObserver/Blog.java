package edu.monmouth.se207.s1313642.BlogObserver;

import java.util.ArrayList;

public class Blog implements Subject {
	
	ArrayList<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		if (!observers.contains(o)) {
			observers.add(o);
		}
		else {
			System.err.println("Observer already registered.");
		}
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(observers.contains(o)) {
			observers.remove(o);
		}
		else {
			System.err.println("Observer not registered.");
		}
	}

	@Override
	public void postNewArticle(BlogPost post) {
		for (Observer o:observers) {
			if(!o.equals(post.getPoster())) {
				o.acceptBlog(post);
			}
		}
	}
}
