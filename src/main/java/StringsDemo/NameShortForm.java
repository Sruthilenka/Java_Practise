package StringsDemo;


//I/p-> Jaya Sachin Dev O/p-->J.S.Dev

public class NameShortForm {
    public static void shortForm(String s) {
        String[] s1 = s.split(" ");
        String result;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length-1; i++) {
            sb.append(s1[i].charAt(0)).append(".");
        }

        sb.append(s1[s1.length-1]);
        System.out.println(sb);
    }


    public static void main(String[] args) {
shortForm("Lenka Sruthi");
    }
}
