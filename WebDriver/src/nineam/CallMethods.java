package nineam;

public class CallMethods {

	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com");
		m.elementPresent("email", true);
		m.elementPresent("pass", false);
		m.elementPresent("day", true);
		m.elementPresent("month", false);
		m.closeApp();
		m.launchApp("https://mail.rediff.com/cgi-bin/login.cgi");
		m.elementPresent("login1", true);
		m.elementPresent("password", false);
		m.closeApp();

		

	}

}
