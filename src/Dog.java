public class Dog extends Animal{// the extend keyword helps the new class (Dog) you have created
    // inherit certain behaviours from the parent or super class , which is the Animal class.
    // it basically tells you that the Dog class is based on the Animal class.

    private int eyes ;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes= eyes;
        this.legs=legs; 
        this.teeth=teeth; 
        this.coat = coat; 
    }
//    public Dog(String name, int brain, int size, int weight) {
//        //The above class has initialized the base characteristics of the Animal class-name,brain etc.
//        super(name, brain, size, weight);// super calls the constructor that is from the class we are extending
//        //or inheriting from - which is the Animal class.
//    }

    private void chew(){

        System.out.println("Dog.chew () called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();;
        super.eat();
    }
}
