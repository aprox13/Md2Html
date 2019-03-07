package markup;

import java.util.List;

public class Strong extends EmptyMarkDown {
    public Strong(List<MarkDownElement> list) {
        super(list, "__", "\\textbf{");
    }
}
