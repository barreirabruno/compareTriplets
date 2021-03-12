package br.com.bruno;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;


public class TesteCompareTriplets {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("write-here.txt"));
		
		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());
		
		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		
		Solution solutionClass = new Solution();
		List<Integer> result = solutionClass.compareTripelets(a, b);
		
		bufferedWriter.write(
			result.stream()
				.map(Object::toString)
				.collect(joining(" "))
				+ "\n"
		);
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
