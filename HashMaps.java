import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap < String , Integer > a = new HashMap<>();
        // string is key
        // Integer is value

        //.put to add and map keys to values
        //can have same values but not same keys
        //if we put another key with same name it will update first one

        a.put("atharv",1);
        a.put("shree",2);
        a.put("kunal",3);
        a.put("saurabh",4);
        a.put("raj",1);
        System.out.println(a); // order can be random not same like input
        a.put("shree",5); // it will update first shree value does not create another shree
        System.out.println(a);

        //.get to get value by key vice versa not possible

        System.out.println(a.get("atharv")); //  return value by key but vice versa not possible
        System.out.println(a.get(1)); // return null as there is no value assign to key 1

        //.containsKey() to know it contains key or not
        //.containsValue() to know it contains value or not

        System.out.println(a.containsKey("atharv"));
        System.out.println(a.containsValue(8));

        //.replace to replace already existing key with other value
        // if key does not exist already it will not replace

        a.replace("kunal",2);
        System.out.println(a);

        //.putIfAbsent to put if & only if key is absent

        a.putIfAbsent("saurabh",1); // does not done anything because saurabh already exist
        System.out.println(a);
        a.putIfAbsent("aditya",1);
        System.out.println(a);

        //.remove to remove

        a.remove("aditya");
        System.out.println(a);

        // iteration in hashmap

        for (String i : a.keySet()){
            System.out.println(i);
            System.out.println(a.get(i));

        }





    }
}
