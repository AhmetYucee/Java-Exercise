public class Sayikarsilastirma {
    public static void main(String[] args) {

//karşılaştırma için iki sayı tanımladık.
    int sayi1 = 10;
    int sayi2 = 20;

    if(sayi1 > sayi2){
        System.out.println(sayi1 + " büyüktür " + sayi2+ " sayısından");
    }
    else if(sayi1 < sayi2){
        System.out.println(sayi1 + " küçüktür " + sayi2+ " sayısından");
    }
    else{
        System.out.println(sayi1 + " eşittir " + sayi2);
    }
}

}
