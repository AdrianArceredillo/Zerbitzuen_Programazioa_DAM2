package socketprueba.objektuaBidali;

import java.io.Serializable;

public class Objektua implements Serializable {

    public String mezua;
    public int zenbakia;

    public Objektua() {

    }

    public Objektua(String mezua, int zenbakia) {
        this.mezua = mezua;
        this.zenbakia = zenbakia;
    }

    public String getMezua() {
        return mezua;
    }

    public void setMezua(String mezua) {
        this.mezua = mezua;
    }

    public int getZenbakia() {
        return zenbakia;
    }

    public void setZenbakia(int zenbakia) {
        this.zenbakia = zenbakia;
    }

    public String toString() {
        return "[Mezua: " + mezua + ", Zenbakia: " + zenbakia + "]";
    }

}
