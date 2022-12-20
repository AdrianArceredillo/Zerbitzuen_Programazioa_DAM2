import java.io.Serializable;

class Persona implements Serializable{

    public String izena;
    public int urteak;
    
    Persona(String izena, int urteak) {
        this.izena = izena;
        this.urteak = urteak;     
    }

    public String getIzena() {
        return izena;
    }

    public int getUrteak() {
        return urteak;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setUrteak(int urteak) {
        this.urteak = urteak;
    }
    
}
