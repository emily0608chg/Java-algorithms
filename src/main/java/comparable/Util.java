package comparable;

public class Util {

    public static void order(Object arr[], Criteria cr)
    {
        boolean order = false;
        while( !order )
        {
            order = true;
            for(int i = 0; i<arr.length-1; i++)
            {
                if(cr.compare(arr[i+1],arr[i])<0)
                {
                    Object aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    order = false;
                }
            }
        }
    }

    public static void print (Object arr []){
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr [i]);
        }
    }
}
