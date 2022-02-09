package tests;

import model.User;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*User testUser = new User("mike", "my_passwd", "Mike", "Smith", "0771234567");
		
		System.out.println(testUser.toString());
		*/
		
		//Automated
		
		//1 - Setup and initialise test object/data
		String test_username = "mike";
		String test_password = "my_passwd";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "0771234567";
		
		//2 - Run object under test
		User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		//3 - Verify (Assert)
		
		Boolean passed = true;
		
		if(testUser.getUsername() != test_username) {
			System.out.println("TC1 Failed: Username did not match");
			passed = false;
		}
		
		if(testUser.getPassword() != test_password) {
			System.out.println("TC2 Failed: Password did not match");
			passed = false;
		}

	}

}
