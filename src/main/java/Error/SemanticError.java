package Error;

import java.lang.*;

public class SemanticError extends Exception {

    public SemanticError(int line, String str) {
        super("[" + Integer.toString(line) + "] " + str);
    }

    public SemanticError(String str) {
        super(str);
    }
}
