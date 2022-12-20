package socketprueba.tcp_udp.tcpObjetos;

import java.io.Serializable;

public class Ikaslea implements Serializable{
    int id;
    String izena;
    String abizena;
    
    public Ikaslea(int id, String izena, String abizena){
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }
    
    
}