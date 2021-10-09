
package Entidad;


public class usuario {
    private int id;
    private String nomUsuario;
    private String clave;
    private String idempleado;
    
    //constructor vacio 

    public usuario() {
    }
    
    //constructor que devuelve valores

    public usuario(int id, String nomUsuario, String clave, String idempleado) {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.clave = clave;
        this.idempleado = idempleado;
    }
    
    //crear metodo Get y SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }
    
    
}
