import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    static class Item{
        int profit;
        int weight;
        Item( int weight,int profit){
            this.profit= profit;
            this.weight = weight;
        }
        public String toString(){
            return ""+this.profit +" - " + this.weight; 
        }
    }
    public static double knapsack(Item items[],int capacity){
        int i =0;
        double max = 0.0;
        while(capacity > 0 && i < items.length){
            
            if(items[i].weight < capacity ){
                
                max += items[i].profit;
               
                capacity -=  items[i].weight;
            }
            else{
                max += capacity * items[i].profit/(0.0+items[i].weight);
                capacity = 0;
            }
            i++;
            // System.out.println( max);
        }
        
        return max;
    }
    public static void main(String[] args) {
        Item items[] = new Item[6];
        items[0] = new Item(2,15);
        items[1] = new Item(5,14);
        items[2] = new Item(1,10);
        items[3] = new Item(3,45);
        items[4] = new Item(4,30);
        items[5] = new Item(6,50);
        Arrays.sort(items, new Comparator<Item>() {

            @Override
            public int compare(Item o1, Item o2) {
                double value1 = o1.profit/(o1.weight + 0.0);
                double value2 = o2.profit/(o2.weight + 0.0);
                if(value1 < value2){
                    return 1;
                }
                return -1;
            }
            
        });
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        System.out.println(knapsack(items, 7));
    }
}

