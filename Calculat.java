package calculator;

import java.util.Arrays;

import calculator.solutions.Operationable;

public class Calculat implements Operationable{
    
    
    double a;
    double b;
    double res;
    String simb;
    String err;



    Calculat (double a, double b, String simb){
    this.a = a;
    this.b = b;
    this.simb = simb;
    }

    public void solution(){
        if(simb.equals("+")){
            Operationable operation1;
            operation1 = (a,b) -> a + b;
            double res = operation1.calculate(a, b);
            this.res = res;
            
        }else if(simb.equals("-")){
            Operationable operation2;
            operation2 = (a,b) -> a - b;
            double res = operation2.calculate(a, b);
            this.res = res;
            
        }else if(simb.equals("*")){
            Operationable operation3;
            operation3 = (a,b) -> a * b;
            double res = operation3.calculate(a, b);
            this.res = res;
            
        }else if(simb.equals("/")){
            if(b == 0){
                System.out.println("Error, некорректное действие. На ноль делить нельзя");
                err = "Error, некорректное действие. На ноль делить нельзя";
            }else{
            Operationable operation4;
            operation4 = (a,b) -> a / b;
            double res = operation4.calculate(a, b);
            this.res = res;
            }
        }else{
            System.out.println("Error, некорректное действие");
            this.err = "Error, некорректное действие";
            
        }
       
    }

    public String log(){
        Object[] arr = {a,simb,b,"=",res,err};
        //return Arrays.toString(arr);
        //System.out.println(Arrays.toString(arr));
        return Arrays.toString(arr);
    }

    public void printRes(){
        System.out.println("Решение -->: "+ res);
    }

    @Override
    public double calculate(double x, double y) {
        return x+y;
    }

    public void getA(){
        System.out.println(a);
    }

    public void getB(){
        System.out.println(b);
    }

    public void getSimb(){
        System.out.println(simb);
    }

}
