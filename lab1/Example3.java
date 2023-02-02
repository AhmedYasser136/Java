
public class Example2 {


    public static void main (String args[]) {
        if (args.length < 2) {
          System.out.println("not enough")
          return
            }

            int loops = Integer.parseInt(args[0]);
            if (args[1].equals("corejava")) {
            for (int i=0 ; i<loops ; i++){
               System.out.println(args[1]);

            }
            }
             else {
                System.out.println("false keyword");
            }

        }
    }


