public class Triangulo {
    Ponto t1;
    Ponto t2;
    Ponto t3;

    public Triangulo(Ponto t1, Ponto t2, Ponto t3){
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;

    }
    
    public double Area(){
        double resultadosPositivos;
        double resultadosNegativos;
        
        resultadosPositivos = (t1.x * t2.y)+ (t1.y * t3.x) + (t2.x * t3.y);  
        resultadosNegativos = (-1) * (t1.y * t2.x)+ (t1.x * t3.y) + (t2.y * t3.x);  
        double resposta;
        
        resposta = (resultadosPositivos + resultadosNegativos) /2;
        return resposta;
    }

    public double perimetro(){

        return t1.equaçao(t2) + t2.equaçao(t3) + t3.equaçao(t1);
    }
}   
