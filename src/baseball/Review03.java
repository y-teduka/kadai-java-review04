package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam toukyou = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam yokohama = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam hansin = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam hirosima = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam tyuuniti = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        
        toukyou.report();
        yokohama.report();
        hansin.report();
        yomiuri.report();
        hirosima.report();
        tyuuniti.report();
    }
    

}
