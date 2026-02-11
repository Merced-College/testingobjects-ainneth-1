//Angie Alvarez
// 2-9-2026
// Dog class for my Dog object

public class Dog { 

    //data variables
    public String name;
    public int age;
    public String breed;

    // Constructors
    public Dog() {            // default constructor
        name = "Unknown";
        age = 0;
        breed = "Mixed";
    }

    public Dog(String name, int age, String breed) { // parameterized constructor
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

}// end Dog class