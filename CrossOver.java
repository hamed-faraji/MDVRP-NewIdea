import java.util.ArrayList;

public class CrossOver {
	
	ArrayList<ArrayList<Index>> matrix = new ArrayList<ArrayList<Index>>();
	ArrayList<Customers> uniqueCustomers = new ArrayList<Customers>();
	
	public Chromosome[] crossover(Chromosome chr1 ,Chromosome chr2){
		Chromosome[] chr = new Chromosome[2];

		int random = (int) (Math.random() * chr1.chromosome.size());

			makeMatrix(chr1.chromosome.get(random).customers, chr2.chromosome.get(random).customers);
			Depot depot1 = combine(chr1.chromosome.get(random), chr2.chromosome.get(random));

			Depot depot2 = combine(chr1.chromosome.get(random), chr2.chromosome.get(random));

			while((check(depot1.customers, depot2.customers)))
				depot2 = combine(chr1.chromosome.get(random), chr2.chromosome.get(random));
		
	}
	public void makeMatrix(ArrayList<Customers> cus1, ArrayList<Customers> cus2){
		
	}
	public int find(ArrayList<Customers> cus2, Customers cus){
	
	}
	public Depot combine(Depot dp1, Depot dp2){
	
	}
	public Customers getNextCustomer(ArrayList<ArrayList<Index>> matrixTmp, ArrayList<Customers> uniqueCustomersTmp, Customers cus){
		
	}
	public ArrayList<ArrayList<Index>> deleteInMatrix(ArrayList<ArrayList<Index>> matrix, int id){
	
	}
	public ArrayList<ArrayList<Index>> copyMTmp (ArrayList<ArrayList<Index>> asl, ArrayList<ArrayList<Index>> fake){
	
	}
	public ArrayList<Customers> copyUTmp (ArrayList<Customers> asl, ArrayList<Customers> fake){
		for (int i = 0; i < asl.size(); i++) {

			fake.add(asl.get(i));

		}

		return fake;
	}
	public boolean check (ArrayList<Customers> cus1, ArrayList<Customers> cus2){
		boolean c = true;
		for (int i = 0; i < cus1.size(); i++) {

			if(!(cus1.get(i).ID == cus2.get(i).ID))
				c = false;

		}

		return c;
	
	}
}