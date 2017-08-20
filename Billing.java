import java.util.*;
public class Billing
{ 
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm =new HashMap<Integer,String> ();
		hm.put(1,"APPLE");
		hm.put(2,"BANANA");
		hm.put(3,"CASHEW NUT");
		hm.put(4,"DATES");
		hm.put(5,"PINEAPPLE");
		System.out.println("PRODUCT_ID \t" +"PRODUCT_NAME"); //heading
		Set s = hm.entrySet();  // Converting Map into set for iteration
		Iterator itr = s.iterator(); 
		while(itr.hasNext())
		{
			Map.Entry me =(Map.Entry)itr.next(); // Converting into Map.Entry to get keys and values separat
			System.out.println("\t" +me.getKey() +"\t" +me.getValue());
		}

		HashMap<Integer,String> hm1 =new HashMap<Integer,String> ();
		hm1.put(1,"100");
		hm1.put(2,"50");
		hm1.put(3,"250");
		hm1.put(4,"300");
		hm1.put(5,"120");
		
		float p=0;                                    // initialization
		String m;
		String str = new String("Y");
		HashMap<String,Float> hm2 = new HashMap<String,Float>();    //Creating object of hashmap for storing id
		float quantity;
		do
		{
			System.out.println("ENTER THE CORRESPONDING PRODUCT_ID TO AVAIL PRODUCT ");
			Scanner id_input = new Scanner(System.in);
			int id = id_input.nextInt();

			System.out.println("YOU HAVE SELECTED PRODUCT_ID AS " +id +" AND CORRESPONDING PRODUCT DETAILS ARE AS FOLLOWS");
			System.out.println("PRODUCT_NAME = " +hm.get(id));
			System.out.println("PRODUCT_PRICE = " +hm1.get(id)+"/kg");

			System.out.println("ENTER THE QUANTITY REQUIRED FOR THIS PRODUCT");
			Scanner qua_input=new Scanner(System.in);
			quantity = qua_input.nextFloat();
			float price_each=Float.parseFloat(hm1.get(id));
			float price = price_each*quantity;
			System.out.println("YOU HAVE ENTERED QUANTITY AS " +quantity +"kg AND TOTAL PRICE is " +price+"Rs");
			System.out.println("----------------------------------------------------------------------------------------");
						
			hm2.put(hm.get(id),price);
			
			System.out.println("DO YOU WANT TO BUY ANY OTHER PRODUCT(Y/N)?");
			Scanner quest=new Scanner(System.in);
			m = quest.nextLine();
			float total_price = p+price;
			p=total_price;
	        }while(m.equals(str));
		System.out.println("\n \nTHE BILL FOR YOUR SHOPPING");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("PRODUCT_NAME\t" +" PRICE ");
		System.out.println("----------------------------------------------------------------------------------------");
		Set s2=hm2.entrySet();
		Iterator itr2 = s2.iterator();
		while(itr2.hasNext())
		{
			Map.Entry me2 = (Map.Entry)itr2.next();
			System.out.format("%-15s %.2f\n" ,me2.getKey(),me2.getValue()); //format specifier like in c program
		}
                System.out.println("\nPAY THE AMOUNT OF Rs " +p);
		
	} 
}		
