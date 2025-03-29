import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tt = in.nextInt();
        while(tt-- >0)
        {
            int n = in.nextInt(); 
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(in.nextInt());
            }
            int sum = 0;
            int p =1;
            for(int i=0;i<n;i++)
            {
                sum+=list.get(i);
                p*=list.get(i);
            }
           
                int i =0 ;
                int op=0;
             while(sum<0 && i<n)
             {
                if(list.get(i)<0)
                {
                    list.set(i,1);
                    sum+=2;
                    op++;
                }
                i++;
             }     
            //  System.out.print(list);
            //  System.out.println(sum); 
            //  System.out.println("op" + op);  
            int cntn = 0;
             for(int j=0;j<list.size();j++)
            {
                
                if(list.get(j)<0)
                ++cntn;
            }
            // System.out.println("cntn%2 = "+ cntn);   
            System.out.println(op + cntn%2 );   
       
            
        }
        in.close();
    }

}
