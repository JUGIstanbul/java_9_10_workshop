package jug.istanbul.misc;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
public class TurkishCharacterConverter {
    public static String convertCharactersFromTurkishToEnglish(String text) {
        return text.replaceAll("ü", "u")
                .replaceAll("ı", "i")
                .replaceAll("ö", "o")
                .replaceAll("ü", "u")
                .replaceAll("ş", "s")
                .replaceAll("ğ", "g")
                .replaceAll("ç", "c")
                .replaceAll("Ü", "U")
                .replaceAll("İ", "I")
                .replaceAll("Ö", "O")
                .replaceAll("Ü", "U")
                .replaceAll("Ş", "S")
                .replaceAll("Ğ", "G")
                .replaceAll("Ç", "C");

    }
}
