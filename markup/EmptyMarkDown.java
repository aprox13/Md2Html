package markup;

import java.util.ArrayList;
import java.util.List;

public abstract class EmptyMarkDown implements MarkDownElement {

    private List<MarkDownElement> elements;
    private final String openBorder, closeBorder, tex, closeTex;

    EmptyMarkDown(List<MarkDownElement> list, String border, String tex) {
        if (list == null) {
            elements = new ArrayList<>();
        } else {
            elements = list;
        }

        if (!border.equals("")) {
            openBorder = border;
            closeBorder = border;
        } else {
            openBorder = "";
            closeBorder = "";
        }
        this.tex = tex;
        if (tex.equals("")) {
            closeTex = "";
        } else {
            closeTex = "}";
        }
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder sb) {
        sb.append(openBorder);
        elements.forEach(element -> element.toMarkdown(sb));
        return sb.append(closeBorder);
    }

    @Override
    public StringBuilder toTex(StringBuilder sb) {
        sb.append(tex);
        elements.forEach(element -> element.toTex(sb));
        return sb.append(closeTex);

    }
}
