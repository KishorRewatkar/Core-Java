package containment;

class Author{
	
	String authorName;
	int age;
	String place;
	
	public Author(String authorName, int age, String place) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
class book{
	String name;
	int price;
	String author;
	Author a=new Author("kishor", 13, "sitaburdi");
	
	public book(String name, int price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		
	}
	public void ShowDetails()
	{
		System.out.println(name+" "+price+" "+author);
	}
	
}
public class Hw1Main {

	public static void main(String[] args) {
		
		book b=new book("kishor", 312, "hellow");
		b.ShowDetails();
	}
}
