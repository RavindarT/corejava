package com.core;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
 
public class JavaStreamDistinctExamples 
{
    public static void main(String[] args) 
    {
        Person lokesh = new Person(1, "Lokesh", "Gupta");
        Person brian = new Person(2, "Brian", "Clooney");
        Person alex = new Person(3, "Alex", "Kolen");
         
        //Add some random persons
        Collection<Person> list = Arrays.asList(lokesh,brian,alex,lokesh,brian,lokesh);
 
        // Get distinct objects by key
        List<Object> distinctElements = list.stream()
                                            .filter( distinctByKey(null) )
                                            .collect( Collectors.toList() );
 
        // Let's verify distinct elements
        System.out.println( distinctElements );
    }
 
        //Utility function
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<Object, Boolean>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
 
//Model class
class Person 
{
    public Person(Integer id, String fname, String lname) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
 
    private Integer id;
    private String fname;
    private String lname;
 
    //Getters and Setters
 
    @Override
    public String toString() {
        return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
    }
}