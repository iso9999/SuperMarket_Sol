package ma.ensa.exam.states;

import ma.ensa.exam.Issue;

public class IssueFermee extends IssueState {

	public IssueFermee(Issue issue) {
		super(issue);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void fermer() {
		System.out.println("deja fermée !");
	}

	//change the state of the current issue to Opened
	@Override
	public void ouvrir() {	
		issue.setIssueState(new IssueOuverte(issue));
	}
	//calculate the distance btwn the current issue and the position $curr 
	//In this case the issue is closed then, as a solution, I decide to return the max distance possible (NbrDeRayons() + 1)
	@Override
	public int distance(int curr) {
		return issue.getNbrDeRayons() + 1;
	}

}
