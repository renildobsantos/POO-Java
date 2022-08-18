package Televisao;

public class Main {
    public static void main(String[] args) {

        Tv novaTv = new Tv("Smart", "32'", "Preta", "Sansung");
        System.out.println("MODELO: " + novaTv.getModelo());
        System.out.println("POLEGADAS: " + novaTv.getTamanho());
        System.out.println("COR: " + novaTv.getCor());
        System.out.println("MARCA: " + novaTv.getMarca());
    }
}
