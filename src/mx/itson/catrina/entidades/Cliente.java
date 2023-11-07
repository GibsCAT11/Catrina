/*
 * Esta es una clase llamada "Cliente" que representa a un cliente en un sistema.
 * Contiene atributos como id, nombre, dirección, ciudad, RFC y código postal.
 */
package mx.itson.catrina.entidades;

/**
 * @author GibsCAT11
 */

public class Cliente {
    
    // Atributos de la clase Cliente
    private String id;
    private String name;
    private String address;
    private String city;
    private String rfc;
    private String zip_code;

    // Método para obtener el valor del atributo "id"
    public String getId() {
        return id;
    }

    // Método para establecer el valor del atributo "id"
    public void setId(String id) {
        this.id = id;
    }

    // Método para obtener el valor del atributo "name"
    public String getName() {
        return name;
    }

    // Método para establecer el valor del atributo "name"
    public void setName(String name) {
        this.name = name;
    }

    // Método para obtener el valor del atributo "address"
    public String getAddress() {
        return address;
    }

    // Método para establecer el valor del atributo "address"
    public void setAddress(String address) {
        this.address = address;
    }

    // Método para obtener el valor del atributo "city"
    public String getCity() {
        return city;
    }

    // Método para establecer el valor del atributo "city"
    public void setCity(String city) {
        this.city = city;
    }

    // Método para obtener el valor del atributo "rfc"
    public String getRfc() {
        return rfc;
    }

    // Método para establecer el valor del atributo "rfc"
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    // Método para obtener el valor del atributo "zip_code"
    public String getZip_code() {
        return zip_code;
    }

    // Método para establecer el valor del atributo "zip_code"
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
}
