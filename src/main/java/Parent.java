/**
 * Class representing a parent. Comes with variables for name, age, spouse, and children.
 * @version 1.0.0
 * @author Richard Gao
 */
public class Parent extends Person {
    private Parent spouse;
    private Child[] children;

    /**
     * Creates a new Parent with specified name, age, and spouse. Initializes children to empty Child array. 
     * @param name a String representing the name of the parent
     * @param age an int representing the age of the parent
     * @param spouse a Parent representing the spouse of the parent
     */
    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[0];
    }

    /**
     * Creates a new Parent with specified name and age. Spouse will be initialized to null. Initializes children to empty Child array.
     * @param name a String representing the name of the parent
     * @param age an int representing the age of the parent
     */
    public Parent(String name, int age) {
        super(name, age);
        this.spouse = null;
        this.children = new Child[0];
    }

    public Parent getSpouse() {
        return this.spouse;
    }

    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }

    public Child[] getChildren() {
        return this.children;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public void addChild(Child child) {
        Child[] tempChildren = new Child[this.children.length + 1];
        for (int i = 0; i < this.children.length; i++) {
            tempChildren[i] = this.children[i];
        }
        tempChildren[tempChildren.length - 1] = child;
        this.children = tempChildren;
    }
}
