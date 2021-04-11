public class TextFormater {

    public TextFormater(){
    }

/*
1. Метод принимает строку и возвращает кол-во слов в строке.
 */
    public Integer numberOfWords(String str){
        int count = 1;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
/*
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
*/
    public boolean consistsPalindrom(String str){

        boolean check = false;

        String[] words = str.split("\\s");

        for (int i = 0; i < words.length; i++){
            StringBuilder reversed = new StringBuilder(words[i]);
            if (reversed.reverse().toString().equals(words[i])){
                check = true;
                break;
            }
        }
        return check;
    }
}

