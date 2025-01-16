/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Juet {
	private int age;
	private String name;

	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

}
public class GetterSetter
{
	public static void main(String[] args) {
		Juet student1 = new Juet();
		student1.setName("Jatin Sharma");
		student1.setAge(22);

		Juet student2 = new Juet();
		student2.setName("Anant Gupta");
		student2.setAge(20);

		System.out.println(student1.getName() + " " +  student1.getAge());
		System.out.println(student2.getName() + " " +  student2.getAge());
	}
}
