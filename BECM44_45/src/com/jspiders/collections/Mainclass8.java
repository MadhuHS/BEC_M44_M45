package com.jspiders.collections;

import java.util.Iterator;
import java.util.TreeSet;

//Entity
 class Student implements Comparable<Student> {
	private Integer id;
	private String name;
	private String email;
	private String mob;

	public Student() {
		super();
	}

	public Student(String name, String email, String mob) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "name : " + name + " email : " + email + " mob : " + mob;
	}
	
	
  @Override
  public int hashCode() 
  {
  	int h1 = Integer.parseInt(mob);
  	return h1;
  }
  
	@Override
	public boolean equals(Object obj) 
	{
		Student s1 = (Student) obj;
		String s1Email = s1.getEmail();	
		String s2Email = this.getEmail();
		
		String s1Mob = s1.getMob();
		String s2Mob = this.getMob();

		
		if(s1Email.equalsIgnoreCase(s2Email) && s1Mob.equalsIgnoreCase(s2Mob))
		{
			return true;//if they are same
		}
		
		return false;//if they are diff
	}

	@Override
	public int compareTo(Student std)
	{
		String s1Name = std.getName();
		String s2Name = this.getName();
		
		String s1Mob = std.getMob();
		String s2Mob = this.getMob();
		
		String s1Email = std.getEmail();
		String s2Email = this.getEmail();
		
		int res;
		
		if(s1Email.equalsIgnoreCase(s2Email) || s1Mob.equalsIgnoreCase(s2Mob))
		{
			return 0;//reject
		}
		
		if(s1Name.equalsIgnoreCase(s2Name) == true)
		{
			res = s1Mob.compareTo(s2Mob);
		}
		else
		{
			res = s1Name.compareTo(s2Name);
		}
		
		return res;
	}

}

public class Mainclass8
{
	public static void main(String[] args)
	{
       //datatype arrayname = new datatype[size];
		
		//Create
		TreeSet<Student> ts1 = new TreeSet<Student>();
		
		Student s1 = new Student("aaa", "a@gmail.com", "1111");
		Student s2 = new Student("bbb", "b@gmail.com", "989878861");
		
		Student s3 = new Student("ddd", "a@gmail.com", "908766818");
		Student s4 = new Student("eee", "e@gmail.com", "1111");
		
		Student s5 = new Student("aaa", "ab@gmail.com", "89899877");
		
		ts1.add(s1);//accept
		ts1.add(s2);//accept
		ts1.add(s3);//rejected
		ts1.add(s4);//rejected
		ts1.add(s5);//accept
	
		
		Iterator<Student> i1 = ts1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}







