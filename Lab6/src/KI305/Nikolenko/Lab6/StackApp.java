package KI305.Nikolenko.Lab6;
/**
 * Class StackApp implements main method for Stack
 * class possibilities demonstration
 * @author Oleksandr Nikolenko
 * @version 1.0
 */
public class StackApp {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Stack <? super Data> Stack1 = new Stack <Data>(10);
        Stack1.Push(new text("Tania",5));
        Stack1.Push(new Variable("Integer",8));
        Stack1.Push(new Variable("Integer",8));
        Stack1.Push(new Variable("Integer",8));
        Stack1.Push(new Variable("Integer",8));
        Stack1.Push(new Variable("Integer",8));
        Stack1.Push(new Variable("Char",1));
        Stack1.Push(new text("Vitalii",7));
        Stack1.Push(new Variable("Float",4));
        System.out.print("___________________________________ \n");
        Stack1.getMin();
        Stack1.Pop();
        System.out.print("************************************ \n");
        System.out.println("Stack after delete element ");
        System.out.print("************************************ \n");
        Stack1.Print();

        System.out.println("Кількість об'єктів з ім'ям \"Integer\": " + Variable.getCountIntegerObjects());
    }
}
