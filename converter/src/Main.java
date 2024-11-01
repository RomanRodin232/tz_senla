import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Добро пожаловать в конвертер валют.");
        boolean znv = true, znc = true;
        String valuta1 = "", valuta2 = "";
        Double result;
        while (znv) {
            System.out.print("Выберите валютю (RUB, EUR, USD, CNY, GBP): ");
            valuta1 = val.nextLine().toUpperCase();
            if (proverkaval(valuta1)) {
                znv = false;
            }
        }
        System.out.print("Введите количество (дробную часть через запятую): ");
        Double kolich = val.nextDouble();
        val.nextLine();
        while (znc) {
            System.out.print("Выберите валютю в которую нужно перевести (RUB, EUR, USD, CNY, GBP): ");
            valuta2 = val.nextLine().toUpperCase();
            if (proverkaval(valuta2)) {
                znc = false;
            }
        }
        switch (valuta1) {
            case "RUB":
                switch (valuta2){
                    case "USD":
                        result = kolich * 0.010307;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "EUR":
                        result = kolich * 0.009477;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "CNY":
                        result = kolich * 0.009477;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "GBP":
                        result = kolich * 0.009477;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "RUB":
                        System.out.println(kolich + valuta1 + " = " + kolich + valuta2);
                        break;
                }
                break;
            case "USD":
                switch (valuta2){
                    case "USD":
                        System.out.println(kolich + valuta1 + " = " + kolich + valuta2);
                        break;
                    case "EUR":
                        result = kolich * 0.92048;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "CNY":
                        result = kolich * 7.12;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "GBP":
                        result = kolich * 0.77429;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "RUB":
                        result = kolich * 97.02;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                }
                break;
            case "EUR":
                switch (valuta2){
                    case "USD":
                        result = kolich * 1.09;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "EUR":
                        System.out.println(kolich + valuta1 + " = " + kolich + valuta2);
                        break;
                    case "CNY":
                        result = kolich * 7.74;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "GBP":
                        result = kolich * 0.841181;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "RUB":
                        result = kolich * 105.52;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                }
                break;
            case "CNY":
                switch (valuta2){
                    case "USD":
                        result = kolich * 0.010307;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "EUR":
                        result = kolich * 0.009477;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "CNY":
                        System.out.println(kolich + valuta1 + " = " + kolich + valuta2);
                        break;
                    case "GBP":
                        result = kolich * 0.009477;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "RUB":
                        System.out.println(kolich + valuta1 + " = " + kolich + valuta2);
                        break;
                }
                break;
            case "GBP":
                switch (valuta2){
                    case "USD":
                        result = kolich * 1.29;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "EUR":
                        result = kolich * 1.19;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "CNY":
                        result = kolich * 9.2;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                    case "GBP":
                        System.out.println(kolich + valuta1 + " = " + kolich + valuta2);
                        break;
                    case "RUB":
                        result = kolich * 126.09;
                        System.out.println(kolich + valuta1 + " = " + result + valuta2);
                        break;
                }
                break;
        }
    }

    public static boolean proverkaval(String valuta){
        if(valuta.equals("RUB") || valuta.equals("EUR") || valuta.equals("USD") || valuta.equals("CNY") || valuta.equals("GBP")){
            return true;
        }
        else{
            System.out.println("Вы ввели неправильное значение.");
            return false;
        }
    }
}