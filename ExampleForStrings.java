import java.lang.StringBuffer;
//String Vs String Buffer Vs String Builder

public class ExampleForStrings {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Human");
        System.out.println("Initial value of StringBuffer : "+s1);
        System.out.println("Getting index value of m: "+s1.indexOf("m"));
        String s2=s1.toString();
        System.out.println("Converted from StringBuffer to String: "+s2);
        concat(s2);
        s1.append(56);
        System.out.println("Modification Done in String buffer which are mutable: "+s1);
        toStringBuilder(s2);

    }
    public static void concat(String s1){
        //s1.toUpperCase();
        s1=s1.toUpperCase();
        System.out.println("Creating a new memory in static Pool : "+s1);
    }
    public static void toStringBuilder(String sb3){
        StringBuilder sb1=new StringBuilder(sb3);
        System.out.println("From String to StringBuilder : "+sb1);
        sb1.append("ity");
        System.out.println("Modified StringBuilder : "+sb1);

    }
}
