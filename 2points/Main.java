public class Main{
    public static void main(String[] args) {
        //Ponto p1= new Ponto(1,1);
        //Ponto p2= new Ponto(5,4);
        Ponto t1 = new Ponto (1,1);
        Ponto t2 = new Ponto (2,2);
        Ponto t3 = new Ponto (3,3);

        Triangulo T = new Triangulo(t1,  t2, t3);
        
        //double distanciaentre2pontos = p1.equaçao(p2);
       // System.out.println("Seu resultado é:"+ distanciaentre2pontos);
        
        System.out.println(T.Area());

        Ponto t4 = new Ponto (1,1);
        Ponto t5 = new Ponto (5,4);
        Ponto t6 = new Ponto (5,1);

        Triangulo T2 = new Triangulo(t4, t5, t6);
        System.out.println(T2.Area());
        System.out.println(T2.perimetro());
    }
}
