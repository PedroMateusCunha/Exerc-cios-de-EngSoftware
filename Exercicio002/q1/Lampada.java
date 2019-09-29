public class Lampada{
    private boolean ligada = false;

    public void liga(){
        this.ligada = true;
    }

    public void desliga(){
        this.ligada = false;
    }

    public String observa(){
        if (this.ligada)
            return "ligada";
        else
            return "desligada";
    }

}