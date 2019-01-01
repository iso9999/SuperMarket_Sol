package ma.ensa.test;


import ma.ensa.exam.SuperMarche;

public class App {

	public static void main(String[] args) {
		int nombreDeRayon=10;
		SuperMarche supermarche = new SuperMarche(nombreDeRayon,"issu1:3","issu2:9");
		supermarche.getIssuesSecours().get("issu1").setNombreDePersonne(10);
		supermarche.getIssuesSecours().get("issu2").setNombreDePersonne(4);
		String issuId = supermarche.selectIssueFrom(6);
		System.out.println(issuId);
	}

}
			