public class SecondClass {

    public static void Tryme(int x){        
        for(int i = 0; i<x ;i++){
            for(int j = 0;j<i;j++){
                System.out.print('*');
                
            }
            System.out.print('\n');

        }
    }
    public static double Power (int x,int y){        
        double pr = 1 ;
        for(int i = 1; i<=y ;i++){
            pr = pr*x;
            }
        return pr;

        }
    }
