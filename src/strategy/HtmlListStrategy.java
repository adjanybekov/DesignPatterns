package strategy;

public class HtmlListStrategy implements ListStrategy {
    @Override
    public void begin(StringBuilder sb) {
        sb.append("<ul>").append(System.lineSeparator());
    }

    @Override
    public void item(StringBuilder sb, String item) {
        sb.append("  <li>").append(item).append("</li>").append(System.lineSeparator());
    }


    @Override
    public void end(StringBuilder sb) {
        sb.append("</ul>").append(System.lineSeparator());
    }
}
