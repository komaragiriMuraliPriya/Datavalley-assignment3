class Parent {
    public void display() {
        System.out.println("This is Parent class");
    }
    public void display(String message) {
        System.out.println("Message from Parent: " + message);
    }
}
class Child extends Parent {
    public void display() {
        System.out.println("This is Child class");
    }
    public static void main(String args[]) {
        Child child = new Child();
        child.display(); 
        child.display("Hello"); 
    }
}
