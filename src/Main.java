public class Main {
    public static void main(String[] args) {
        int sum = 0;//хранения суммы всех найденных цифр.
        String str = "0,1,2,3,4,5,6,7,8,9";
        for (int i = 0; i < str.length(); i++) { //проходимся по всем символам строки
            char ch = str.charAt(i); //Программа берет символ из строки str, который находится на позиции i, и сохраняет его в переменной ch
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum = sum + digit;
            }
        }
        System.out.println(sum);
    }
}
