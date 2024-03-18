import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
public class LabOne{

    public static void getAllWordsOfLetter(String c, HashMap<String, ArrayList> dic){
        System.out.println("key " + c +  " " + dic.get(c));

    }
    public static void main(String[] args) {
        ArrayList<String> LetterA = new ArrayList<String>();
        LetterA.add("Asd");
        LetterA.add("apple");
        LetterA.add("ant");
        Collections.sort(LetterA);
        ArrayList<String> LetterB = new ArrayList<String>();
        LetterB.add("ball");
        LetterB.add("banana");
        Collections.sort(LetterB);

        ArrayList<String> LetterC = new ArrayList<String>();
        LetterC.add("circel");
        LetterC.add("call");
        LetterC.add("cat");
        Collections.sort(LetterC);

        HashMap<String, ArrayList> dic = new HashMap<String, ArrayList>();
        dic.put("a", LetterA);
        dic.put("b", LetterB);
        dic.put("c", LetterC);

        for (String i : dic.keySet()) {
            System.out.println("key: " + i + " value: " + dic.get(i));
        }

        LabOne.getAllWordsOfLetter("a",dic);

    }
}