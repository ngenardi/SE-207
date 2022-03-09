package edu.monmouth.se207.s1313642.BlogObserver;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void postNewArticle(BlogPost post);
}
