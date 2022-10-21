public class StringBuilder1 {

    public static void main(String[] args) {
        System.out.println("\nHello repo-github!\n-------------------");


        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend\n";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);


        StringBuilder sb = new StringBuilder("--Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());

    }
}
