import java.util.InputMismatchException;
import java.util.Scanner;

    public class LabSevenTakeTwo {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            
            Scanner scan1 = new Scanner(System.in);
            String choice = "yes";
            int userInput= 0;
            System.out.println("Welcome to our Java Class!");
            while (choice.equalsIgnoreCase("yes"))
            {
                
                String [][] studentInformation = {{"Harry Potter", "Thomas Riddle", "Pansy Parkinson", "Professor Quirrell", "Fluffy",  "Gilderoy Lockhart", "Hermione Granger", "Helga Hufflepuff", "Victor Krum", "Fleur DeClour", "Cedric Diggory", "Draco Malfoy", "Ron Weasley", "George Weasley", "Ginnie Weasley", "Percey Weaseley", "Bill Weasley", "Neville Longbottom", "Albus Dumbledore", "Professor McGonagall", "Professor Sprout", "Rubeus Hagrid", "Cho Chang",},
                        {"Harry", "Thomas", "Pansy", "Quirrell", "Fluffy", "Gildie", "Hermione", "Helga", "Victor", "Fleur", "Cedric", "Draco", "Ron", "George", "Ginnie", "Percey", "Bill", "Neville", "Albus", "McGonigall", "Sprout", "Rubeus", "Cho" }, {"Godric's Hollow, UK", "Little Hangelton, UK", "York, UK", "Who Knows", "Manchester, UK", "Duffworth, UK", "Exmoor, UK", "Little Whinging, UK", "Anytown, Romania", "Anytown France", "Glasgow, Scotland", "Chudly, UK", "Small Town, UK", "Small Town, UK", "Small Town, UK", "Small Town, UK", "Small Town, UK", "Bath, UK", "Aberdeen, UK", "Liverpool, UK", "Greentown, UK"},
                        {"Chocolate Frogs", "unicorn blood", "Butterbeer", "unicorn blood", "Hagrid's rock cakes", "Pumpkin pasties", "bouillabaise", "treacle tart", "acid pops", "bouillabaise", "butterbeer", "pollyjuice potion", "chocolate frogs", "Skiving Skivers", "chocolate frogs", "studying", "Hagrid Rock Cakes", "Chocolate Frogs", "Bertie Bots Every Flavor Beans", "Bouillabaisse", "Salad", "Fire whiskey", "treacle tart"}};
                
                
                try {
                System.out.println("Which student would you like to learn more about? (Enter a number from 0-20)");
                userInput = scan1.nextInt();
                        scan1.nextLine();
                        userInput = userInput-1;
                
                }
               
                
                catch (InputMismatchException e)
                {
                
                System.out.println("Error!  Please enter a number between 0 and 20");
                }    
                
            
                {System.out.println("Student " + userInput + " is " + studentInformation [0][userInput]);
                System.out.println("What would you like to know about " + studentInformation [1][userInput] + "? (Enter hometown or fav food)"); 
                
                String homeTownOrFavFood = scan1.nextLine();    
                
                
                    if (homeTownOrFavFood.equalsIgnoreCase("hometown"))
                            {
                        System.out.println(studentInformation[1][userInput] + " is from " + studentInformation[2][userInput] );
                        
                            }
                    else if (homeTownOrFavFood.equalsIgnoreCase("fav food"))
                    {
                        System.out.println(studentInformation [1][userInput] + "'s favorite food is " + studentInformation[3][userInput] + ".") ;
                    }
                }
                
                

            }
            
        }
    }
					
				
	
	
	
	
	
	
			
		
	
		
		

		


	


