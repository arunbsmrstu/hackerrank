
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;



public class Test {
    
    public static void print(HashMap <String,Integer> map){
        if(map.isEmpty()){
            System.out.println("MAP is Empty");
        }else{
            System.out.println("CAR LIST "+map);
        }
    }
    
    //10, 34, 5, 10, 3, 5, 10
    public static void printFreqHashMap(int[] arr){
        HashMap<Integer , Integer> map= new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            Integer c=map.get(arr[i]);
            if(map.get(arr[i])==null){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], ++c);
            }
        
        }
        
        
        // Print result 
        for (Map.Entry m:map.entrySet()) 
          System.out.println("Frequency of " + m.getKey() +  
                             " is " + m.getValue()); 
    
    }

    public static void main(String args[]) throws IOException {
//        HashMap <String,Integer> map = new HashMap();
//        print(map);
//        map.put("Ferarri", 10);
//        map.put("BMW", 20);
//        map.put("Lamborghini", 30);
//        map.put("Audi", 40);
//        
//        print(map);
//        
//        if(map.containsKey("Ferarri")){
//            System.out.println(">>>Value of Ferarri is "+map.get("Ferarri"));
//        }
//        
//        map.clear();
//        
//        print(map);

//         int arr[] = {10, 34, 5, 10, 3, 5, 10}; 
//         printFreqHashMap(arr);

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String value= in.readLine();
            for(int i=0;i<value.length();i++){
                System.out.println(value.charAt(i));
            }
            
            
        
    }
}
