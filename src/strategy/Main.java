package strategy;

import java.util.List;

// example with the creating list in markdown & html
public class Main {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor(OutputFormat.HTML);
        textProcessor.appendList(List.of("milk", "cofee", "banana"));
        System.out.println(textProcessor.toString());

        textProcessor.clear();

        textProcessor.setOuputFormat(OutputFormat.MARKDOWN);
        textProcessor.appendList(List.of("milk", "cofee", "banana"));
        System.out.println(textProcessor.toString());

    }
}
