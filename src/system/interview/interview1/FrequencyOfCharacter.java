package system.interview.interview1;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String  st ="AAABBBCDDEFGGGHH";
        String expected = "";
        for(int i = 0; i<st.length();i++){
            int num = 0;
            for(int j =0; j<st.length();j++){
                if(st.charAt(i)==st.charAt(j)){
                    num++;
                }
            }
            expected = st.charAt(i)+""+num;
            st =st.replace(""+st.charAt(i),"");
            i=-1;
            System.out.print(expected);
        }






    }
}
