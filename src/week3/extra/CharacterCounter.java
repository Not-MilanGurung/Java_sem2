package week3.extra;

public class CharacterCounter {
    public static void main(String[] args) {
        loopOverString("Milan234 *32");
    }
    /**
     * Loops over each character of the string and classifies them using
     * {@link #classifyCharacter(char)}, counts each type and prints total count
     * @param s String whose characters to classify
     */
    static void loopOverString(String s){
        int vowel, consonant, number, special;
        vowel = consonant = number = special = 0;
        for (char c : s.toCharArray()){
            switch(classifyCharacter(c)){
                case 0:
                    vowel++;
                    break;
                case 1:
                    consonant++;
                    break;
                case 2:
                    number++;
                    break;
                case 3:
                    special++;
            }
        }
        System.out.printf("There are %d vowels, %d consonants, %d number and %d special characters\n",
                            vowel, consonant, number, special);
    }
    /**
     * Classifies the entered character
     * @param c A ASCII character
     * @return 
     *  0 for Vowels
     *  
     */
    static int classifyCharacter(char c){
        switch (Character.getType(c)) {
            case Character.UPPERCASE_LETTER, Character.LOWERCASE_LETTER:
                switch (c) {
                    case 'a','e','i','o','u','A','E','I','O','U' :
                        return 0;
                    default:
                        return 1;
                }
            case Character.DECIMAL_DIGIT_NUMBER:
                return 2;
            default:
                return 3;
        }
    }
}
