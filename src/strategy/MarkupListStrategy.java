package strategy;

public class MarkupListStrategy implements ListStrategy {

    @Override
    public void item(StringBuilder sb, String item) {
        sb.append(" * ").append(item).append(System.lineSeparator());
    }
}
