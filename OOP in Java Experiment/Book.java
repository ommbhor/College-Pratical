

public class Book {
	int id;
	String name;
	double price;

	public Book(int i,String n,double p) {
		id=i;
		name=n;
		price=p;
		
	}
	public void displaybook() {
		System.out.println("Book id:"+id);
		System.out.println("Book name:"+name);
		System.out.println("Book price:"+price);
		
	}

	public static void main(String[] args) {
		Book b1=new Book(2,"pic",200);
		Book b2=new Book(3,"oops",450);
		System.out.println("Book 1:");
		b1.displaybook();
		System.out.println("Book 2:");
		b2.displaybook();
		
		
		

	}

}
