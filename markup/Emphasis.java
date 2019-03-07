package markup;

import java.util.List;

public class Emphasis extends EmptyMarkDown {
    public Emphasis(List<MarkDownElement> list) {
        super(list, "*", "\\emph{");
    }
}
