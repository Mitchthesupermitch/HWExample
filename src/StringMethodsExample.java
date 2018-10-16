public class StringMethodsExample {


    public static boolean abcTest(String word){
        for(int i = 0; i < word.length()-2; i++){
            if((word.substring(i, i +1)).equals("a")&&(word.substring(i+1, i+2)).equals("b")&&(word.substring(i+2, i+3)).equals("c")){
                if(i==0){
                    return true;
                }else if ((word.substring(i-1,i)).equals(".")){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
    public static String alternateStrings(String str1, String str2){
        String newWord ="";
        while (newWord.length()!=(str1.length()+str2.length())){
            int stringLength = Math.min(str1.length(),str2.length());
            String longerString ="";
            if(str1.length()!=stringLength){
                longerString = str1;
            }else {
                longerString = str2;
            }
            for (int i =0; i<stringLength; i++){
                newWord = newWord+str1.substring(i,i+1);
                newWord = newWord+str2.substring(i,i+1);
            }
            newWord = newWord + longerString.substring(stringLength, longerString.length());
        }
        return newWord;
    }

}
