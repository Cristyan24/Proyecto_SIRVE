
package prograproyecto;

public class Vehiculo {
    private String placa, dpi, nombre, marca, modelo;
    private int año, multas, traspasos;

    public Vehiculo(String[] datos) {
        this.placa = datos[0];
        this.dpi = datos[1];
        this.nombre = datos[2];
        this.marca = datos[3];
        this.modelo = datos[4];
        this.año = Integer.parseInt(datos[5]);
        this.multas = (datos.length > 6) ? Integer.parseInt(datos[6]) : 0;
        this.traspasos = (datos.length > 7) ? Integer.parseInt(datos[7]) : 0;
    }

    public String getPlaca() { return placa; }
    public String getDpi() { return dpi; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public int getMultas() { return multas; }
    public int getTraspasos() { return traspasos; }
}

