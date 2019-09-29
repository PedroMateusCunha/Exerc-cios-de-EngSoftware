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

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.liga();
        lampada2.desliga();

        System.out.println(lampada1.observa());
        System.out.println(lampada2.observa());
    }
}