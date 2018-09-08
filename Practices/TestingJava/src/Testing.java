public class Testing {
   public static void main(String[] args) {
       System.out.println("Testing, Java!");
       sayHello("Bob", 1, 0, 0);
       sayHello("Jon", 1, 1, 1);
       sayHello("Mike", 0, 0, 1);



   }

   public static int sayHello(String name, int dogs, int cats, int friends) {
       System.out.println("Hello there " + name + " you have " + dogs + " dogs, " +  cats + " cats, and " + friends + " friends!");
       if(friends == 0) {
           System.out.println("You have " + friends + " friends so you are AWSOME");
           return friends;
       } else {
           System.out.println("Lame! You have " + friends + " friends so you are COOL ");
           return friends;
       }

   }



}
