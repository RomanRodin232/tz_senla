import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"ИГРА", "ПРОГРАММА", "МАШИНА", "СЕНЛА", "ВЫЧИСЛЕНИЕ", "КЛАВИАТУРА"};
        String qword = words[random.nextInt(words.length)];
        char[] hword = new char[qword.length()];
        Arrays.fill(hword, '_');
        int tries = 0;
        System.out.println("Добро пожаловать в игру \"Висилица\"!");

        while(tries < 7 && !qword.equals(String.valueOf(hword))){
            death(tries);
            System.out.println(hword);
            System.out.println("Ваши жизни: " + (7 - tries));
            System.out.print("Введите букву: ");
            boolean zh = false;
            String lword = letter.next();
            if(proverka(lword)){
                char ch = lword.toUpperCase().charAt(0);
                for (int i = 0; i < qword.length(); i++){
                    if(qword.charAt(i) == ch){
                    hword[i] = ch;
                    zh = true;
                    }
                }
                if(!zh){
                    System.out.println("Такой буквы нету, попробуйте ещё раз.");
                    tries += 1;
                }
            }
        }
        if(tries == 7){
            death(tries);
            System.out.println("Вы проиграли, у вас закончились жизни.");
            System.out.println("Загаданное слово: " + qword);
        }
        else{
            System.out.println("Поздравляю вы победили!");
        }
    }

    public static boolean proverka(String lword){
        Pattern patproverka = Pattern.compile("[а-яА-Я]{1}");
        Matcher matproverka = patproverka.matcher(lword);
        boolean prov = true;
        if (lword.length() > 1) {
            System.out.println("Введите только 1 букву.");
            prov = false;
        }
        else if(!matproverka.matches()){
            System.out.println("Необходимо вводить русские буквы.");
            prov = false;
        }
        return prov;
    }

    public static void death(int tries){
        System.out.println("--------");
        if (tries >= 1) {
            System.out.println(" |     |");
        }
        else{
            System.out.println("       |");
        }
        if (tries >= 2) {
            System.out.println(" 0     |");
        }
        else{
            System.out.println("       |");
        }
        if (tries >= 3) {
            if (tries - 3 == 0) System.out.println(" |     |");
            if (tries - 4 == 0) System.out.println("/|     |");
            if (tries >= 5) System.out.println("/|\\    |");
            System.out.println(" |     |");
        }
        else{
            System.out.println("       |");
            System.out.println("       |");
        }
        if (tries >= 6) {
            if (tries - 6 == 0) System.out.println("/      |");
            if (tries == 7) System.out.println("/ \\    |");
        }
        else{
            System.out.println("       |");
        }
        System.out.println("_______|_");
    }
}