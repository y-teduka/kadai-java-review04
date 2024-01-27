package animal;

public class Human extends Animal implements Thinkable {
    private String syumi;

    public String getSyumi() {
        return syumi;
    }

    public void setSyumi(String syumi) {
        this.syumi = syumi;
    }

    public Human() {
    }

    public Human(String name, int age, String syumi) {
        super(name, age);
        this.syumi = syumi;
    }

    @Override
    public void think() {
        System.out.println("私は" + syumi + "について考えています。");
    }

}
