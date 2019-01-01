package ma.ensa.exam.states;

import ma.ensa.exam.Issue;

public abstract class IssueState {
	protected Issue issue;
	public IssueState(Issue issue) {
		super();
		this.issue = issue;
	}
	//open the current issue
	public abstract void ouvrir();
	//close the current issue
	public abstract void fermer();
	//calculate the distance btwn the current issue and the position $curr
	public abstract int distance(int curr);
}
