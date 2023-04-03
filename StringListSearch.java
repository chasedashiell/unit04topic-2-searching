import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(term)){
                return i;
            }
        }
        return -1;
    }

    public static int orderedLinearSearch(ArrayList<String> items, String term){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).compareTo(term) == 0){
                return i;
            } else if (items.get(i).compareTo(term) > 0){
                return -1;
            }
        }
        return -1;
    }
    
    public static int orderedBinarySearch(ArrayList<String> items, String term){
        int max = items.size()-1;
        int mid = items.size()/2;
        int min = 0;
        for(int i = 0; i < items.size(); i++){
            if (items.get(mid).compareTo(term) == 0){
                return mid;
            } else if(items.get(mid).compareTo(term) <0){
                max = mid;
                mid = max /2;
            } else if (items.get(mid). compareTo(term) > 0){
                min = mid; 
                mid = (min + max) / 2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}