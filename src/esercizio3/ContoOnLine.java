package esercizio3;

public class ContoOnLine extends ContoCorrente{
    double maxPrelievo;
    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo= maxP;
    }
    void stampaSaldo(){
        System.out.println("titolare: " + titolare + "-saldo: " + saldo + "- Num movimenti: " + nMovimenti + "-Massimo movimenti: " + maxMovimenti + "-massimo prelievo possibile: " + maxPrelievo);
    }
    void preleva(double x){
        if(x<=maxPrelievo){
            super.preleva(x);
        }
    }
}
