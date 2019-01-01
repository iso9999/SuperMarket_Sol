package ma.ensa.exam;

import ma.ensa.exam.states.IssueOuverte;
import ma.ensa.exam.states.IssueState;

public class Issue {
	//the issue id
	private String id;
	//the issue state
	private IssueState issueState;
	private int rayon;
	private int nbrDeRayons;
	private int nombreDePersonne;
	
	public int distance(int curr)
	{
		return issueState.distance(curr);
	}
	
	public Issue(String id, int rayon, int nbrDeRayons, int nombreDePersonne) {
		super();
		this.id = id;
		this.rayon = rayon;
		this.nbrDeRayons = nbrDeRayons;
		this.nombreDePersonne = nombreDePersonne;
		//init the issue state by Opened State
		this.issueState = new IssueOuverte(this);
	}


	public int getNombreDePersonne() {
		return nombreDePersonne;
	}


	public void setNombreDePersonne(int nombreDePersonne) {
		this.nombreDePersonne = nombreDePersonne;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public IssueState getIssueState() {
		return issueState;
	}


	public void setIssueState(IssueState issueState) {
		this.issueState = issueState;
	}


	public int getRayon() {
		return rayon;
	}


	public void setRayonAct(int rayon) {
		this.rayon = rayon;
	}


	public int getNbrDeRayons() {
		return nbrDeRayons;
	}


	public void setNbrDeRayons(int nbrDeRayons) {
		this.nbrDeRayons = nbrDeRayons;
	}
	
}
