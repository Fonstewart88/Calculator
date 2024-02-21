package calculator;

import java.util.Arrays;
import java.util.Scanner;
import calculator.Calculat;



public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Double a = sc.nextDouble();
        System.out.print("Выберите действие: ");
        sc.nextLine();
        String ch = sc.nextLine();
        System.out.print("Введите второе число: ");
        Double b = sc.nextDouble();
        
        

        Calculat calc = new Calculat(a, b, ch);
        calc.solution();
        calc.printRes();
        FileCalc write = new FileCalc();
        write.newFile();
        //write.newWriter(calc.log());
        write.newWrite(calc.log());
        //write.FileReade();
        
    
        
        
    }

    
}
