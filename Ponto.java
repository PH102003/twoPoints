public class Ponto {
    //atributos
    public int x;
    public int y;
    //construtor
    public Ponto(int x , int y){
        this.x= x;
        this.y= y;

    }
    //método
    public double equaçao(Ponto ponto){
        double resultado = Math.sqrt(Math.pow((ponto.x -this.x), 2) + Math.pow((ponto.y - this.y), 2));
        return resultado; 
    }
}
