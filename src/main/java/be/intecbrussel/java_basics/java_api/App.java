package be.intecbrussel.java_basics.java_api;
/*
StringBuffer and StringBuilder

The difference between StringBuffer and StringBuilder is that StringBuffer is thread safe and StringBuilder is not thread safe, but faster.

They both are mutable.

Some common methods:

Append() has overloaded arguments.

Insert() has also overloaded arguments. Insert(1, "st") will insert st on the position of 1.

Replace() has three parameters. First parameter is the start and the second is the end spot(not including) so it is a range  ex. Replace(1,2, "t") will replace whatever at the spot starting from one.

Delete() has two parameters the range(start and end excluding)

DeleteCharAt() takes one parameter which is the index.

Reverse() very straightforward. It just reverses.

 */
public class App {

    public static void main(String[] args) {
        /* StringBuffer stringBuffer  = new StringBuffer("OCA");
        stringBuffer.append("JP");
        System.out.println(stringBuffer);

         */
/*
        StringBuffer stringBuffer = new StringBuffer("OJP");
        stringBuffer.insert(1,"CA");
        System.out.println(stringBuffer);

 */
/*
        StringBuffer stringBuffer = new StringBuffer("OCAJP");
        stringBuffer.replace(2,3,"P");
        System.out.println(stringBuffer);

 */
/*
        StringBuffer stringBuffer = new StringBuffer("OCAJP");
        stringBuffer.delete(0,2);
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);

 */
        StringBuffer stringBuffer = new StringBuffer("Mika");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
