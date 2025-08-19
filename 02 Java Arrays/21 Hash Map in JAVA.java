
import java.util.HashMap;
import java.util.Map;
class Main{
    private static Map<String,Integer> createMap(){
        Map<String,Integer> map = new HashMap<>();
        return map;
    }
    private static void printMap( Map<String,Integer> map){
        for( String s : map.keySet()){
            System.out.println("key : " + s);
            System.out.println("Value : " + map.get(s));
        }
    }
    private static boolean findInMap(Map<String,Integer> map, String key){
        return map.containsKey(key);
    }
    private static void removeFromMap(Map<String,Integer> map, String key){
        map.remove(key);
    }
    public static void main( String [] args){
        Map<String,Integer> map = createMap();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        printMap(map);
        System.out.println(findInMap(map,"A"));
        System.out.println(findInMap(map,"X"));
        removeFromMap(map,"B");
        printMap(map);



    }
}