
package alwaysmakeanewproject;

public class AlwaysMakeANewProject {

    public static void main(String[] args) {
        String colour = "Green";
        String name = "Josh";
        String street = "Kingfisher way";
        System.out.println("My favourite colour is " + colour);
        System.out.println("My name is " + name);
        System.out.println("I grew up on " + street);
        
        int number = 5;
        int age = 16;
        int shoe = 9;
        System.out.println("Your chosen number is: " + number);
        System.out.println("I am " + age + " years old");
        System.out.println("My shoe size is: " + shoe);
        
        double test = 1.5;
        double pi = 3.14;
        System.out.println(test);
        System.out.println(pi);
    // area of a circle = pi*r^2
    // speed = distance/time
        
        System.out.println(age+shoe);
        System.out.println(age-shoe);
        System.out.println(age*shoe);
        System.out.println(age/shoe);
        
        int x = 10;
        int y = 5;
        if(x < y){
            //if the condition is true
            System.out.println("x is less than y");
        }else{
            System.out.println("x is more than y");
            //if the condition is false
        }
    }
    
}
