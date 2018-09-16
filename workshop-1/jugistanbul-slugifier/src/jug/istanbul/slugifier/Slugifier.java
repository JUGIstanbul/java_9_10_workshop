package jug.istanbul.slugifier;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.Normalizer;

public class Slugifier
{
    private Slugifier() {
    }
    
    public static String slugify ( String text ) throws UnsupportedEncodingException
    {
        if ( text == null || text.isEmpty() )
        {
            return "";
        }

        String normalizedText = normalize ( text )
            .replaceAll ( "[^\\w\\s\\-]", "" )
            .replaceAll ( " ", "-" )
            .toLowerCase ();
        return URLEncoder.encode ( normalizedText, "UTF-8" );
    }

    private static String convertCharactersFromTurkishToEnglish ( String text )
    {
        return text.replaceAll ( "ü", "u" )
            .replaceAll ( "ı", "i" )
            .replaceAll ( "ö", "o" )
            .replaceAll ( "ü", "u" )
            .replaceAll ( "ş", "s" )
            .replaceAll ( "ğ", "g" )
            .replaceAll ( "ç", "c" )
            .replaceAll ( "Ü", "U" )
            .replaceAll ( "İ", "I" )
            .replaceAll ( "Ö", "O" )
            .replaceAll ( "Ü", "U" )
            .replaceAll ( "Ş", "S" )
            .replaceAll ( "Ğ", "G" )
            .replaceAll ( "Ç", "C" );
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
