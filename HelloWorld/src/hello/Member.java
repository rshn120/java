package hello;

public class Member {
	private String id;
	private String name;
	private String password;
	private int age;	

	
	public Member() {}
	public Member(String id, String name, String password, int age) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
	}
	public Member(String name, String id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}



