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
			
			chr1.chromosome.remove(random);
			chr2.chromosome.remove(random);
			chr1.chromosome.add(random, depot1);
			chr1.chromosome.add(random, depot2);

			chr[0] = chr1;
			chr[1] = chr2;

		return chr;
		
	}
	public void makeMatrix(ArrayList<Customers> cus1, ArrayList<Customers> cus2){
		for (int i = 0; i < cus1.size(); i++) {

			ArrayList<Index> matrixRow = new ArrayList<Index>();
			uniqueCustomers.add(cus1.get(i));

			if(i == 0){
				matrixRow.add(new Index(cus1.get(cus1.size() - 1)));
				matrixRow.add(new Index(cus1.get(1)));
			}

			else if(i == cus1.size() - 1){
				matrixRow.add(new Index(cus1.get(cus1.size() - 2)));
				matrixRow.add(new Index(cus1.get(0)));
			}

			else {
				matrixRow.add(new Index(cus1.get(i - 1)));
				matrixRow.add(new Index(cus1.get(i + 1)));
			}

			int index = find(cus2, cus1.get(i));
			
			if(index != -1){

				if(index == 0){

					if(cus2.get(1).ID == matrixRow.get(0).cus.ID)
						matrixRow.get(0).plus = true;
					else if(cus2.get(1).ID == matrixRow.get(1).cus.ID)
						matrixRow.get(1).plus = true;
					else
						matrixRow.add(new Index(cus2.get(1)));

					if(cus2.get(cus2.size() - 1).ID == matrixRow.get(0).cus.ID)
						matrixRow.get(0).plus = true;
					else if(cus2.get(cus2.size() - 1).ID == matrixRow.get(1).cus.ID)
						matrixRow.get(1).plus = true;
					else
						matrixRow.add(new Index(cus2.get(cus2.size() - 1)));

				}

				else if(index == cus2.size() - 1){

					if(cus2.get(0).ID == matrixRow.get(0).cus.ID)
						matrixRow.get(0).plus = true;
					else if(cus2.get(0).ID == matrixRow.get(1).cus.ID)
						matrixRow.get(1).plus = true;
					else
						matrixRow.add(new Index(cus2.get(0)));

					if(cus2.get(index - 1).ID == matrixRow.get(0).cus.ID)
						matrixRow.get(0).plus = true;
					else if(cus2.get(index - 1).ID == matrixRow.get(1).cus.ID)
						matrixRow.get(1).plus = true;
					else
						matrixRow.add(new Index(cus2.get(index - 1)));

				}
				else{

					if(cus2.get(index - 1).ID == matrixRow.get(0).cus.ID)
						matrixRow.get(0).plus = true;
					else if(cus2.get(index - 1).ID == matrixRow.get(1).cus.ID)
						matrixRow.get(1).plus = true;
					else
						matrixRow.add(new Index(cus2.get(index - 1)));

					if(cus2.get(index + 1).ID == matrixRow.get(0).cus.ID)
						matrixRow.get(0).plus = true;
					else if(cus2.get(index + 1).ID == matrixRow.get(1).cus.ID)
						matrixRow.get(1).plus = true;
					else
						matrixRow.add(new Index(cus2.get(index + 1)));

				}

			}

			matrix.add(matrixRow);
		
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