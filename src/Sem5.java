import java.util.HashMap;
import java.util.Map;
public class Sem5 {
    public static void main(String[] args) {
        task0();
    }
    static  void task0(){
        telNumber telNumbers = new telNumber();
        telNumbers.add("Petr", 1223);
        telNumbers.add("Petrov", 8777);
        telNumbers.add("Alex", 656565);
        telNumbers.add("New", 45454);
        telNumbers.add("Petr", 44545);
        telNumbers.add("Ivan", 324334);
        telNumbers.add("Ivan", 3434);
        telNumbers.add("Petrov", 877227);
        telNumbers.add("Petrov", 2877227);
        telNumbers.add("Petrov", 1877227);
        System.out.println(telNumbers.getByLastName("Petrov"));
        System.out.println(telNumbers.getByTelNum(3434));
        System.out.println(telNumbers.getAll());

    }
}