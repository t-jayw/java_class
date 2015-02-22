class Guess4 {
    public static void main(String args[])
        throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("Guess letter btwn A-Z: ");

            ch = (char) System.in.read();
            
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            
            if (ch == answer) System.out.println("**RIGHT**");
            else {
                System.out.print("...Sorry, you're ");
                if(ch < answer) System.out.println("too low");
                else System.out.println("too hight");
                System.out.println("try again!\n");
            }
        } while (answer != ch);
    }
}
