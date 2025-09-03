package java_basics;

import java.util.HashMap;
import java.util.Map;

public class MethodsExamples {
	
	// Return type without argument
	
	public static Map<String, Integer> getStudentScores() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 78);
        return scores;
    }
	
	// void method with no return type
    public static void printArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Elements:");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
    
 // Method that takes String[] as argument and returns a Map
    public static Map<String, Integer> getNameLengthMap(String[] names) {
        Map<String, Integer> nameLengthMap = new HashMap<>();
        for (String name : names) {
            nameLengthMap.put(name, name.length());
        }
        return nameLengthMap;
    }
    
 // void method that accepts a Map and prints it
    public static void printStudentScores(Map<String, Integer> scores) {
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
	
	

	public static void main(String[] args) {
		
		
		Map<String, Integer> result = getStudentScores();  // calling method
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        
        printArray();
        
        
        String[] students = {"Alice", "Bob", "Charlie"};
        
        Map<String, Integer> results = getNameLengthMap(students);
        
        System.out.println("Name -> Length Map:");
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 92);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 76);

        // pass the map as argument
        printStudentScores(studentScores);
        
	 

	}

}

