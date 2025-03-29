/* *    JAVA BASICS
 *  File extensions
 ? .Java - 
 * Contains java Source code
 * High Level Human readable
 * Used for Development
 * File is editable
 ? .Class
 * Contains Java byte code
 * For consumption of JVM 
 * Used for execution 
 * not meant to be edited
 ! JVM VS JRE vs JDK 
 ?  .JDK - It's a software development kit required to develop java applications
 *  include the JRE, interpreter/loader , a compiler(javac), doc generator
 *  (javadoc), and other tools needed for java development
 *  basically , jdk is a superset of jre
 ? JRE -  It's a part of JDk, but can be downloaded separately 
 * provides the libraries, the JVM , and other componenets to
 * run applications
 * Does not have tools and utilities for developers like compilers or debuggers
 ? JVM -  it's a part of JRE and responsible for executing the bytecode
 * Ensures java;s write once run everywhere
 ! Not platform independent a different JVM is needed for each type of OS/Machine
 ? Why main method ?
 * Entry point :  It is the entry point of a java program, where
 * the execution starts
 * Without the main method, The java virtual machine (jvm) does not know 
 * where to  begin run the code
 ? static and Public : It is a keyword that is when associated with a method, making it a class-related method. 
    *   The main() method is static so that JVM can invoke it 
    *   without instantiating the class.
    *   This also saves the unnecessary wastage of memory 
    *   which would have been used by the object declared only 
    *   for calling the main() method by the JVM.
 !public - 
    *   It is an Access modifier, which specifies from where and who can access the method.
    *  Making the main() method public makes it globally available.
    *  It is made public so that JVM can invoke it from outside the class 
    *  as it is not present in the current class.

 *  If the main method is not public, it’s access is restricted.
 *  If you try to run Java code where main is not static, you will get an error.
 ? Fixed Signature :  main(String[] args)
 ? Data types -  byte(1byte) , short(2byte) , int(4byte) , long (8byte), char(2byte) , float(4 byte) ,double(8 byte) , boolean (1byte)
 ? Escape Sequence :   a combination of characters, typically starting with a backslash (`\`), 
 * used to represent special characters 
 * or commands that might otherwise be difficult or impossible to represent directly
 !Type Conversion and casting 
 *  byte -> short -> int -> long ->float ->double    [implicit type conversion] 
 *  byte <- short <- int <- long <-float <-double   [explicit type conversion]
 ? Double(64 bit) vs Float(32 bit)
 *  Double has more precision (1-sign ,11-exponent,52-mantissa) 
 TODO: What is associativity and precedence?
 *
 * 
 */
import java.util.*;
public class Day2{
    public static void main(String []Ayan)
    {   
        float myf = 5;
        System.out.println(myf);

        int myi = (int)5.45f;
        int myd = (int)5.0f;
        System.out.println(myi);
        System.out.println(myd);
        
        //*  "Escape Sequence"
        //*   \t , \b  , \n , \' , \" , \\
        Scanner  in = new Scanner(System.in);
        System.out.println("Bismillah");
        System.out.println("Welcome to\bp-11");
        System.out.println("Welcome to \n\\p-11\\");
        
        byte a = 1;
        
        System.out.println("byte\t" + a);

        
        String s = in.nextLine();
        System.out.println("welcome " + s + " to kg coding " );
        int n = in.nextInt();
        int k=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        for(int i=1;i<=k;i++)
        {System.out.print(" * ");}
        System.out.println();

        for(int i=5;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            { 
                
                if(j<=n-i)
                System.out.print(" ");
                else
                System.out.print("* "); // triangle
                // System.out.print("*");  right triangle
              
             
            }
           System.out.println();
           
        }

    }
}
