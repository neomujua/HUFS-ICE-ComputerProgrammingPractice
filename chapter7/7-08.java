import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] argsq) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        String args[] = {"java", "c", "java", "cpp", "cpp", "cobol", "java"};
        int countWord = 0;

        for(int i=0; i<args.length; i++) {
            if(myMap.containsKey(args[i])){
                myMap.put(args[i], myMap.get(args[i])+1);
            } else {
                myMap.put(args[i], 1);
                countWord += 1;
            }
        }
        
        System.out.println(Arrays.toString(args));
        System.out.printf("%d distinct words dected:\n", countWord);
        System.out.println(myMap);
    }
}