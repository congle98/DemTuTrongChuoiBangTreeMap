import java.util.*;

public class demo {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        String str = "a b d s g h, H a D h h";
        treeMap=addString(str);
        System.out.println(treeMap);



//
//        String str = "Xin chào, tôi là sinh viên, tôi tôi đến từ bình định, bình định đầy nắng và gió";
//        str = str.replaceAll(",","");
//        String[] arr = str.split(" ");
//        String key="";
//        Integer value;
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        for(int i=0;i<arr.length;i++){
//            key = arr[i];
//            if(map.containsKey(key)){
//                value = map.get(key);
//                map.remove(key);
//                map.put(key, value+1);
//            } else{
//                map.put(key, new Integer(1));
//            }
//        }
//        // print result
//        Set set=map.keySet();
//        Iterator i = set.iterator();
//        while(i.hasNext()){
//            key=(String)i.next();
//            System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
//        }

    }



    static TreeMap<String,Integer> addString(String list){
        list = list.replace(",",""); // bỏ dấu ,
        String[]strings = list.split(" ");// lấy từ theo dấu cách
        TreeMap<String,Integer> stringTreeMap = new TreeMap<String,Integer>();

        for (int i = 0; i < strings.length; i++) {
            int value =0;
            String key=strings[i];
            for (int j = 0; j < strings.length; j++) {
                if(strings[i].equalsIgnoreCase(strings[j])){
                    value++;
                }
            }
            stringTreeMap.put(key.toUpperCase(Locale.ROOT),value);
        }
        return stringTreeMap;
    }
}
