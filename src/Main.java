public class Main {
    public static void main(String[] args) {
        int sum = 0;
        String temp= "0";
        String str ="1,2,3,4,5,6,7,8,9,10";
        char ch= str.charAt(0);


        for (int i = 0; i < str.length() ; i++) {

        if (Character.isDigit(str.charAt(i))) {

           sum += str.charAt(i);


        } else {

            sum += Integer.parseInt(temp);

            temp = "0";
        }
    }
        System.out.println(sum);


    }
}