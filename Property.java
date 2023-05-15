import java.util.*;

interface Property
{
	double computePrice();
	void display();
}

class Bungalow implements Property
{
	int con_area;
	String name;
	
	
	
	public double computePrice ()
	{
		return 1100*con_area;
	}
	public void display ()
	{
		System.out.println("The Property name: "+name);
		System.out.println("The Property type: Bungalow");
		System.out.println("Contruction cost: "+computePrice());
	}
}

class Flat implements Property
{
	int con_area;
	String name;
	
	public double computePrice ()
	{
		return 500*con_area+200000;
	}
	
	public void display ()
	{
		System.out.println("The Property name: "+name);
		System.out.println("The Property type: Flat");
		System.out.println("Contruction cost: "+computePrice());
	}
}

class mainproperty
{
	public static void main (String args[])
	{
		int choose=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Property type:\n1.Bungalow\n2.Flat");
		choose= sc.nextInt();
		
		if(choose==1)
		{
			Bungalow obj = new Bungalow();
			System.out.print("Enter Property name: ");
			obj.name=sc.nextLine();
			System.out.print("Enter Property Contruction area: ");
			obj.con_area=sc.nextInt();
			
			obj.display ();
			
		}
		
		else
		{
			Flat obj = new Flat();
			System.out.print("Enter Property name: ");
			obj.name=sc.nextLine();
			System.out.print("Enter Property Contruction area: ");
			obj.con_area=sc.nextInt();
			
			obj.display ();
		}
	
	}
}
