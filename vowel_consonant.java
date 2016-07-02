public class vowel { 
     private static int ch;    
     public static void main(String[]args){     
        char vowel;
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter alphabet:" );     
        vowel=sc.next().charAt(0);

    switch (ch){    
        case 'a':     
        case 'A':     
        case 'e':     
        case 'E':     
        case 'i':     
        case 'I':     
        case 'o':     
        case 'O':     
        case 'u':     
        case 'U':    
           System.out.println("This is a Vowel:"+ vowel);
           break;
        default:
           System.out.println("This is a consonant:"+ vowel);
           break;

        }
    } 
}
