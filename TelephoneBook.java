import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class TelephoneBook{
    
    public static void NumbersAdding(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    
    public static void BookPrinting(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String telephones = «»;
            for(int elem : item.getValue()){
                telephones = telephones + elem + «, «;
            }
            System.out.printf(«%s: %s \n», item.getKey(), telephones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> telephoneBook = new HashMap<>();
        NumbersAdding(«Samsonov», 89167825436, telephoneBook);
        NumbersAdding(«Khramov», 89855693882, telephoneBook);
        NumbersAdding(«Petrov», 89855903827, telephoneBook);
        NumbersAdding(«Semenov», 89856094738, telephoneBook);
        NumbersAdding(«Khramov», 89859874385, telephoneBook);
        NumbersAdding(«Petrov», 8985865796, telephoneBook);
        BookPrinting(telephoneBook);
       }
}