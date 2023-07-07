package org.example;

public class Java_BeginnerNotes {
    public static void main(String[] args) {
        System.out.println("Please refer to the below notes");
        System.out.println("JAVA:\n" +
                "\n" +
                "\n" +
                "- [ ] The key difference between the CLI and GUI is that the interaction with CLI is based on issuing commands. In contrast, the interaction with a GUI involves visual elements, such as windows, buttons, etc. Both interface types have advantages and disadvantages, but their purpose is the same.\n" +
                "- [ ] The most significant difference between GUI and CUI is that the GUI is an interface in which the user interacts with the computer using Graphics like images and icons, while the CUI is an interface in which the user interacts with a computer using commands like text.\n" +
                "- [ ] The package will specify which class we are referring to. For example, in System.out.println line, System is a class of java.lang package, which is imported automatically. So it will be java.lang.system in particular.\n" +
                "- [ ] Smallest entity of Java- Function(method). And functions can’t exist on their own and should be assigned to some class.So class is a container for one or more related functions.(Class - first letter caps, Method - except first word all other words first letter capital)\n" +
                "- [ ] Difference between function and method: Method belongs to a class and function is defined out of a class.\n" +
                "- [ ] Access Modifiers\n" +
                "- [ ] Static key word\n" +
                "- [ ] System.out.println() —> Out field??—>Out is a field of Print Stream class and print ln is the method defined in print stream class\n" +
                "- [ ] ctrl+r — run the program\n" +
                "- [ ] JDK has java compiler, which converts code to byte code— compilation. Main.java —>java file and after compiling we get Main.class — which contains the byte code which can be run on any operating system.\n" +
                "- [ ] JRE has JVM which can convert this byte code into any native code which the respective OS can understand which makes java portable / platform independent\n" +
                "- [ ] Data types — 2 types. Primitive Type(8)- to store data of simple values. Reference Types- for storing complex objects..(ex date).FOr reference data types we have to allocate memory while declaring them. Eg: Date now= new Date();So ’now’ is the instance od Date class and date class is the template or blueprint of new objects/instances.\n" +
                "- [ ] Difference between these types with respect to memory: For primitive type data will be stored in the memory for a variable but for Reference type address of the location at which the data stored is stored for that variable.\n" +
                "- [ ] ‘String’ is not  a primitive data type though we declare it as {String message = “this is the message” }( String is a class from java.lang package, so u may think we have to declare it as String message = new String(“this is the message”),but somehow this is redundant in java).This can also access a lot of methods of String class like ednsWith,startsWith,length,indexOf etc\n" +
                "- [ ] Replace method of String class doesn’t actually change the string but it creates a new String. \n" +
                "- [ ] Eg: String message= \"Hello World\" + \"!!\";System.out.println(message) System.out.println(message.replace(\"Hello\",\"Hi\")); —> Here it creates a new String but doesn’t modify the original string.\n" +
                "- [ ] In Javas Strings are immutable, i.e, any method which changes a string doesn’t change the original String but creates a new one.\n" +
                "- [ ] Releasing of memory will automatically taken care by JRE.\n" +
                "- [ ] Packages create a namespace for our classes. I.e., we have date class in java.util package  and also in java.sql package. Both don’t conflict.\n" +
                "- [ ] Escape Sequence:   \\ —> eg: if we want to use “ “ Inside “ “, then give “ \\”  message \\” “, similar \\n and \\t\n" +
                "- [ ] Arrays:  int[] array = new int[5] as Array is reference type. If we try to directly print this array we will get output as some address of the memory, so we have a class in java names Arrays and the method toString, which is implemented multiple times for different data types(both primitive and reference) which is called Method overloading.\n" +
                "- [ ] For MultiDimensional Arrays, we have deepToString() for reading the values of the multi dimensional array.\n" +
                "- [ ] Variable- declare, initialise and can change value through out the program. \n" +
                "- [ ] Constant- If u want the value of the variable not to change then declare it as “final” and it becomes a constant.\n" +
                "- [ ] Augmented or Compound Assignment Operator:  Instead of x=x+2 we can use compound assignment operator and say “x+=2” Similarly -=, *=, /=\n" +
                "- [ ] Implicit Casting: Whenever we have a value which can be converted to a bigger data type , i.e bigger casting or casting happens automatically or implicitly eg: byte > short> int> long > float  > double\n" +
                "- [ ] So implicit casting happens when we are not going to loose data. (See small one can be adjusted in bigger data type ryt?)\n" +
                "- [ ] Explicit Casting: double x =1.1; int y=  (int) x +2; it happens only between compatible data types.\n" +
                "- [ ] Wrapper Class - ?\n" +
                "- [ ] When we have to cast not compatible data types, say should cast String to int then we have a wrapper class  for all primitive types here Integer wrapper class for datatype int, and this class has a method “parseInt()”\n" +
                "- [ ] Math Class : has lot of methods like round, ceil, floor, max etc.\n" +
                "- [ ] Java.text package has number of classes to format date, text, numbers etc.  NumberFormat class is one such to format numbers. \n" +
                "- [ ] But NumberFormat class is an abstract class so we can’t use new operator to instantiate a new instance of this class.So instead of creating new instance we can directly use its methods, called factory methods which return number format object\n" +
                "- [ ] Scanner Class: To read input from the user. —> Here we have different methods like nextByte,next,nextLine etc. The difference between next and nextLine is next will take only one token at a time i.e, if there are spaces in the name provided by the user then only the first word will be read. Contrary nextLine will read the entire line.\n" +
                "- [ ] Println and print —> println will take u to the next line. Print will be on the same line.\n" +
                "- [ ] Boolean expression and ternary operator :  String className= income>100000 ? \"First\" : \"Economy\";\n" +
                "- [ ] We can’t use comparator operator for String type(reference types) as the addresses will be compared not the values. So eg:     String input = “”;  while(!input.equals(“quit”)){ code };\n" +
                "- [ ] For loop, while loop, switch statement, if clause, if else, nested if / nested if else, do-while loop, for-each loop.\n" +
                "- [ ] While loops are god when we don’t know how many iterations are required ahead of times.\n" +
                "- [ ] Break can be used to jump out of the loop at some condition, similarly continue can be used to just continue with the next iteration and not jump out of the loop\n" +
                "- [ ] Its advisable to use while(true) loop but remember to have a break statement if not would result in infinite loop.\n" +
                "- [ ] Don’t instantiate scanner class inside a loop, as it would create multiple scanner class objects for multiple iteration which would pollute the memory.\n" +
                "- [ ]  Limitations of For-each loop:  - can’t iterate backwards\n");
    }
}
