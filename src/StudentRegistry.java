import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentRegistry {

	public static void main(String[] args) {
		Map<String, String> students = new HashMap<String, String>();

		students.put("prkr", "Peter Porker");
		students.put("23A52", "Harvey Dent");
		students.put("68Z29", "Jessica Jones");
		students.put("57W85", "J Jonah Jameson");

		System.out.println("The students are " + students);

		String studentName = students.get("23A52");
		System.out.println("Found the student!");
		System.out.println("The student's name name is " + studentName);

		Set<String> studentIds = students.keySet();
		System.out.println("The student IDs are " + studentIds);

		for (String currentId : studentIds) {
			System.out.println("Student with id " + currentId + " is named " + students.get(currentId));
		}

		Collection<String> studentNames = students.values();
		System.out.println("The student names are " + studentNames);

		for (Entry<String, String> entry : students.entrySet()) {
			System.out.println("The student's id is " + entry.getKey());
			System.out.println("The student's name is " + entry.getValue());
		}
	}

}
