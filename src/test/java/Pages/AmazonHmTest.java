package Pages;

public class AmazonHmTest extends AmazonHm{
	
	public void creds(String uname, String pwd) {
		System.out.println("To login Homepage");
	}

	public static void main(String[] args) {
		AmazonHmTest amazontest=new AmazonHmTest();
		amazontest.browserName("chrome");
		amazontest.url("http://www.amazon.in");
		
	

	}

}
