package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class Shape {}
class Quadrilateral extends Shape {}
class Triangle extends Shape{}
@SpringBootApplication
public class DemoApplication {


	public enum Element {
		HELIUM("He", "Gas"),
		MAGNESIUM("Mg", "Solid");
		private String chemicalSymbol;
		private String nature;
		private Element(String newChemicalSymbol, String newNature) {
			chemicalSymbol = newChemicalSymbol;
			nature = newNature;
		}
		public String chemicalSymbol() {return chemicalSymbol;}
		public String nature() {return nature;}
	}
	public static void main(String[] args) {
        Predicate<String> lengther = (s) -> s.length() < 2;
        Predicate<String> equalizer = Predicate.isEqual("car");
        Function<Boolean,String> booleaner = i -> Boolean.toString(i);
        Function<String,Boolean> stringer  = s -> Boolean.parseBoolean(s);
		System.out.println(booleaner.apply(true));

		int b = 8;
int a = b = 2;       
int c = a == b ? (a < b ? 1 : 0) : -1;
System.out.println(c);
		Shape shape = new Quadrilateral();
		Quadrilateral quadrilateral = new Quadrilateral();

		var numberHash1 = java.util.Map.of(1, "one", 3, "three", 8, "eight", 5, "five");
		var numberHash2 = java.util.Map.of(1, "one", 5 , "cinq", 3 , "trois", 9, "nouveau", 4, "four");
		var values1 = new java.util.TreeSet<>(numberHash1.values());
		var values2 = new java.util.TreeSet<>(numberHash2.values());
		values1.retainAll(values2);
		System.out.println(values1);

		//SpringApplication.run(DemoApplication.class, args);
		List <Integer> numberList = List.of(0, 3, 4, 1, 9, 6, 2, 1, 2);
		//List <Integer> newList = numberList.stream().sorted((a,b)->a<b?b:a).filter(s -> s % 3 == 0).collect(Collectors.toList());
		//System.out.println(newList);
		List<String> list = Arrays.asList("dog","over","good");
		//list.stream().reduce((x1,x2)->x1.length()>x2.length()?x1:x2).ifPresent(System.out::println);
		System.out.println(list.stream().reduce(new String(), (x1,x2)->{if(x1.equals("dog"))return x1;return x2;}));

		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(1988));
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1987);
		int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
		cal.set(1988, 1, 1);
		int days2 = cal.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days2);

		String [] name = {"George", "John", "James", "Jacob", "Henry"};
    java.util.Set <String> set = new java.util.TreeSet<>();
    java.util.Collections.addAll(set, name);
    System.out.println(set);
	}

}
