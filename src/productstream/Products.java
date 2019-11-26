package productstream;

/**
 *
 * @author Alba
 */
public class Products {

    /**
     * a)Clase Product: debe ter tres variables privadas:
     *        codigo tipo String
     *        descricion tipo String 
     *        prezo tipo Double 
     * O contructor por defecto introducira cadeas nulas nas variables codigo e 
     * descricion e un cero no prezo. A clase debe ter outro constructor con 
     * pase de tres parametros (codigo, descricion e prezo)
     */

    private String codigo, descricion;
    private double prezo;

    public Products() {
        this.codigo = null;
        this.descricion = null;
        this.prezo = 0;
    }

    public Products(String codigo, String descricion, double prezo) {
        this.codigo = codigo;
        this.descricion = descricion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

}
