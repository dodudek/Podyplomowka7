public class TshirtTester {

    public static void main(String[] args) {

//        Tshirt tshirt = new Tshirt(TshirtSize.S, "Polex");

        Tshirt tshirt [] = new Tshirt[5];
        tshirt [0]  = new Tshirt(TshirtSize.S, "Polex");
        tshirt [1] = new Tshirt(TshirtSize.M, "MarcoPolo");
        tshirt [2] = new Tshirt(TshirtSize.L, "Polex");
        tshirt [3] = new Tshirt(TshirtSize.S, "C%A");
        tshirt [4] = new Tshirt(TshirtSize.XL, "H&M");

        for (Tshirt x:tshirt) {
            System.out.println("Posiadamy koszulkę marki " + x.getManufacture() + " o rozmiarze: " + x.getSize());
        }

    }
}
