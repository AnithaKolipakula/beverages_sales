//Calculate variance(just difference between sales) and variance percentage given 
//sales data for two years 2022 and 2021
// this is my code
import java.util.*;
public class variance {
    public static void main(String args[]){
        List<String> beverages=new ArrayList<>();
        beverages.add("tea");
        beverages.add("coffee");
        beverages.add("greentea");
        beverages.add("orangesoda");
        beverages.add("lemonade");

        List<Integer> sales2021=new ArrayList<>();
        sales2021.add(120);
        sales2021.add(230);
        sales2021.add(60);
        sales2021.add(210);
        sales2021.add(205);
        List<Integer> sales2022=new ArrayList<>();
        sales2022.add(100);
        sales2022.add(250);
        sales2022.add(50);
        sales2022.add(180);
        sales2022.add(220);

        Map<String,Integer> variance=new LinkedHashMap<>();
        Map<String,Double> variancepct=new LinkedHashMap<>();
        for(int i=0;i<beverages.size();i++){
           
           int var=sales2022.get(i)-sales2021.get(i);
           variance.put(beverages.get(i),var);

           double varpct=((double)var/sales2022.get(i))*100;
           variancepct.put(beverages.get(i),varpct);
        }
        System.out.println("Variances of sales 2021 and 2022: \n"+variance);
        System.out.println("Variances Percentages of sales 2021 and 2022: \n"+variancepct);




        
    }
    
}








        
    
    

