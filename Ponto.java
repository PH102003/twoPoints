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
    public double equaçao(Ponto segundoPonto){
        //utilização de um outro parâmetro para servir de "auxiliar" no cálculo da equação, atribuindo um outro valor além do de this.x e this.y
        
        double resultado = Math.sqrt(Math.pow((segundoPonto.x -this.x), 2) + Math.pow((segundoPonto.y - this.y), 2));
        //raiz quadrada ( de (xb - xa)^2 + (yb-ya)^2) ;
        return resultado; 
    }
}

