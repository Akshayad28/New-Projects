package main.AutomationProject;

public class Myclass {

    public void outerMethod() {
        System.out.println("Executing outerMethod");

        // Define an anonymous inner class that extends a class or implements an interface
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing innerMethod");
            }
        };

        // Use the anonymous inner class
        r.run();
    }

    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.outerMethod();
    }
}
