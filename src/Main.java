public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        // aynı isimdeki metodları bu şekilde kullanabilirsiniz.
        int toplam2 = dortIslem.topla(12,42);
        int toplam3 = dortIslem.topla(23,12,43);

        System.out.println("2 sayının toplamı : " + toplam2);
        System.out.println("3 sayının toplamı :" + toplam3 );

    }
}