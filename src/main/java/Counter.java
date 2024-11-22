import java.util.Arrays;

public class Counter {
    private int lineCount = 0;
    private int charCount = 0;
    private int wordCount = 0;

    private String longestWord = "";

    public void addLine(String line) {
        lineCount++;
        charCount += line.length();

        String[] words = line.split("\\s+");
        wordCount += Arrays.stream(words).filter(word -> !word.isBlank()).count();

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void printResults() {
        System.out.println("Number of lines entered (excluding 'stop'): " + lineCount);
        System.out.println("Total number of characters: " + charCount);
        System.out.println("Total number of words: " + wordCount);
        System.out.println("Longest word: " + (longestWord.isEmpty() ? "None" : longestWord));
    }
}

