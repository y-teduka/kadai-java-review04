
public class Review01 {

    public static void main(String[] args) {
        int zei=10;
        int price=1500;
        int result;
        result=tax(zei,price);
        System.out.println(price+"円の商品の税込価格は"+(price+result)+"円（消費税は"+result+"円）です。");
    }

    public static int tax(int zei,int price) {
    int result=price/zei;
    return result;
    }
}
