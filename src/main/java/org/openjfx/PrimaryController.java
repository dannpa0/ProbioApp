package org.openjfx;

import java.io.IOException;

import com.probio.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    public void switchToSecondary() throws IOException {
        App.setRoot("secondary");


    }
}
