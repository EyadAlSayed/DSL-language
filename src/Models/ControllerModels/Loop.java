package Models.ControllerModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Loop extends Printer {

    String forId;
    String openParBracktId;
    String textNum1;
    String fileNameId1;
    String rang;
    String textNum2;
    String fileNameId2;
    String closeParBracktId;
    String openCurlyBracktId;
    final List<ControllerTokens> controllerTokens = new ArrayList<>();
    String closeCurlyBracktId;


    public String getForId() {
        return forId;
    }

    public void setForId(String forId) {
        this.forId = forId;
    }

    public String getOpenParBracktId() {
        return openParBracktId;
    }

    public void setOpenParBracktId(String openParBracktId) {
        this.openParBracktId = openParBracktId;
    }

    public String getTextNum1() {
        return textNum1;
    }

    public void setTextNum1(String textNum1) {
        this.textNum1 = textNum1;
    }

    public String getFileNameId1() {
        return fileNameId1;
    }

    public void setFileNameId1(String fileNameId1) {
        this.fileNameId1 = fileNameId1;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getTextNum2() {
        return textNum2;
    }

    public void setTextNum2(String textNum2) {
        this.textNum2 = textNum2;
    }

    public String getFileNameId2() {
        return fileNameId2;
    }

    public void setFileNameId2(String fileNameId2) {
        this.fileNameId2 = fileNameId2;
    }

    public String getCloseParBracktId() {
        return closeParBracktId;
    }

    public void setCloseParBracktId(String closeParBracktId) {
        this.closeParBracktId = closeParBracktId;
    }

    public String getOpenCurlyBracktId() {
        return openCurlyBracktId;
    }

    public void setOpenCurlyBracktId(String openCurlyBracktId) {
        this.openCurlyBracktId = openCurlyBracktId;
    }

    public List<ControllerTokens> getControllerTokens() {
        return controllerTokens;
    }

    public String getCloseCurlyBracktId() {
        return closeCurlyBracktId;
    }

    public void setCloseCurlyBracktId(String closeCurlyBracktId) {
        this.closeCurlyBracktId = closeCurlyBracktId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Loop",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("label","Loop");

        if (forId != null)
            map.put("forId",forId);

        if (openParBracktId != null)
            map.put("OpenParBracktId",openParBracktId);

        if (textNum1 != null)
            map.put("TextNum1",textNum1);

        if (fileNameId1 != null)
            map.put("fileNameId1",fileNameId1);

        if (rang != null)
            map.put("Rang",rang);

        if (textNum2 != null)
            map.put("TextNum2",textNum2);

        if (fileNameId2 != null)
            map.put("fileNameId2",fileNameId2);

        if (closeParBracktId != null)
            map.put("CloseParBracktId",closeParBracktId);

        if (openCurlyBracktId != null)
            map.put("OpenCurlyBrackId",openCurlyBracktId);

        if (controllerTokens.size() > 0){
            ArrayList<Map<String,Object>> list = new ArrayList<>();
            for (ControllerTokens ct: controllerTokens) {
                list.add(ct.toMap());
            }
            map.put("ControllerTokens",list);
        }

        if (closeCurlyBracktId != null)
            map.put("CloseCurlyBracktId",closeCurlyBracktId);

        return map;
    }
}
