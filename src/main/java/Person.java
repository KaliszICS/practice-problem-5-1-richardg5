/**
 * Class representing a person. Comes with variables for name and age.
 * @version 1.0.0
 * @author Richard Gao
 */
public class Person {
    private String name;
    private int age;

    /**
     * Creates a new Person with specified name and age.
     * @param name a String representing the name of the person
     * @param age an int representing the age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the person's name.
     * @return a String representing the person's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the person's age.
     * @return an int representing the person's age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Sets the person's name to the name specified.
     * @param name a String representing the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the person's age to the age specified.
     * @param age an int representing the new age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }
}
