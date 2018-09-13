import java.util.ArrayList;

public class Customers {


		int x;
		int y;
		int Cost;
		boolean depot;
		int ID;
		public static ArrayList<Integer> DistanceS = new ArrayList<>();
		public Customers(int ID,int x,int y,int Cost,boolean depot){
			this.x = x;
			this.y = y;
			this.depot = depot;
			this.Cost = Cost;
			this.ID = ID;
		}
}