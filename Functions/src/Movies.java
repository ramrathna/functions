import java.util.ArrayList;
import java.util.function.Predicate;

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
public class Movies {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(001, "Naveen", 21));
		al.add(new Student(002, "Prasad", 13));
		al.add(new Student(003, "Kumar", 18));
		al.add(new Student(004, "Raja", 24));
		al.add(new Student(005, "Rani", 22));
		Predicate<Student> p1 = i -> (i.age >= 18);
		// System.out.println("Allowed to watch movie");
		Predicate<Student> p2 = e -> (e.age < 18);
		// System.out.println("NotAllowed to watch movie");
		for (Student s : al) {
			if (p1.test(s)) {

				System.out.println("Student Age is :" + s.age + " " + "Student Name is:" + s.name);
				System.out.println("Allowed to watch movie:");
				System.out.println(" ");
			}

			else if (p2.test(s)) {

				System.out.println("Student Age is :" + s.age + " " + "Student Name is:" + s.name);
				System.out.println("notAllowed to watch movie:");
				System.out.println("  ");
			}

		}
	}
}


