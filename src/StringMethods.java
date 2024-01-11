public class StringMethods {
    private static String JsonTextBox = """ 
            {
            "username": "applicant@gmail.com",
            "password": "pass1"
            }
            """;
    public static void main(String[] args) {

        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println(" x".isBlank());

        //repeat method
        System.out.println("one two ".repeat(1));

        //indentation
        System.out.println("one two".indent(2));
        System.out.println("  one two".indent(-2));

        //lines
        System.out.println("one two\none two three four".lines().toList());
        System.out.println(JsonTextBox);
        System.out.println(JsonTextBox.lines().toList());

        //Strip: Trim a line

        String a="Stripped";
        String b=" Stripped ";
        String c="Stripped ";
        String d=" Stripped ";
        System.out.println(a+" "+b);
        System.out.println(a.equals(b));
        System.out.println(a.equals(b.strip()));
        System.out.println(a.equals(b.strip()));

        System.out.println(c.stripLeading());
        System.out.println(d.stripTrailing());

        // String s=null;
        // System.out.println(s.isBlank());
    }

}
