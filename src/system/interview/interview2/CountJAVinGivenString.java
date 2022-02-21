package system.interview.interview2;

public class CountJAVinGivenString {
    public static void main(String[] args) {


        String st = "GenocideHappeningInChina,stopGenocide,ChinaIsResponsibleUyghurGenocide";
        int count =0;

       /*  first approach
       for(int i=0;i<st.length()-7;i++){
            if(st.substring(i,i+8).equalsIgnoreCase("genocide")){
                count++;


            }

        }
       System.out.println("Genocide occurrence: "+ count+ " times in given string");
*/
        //second approach
         st= st.toLowerCase();
        while (st.contains("genocide")){
            count++;
            st=st.replaceFirst("genocide","");


        }
        System.out.println(count+" times");

    }

}