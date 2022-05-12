public class Difference_Between_equals_And_eqaulity_operaror
{
   public static void main(String[] args)
 {
    String s1 = new String("HELLO");
    String s2 = new String("HELLO");
    String s3="Hello";
    String s4="Hello";
    String s5,s6;
    s5=s1;
    s6=s3;
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println(s3 == s4);
    System.out.println(s3.equals(s4));
    System.out.println(s1==s3);
    System.out.println(s1.equals(s3));
    System.out.println(s5 == s1);
    System.out.println(s1.equals(s5));
    System.out.println(s3 == s6);
    System.out.println(s3.equals(s6));
    System.out.println(s5.equals(s6));
    System.out.println(s5==s6);
    s5=s5+" World";
    s6=s6+" World";
    System.out.println("s1= "+s1);
    System.out.println("s5= "+s5);
    System.out.println("s3= "+s3);
    System.out.println("s6= "+s6);
    }  }
