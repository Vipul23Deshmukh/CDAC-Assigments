
public class TeatTeam {
	public static void main(String[] args) {
		Player[] plst= {
				new Player(1,"Vipul","Batsman"),
				new Player(2,"Suyog","Baller"),
				new Player(3,"sumit","Allrounder")
				
		};
		Player c=new Player(11,"Sharma","Batsman");
		Team t1=new Team(100,"CSK",c,plst,3);
		System.out.println(t1);

	}
}
