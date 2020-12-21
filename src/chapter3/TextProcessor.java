package chapter3;

public class TextProcessor {

    public static void main(String[] args){
        countWords("I love Test Automation University");
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
}
