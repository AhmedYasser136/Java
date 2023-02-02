
public class Example2 {


    public static void main (String args[]) {
        if (args[0] != null) {
            int check = 0;
            for (int i = 0; i < args.length; i++) {
                if (args[i] == "corejava") {

                    System.out.println("true . value :" + args[i]);
                    check = 1;
                }
            }

            if (check == 0) {
                System.out.println("false ");
            } else {
                System.out.println("no argument provieded .");
            }

        }
    }

}
