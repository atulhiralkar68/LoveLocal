package javaWrapperClass;

public class ConvertObjectToPrimitiveDataType {

    public static void main(String []args) {
        //byte data type 
        byte b = 1;

        //Wrapping around Byte Object 
        Byte byteobj = new Byte (b);
        //OR
        Byte bytobj1 = b;
        //OR
        Byte bytobj2 = Byte.valueOf(b);


        System.out.println(byteobj);
        System.out.println(bytobj1);
        System.out.println(bytobj2);

        // int data type
        int i = 2;

        //Wrapping around Integer Object
        Integer intobj = new Integer (i);
        //OR
        Integer intobj1 = Integer.valueOf(i);
        //OR
        Integer intobj2 = i;

        System.out.println(intobj);
        System.out.println(intobj1);
        System.out.println(intobj2);

        //short data type 
        short s = 1;

        // Wraping around Short object 
        Short shortobj = new Short(s);
        //OR
        Short shortobj1 = Short.valueOf(s);
        //OR
        Short shortobj2 = s;

        System.out.println(shortobj);
        System.out.println(shortobj1);
        System.out.println(shortobj2);

        //float data type 
        float f = 2.0f;

        //Wrapping around Float object 
        Float floatobj = new Float (f);
        //OR 
        Float floatobj1 = Float.valueOf(f);
        //OR
        Float floatobj2 = f;

        System.out.println(floatobj);
        System.out.println(floatobj1);
        System.out.println(floatobj2);
        

        //double data type 
        double d = 3.3;

        // Wrapping around Double object 
        Double doubleobj = new Double (d);
        Double doubleobj1 = Double.valueOf(d);
        Double doubleobj2 = d;
        
        System.out.println(doubleobj);
        System.out.println(doubleobj1);
        System.out.println(doubleobj2);

        //char data type 
        char c = 'c';

        //Wraping around Character object 
        Character charobj = new Character(c);
        //OR
        Character charobj1 = Character.valueOf(c);
        //OR
        Character charobj2 = c;

        System.out.println(charobj);
        System.out.println(charobj1);
        System.out.println(charobj2);

        // objects to data types (retrieving data types from
        // objects) unwrapping objects to primitive data

        byte bv = byteobj;
        short sv = shortobj;
        int iv = intobj;
        char cv = charobj;
        double dv = doubleobj;
        float fv = floatobj;

        System.out.println(bv);
        System.out.println(sv);
        System.out.println(iv);
        System.out.println(cv);
        System.out.println(dv);
        System.out.println(fv);

    }
    
}
