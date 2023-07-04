package main.java.latihan5;
public class main {
    public static void main (String[] args) {
        String book = "https://www.gutenberg.org/cache/epub/159/pg159.txt";

        WordCounter pk = new WordCounter(book);

        System.out.println(pk.getCount("the"));
        System.out.println(pk.getCount("I"));
        System.out.println(pk.getCount("a"));

        System.out.println("Restu Andra Ahmad Saeroji // 22201170");
    }
}
