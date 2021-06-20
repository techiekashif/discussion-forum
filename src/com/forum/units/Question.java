package com.forum.units;

public class Question extends AbstractEntity {

	// brief description of question
	private String title;
	// detail question
	private String message;
	// user who asked the question
	private User user;
	// number of upvotes for the question.
	private int upvoteCount = 0;
	// id of the last question asked on discussion forum
	private static Long lastEntry = 0L;

	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		setId(lastEntry);
	}

	public String getTitle() {

		return this.title;
	}

	public void setTitle(String title) {

		this.title = title;
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

	public int getUpvoteCount() {
		return this.upvoteCount;
	}

	public void increaseUpvoteCount() {
		this.upvoteCount++;
	}

}
