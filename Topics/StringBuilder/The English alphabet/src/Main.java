/**
 * Here you need to prepare a StringBuilder that produces all English letters in the uppercase (A-Z). All the letters
 * should be separated by one space, but there shouldn't be a space after the last letter. Despite the possibility to
 * solve this problem without a StringBuilder at all, we highly recommend you to use it to get more practice.
 */

class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder();
        sb.append("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        return sb;
    }
}