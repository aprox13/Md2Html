package markup;

public class Text implements MarkDownElement {

    private final String text;
    private final String border;

    public Text(String text) {
        this.text = text;
        border = "";
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        return sb.append(border).append(text).append(border);
    }

    @Override
    public StringBuilder toTex(StringBuilder sb) {
        return sb.append(text);
    }
}
