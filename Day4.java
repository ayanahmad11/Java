/*
*   Procedural vs Object Oriented Programming
*   In OOP Objects can share function and properties/attributes
!   Class  // class is a blueprint , objects are real values
*   A class is a user-defined data type, which holds its own
*   data members and member functions that can be accessed and
*   used by creating an instance of that class.
*   A C++/JAVA class is like a blueprint for an object.
!   Declaring Objects
*   "new" instantiates the new object of a class
!   new creates the dynamic allocation at run time;
?   Allocates memory for objects in the heap;
*   Access properties using dot '.' operators
TODO: Static
*   Static Variables : Belong to the class, not individual instances.
*                      Shared among all instances of the class
*   Static methods :   Can be called without creating an object 
*                      of the class, 
?   Can directly access static variables and other static methods
*   NO access to Non-static members : Static methods and blocks
*   cannot directly access non-static members (variables and methods) of the class

!   Constructors
?   Purpose : Constructors initialize new objects and set initial states
*             for the object's attributes
*   Naming : A constructor must have the same name
*   as the class in which it is declared
*   No return Type : Constructor do not 
*   have a return type,

?   Java constructors or constructors in Java is a terminology used to construct something in our programs.
* A constructor in Java is a special method that is used to initialize objects when they are created.
* It is automatically called when an object is instantiated using the new keyword.
! It can be used to set initial values for object attributes.

TODO: Key Features of Constructors:

* Same Name as the Class: A constructor has the same name as the class in which it is defined.
* No Return Type: Constructors do not have any return type, not even void. The main purpose of a constructor is to initialize the object, not to return a value.
* Automatically Called on Object Creation: When an object of a class is created, the constructor is called automatically to initialize the object’s attributes.
* Used to Set Initial Values for Object Attributes: Constructors are primarily used to set the initial state or values of an object’s attributes when it is created.
? Default Constructor : if no constructor is explicitly,java provides a default 
*                       constructor that initialiazes all member variables to default values
? Parameterized Constructor : Constructors can have parameters to pass values
*                           when creating an object allowing for different initializations
? Constructor Chaining - Two constructors calling each other resulting in a loop 

! Code Blocks
*  1. Scope : Code Blocks{} determine the scope of variables
*  2. local varibles : Variables inside a block are not accessible outside it
*  3. Initialization Block : Block without static -  run each time an instance is create
*  4. Static block : Blocks with static run once when the class is loaded

? Do not use this keyword for static variable and its initialization
* instead use dot operator

* Stack vs Heap Memory
* The Stack :  where all method invocations and local variable live
*               go() / dostuff() / main()  [in order in stack ]

* The Heap : Where all objects live
*            random order of storing 

? Primitive vs Reference Types
* Primitives store actual values while refernce store addresses to objects

! Variables scope  { { { p }Q } R}

* Garbage Collection and Finalize
* Gb collection is managed by JVM , running in background 

? Loops -  for,while,do while
* break,continue,return
? Recursion
* function calling itself

? toString method(); provides a string representation of an object
? Inheritance : It's inherited from the Object class
? Default Format : By default,return class name @hashcode
? hashcode [Classname@objecthashcode]
* toString() is implicit

! String Class  
* 1> Immutability : Once created, a String Object's value can't be changed
* 2> String Pool : Java maintains a pool of strings for efficiency , 
*                  when a  new string is created, it's checked against the pool
*                  for a match to refuse
! 3> Comparing : equals() method for value comparison,
! == operator checks reference equality

* String Class
* 1. Concatenation : Strings can be concatenated using + operator,
*    but each concatenation created a new String 
* 2. Methods : provides a method like length(),substring(),equals()
*             compareTo(),indexOf(), for various operations  
* 3. Memory : Being Immutable, strings can use more memory
*              when frequently modified
! Final keyword
* 1. Variable : When applied to a variable, it becomes constant,        
*                meaning its value cannot be changed once initiliazed.

* 2.Efficiency : final can to lead to performance optimizations.

* 3. Null safety : A final varible  must be initialized before the constructor completes
* reducing null pointing errors.

* 4. Immutable objects : Helps in creating  immutable objects in 
*combination with private fields and no setter method.

* */
    import java.util.Scanner;
    public  class Day4 {
        static int noOfCarsSold;
        int  noOfWheels;
        String color;
        float maxspeed;
        float currentFuelInLitres;
        int noOfSeats;
        static{
            System.out.println("I am in static block");
            noOfCarsSold =0;
        }
        {  
            System.out.println("I'm Init block ");
            noOfCarsSold++;
        }
        Day4(){

        }
        Day4(String color){
            this.color = color;
        }
        public Day4(int noOfWheels, String color, float maxspeed, float currentFuelInLitres, int noOfSeats) {
            this.noOfWheels = noOfWheels;
            this.color = color;
            this.noOfWheels = noOfWheels;
            this.color = color;
            this.maxspeed = maxspeed;
            this.currentFuelInLitres = currentFuelInLitres;
            this.noOfSeats = noOfSeats;
        }

        
        public Day4 started(){
            System.out.println("Car is Started....bruhh");
            return this;
        }
        public void drive(){
            System.out.println("Car is driving");
            currentFuelInLitres--;
        }
        public void addFuel(float currentFuelInLitresfuel)
        {
            this.currentFuelInLitres += currentFuelInLitresfuel;
        }
        public float getCurrentFuelLevel(){
            return currentFuelInLitres;
        }
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            Day4 swift = new Day4("red");
            Day4 thar = new Day4("black");
            // swift.color = "red"; 
            System.out.println(thar.color);
            System.out.println(swift.color);
            System.out.println("koka");
            fibonacci(8); // fibonacci upti nth term 
            //* Switch statement 
            switch(thar.color)
            {   
                case "red" : System.out.println("Laal hai");
                             break;
                case "Black" : System.out.println("Kaala");
                              break;
                default : System.out.println("Satrangi");
                              break;
            }
            switch(swift.color)
            {   
                case "red" : System.out.println("Laal hai");
                             break;
                case "Black" : System.out.println("Kaala");
                             break;
                default : System.out.println("Satrangi");
                             break;
            }
            String  s = in.next();
            StringBuilder sb = new StringBuilder("First");
            sb.append(45);
            sb.append(", now is the ");
            sb.append(76.45);
            System.out.println(sb);
            int[] arr = {1,2,4};
            System.out.println(arr.length);
            System.out.println(s.length());
            System.out.println((palindromeChecker(s))? "palindrome" : "not palindrome");


        }
       static boolean palindromeChecker(String s)
       {
            if(s.length()<=1)
            return true;
            int lastPos =  s.length() - 1;
            if(s.charAt(0) != s.charAt(lastPos))
                return false;
            String newStr = s.substring(1,lastPos);
            return palindromeChecker(newStr);

       }
       static long factorial(int num)
       {    

            if(num == 1)
            return 1;
            return num * factorial(num-1);
       }
       static void fibonacci(int n)
        {
            int a=0,b=1,c;
            for(int i=0;i<n;i++)
            {
                System.out.print(a+" ");
                c = a+b;
                a = b;
                b = c;
            }
        }
    }
