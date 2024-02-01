public class Bola {
    private String cor;

    public Bola(String cor)
    {
        this.cor = cor;
    }
    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getCor()
    {
        return cor;
    }


    public static void main(String[] args) {
      
        Bola minhBola = new Bola("vermelho");
        System.out.println("Cor da bola: " + minhBola.getCor());

        minhBola.setCor("azul");
        System.out.println("nova cor da bola: " + minhBola.getCor());
    }
}
