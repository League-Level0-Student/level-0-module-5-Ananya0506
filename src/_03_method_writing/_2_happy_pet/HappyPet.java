package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
    String pet = JOptionPane.showInputDialog("what pet do you want to buy? dog; cat; hamster; horse; parrot");
    		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int i = 0; i<10; i++) {
    
    int task = JOptionPane.showOptionDialog(null, "What task do you want to do for your " + pet, "Task for" + pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "groom" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
if (pet.equalsIgnoreCase("dog")) {
	dog();
} else if (pet.equalsIgnoreCase("cat")) {
	cat();
} else if (pet.equalsIgnoreCase("horse")) {
	horse();
} else if (pet.equalsIgnoreCase("hamster")) {
	hamster();
} else if (pet.equalsIgnoreCase("parrot")) {
	parrot();
}

}
			JOptionPane.showMessageDialog(null,"great job! you have finished the game! your pet's happiness level is " +  happinessLevel + "! have a nice day!" );
System.exit(0);

// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

 public static void dog() {
	 JOptionPane.showMessageDialog(null,"your dog is happy. bark!");
	 happinessLevel++;
	}
 public static void cat() {
	 JOptionPane.showMessageDialog(null,"your cat is happy. purr!");
	 happinessLevel++;
	}
 public static void horse() {
	 JOptionPane.showMessageDialog(null,"your horse is happy. neigh!");
	 happinessLevel++;
	}
 public static void hamster() {
	 JOptionPane.showMessageDialog(null,"your hamster is happy. squeak!");
	 happinessLevel++;
	}
 public static void parrot() {
	 JOptionPane.showMessageDialog(null,"your parrot is happy. squawk!");
	 happinessLevel++;
	}









}












