package ma.ensa.exam.states;

import ma.ensa.exam.Issue;

public class IssueOuverte extends IssueState {

	public IssueOuverte(Issue issue) {
		super(issue);
		// TODO Auto-generated constructor stub
	}
	//change the state of the current issue to Closed
	@Override
	public void fermer() {
		issue.setIssueState(new IssueFermee(issue));
	}

	@Override
	public void ouvrir() {
		System.out.println("deja ouverte !");
	}

	//Calculate the distance btwn the current issue and the position $curr using abd()
	@Override
	public int distance(int curr) {
		return Math.abs(curr - issue.getRayon());
	}

}
