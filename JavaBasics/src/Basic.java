import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Basic {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("enter size");
		size = scan.nextInt();
		System.out.println("enter data");
//		
		IntStream.range(0, size + 1).forEach(name -> names.add(scan.nextLine()));
//		
		for (String name : names) {
			System.out.println(name);
		}
//		
		names.forEach(System.out::println);
//		
		names.forEach(i -> System.out.println(i));
		
		String out = names.size()<5 ? ">5" : "<5";
		System.out.println(out);
		scan.close();
	}

}
