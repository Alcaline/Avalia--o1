package utfpr.ct.dainf.if62c.avaliacao;

import java.text.DecimalFormat;

/**
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Avaliacao1 {
    public static void main(String args[]){
        DecimalFormat formatar = new DecimalFormat("#.##");
        
        Ponto pontos[] = new Ponto[4];
        pontos[0] = new Ponto(1,1);
        pontos[1] = new Ponto(3,3);
        pontos[2] = new Ponto(6,3);
        pontos[3] = new Ponto(9,1);
        
        Poligonal poly = new Poligonal(pontos);
        
        System.out.println("Area: " + formatar.format(poly.getArea())+
                           "\nPerimetro: "+ formatar.format(poly.getPerimetro()));
    }    
}
