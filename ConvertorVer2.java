
import java.util.Scanner;

public class ConvertorVer2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        println("Введите основание системы счисления, из которой нужно перевести число(От 2 до 21): ");
//        Основание системы счисления введеного числа
        int baseNow = in.nextInt();
        println("Введите число, для перевода: ");
//        Переменная для хранения введеного числа
        String IntegerInNow = in.next();
//        Перемннная для хранения результата
        String Integer=conversionInTen(IntegerInNow, baseNow);;
        println("Введите основание системы счисления, в которую нужно перевести(От 2 до 21): ");
//        Основание системы счисления, в которую нужно перевести число
        int baseNeed = in.nextInt();
        if (baseNeed == 10) {
            println(Integer);
        } else {
            Integer = conversionInBaseNeed(Integer, baseNeed);
            println(Integer);
        }

    }

    //    Метод для перевода числа из десятичной в любую другу систему счисления baseNeed
    static String conversionInBaseNeed(String IntegerA, int baseNeed) {

//        Переменная для перевода в другие СС путем деления
        int con=Integer.parseInt(IntegerA);
        IntegerA="";
        while (con>0){
            int value=con%baseNeed;
            IntegerA+=SwitchStr(value);
            con/=baseNeed;
        }
        StringBuffer buffer= new StringBuffer(IntegerA);
        IntegerA=buffer.reverse().toString();
        return IntegerA;
    }

    //    Метод для приведения числа в десятичну систему счисления из любой другой baseNow
    static String conversionInTen(String IntegerA, int baseNow){
//        Массив цифр для перевода в 10 СС
        String[] IntegerSplits=IntegerA.split("");
//        con=переменная для перевода в 10 СС, len-длинна массива цифр, count-счетчик для цикла
        int con=0, len=IntegerSplits.length, count=len-1;
        for (String value: IntegerSplits){
            int IntValue=SwitchInt(value);
            con+=IntValue*Math.pow(baseNow, count);
//            println(con);
            count--;
        }
        IntegerA=String.valueOf(con);
        return IntegerA;
    }


    public static void println(Object args) {
        System.out.println(String.valueOf(args));
    }
    //Метод для перевода из СС от 11 до 21
    static int SwitchInt(String value){
        switch (value) {
            case "A":
                return  10;
            case "B":
                return  11;
            case "C":
                return  12;
            case "D":
                return  13;
            case "E":
                return  14;
            case "F":
                return  15;
            case "G":
                return  16;
            case "H":
                return  17;
            case "I":
                return  18;
            case "J":
                return  19;
            case "K":
                return  20;
            default:
                return Integer.parseInt(value);
        }
    }
    //Метод для перевода в СС от 11 до 21
    static String SwitchStr(int value){
        switch (value) {
            case 10:
                return  "A";
            case 11:
                return  "B";
            case 12:
                return  "C";
            case 13:
                return  "D";
            case 14:
                return  "E";
            case 15:
                return  "F";
            case 16:
                return  "G";
            case 17:
                return  "H";
            case 18:
                return  "I";
            case 19:
                return  "J";
            case 20:
                return  "K";
            default:
                return String.valueOf(value);
        }
    }
}
