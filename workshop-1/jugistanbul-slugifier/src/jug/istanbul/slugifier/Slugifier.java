package jug.istanbul.slugifier;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.Normalizer;

public class Slugifier
{
    public static String run ( String text )
    {
        if ( text == null || text.length () == 0 )
        {
            return "";
        }

        String toReturn = "";
        try
        {
            String normalizedText = normalize ( text );
            normalizedText = normalizedText.replaceAll ( "[^\\w\\s\\-]", "" );
            normalizedText = normalizedText.replaceAll ( " ", "-" );
            normalizedText = normalizedText.toLowerCase ();
            toReturn = URLEncoder.encode ( normalizedText, "UTF-8" );
        }
        catch ( UnsupportedEncodingException e )
        {
            // TODO: Log the exception
            e.printStackTrace ();
        }

        return toReturn;
    }

    public static String convertCharactersFromTurkishToEnglish ( String text )
    {
        text = text.replaceAll ( "ü", "u" );
        text = text.replaceAll ( "ı", "i" );
        text = text.replaceAll ( "ö", "o" );
        text = text.replaceAll ( "ü", "u" );
        text = text.replaceAll ( "ş", "s" );
        text = text.replaceAll ( "ğ", "g" );
        text = text.replaceAll ( "ç", "c" );
        text = text.replaceAll ( "Ü", "U" );
        text = text.replaceAll ( "İ", "I" );
        text = text.replaceAll ( "Ö", "O" );
        text = text.replaceAll ( "Ü", "U" );
        text = text.replaceAll ( "Ş", "S" );
        text = text.replaceAll ( "Ğ", "G" );
        text = text.replaceAll ( "Ç", "C" );
        return text;
    }

    private static String normalize ( String input )
    {
        if ( input == null || input.length () == 0 )
        {
            return "";
        }
        
        String normalizedText = Normalizer.normalize ( input, Normalizer.Form.NFD );
        return convertCharactersFromTurkishToEnglish ( normalizedText );
    }
}
