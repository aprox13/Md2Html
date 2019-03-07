package markup;

public interface MarkDownElement {
    StringBuilder toMarkdown(StringBuilder sb);
    StringBuilder toTex(StringBuilder sb);
}
