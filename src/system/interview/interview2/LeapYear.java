package system.interview.interview2;

public class LeapYear {
    public static void main(String[] args) {

        //divisble /4; ending with 00
        // century year is leap year only when its perfectly divisble by 400


        int year = 1600;
        boolean leap = false;

      if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }

        } else {
            leap = false;
        }


        if (leap) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year");
        }




     /*   if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;

                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap){
            System.out.println(year+" is a leap year");

    }else {
            System.out.println(year+" is not leap year");
        }

      */
    }


}







