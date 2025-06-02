package com.bipin.streams.HandsOn;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find the longest string in a list of strings using Java streams:
//Calculate the average age of a list of Person objects using Java streams:
//Check if a list of integers contains a prime number using Java streams:
//Merge two sorted lists into a single sorted list using Java streams:
//Find the intersection of two lists using Java streams:
//Remove duplicates from a list while preserving the order using Java streams:
//Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
//Find the kth smallest element in an array using Java streams:
//Given a list of strings, find the frequency of each word using Java streams:
//Implement a method to partition a list into two groups based on a predicate using Java streams:

//********* EMPLOYEE **********
//Find list of employees whose name starts with alphabet A
//Group The employees By Department Names
//Find the total count of employees using stream
//Find the max age of employees
//Find all department names
//Find the count of employee in each department
//Find the list of employees whose age is less than 30
//Find the list of employees whose age is in between 26 and 31
//Find the average age of male and female employee
//Find the department who is having maximum number of employee
//Find the Employee who stays in Chennai and sort them by their names
//Find the average salary in all departments
//Find the highest salary in each department
//Find the list of employee and sort them by their salary
//Find the employee who has second highest salary

public class HandsOn {
    public static void main(String[] args)
    {
        //Find the longest string in a list of strings using Java streams:
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> longestString = strings.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestString);

        //Calculate the average age of a list of Person objects using Java streams:
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35));
        double avg = persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(avg);

        //Check if a list of integers contains a prime number using Java streams:
        checkPrime();

        //Merge two sorted lists into a single sorted list using Java streams:
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> listconcat = Stream.concat(list1.stream(),list2.stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listconcat);

        //Find the intersection of two lists using Java streams:
        List<Integer> listx = Arrays.asList(1, 3, 5, 7, 8,9);
        List<Integer> listy = Arrays.asList(1, 2, 4, 6, 8, 10);
        List<Integer> Interlist = listx.stream()
                .filter(listy::contains)
                .collect(Collectors.toList());
        System.out.println(Interlist);

        //Write duplicates from a list while preserving the order using Java streams:
        List<Integer> templist = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        Set<Integer> set = new HashSet<>();
        List<Integer> duplist = templist.stream()
                .filter(n -> !set.add(n))
                .collect(Collectors.toList());
        System.out.println(duplist);

        //Remove duplicates from a list while preserving the order using Java streams:
        List<Integer> templist1 = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> duplist1 = templist1.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplist1);

        //Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        Map<String, Integer> sumInt = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,LinkedHashMap::new, Collectors.summingInt(Transaction::getAmount)));
        System.out.println(sumInt);

        //Find the kth smallest element in an array using Java streams:
        int[] array = {4, 2, 7, 11, 5, 3, 6};
        int k=5;
        int ksmall = Arrays.stream(array)
                .sorted()
                .skip(k-1)
                .findFirst()
                .orElse(-1);
        System.out.println(ksmall);

        //Given a list of strings, find the frequency of each word using Java streams:
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String,Long> freq = words.stream()
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        System.out.println(freq);

        //Implement a method to partition a list into two groups based on a predicate using Java streams:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean,List<Integer>> partition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 ==0));
        List<Integer> even = partition.get(true);
        List<Integer> odd = partition.get(false);
        System.out.println(even);
        System.out.println(odd);

        //******************* employee **************
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Bipin", 29, "IT", "Mumbai", 20000, "Male"),
                new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
                new Employee(3, "Alex Joe", 28, "IT", "Chennai", 22000, "Male"),
                new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
                new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
                new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
                new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
        );

        //Find list of employees whose name starts with alphabet A
        List<Employee> employees1 = employees.stream()
                .filter(emp -> emp.getName().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(employees1);

        //Group The employees By Department Names
        Map<String, List<Employee>> employees2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employees2);

        //Find the total count of employees using stream
        long employees3 = employees.stream()
                .count();
        System.out.println(employees3);

        //Find the max age of employees
        Optional<Employee> employees4 = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        System.out.println(employees4);

        int age = employees.stream().mapToInt(Employee::getAge).max().getAsInt();
        System.out.println("Maximum age of employee "+ age);

        //Find all department names
        List<String> employees5 = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(employees5);

        //Find the count of employee in each department
        Map<String, Long> employees6 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(employees6);

        //Find the list of employees whose age is less than 30
        List<Employee> employees7 = employees.stream()
                .filter(emp -> emp.getAge() < 30)
                .collect(Collectors.toList());
        System.out.println(employees7);

        //Find the list of employees whose age is in between 26 and 31
        List<Employee> employees8 = employees.stream()
                .filter(emp -> emp.getAge() <= 31 && emp.getAge() > 26)
                .collect(Collectors.toList());
        System.out.println(employees8);

        //Find the average age of male and female employee
        Map<String,Double> employees9 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,LinkedHashMap::new, Collectors.averagingInt(Employee::getAge)));
        System.out.println(employees9);

        //Find the department who is having maximum number of employee
        Map.Entry<String, Long> employeesA = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .max(Map.Entry.comparingByValue())
                                                .get();
        System.out.println(employeesA);

        //Find the Employee who stays in Chennai and sort them by their names
        List<Employee> employeesB = employees.stream()
                .filter(emp -> emp.getCity().equalsIgnoreCase("Chennai"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(employeesB);

        //Find the average salary in all departments
        Map<String, Double> employeesC = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment(),Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(employeesC);
        
        //Find the highest salary in each department
        Map<String, Optional<Employee>> employeesD = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(employeesD);

        //Find the list of employee and sort them by their salary
        List<Employee> employeesE = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(employeesE);

        //Find the employee who has second highest salary
        int k1=2;
        Employee employeesF = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(k1-1)
                .findFirst()
                .get();
        System.out.println(employeesF);

    }

    public static boolean isPrime(int number)
    {
        if(number < 2)
            return false;

        for(int i=2; i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }

    private static void checkPrime()
    {
        List<Integer> list = Arrays.asList(1,45,66,67,88,3,2,67,50,7,1,0);
//        List<Integer> list = Arrays.asList(1,45,66,675,88,35,25,675,50,75,15,50);
        boolean containsPrime = list.stream()
                .anyMatch(HandsOn::isPrime);
        System.out.println(containsPrime);
    }
}
