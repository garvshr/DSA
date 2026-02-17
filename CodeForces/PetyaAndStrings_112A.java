public class PetyaAndStrings_112A {
    public static void main(String[] args) {
        java.util.Scanner ob = new java.util.Scanner(System.in);
        String str1 = ob.nextLine();
        String str2 = ob.nextLine();
        int result = str1.compareToIgnoreCase(str2);
        if(result < 0) {
            System.out.println("-1");
        } else if(result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
    
}
