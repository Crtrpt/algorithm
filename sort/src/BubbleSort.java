import java.util.Random;
import java.util.Vector;

/**
 * @author jzx
 * @date 2018/12/10 10:29
 * @Description:
 */
public class BubbleSort {
    public static void main(String[] strings){
        Vector<Integer> Datasource=new Vector<>(100);
        Random ran1 = new Random(100);
        for (int i=0;i<100;i++){
//            System.out.print(ran1.nextInt(100) + " ");
            Datasource.add(ran1.nextInt(100));
        }
        System.out.println("data source:>>>");
        System.out.println(Datasource);
        System.out.println("data source:<<<");
        for (int i=0;i<Datasource.size();i++){

        }
    }
}