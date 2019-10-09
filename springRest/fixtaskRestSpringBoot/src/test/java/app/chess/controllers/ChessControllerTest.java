package app.chess.controllers;

import app.controllers.ChessController;
import app.reuqestForms.CountForRookMovesForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChessControllerTest {
    @MockBean
    private ChessController chessController;

    @Test
    public void count() {
        CountForRookMovesForm form = new CountForRookMovesForm();
        form.setEnd("B4");
        form.setStart("A2");
        form.setHeight(8);
        form.setWeight(8);
        chessController= new ChessController();
        Assert.assertEquals(ResponseEntity.ok(1),chessController.count(form));
    }
}
