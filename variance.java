//Calculate variance and variance percentage given 
//sales data for two years 2022 and 2021
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

         int sum21=0,sum22=0;
        int mean21=0,mean22=0;
        int sumsqr21=0,sumsqr22=0;
        //Calculate mean of sales
        for(int j=0;j<beverages.size();j++){
            sum21=sum21+sales2021.get(j);
            sum22=sum22+sales2022.get(j);
        }
        mean21=sum21/beverages.size();
        mean22=sum22/beverages.size();

        //To calculate sumofsquares
       
        for(int i=0;i<beverages.size();i++){
            
           int diff21=sales2021.get(i)-mean21;
            sumsqr21+=(diff21*diff21);
          
          int diff22=sales2022.get(i)-mean22;
             sumsqr22+=(diff22*diff22);
        }

        //To calculate variance

        double var21=sumsqr21/(beverages.size()-1);
        double var22=sumsqr22/(beverages.size()-1);
        //To caluculate variance percentage

        double variancepct = (var22 - var21) / var21 * 100.0;
       

        System.out.println("Variances of sales 2021: \n"+var21);
        System.out.println("Variances of sales 2022: \n"+var22);
        System.out.printf("Variance Pct: %.2f%%\n", variancepct);
    }
    
}




        
    }
    
}
