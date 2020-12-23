package strategy;

import java.util.List;

public class TextProcessor {
    private StringBuilder sb = new StringBuilder();
    private ListStrategy listStrategy;

    public TextProcessor(OutputFormat format) {
        setOuputFormat(format);
    }

    void setOuputFormat(OutputFormat format) {
        switch (format) {
            case HTML:
                listStrategy = new HtmlListStrategy();
                break;
            case MARKDOWN:
                listStrategy = new MarkupListStrategy();
                break;
        }
    }

    void appendList(List<String> items) {
        listStrategy.begin(sb);
        for (String item : items) {
            listStrategy.item(sb, item);
        }
        listStrategy.end(sb);
    }

    void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
