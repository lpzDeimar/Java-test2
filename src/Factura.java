public class Factura {
    private String numero;
    private String descripcion;
    private int nArticulos;
    private double precioArticulo;

    public Factura(String numero, String descripcion,int nArticulos, double precioArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.nArticulos = nArticulos;
        this.precioArticulo = precioArticulo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        precioArticulo = precioArticulo;
    }

    public int getnArticulos() {
        return nArticulos;
    }

    public void setnArticulos(int nArticulos) {
        this.nArticulos = nArticulos;
    }

    public double getTotalFatura(){
        if(this.nArticulos * this.precioArticulo<0){
          return 0;
        }else{
            return this.nArticulos * this.precioArticulo;
        }
    }
}
