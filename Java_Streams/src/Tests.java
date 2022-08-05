import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tests {

	public static void usingStream(ArrayList<String> names) {
		// there is no life for intermediate operation if there is no terminal operation
		// ie, filter should work then only count will work
		// termainal op will execute only if intermediate(filter) returns true

		// we can create stream
		// Stream.of("Abhi","Ram").filter(s->s.startsWith("A")).count()

		Long c = names.stream().filter(s -> s.startsWith("A")).count();// -> is lamda expression

		// can be written in below manner as well , if it contains multiple linesa
		// Long c=names.stream().filter(s->
//		{
//			s.startsWith("A")).count();
//		}

		System.out.println("Count the number of names starting with A using Streams : " + c);
	}

	public static void PrintAllnamesUsingStream(ArrayList<String> names) {
		System.out.println("---------------------");
		// Print all the names having length greater than 3
		names.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));

		// Limit the filtered names to only first name
		names.stream().filter(s -> s.length() > 3).limit(1).forEach(s -> System.out.println("First name :" + s));

	}

	public static void StreamMap(ArrayList<String> names) {
		// print names which have last letter as 'm' with Uppercase
		System.out.println("---------------------");
		names.stream().filter(s -> s.endsWith("m")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println("---------------------");

		// print names starting with 'a' , in sorted order
		List<String> namelist = Arrays.asList("Azhishek", "Aaun", "Cat", "Anuj");
		namelist.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("--!----!---------------");
	}

	public static void merge() {
		List<String> namelist1 = Arrays.asList("Azhishek", "Aaun", "Cat", "Anuj");
		List<String> namelist2 = Arrays.asList("Abhishek", "Ram", "Lakshman", "Bhim2");

		Stream<String> newStream = Stream.concat(namelist1.stream(), namelist2.stream());
		// newStream.sorted().forEach(s->System.out.println(s));

		// Find Ram in the new list
		boolean flag = newStream.anyMatch(s -> s.equals("Ram"));
		System.out.println(flag);

	}

	public static void Streamcollect() {
		System.out.println("---------------------");
		List<String> collectedStream = Stream.of("Aa", "Bba", "werwa").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(collectedStream.get(0));
		System.out.println("---------------------");
	}

	public static void UniqueNumber() {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 45, 5, 5, 6, 67, 7, 7);
//numbers.stream().distinct().sorted().forEach(s->System.out.println(s));

//get me the third index
		Stream<Integer> values = numbers.stream().distinct().sorted();
		List<Integer> num = values.toList();
		System.out.println(num.get(2));

	}

	public static void main(String[] args) {

		// count the number of names starting with alphabet A in list

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Kumar");
		names.add("Ram");
		names.add("Shayam");
		names.add("Tom");
		names.add("Arav");
		System.out.println(names);
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println("Total count without using count : " + count);

		usingStream(names);
		PrintAllnamesUsingStream(names);
		StreamMap(names);
		merge();
		Streamcollect();
		UniqueNumber();

	}

}
