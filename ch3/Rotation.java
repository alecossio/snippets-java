public class Rotation {
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int ROTATION = 10;
    public static final String INPUT = "ALEJANDRO EL ZORRO";

    public static void main(String[] args) {
        Rotation rotation = new Rotation();

        rotation.run();
    }

    public char encrypt(char currentChar){
        //int t = (currentChar + ROTATION)%alphabet.length();
        int t = (currentChar + ROTATION)%alphabet.length();
        return (char)t;
    }

    public char decrypt(char currentChar){
        int t = (currentChar - ROTATION)%alphabet.length();
        return (char)t;
    }

    public void run() {
        char[] encrypted = new char[INPUT.length()];
        System.out.print("Encrypted: ");
        for(int i = 0; i < INPUT.length(); i++){
            char a = encrypt(INPUT.toCharArray()[i]);
            System.out.print((int)a);
            encrypted[i] = a;
        }
        System.out.println();
        System.out.print("Decrypted: ");
        for(char a : encrypted){
            System.out.print(decrypt(a));
        } 

        System.out.println("Plain text: " + INPUT);
        System.out.print("Plain numbers: ");
        for(char i : INPUT.toCharArray()){
            System.out.print((int)i + ", ");
        }
        System.out.println();
        System.out.print("Wrapped around numbers: ");
        for(char i : INPUT.toCharArray()){
            int j = (int)i;
            System.out.print(j%70 + ", ");
            
        }
        System.out.println();
        System.out.print("Sequential wrapped around numbers: ");
        for(int i=0; i<100; i++){
            System.out.print(i % 20 + ", ");
        }
        System.out.println();

            
    }
}