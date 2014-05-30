package utfpr.ct.dainf.if62c.avaliacao;

/**
 * Representa um ponto no plano.
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Ponto {
    
    // as coordenadas do ponto
    private double x;
    private double y;
    
    /**
     * Construtor que inicializa as coordenadas do ponto.
     * @param x A coordenada x do ponto
     * @param y A coordenada y do ponto
     */
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Implementar os seguintes métodos:
    // getX()
    // getY()
    // setXY(double x, double y)
    
    /**
     * Método para retornar a coordenada x do ponto.
     * @return A coordenada x do ponto
     */
    public double getX() {
        return x;
    }
    
    /**
     * Método para retornar a coordenada y do ponto.
     * @return A coordenada x do ponto
     */
    public double getY() {
        return y;
    }
    
    /**
     * Método que altera as coordenadas do ponto.
     * @param x A coordenada x do ponto para ser alterada
     * @param y A coordenada y do ponto para ser alterada
     */
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Retorna uma representação textual do ponto no formato (x, y).
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        String coord = "("+ x +", "+ y +")";
        s.append(coord);
        return s.toString();
    }   
}
