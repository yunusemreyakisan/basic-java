public class AccountManager {
    private double bakiye;

    public void yatirilanPara(double miktar){
        bakiye = getBakiye() + miktar;
    }

    public void cekilenPara(double miktar) throws Exception {
        if(bakiye>=miktar){
            bakiye=getBakiye() - miktar;
        }else{
            throw new Exception("Bakiye yetersiz");
        }
    }
    public double getBakiye() {
        return bakiye;
    }
}
