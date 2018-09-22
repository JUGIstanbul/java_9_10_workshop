package jug.istanbul.slugifier;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;

import static jug.istanbul.misc.TurkishCharacterConverter.convertCharactersFromTurkishToEnglish;

public class Slugifier {
    public static String slugify(String text) {
        if (text == null || text.length() == 0) {
            return "";
        }

        return URLEncoder.encode(normalize(text)
                    .replaceAll("[^\\w\\s\\-]", "")
                    .replaceAll("\\s", "-")
                    .toLowerCase(),
                StandardCharsets.UTF_8);

    }


    private static String normalize(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        String normalizedText = Normalizer.normalize(input, Normalizer.Form.NFD);
        return convertCharactersFromTurkishToEnglish(normalizedText);
    }
}
