package ma.ensa.exam;
import java.util.HashMap;
import java.util.Map;

import ma.ensa.exam.states.IssueFermee;
import ma.ensa.exam.states.IssueOuverte;
import ma.ensa.exam.states.IssueState;

public class SuperMarche {
	private int nombreDeRayon;
	
	//declare a map of issues
	private Map<String , Issue> issuesSecours;
	
	
	//test method ..
	public String selectIssueFrom(int n) {
		//min = the max distance possible 
		int min = this.nombreDeRayon + 1;
		//init by empty String to avoid NullPointerExceptions
		String minId="";
		for (String id : issuesSecours.keySet())
		{
			
			Issue issue = issuesSecours.get(id);
			// The 2st constraint test
			if(issue.distance(n)<min)
			{
				min = issue.distance(n);
				minId = issue.getId();
			}
			// The 3rd constraint test
			else if(issue.distance(n) == min)
			{
				if(minId != "")
				if(issue.getNombreDePersonne() < issuesSecours.get(minId).getNombreDePersonne())
				{
					min = issue.distance(n);
					minId = issue.getId();
				}
			}
		}
		return minId;
	}
	//Close the issue with id
	public void fermer(String id)
	{
		Issue issue = issuesSecours.get(id);
		issue.getIssueState().fermer();
	}
	//Open the issue with id 
	public void ouvrir(String id)
	{
		Issue issue = issuesSecours.get(id);
		issue.getIssueState().ouvrir();
	}
	
	public SuperMarche(int nombreDeRayon, String... issuses) {
		super();
		this.nombreDeRayon = nombreDeRayon;
		
		this.issuesSecours = new HashMap<>();
		
		for (String issuse : issuses)
		{
			//get the current issuse id
			String id = issuse.split(":")[0];
			//get the current issuse pos
			int rayonNbr = Integer.parseInt(issuse.split(":")[1]);;
			//init the number of persons by 0
			Issue issue = new Issue(id, rayonNbr, nombreDeRayon,0);
			//add the current issues to the map
			this.issuesSecours.put(id, issue);
		}
		
	}



	//G&S
	public int getNombreDeRayon() {
		return nombreDeRayon;
	}



	public void setNombreDeRayon(int nombreDeRayon) {
		this.nombreDeRayon = nombreDeRayon;
	}



	public Map<String, Issue> getIssuesSecours() {
		return issuesSecours;
	}



	public void setIssuesSecours(Map<String, Issue> issuses) {
		this.issuesSecours = issuses;
	}
	
	
	
}
