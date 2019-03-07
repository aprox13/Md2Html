package markup;

import java.util.List;

public class Strikeout extends EmptyMarkDown {
    public Strikeout(List<MarkDownElement> list) {
        super(list, "~", "\\textst{");
    }
}
