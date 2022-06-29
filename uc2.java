package workshop;

public class uc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var stake = 100;
		var bet = 1;	 
		
		double playgame = (double) Math.random();
		stake -= bet;

		if(playgame < 0.5) {
		System.out.println("loose the bet");
		stake -= bet;
		}	else {
			System.out.println("win the bet");
		stake += bet;
		}
		System.out.println("remaining stake = "+stake);
		
	}

}
