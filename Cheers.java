// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheersIn = args [0];
        String cheer = cheersIn.toUpperCase();
        int count = Integer.parseInt(args[1]);
        int countA = cheer.length();//how many letter do i have in the cheer?
        if (count!=0)
        { 
                System.out.println(cheer);
        }
        String spacialLatter = "ABEFHILMNORSX";
        for (int i=0; i<countA; i++)
        {
                char letter = cheer.charAt(i);
                if (spacialLatter.indexOf(letter)!=-1)
                 {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                }
                else{
                        System.out.println("Give me a  " + letter + ": " + letter + "!");
                }
        }
        System.out.println("What does that spell?");
        for (int j=0; j<count;j++)
        {
                System.out.println(cheer + "!!!");
        }
        }
}
