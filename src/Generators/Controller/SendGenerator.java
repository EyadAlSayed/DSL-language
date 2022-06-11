package Generators.Controller;

import Models.ControllerModels.Send;

public class SendGenerator {
    StringBuilder stringBuilder = new StringBuilder();

    public String sendGenerator(Send send) {

        if (send.getSend() != null) {
            stringBuilder.append("header");
        }
        if (send.getOpenParBracktId() != null)
            stringBuilder.append(send.getOpenParBracktId()).append("'").append("Location:");

        if (send.getText() != null) {
            String text = send.getText().replace("\"",""); // delete DOUBLE_QUOTE from text file path
            stringBuilder.append(text);
        }

        if (send.getCloseParBracktId() != null)
            stringBuilder.append(".php").append("'").append(send.getCloseParBracktId());

        if (send.getEndStatement() != null)
            stringBuilder.append(send.getEndStatement());

        return stringBuilder.toString();
    }


}
