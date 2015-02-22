class DWDemo {
    public static void main(String args[])
        throws java.io.IOException{

        char ch;
        do {
            System.out.print("press a key followed by Enter: ");
            ch = (char) System.in.read(); // get char
        } while(ch != 'q');
    }
}
