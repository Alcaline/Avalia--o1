package utfpr.ct.dainf.if62c.avaliacao;

/**
 * Representa uma poligonal fechada.
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Poligonal {
    private final Ponto[] vertices;
    
    /**
     * Construtor que inicializa a poligonal com um vetor de vértices recebido.
     * @param vertices Os vértices da poligonal
     */
    public Poligonal(Ponto[] vertices) {
        this.vertices = vertices;
    }
    
    /**
     * Construtor que inicializa um vetor de n+1 vértices.
     * @param n O número de vértices da poligonal
     */
    public Poligonal(int n) {
        vertices = new Ponto[n+1];
    }
    
    // Implmentar os seguintes métodos:
    // getVertice(int i)
    // setVertice(int i, double x, double y)
    // setVertice(int i, Ponto vertice)
    // getArea()
    // getPerimetro()
    
    /**
     * Método que retorna o ponto em um vertice desejado.
     * @param i O indice do vértice desejado
     * @return o ponto do vértice
     */
    public Ponto getVertice(int i) {
        if(vertices.length < i || i < 0)
            return null;
        return vertices[i];
    }
    
    /**
     * Método que altera o ponto em um vértice desejado com outro vertice.
     * @param i O indice do vértice desejado
     * @param vertice ponto do vertice para sobreescrever o anterior
     */
    public void setVertice(int i, Ponto vertice) {
        if(vertices.length > i && i > 0)
            vertices[i] = vertice;
    }
    
    /**
     * Método que altera o ponto em um vértice desejado com as coordenada do vértice.
     * @param i O indice do vértice desejado
     * @param x coordenada x do vertice para sobreescrever o anterior
     * @param y coordenada y do vertice para sobreescrever o anterior
     */
    public void setVertice(int i, double x, double y) {
        Ponto vertice = new Ponto(x,y);
        if(vertices.length > i && i > 0)
            vertices[i] = vertice;
    }
    
    /**
     * Método que retorna a área do polígono em questão.
     * @return Area do poligono
     */
    public double getArea() {
        double area = 0;
        for(int i = 0; i < vertices.length; i++)
            area += (vertices[i].getX() - vertices[i>0?i-1:vertices.length-1].getX())* 
                    (vertices[i].getY() + vertices[i>0?i-1:vertices.length-1].getY());
        area = Math.abs(area/2);
        return area;
    }
    
    /**
     * Método que retorna o perímetro do polígono em questão.
     * @return Perímetro do poligono
     */
    public double getPerimetro() {
        double perim = 0;
        for(int i = 0; i < vertices.length; i++)
            perim += Math.sqrt(Math.pow(vertices[i].getX() - vertices[i>0?i-1:vertices.length-1].getX(), 2)+ 
                               Math.pow(vertices[i].getY() - vertices[i>0?i-1:vertices.length-1].getY(), 2));
        return perim;
    }

}
