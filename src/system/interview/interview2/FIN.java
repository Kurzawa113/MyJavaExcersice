package system.interview.interview2;

public class FIN {
    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {
            String st ="";
            if (i % 3 == 0) st = "FIN";

            if (i % 5 == 0) st = "RA";


            if (st.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(st);
            }

        }


    }
}
