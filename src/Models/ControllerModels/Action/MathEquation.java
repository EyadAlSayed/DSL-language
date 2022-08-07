package Models.ControllerModels.Action;

import Models.ControllerModels.If.BinaryEqualCondition;
import Models.Printer;
import gen.DSLParser;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MathEquation extends Printer {

    String fileNameId;
    String assignOpId;
    SimpleMathEquation simpleMathEquation;
    List<ComplexMathEquation> complexMathEquationList;
    String endStatementId;

    public String getFileNameId() {
        return fileNameId;
    }

    public void setFileNameId(String fileNameId) {
        this.fileNameId = fileNameId;
    }

    public String getAssignOpId() {
        return assignOpId;
    }

    public void setAssignOpId(String assignOpId) {
        this.assignOpId = assignOpId;
    }

    public SimpleMathEquation getSimpleMathEquation() {
        return simpleMathEquation;
    }

    public void setSimpleMathEquation(SimpleMathEquation simpleMathEquation) {
        this.simpleMathEquation = simpleMathEquation;
    }

    public List<ComplexMathEquation> getComplexMathEquationList() {
        return complexMathEquationList;
    }

    public void setComplexMathEquationList(List<ComplexMathEquation> complexMathEquationList) {
        this.complexMathEquationList = complexMathEquationList;
    }

    public String getEndStatementId() {
        return endStatementId;
    }

    public void setEndStatementId(String endStatementId) {
        this.endStatementId = endStatementId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("MathEquation", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("label", "MathEquation");

        if (fileNameId != null)
            map.put("fileNameId", fileNameId);
        if (assignOpId != null)
            map.put("assignOpId", assignOpId);
        if (simpleMathEquation != null)
            map.put("simpleMathEquation", simpleMathEquation.toMap());

        if (complexMathEquationList.size() > 0) {
            ArrayList<Map<String, Object>> list = new ArrayList<>();
            for (ComplexMathEquation cme : complexMathEquationList) {
                list.add(cme.toMap());
            }
            map.put("complexMathEquation", list);
        }

        if (endStatementId != null)
            map.put("endStatementId", endStatementId);

        return map;
    }
}
