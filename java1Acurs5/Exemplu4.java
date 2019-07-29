public class Exemplu4 {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Gigel", 3);
        Angajat a2 = new Angajat("Maria", 4);
        
        Angajat a3 = new Angajat("Ion", 1) {
            @Override
            int getSalariu() {
                return 4000;
            }
        };
        
        System.out.println(a1.getSalariu());
        System.out.println(a2.getSalariu());
        System.out.println(a3.getSalariu());
    }
}