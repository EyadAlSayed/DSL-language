package Visitors;


import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.nio.file.Files;

public class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        //throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        ProjectMain.ERROR=true;
        try {
            Files.writeString(ProjectMain.ERROR_FILE.toPath(),"line " + line + ":" + charPositionInLine + " " + msg+"\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
