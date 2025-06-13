
package prograproyecto;

public class Vehiculo {
    private String placa, dpi, nombre, marca, modelo, departamento;
    private int año, multas, traspasos;

    public Vehiculo(String[] datos, String nombreDepartamento) {
        this.placa = datos[0];
        this.dpi = datos[1];
        this.nombre = datos[2];
        this.marca = datos[3];
        this.modelo = datos[4];
        this.año = Integer.parseInt(datos[5]);
        this.multas = (datos.length > 6) ? Integer.parseInt(datos[6]) : 0;
        this.traspasos = (datos.length > 7) ? Integer.parseInt(datos[7]) : 0;
        this.departamento = nombreDepartamento;
    }

    public String getPlaca() { return placa; }
    public String getDpi() { return dpi; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public int getMultas() { return multas; }
    public int getTraspasos() { return traspasos; }
    public String getDepartamento() { return departamento; }
    
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setAño(int año) { this.año = año; }

}

