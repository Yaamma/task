package app.controllers;

import app.chess.rook.RookMoves;
import app.reuqestForms.CountForRookMovesForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChessController {
    @GetMapping("/hourse/rest/count")
    public ResponseEntity<Object> count(CountForRookMovesForm form){

 return new ResponseEntity<>(RookMoves.findAnswer(form.getWeight(),
         form.getHeight(),form.getStart(),
         form.getEnd()),HttpStatus.OK);
    }
}
