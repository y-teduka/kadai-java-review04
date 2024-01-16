
public class EnhancedForSample1 {

    public static void main(String[] args) {
        // 繰り返し処理に利用する為、配列を準備
        int [] scores= {47,55,88,100,74};
        int sum=0;
        double average=0.0;
        
        //for文にて記述した場合
        for(int i=0;i<scores.length;i++) {
           sum=sum+scores[i];
           
        }
        //平均点の算出
        average=(double) sum/scores.length;
        
        System.out.println("合計点は、"+sum+"点、平均点は、"+average+"点です。");
    }

}
