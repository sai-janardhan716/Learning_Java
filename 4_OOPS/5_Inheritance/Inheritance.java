// Inheritance :- The way of acquiring the attributes and methods from one class to another class
// In Java This will be done by using "extends" keyword
// SuperClass/Parentclass :- The class being inherit
// SubClass/ChildClass    :- The class which inherits from ParentClass/SuperClass

class Calc{
    public int add(int ... args){
        int sumResult = 0;
        for(int i=0;i<=args.length-1;i++){
            sumResult += args[i];
        }
        return sumResult;
    }
    public int sub(int ... args){
        int subResult = args[0];
        for(int i=1;i<=args.length -1;i++){
            subResult -= args[i];
        }
        return subResult;
    }
}

class AdvCalc extends Calc{
    // -> We are inheriting all the attributes and methods of class "Calc" to class "AdvCalc"
    // -> This is called Single Inheritance
    public int multi(int ... args){
        int multiResult = 1;
        for(int i = 0;i<=args.length-1;i++){
            multiResult *= args[i];
        }
        return multiResult;
    }
    public int divi(int ... args){
        int diviResult = args[0];
        for(int i = 1;i<=args.length-1;i++){
            diviResult /= args[i];
        }
        return diviResult;
    }
}

class AdvAdvCalc extends AdvCalc{
    // -> We are inheriting all the attributes and methods from the class "AdvCalc" and this "AdvCaclc" inherits from "Calc"
    // -> This is called MultiLevel Inheritance
    public int power(int base,int power){
        int result = 1;
        for(int i=1;i<=power;i++){
            result *= base;
        }
        return result;
    }
}

public class Inheritance {
    public int gani = 10;
    public static void main(String[] args){
        AdvAdvCalc obj = new AdvAdvCalc();
        int add = obj.add(4,3,4);
        System.out.println(add);
        int sub = obj.sub(4,3,4);
        System.out.println(sub);
        int mul = obj.multi(4,3,4);
        System.out.println(mul);
        int div = obj.divi(42,3,5);
        System.out.println(div);
        int pov = obj.power(4, 3);
        System.out.println(pov);
    }
}