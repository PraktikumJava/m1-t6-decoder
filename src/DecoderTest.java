public class DecoderTest {

    public static void main(String[] args) {
        String cipher = "Оцъылм фтсфсд е ъип-хс угксдугхяфв зс нсрщг — ахс тстусдсегхя ргцълхя ахспц нсптябхиу.";

        System.out.println(new CaesarCipher().decipher(cipher, 3));
    }
}
