/* Import & Pacakges
 ? 1> Package Definition: package in java is a namespace that organizes classes 
 * and interfaces , preventing naming conflicts
 ? 2> Package decalaration : Packages are declared at the begining 
 * of a Java source file using the package keyword followed by the 
 * package name
 ? 3> Import statement: An import statement in java is used to bring
 * in classes or interfaces from other packages into the current file,
 * making them aceessible without using a fully qualified name
 ? 4 Types of import : -
 * 1> Single type import : imports a single class or interface from a package
 * (eg, import java.util.list)
 * 2> On-demand import : import all classes and interfaces from a package
 * (eg, import java.utl.*;)
 
 ? 5> Avoiding Collisions: Packages help in avoiding name collisions by 
 * categorizing similar classes together.
 ? 6> Built in packages : Java comes with built-in packages like
 * java.lang (automatically imported) , java.util, java.io etc.
 */
import java.util.Scanner;
public class Packages {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    }
}

