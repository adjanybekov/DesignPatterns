package strategy;

public interface ListStrategy {
    default void begin(StringBuilder sb) {
    }

    void item(StringBuilder sb, String item);

    default void end(StringBuilder sb) {
    }
}
