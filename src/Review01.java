
public class Review01 {

    public static void main(String[] args) {
        int zei=10;
        int price=1500;
        double result;
        result=tax(zei,price);
        int result2=(int)result;
        System.out.println(price+"円の商品の税込価格は"+(price+result2)+"円（消費税は"+result2+"円）です。");
    }

    public static double tax(int zei,int price) {
    double result=(int)price*(zei*0.01);
    return result;
    }
}