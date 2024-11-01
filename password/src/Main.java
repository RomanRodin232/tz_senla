import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        System.out.println("Добро пожаловать в генератор случайного пароля!");
        boolean zh = true;
        Integer chislo = 0;
        while (zh){
            System.out.print("Введите длину пароля от 8 до 12 символов: ");
            chislo = el.nextInt();
            if (chislo > 12 || chislo < 8){
                System.out.println("Длина пароля должна быть от 8 до 12 символов");
            }
            else zh = false;
        }
        System.out.println("Предлагаемый пароль: " + generate(chislo));
    }

    public static String generate(int chislo){
        Random random = new Random();
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+=-`~|}{[]:;?><,./";;
        String fullstr = uppercaseChars + lowercaseChars + numbers + symbols;
        char[] password = new char[chislo];
        Arrays.fill(password, ' ');
        boolean zn = true;
        password[random.nextInt(chislo)] = uppercaseChars.charAt(random.nextInt(uppercaseChars.length()));
        while (zn){
            Integer rnd = random.nextInt(chislo);
            if(password[rnd] == ' ') {
                password[rnd] = lowercaseChars.charAt(random.nextInt(lowercaseChars.length()));
                zn = false;
            }
        }
        zn = true;
        while (zn){
            Integer rnd = random.nextInt(chislo);
            if(password[rnd] == ' ') {
                password[rnd] = numbers.charAt(random.nextInt(numbers.length()));
                zn = false;
            }
        }
        zn = true;
        while (zn){
            Integer rnd = random.nextInt(chislo);
            if(password[rnd] == ' ') {
                password[rnd] = symbols.charAt(random.nextInt(symbols.length()));
                zn = false;
            }
        }
        for (int i = 0; i < (chislo-4);){
            Integer rnd = random.nextInt(chislo);
            if(password[rnd] == ' ') {
                password[rnd] = fullstr.charAt(random.nextInt(fullstr.length()));
                i++;
            }
        }
        String fpassword = String.valueOf(password);
        return fpassword;
    }
}