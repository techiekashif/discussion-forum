package com.forum.units;

public class Reply extends AbstractEntity {

	//reply body
	private String message;
	//user who replied to the question
	private User user;
	//question for which user has replied
	private Question question;
	//id of the last reply posted on discussion forum
	private static Long lastEntry = 0L;

	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		setId(lastEntry);
	}
	
	public String getMessage() {		
		return this.message;
	}
	
	public void setMessage(String message) {		
		this.message = message;
	}
	
	public User getUser() {		
		return this.user;
	}
	
	public void setUser(User user) {		
		this.user = user;
	}
	
	public Question getQuestion() {
		return this.question;
	}
	
	public void setQuestion(Question question) {		
		this.question = question;
	}
}
