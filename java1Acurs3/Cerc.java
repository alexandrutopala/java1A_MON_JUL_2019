public class Cerc {
    Punct centru;
    int raza;
    
    Cerc(Punct centru, int raza) {
        this.centru = centru;
        this.raza = raza;
    }
    
    double getArie() {
        return Math.PI * raza * raza;
    }
    
    boolean isInside(Punct p) {
        return p.getDistance(centru) <= raza;
    }
    
    
    
    
}