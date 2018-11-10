package OOP.Lab2;

import java.util.Scanner;

public class sixth{

    public static class inWords {
        public inWords(int n){

        }
        public String inWords(int number){
            int firstThree = number / 100;
            int secondTwo = number % 100;
            String s = "";
            s += three(firstThree);
            s += two(secondTwo);

            return s;
        }
        public String three(int number){
            int first = number / 100;
            int second = number / 10 % 10;
            int three = number % 10;
            String s = "";
            if(first != 0 && first != 1){
                s += morethantwenty(first) + " " + word(second) + " thousand";
                s+=" ";

            }
            if(first == 1) {
                s += twoWord(second) + " thousand";
                s += " ";

            }
            if(first == 0){
                if (second != 0) {
                    s += word(second) + " thousand";
                    s += " ";
                }
            }
            if(three != 0){
                s += word(three) + " hundred";
                s+=" ";

            }
            if(first + second + three > 0){
                s+= "[and] ";
            }
            return s;
        }

        public String two(int number){
            int first =number/10;
            int second =number%10;
            String s="";
            if(first!=0&&first!=1){
                s+=morethantwenty(first)+" ";
                s+=word(second);
            }
            if(first==1){
                s+=twoWord(second);
            }
            if(first==0){
                s+=word(second);
            }

            return s;

        }

        public String word(int number){
            String s = "";
            switch (number){
                case 1:
                    s = "one";
                    break;
                case 2:
                    s = "two";
                    break;
                case 3:
                    s = "three";
                    break;
                case 4:
                    s = "four";
                    break;
                case 5:
                    s = "five";
                    break;
                case 6:
                    s = "six";
                    break;
                case 7:
                    s = "seven";
                    break;
                case 8:
                    s = "eight";
                    break;
                case 9:
                    s = "nine";
                    break;
            }
            return s;
        }
        public String twoWord(int number){
            String s = "";
            switch (number){
                case 0: s = "ten";
                    break;
                case 1: s = "eleven";
                    break;
                case 2: s = "twelve";
                    break;
                case 3: s = "thirteen";
                    break;
                case 4: s = "fourteen";
                    break;
                case 5: s = "fifteen";
                    break;
                case 6: s = "sixteen";
                    break;
                case 7: s = "seventeen";
                    break;
                case 8: s = "eighteen";
                    break;
                case 9: s = "nineteen";
                    break;
            }
            return s;
        }
        public String morethantwenty(int number){
            String s = "";
            switch (number){
                case 2: s += "twenty";
                    break;
                case 3: s += "thirty";
                    break;
                case 4: s += "forty";
                    break;
                case 5: s += "fifty";
                    break;
                case 6: s += "sixty";
                    break;
                case 7: s += "seventy";
                    break;
                case 8: s += "eighty";
                    break;
                case 9: s += "ninety";
                    break;
            }
            return  s;
        }
    }


}