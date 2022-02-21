package system.interview.interview1;

public class HowManyTimesOccurrences {
    public static void main(String[] args) {


        String java1 = "java is so useful, java is most used, java is more professional programming language java";
        String java = "java is so useful, java is most used, java is more professional programming language j";
        int counter = 0;
        int counter2=0;

        while (java1.contains("java")){
            counter++;
         java1=java1.replaceFirst("java","");
        }

        System.out.println(counter+"  while loop");

        for (int i = 0; i < java.length() - 3; i++) {
            if (java.substring(i, (i + 4)).equalsIgnoreCase("java")) {
                counter2++;
            }
        }
        System.out.println(counter2+"  for loop");

    }


}

