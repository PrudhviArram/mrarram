package edu.schedule;

public class AlienAttack {

	public static void main(String[] args) {int max=35;int min=1;
	int attackno=3;
	int damage;
	int totaldamage=0;
	do
	{
	damage=(int)(Math.random()*(max-min+1)+min);
	System.out.println("Alien Attack: "+ damage);
	totaldamage=totaldamage+damage;
	if(totaldamage> 0 && totaldamage<= 10)
	System.out.println("ship is lightly damage\n");
	else if(totaldamage>10 && totaldamage<=25)
	System.out.println("Ship is leaking air\n");
	else if (totaldamage>25 && totaldamage<=50)
	System.out.println("Ship is in Trouble\n");
	else if(totaldamage>50 && totaldamage<=75)
	System.out.println("Ship is badly damaged\n");
	else if (totaldamage>75 && totaldamage>=99)
	System.out.println("Ship is in critical Condition\n");
	else 
	System.out.println("ship has been destroyed\n");
	 attackno--;
	}while(attackno!=0);
	}
}


