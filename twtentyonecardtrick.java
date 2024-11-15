package mansurbarancirit;
import java.util.Scanner;
import java.util.*;

public class twtentyonecardtrick {

	public static void main(String[] args) {
	String[] wholedeck= {"A\u2663","K\u2663","Q\u2663","J\u2663","10\u2663","9\u2663","8\u2663","7\u2663","6\u2663","5\u2663","4\u2663","3\u2663","2\u2663",
						"A\u2660","K\u2660","Q\u2660","J\u2660","10\u2660","9\u2660","8\u2660","7\u2660","6\u2660","5\u2660","4\u2660","3\u2660","2\u2660",
						"A\u2666","K\u2666","Q\u2666","J\u2666","10\u2666","9\u2666","8\u2666","7\u2666","6\u2666","5\u2666","4\u2666","3\u2666","2\u2666",
						"A\u2665","K\u2665","Q\u2665","J\u2665","10\u2665","9\u2665","8\u2665","7\u2665","6\u2665","5\u2665","4\u2665","3\u2665","2\u2665"};
/*
 //Displaying wholedeck:	
 	for (int i=0; i<52;i++)
	{
		System.out.print(wholedeck[i]+" ");
		if(i==12||i==25||i==38)
			System.out.print("\n");
	}
	
	*/		
				ArrayList<String> twentyoneDeck1=new ArrayList<String>();
				ArrayList<String> twentyoneDeck2=new ArrayList<String>();
				ArrayList<String> twentyoneDeck3=new ArrayList<String>();
	
				List<String> shuffledDeck = Arrays.asList(wholedeck);
				Collections.shuffle(shuffledDeck);
				
				
				for (int a=0;a<21;a++)
				{
					twentyoneDeck1.add(a,shuffledDeck.get(a));
					
				}
				Scanner inp=new Scanner(System.in);
				
			/*	Random rand = new Random();
				int number=21;
				for (int i = 0; i <number; i++) 
				{
					
					int randomIndex = rand.nextInt(wholedeck.length);
					twentyoneDeck1[i]=wholedeck[randomIndex];
					
				}*/
				for(int i=0;i<21;i++)
				{
					System.out.print(twentyoneDeck1.get(i)+" ");
				}
				System.out.println("\nChoose a card with your eye (hit enter to continue)!");
				inp.nextLine();
				System.out.format(" %-9s%-10s%-14s\n","1","2","3");
				System.out.print("------------------------\n");
				for (int i=0; i<21; i++) 
				{
					System.out.format("%-10s",twentyoneDeck1.get(i));
					if (i==2 || i==5|| i==8|| i==11 || i==14
							|| i==17)
						System.out.print("\n");
					
				}
				System.out.println("\n\nNow choose which column your card is in: ");
				int choice1=inp.nextInt();
				int i=0;
				
				switch (choice1)
				{
				case 1:
					i=2;
					while (i<21)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
					}
					i=0;
					while (i<19)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z+7,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
					}
					i=1;
					while (i<20)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z+7+7,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
					}
					break;
				case 2:
					i=0;
					while (i<19)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z,twentyoneDeck1.get(i));
						
						i+=3;
						}
					
						
					}
					i=1;
					while (i<20)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z+7,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
					}
					i=2;
					while (i<21)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z+7+7,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
					}
					break;
				case 3:
					i=1;
					while (i<20)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
					}
					i=2;
					while (i<21)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z+7,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
						
					}
					i=0;
					while (i<19)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck2.add(z+7+7,twentyoneDeck1.get(i));
						
						i+=3;
						}
						
					}
					break;
				}
				System.out.format(" %-9s%-10s%-14s\n","1","2","3");
				System.out.print("------------------------\n");
				for (int a=0; a<21; a++) 
				{
					System.out.format("%-10s",twentyoneDeck2.get(a));
					if (a==2 || a==5|| a==8|| a==11 || a==14
							|| a==17)
						System.out.print("\n");
					
				}
				System.out.println("\n\nNow choose which column your card is in again: ");
				int choice2=inp.nextInt();
				
				switch (choice2)
				{
				case 1:
					i=2;
					while (i<21)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					i=0;
					while (i<19)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z+7,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					i=1;
					while (i<20)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z+7+7,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					break;
				case 2:
					i=0;
					while (i<19)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					i=1;
					while (i<20)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z+7,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					i=2;
					while (i<21)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z+7+7,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					break;
				case 3:
					i=1;
					while (i<20)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					i=2;
					while (i<21)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z+7,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
						
					}
					i=0;
					while (i<19)
					{
						for (int z=0; z<7;z++)
						{
							twentyoneDeck3.add(z+7+7,twentyoneDeck2.get(i));
						
						i+=3;
						}
						
					}
					break;
				}
				
				System.out.format(" %-9s%-10s%-14s\n","1","2","3");
				System.out.print("------------------------\n");
				for (int a=0; a<21; a++) 
				{
					System.out.format("%-10s",twentyoneDeck3.get(a));
					if (a==2 || a==5|| a==8|| a==11 || a==14
							|| a==17)
						System.out.print("\n");
					
				}
				System.out.println("\n\nNow choose which column your card is in one last time: ");
				int choice3=inp.nextInt();
				switch(choice3)
				{
				case 1:
					System.out.println("Your card was: "+twentyoneDeck3.get(9)+"!");
					break;
				case 2:
					System.out.println("Your card was: "+twentyoneDeck3.get(10)+"!");
					break;
				case 3:
					System.out.println("Your card was: "+twentyoneDeck3.get(11)+"!");
					break;
				}
				
	}

}
