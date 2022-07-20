package com.example.demo;

import java.util.*;
import java.util.stream.*;
class Person {
    String name;
    Integer id;
    Person(String n, Integer i) { name=n; id=i; }
    Person(Integer i) {name=null; id=i;}
    @Override public String toString() { return name + " " + id; }
}
public class PersonTest {
    static List<Person> people = Arrays.asList(
              new Person("Bob",1),new Person(2),new Person("Jane",3));
    static int x;
    public static void main(String[] args) {
        people.stream()
              .reduce((e1,e2) -> { x=e1.id; if (e1.id > e2.id) return e1; x=e2.id; return e2;})
              .flatMap(e -> Optional.ofNullable(e.name))
              .map(y -> new Person(y,x))
              .ifPresent(System.out::println);
    }
}
