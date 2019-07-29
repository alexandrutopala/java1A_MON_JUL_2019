public enum Anotimp {
    IARNA(4), PRIMAVARA(-1), VARA(2), TOAMNA(10);
    
    private int x;
    
    Anotimp(int x) {
        this.x = x;
    }
    
    public int getX() {
        return this.x;
    }
}