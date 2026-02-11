//Angie Alvarez
// 2-9-2026
// Main class for my dog and Hotdog object

public class Main { 
    
    public static void main (String[] args) {

        // A1: Create a Dog with no constructors defined.
        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        // test of data variables as public
        Dog dog2 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + dog2.name);   // expected: null
        System.out.println("age = " + dog2.age);     // expected: 0
        System.out.println("breed = " + dog2.breed); // expected: null

        // test the constructors for the default and non-default, yet data value is still public
        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.name + ", age = " + d2.age + ", breed = " + d2.breed);

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.name + ", age = " + d3.age + ", breed = " + d3.breed);


    }//end main

}// end Main class