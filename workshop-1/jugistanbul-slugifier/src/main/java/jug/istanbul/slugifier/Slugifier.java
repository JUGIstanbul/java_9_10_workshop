package jug.istanbul.slugifier;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.Normalizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Taner Diler (taner.diler@gmail.com)
 */
public class Slugifier {

    private static final Logger LOGGER  = Logger.getLogger(Slugifier.class.getName());

    public static String run(String text) {
        if (text == null || text.length() == 0) {
            return "";
        }

        String toReturn = "";
        try {
            String normalizedText = normalize(text);
            normalizedText = normalizedText.replaceAll("[^\\w\\s\\-]", "");
            normalizedText = normalizedText.replaceAll(" ", "-");
            normalizedText = normalizedText.toLowerCase();
            toReturn = URLEncoder.encode(normalizedText, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOGGER.log(Level.SEVERE, "Exception on slugify", e);
        }

        return toReturn;
    }

    public static String convertCharactersFromTurkishToEnglish(String text) {
        text = text.replaceAll("ü", "u");
        text = text.replaceAll("ı", "i");
        text = text.replaceAll("ö", "o");
        text = text.replaceAll("ü", "u");
        text = text.replaceAll("ş", "s");
        text = text.replaceAll("ğ", "g");
        text = text.replaceAll("ç", "c");
        text = text.replaceAll("Ü", "U");
        text = text.replaceAll("İ", "I");
        text = text.replaceAll("Ö", "O");
        text = text.replaceAll("Ü", "U");
        text = text.replaceAll("Ş", "S");
        text = text.replaceAll("Ğ", "G");
        text = text.replaceAll("Ç", "C");
        return text;
    }

    private static String normalize(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        String normalizedText = Normalizer.normalize(input, Normalizer.Form.NFD);
        return convertCharactersFromTurkishToEnglish(normalizedText);
    }

    public static void main(String[] args) {
        if(args.length ==0) {
            System.out.println("Please send text to slugify as first parameter");
            System.out.println("Example : java ... jug.istanbul.slufigier \"Lorem ipsum dolor sit amet, consectetur adipiscing elit.\"");
        }
        else{
            System.out.println("Text :" + args[0]);
            System.out.println("Slugified Text : " + run(args[0]));
        }
    }
}
