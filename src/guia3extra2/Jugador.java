
package guia3extra2;


class Jugador {
    String nombre;
    int clasificacion;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.clasificacion = 0;
    }

    
    public void tirarDado(Dado dado) {
        dado.generarNro();
        this.clasificacion += dado.verNro();
    }
    
    public int verClasificacion() {
        return this.clasificacion;
    }
}
