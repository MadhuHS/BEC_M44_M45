package encapsulation;

//Model
class User
{
	private long   uid;    
	String name;   //write/read
	private String email;  //write/read
	private String pwd;    //write
	private long   aadhar; //read
	
	public User(long uid,String name, String email, String pwd, long aadhar) 
	{
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.aadhar = aadhar;
	}
	
	public void setPwd(String pwd)//write//update
	{
		this.pwd = pwd;
	}
	
	public String getEmail()//read
	{
		return this.email;
	}
	
	public void setEmail(String email)//write//update
	{
		this.email = email;
	}
	
	public long getAdhar()//write//update
	{
		return this.aadhar;
	}
}

//Service
class AccountService
{
	static User u1;
	public static User createAccnt(String name,String email,String pwd,long aadhar)
	{
		long uid= 1229102;
		 u1 = new User(uid, name, email, pwd, aadhar);
		//save to db
		return u1;
	}
	
	public static void updatePwd(String newPwd)
	{
	   u1.setPwd(newPwd);	
	   System.out.println("password updated");
	}
	
	public static void updateEmail(String newEmail)
	{
	   u1.setEmail(newEmail);	
	   System.out.println("email-id updated");
	}
	
	public static void showEmail()
	{
	  System.out.println(u1.getEmail());
	}
	
	public static void showAadhar()
	{
	  System.out.println(u1.getAdhar());
	}
}


//FE
public class Mainclass 
{
	public static void main(String[] args) 
	{
      User u1 = AccountService.createAccnt("Arjun", "Arjun@gmail.com","1234", 12345677991l);
      AccountService.updatePwd("1234567");
      AccountService.showAadhar();
     
	}
}





