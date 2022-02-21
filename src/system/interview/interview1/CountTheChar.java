package system.interview.interview1;

public class CountTheChar {
    public static void main(String[] args) {


        String str1 = "CyberTruck";
        int count = 0;
        str1 = str1.toLowerCase();
        String usedLetter = "";
        for(int i = 0; i<=str1.length()-1; i++) {
            count = 0;


            if (usedLetter.contains(str1.charAt(i) + ""))
                continue;
            // if we used the letter before it will skip this iterator/loop
            for (int j = 0; j <= str1.length() - 1; j++) {

                if (str1.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str1.charAt(i) + "=" + count);
            usedLetter += str1.charAt(i);
            System.out.println(usedLetter);

        }

            String letter = "Inshaalah";
            int num = 0;
            letter = letter.toLowerCase();

            String usedLetter1 = "";

            for(int i = 0; i <letter.length();i++){
                num = 0;

                if(usedLetter1.contains(letter.charAt(i)+""))
                    continue;

                for(int j =0; j<letter.length(); j++){

                    if(letter.charAt(i)==letter.charAt(j)){
                        num++;
                    }
                }

                System.out.println(letter.charAt(i)+"="+num);
                usedLetter1 += letter.charAt(i);
                System.out.println(usedLetter1);
            }




        }















    }

