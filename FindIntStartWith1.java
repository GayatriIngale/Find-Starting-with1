package FindStartingWith1StreamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FindIntStartWith1 {

	
	public static void main (String args[]) {
		List<Integer> list = Arrays.asList(152,3,8,11,1,1342,56,100,12);
		List<Integer> result = list.stream().filter(x -> x.toString().startsWith("1")).collect(Collectors.toList());
			System.out.println(result);
	}
}
