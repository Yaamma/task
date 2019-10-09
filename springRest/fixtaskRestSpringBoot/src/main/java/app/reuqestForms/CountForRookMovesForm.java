package app.reuqestForms;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CountForRookMovesForm {
    private int height,weight;
    private String end,start;
}
