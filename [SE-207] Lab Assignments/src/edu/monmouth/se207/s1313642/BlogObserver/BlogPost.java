package edu.monmouth.se207.s1313642.BlogObserver;

public class BlogPost {
	private User poster;
	private String title;
	private String message;
	
	/**
	 * @param poster
	 * @param title
	 * @param message
	 */
	public BlogPost(User poster, String title, String message) {
		super();
		this.poster = poster;
		this.title = title;
		this.message = message;
	}

	/**
	 * @return the poster
	 */
	public User getPoster() {
		return poster;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "\""+title+"\"\n"
				+ message;
	}	
}