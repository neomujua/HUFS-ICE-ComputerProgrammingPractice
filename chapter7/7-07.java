import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();
        HashSet<String> myHashSetSame = new HashSet<String>();
        boolean flag = true;
        while(flag) {
            Scanner in = new Scanner(System.in);
            String inString = in.nextLine();
            if(inString.equals("quit")) {
                break;
            } else {
                StringTokenizer inStr = new StringTokenizer(inString);
                while(inStr.hasMoreTokens()){
                    String wordInStr = inStr.nextToken();
                    if (myHashSet.contains(wordInStr)) {
                        myHashSetSame.add(wordInStr);
                    } else {
                        myHashSet.add(wordInStr);
                    }
                }
            }
        }
        myHashSet.removeAll(myHashSetSame);
        System.out.println("중복되지 않은 문자열 => " + myHashSet);
        System.out.println("중복된 문자열 => " + myHashSetSame);
    }
}