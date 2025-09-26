package org.officeAssignment.String;

public class StringDemo {

    public static void main(String[] args) {

        //1st way: Using Object way
        String str = new String("Sindhu");
        // IQ: How many objects are crated here ib the memory
        // 2 Objects,  1st object in the heap memory and 2nd is in SCP.
        System.out.println("Address of str1 "+System.identityHashCode(str));

        //String str1 = new String("Yuva");
        //System.out.println("Address of str2 "+System.identityHashCode(str1));

        String str2 = new String("Sindhu");
        System.out.println("Address of str3 "+System.identityHashCode(str2));

       // String str3 = new String("Swapnil");
        //System.out.println("Address of str4 "+System.identityHashCode(str3));

        //String str4=new String("Spoorti");
        //System.out.println("Address of str4 "+System.identityHashCode(str4));*/

        //2nd Way: Using String Literal

       String name1 = "Sindhu";
        System.out.println("Address of name1 "+System.identityHashCode(name1));

        String name2 = "Sindhu";
        System.out.println("Address of name1 "+System.identityHashCode(name2));

        //String name3 = "Yuva";*/

        //System.out.println(name2.equals(name3));


    }
}
