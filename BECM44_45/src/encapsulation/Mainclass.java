package encapsulation;

//Model//Entity
class User extends Object 
{
	private long  uid;    
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
	
	@Override
	public String toString() 
	{
		String info = "name : "+name+" email : "+email+" Aadhar : "+aadhar;
		return info;
	}
	
	@Override
	public boolean equals(Object obj)
    {
		User us = (User)obj;
		
		if(us.aadhar == this.aadhar)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

//Service
class AccountService
{
	static User u1 = null;
	static User u2 = null;
	
	public static User createAccnt(String name,String email,String pwd,long aadhar)
	{
		long uid= 1229102;
		
		
		if(u1 == null)
		{
		  u1 = new User(uid, name, email, pwd, aadhar);
		   //save to db
			return u1;
		}
		else
		{
		  u2 = new User(uid, name, email, pwd, aadhar);
		  if(u1.equals(u2) == false)
		  {
		    //save to db
			System.out.println("user created");
			return u2;
		  }
		  else
		  {
			  IllegalArgumentException ie = new IllegalArgumentException("Aadhar already exists");
			  throw ie;
		  }
		}
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
	
	public static void showUserDetails()
	{
	  System.out.println(u1); 
	  System.out.println(u2); 
	}	
}
//FE
public class Mainclass 
{
	public static void main(String[] args) 
	{
      User u1 = AccountService.createAccnt("Arjun", "Arjun@gmail.com","1234", 12345677991l);
      User u2 = AccountService.createAccnt("Amith", "Amith@gmail.com","7162", 12345647991l);
      

      AccountService.showUserDetails();
     
	}
}





