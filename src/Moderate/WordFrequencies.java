package Moderate;
/*
Design a method to find the frequency if occurrences of any given word in a book. What if we are running this algorithm multiple times
 */
public class WordFrequencies {
    public static int getFrequency(String[] book, String word){
        word = word.trim().toLowerCase();
        int count = 0;
        for (String w: book){
            if (w.trim().toLowerCase().equals(word)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] book = {"cloud", "azure", "model", "cloud", "technology", "azure", "cloud"};
        System.out.println(getFrequency(book, "azure"));
    }
}
