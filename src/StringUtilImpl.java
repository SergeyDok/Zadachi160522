
public class StringUtilImpl implements StringUtil {

    @Override
    public String getRevertedSubstring(String text, int startIndex, int endIndex) {
        String izmen = text.substring(startIndex,endIndex);
        return new StringBuilder(izmen).reverse().toString();
    }

    @Override
    public int countChar(String text, char charcter) {
        return text.length()-text.replaceAll(String.valueOf(charcter),"").length();
    }
}
