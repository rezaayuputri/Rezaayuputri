public class Lingkaran {
    private final double pi = 3.14;
    private double luas;
    private double jari = 3;

    public void reza(double jari) {
        luas = pi * jari * jari;
        System.out.println(" Luas lingkaran " + luas);
    }

    public static void main(String args) {
        Lingkaran luas = new Lingkaran();
        luas.reza (3);
    }
}

