
public class EnhancedForSample2 {

    public static void main(String[] args) {
        //繰り返し処理に利用する為、配列を準備
        int[]scores= {47,55,88,100,74};
        int sum=0;
        double average=0.0;
        //拡張for文にて記述した場合
        for(int data:scores) {
            sum=sum + data;
        }
        //平均点の算出（キャストあり）
        average=(double)sum/scores.length;
        //合計点と平均点の出力
        System.out.println("合計点は、"+sum+"点、平均点は、"+average+"点です。");
        
    }

}
