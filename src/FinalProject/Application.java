public class Application
{
	public static void main(String[] args) {
	    /*Figure out how to add the username, password, and points using javafx*/
	    String username;
	    String password;
	    int points;
		User u = new User(username, password, points);
		boolean verifier = u.verification(username, password);
		/*If login button clicked*/
		u.login();
		//If logout button clicked
		u.logout();
		//If there is an error then login error
		String loginerr=u.loginError(username,password);
	}
}
