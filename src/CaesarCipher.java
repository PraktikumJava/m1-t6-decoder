public class CaesarCipher {

    private static final int ALPHABET_SIZE = 32;

    public String cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char letterA = Character.isLowerCase(character) ? 'а' : 'А';
                int originalAlphabetPosition = character - letterA;
                int newAlphabetPosition = (originalAlphabetPosition + offset) % ALPHABET_SIZE;
                char newCharacter = (char) (letterA + newAlphabetPosition);
                result.append(newCharacter);
            }
            else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public String decipher(String message, int offset) {
        return cipher(message, ALPHABET_SIZE - (offset % ALPHABET_SIZE));
    }

}
