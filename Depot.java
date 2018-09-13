import java.util.ArrayList;

public class Depot {
	
	int x;
    int y;
    int capacity;
    int ID;
    double maxDistance = 0;
    public  ArrayList<Customers> customers = new ArrayList<>();
        public Depot(int ID,int x,int y,int capacity){
        this.x = x;
        this.y = y;
        this.capacity = capacity;
        this.ID = ID;
      //  this.DistanceS = DistanceS;

      }
}