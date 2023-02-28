package javaTut.inheritance;
// import java.util.LinkedList;
import java.util.Stack;
public class StackDemo {

    public static boolean checkBrackets(String str){
        if(str.length() % 2 != 0){
            return false;
        }
        else{
            Stack<Character> balance = new Stack<>();
            
            for(int i = 0 ; i < str.length() ; i++ ){
                if(str.charAt(i) == '{' || str.charAt(i) == '[' ||str.charAt(i) == '(' ){
                    balance.push(str.charAt(i));
                }
                else{
                    if(balance.size() == 0 ){
                        return false;
                    }
                    if(str.charAt(i) == '}' && balance.pop() != '{' || str.charAt(i) == ']' && balance.pop() != '['  ||str.charAt(i) == ')' && balance.pop() != '(') {
                        return false;
                    }
                }
            }
            if(balance.size() >0 ){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        // LinkedList<Integer> obj = new LinkedList();
        // Integer i = new Integer(12);
        // obj.add(i);
        // obj.add(13);
        // obj.add(14);
        // obj.addFirst(11);
        // // obj.add("Aman");
        // System.out.println(obj);
        // System.out.println(obj.size());
        // obj.remove(i);
        // System.out.println(obj);


        String str = "{}[](){()}";
        System.out.println(checkBrackets(str));
        str = "{}[]({)}";
        System.out.println(checkBrackets(str));
        

    }
}
