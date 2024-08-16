package exception_handling;

public class VotingSystem {
	
	String vote (int age) throws InvalidAgeException { //checked  E
		if(age<18) {
			throw new InvalidAgeException ("You are not eligiable for voting");
				
			}
			return "You are eligiable for voting";
		}
		public static void main (String [] args) {
			VotingSystem obj  = new VotingSystem();
			try {
				System.out.println(obj.vote(25));
			}catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
	}


