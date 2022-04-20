package Models;


import org.apache.commons.collections.ArrayStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public abstract class Printer {

    protected StringBuilder getPrettyString(String label, Map map) {
        if (!map.isEmpty())
            return verbosePrintInternal(label, map, new ArrayStack(), false);
        else return new StringBuilder();

    }

    private static StringBuilder verbosePrintInternal(Object label, Map map, ArrayStack lineage, boolean isItemOfList) {
        StringBuilder str = new StringBuilder();

        str.append(printIndent(lineage.size()));
        if (map == null) {
            if (label != null && !isItemOfList) {
                str.append(label);
                str.append(" : ");
            }

            str.append("null");
            str.append("\n");
        } else {
            if (label != null) {
                str.append(label);
                str.append(" : ");
                str.append("\n");
            }

            str.append(printIndent(lineage.size()));

            str.append("{");
            str.append("\n");
            lineage.push(map);
            Iterator it = map.entrySet().iterator();

            while (true) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object childKey = entry.getKey();
                    Object childValue = entry.getValue();

                    if(childKey.toString().compareTo("label")==0){
                        continue;
                    }

                    if (childValue instanceof Map && !lineage.contains(childValue)) {
                        str.append(verbosePrintInternal(childKey == null ? "null" : childKey, (Map) childValue, lineage, false));
                    } else if (childValue instanceof List && !lineage.contains(childValue)) {
                        str.append(list((List<ArrayList<Map<String, Object>>>) childValue, lineage));

                    } else {
                        str.append(printIndent(lineage.size()));
                        str.append(childKey);
                        str.append(" : ");
                        int lineageIndex = lineage.indexOf(childValue);
                        if (lineageIndex == -1) {
                            str.append(childValue);
                        }

                        if (childValue != null) {
                            str.append("\n");
                        }
                    }
                }

                lineage.pop();


                str.append(printIndent(lineage.size()));
                str.append("}");

                str.append("\n");
                return str;
            }
        }
        return str;
    }

    private static StringBuilder list(List<ArrayList<Map<String, Object>>> list, ArrayStack lineage) {
        StringBuilder str = new StringBuilder();
        if (list.size() > 0) {
            str.append(printIndent(lineage.size()));
            str.append("[");
            str.append("\n");

            for (int i = 0; i < list.size(); ++i) {
                Map map = (Map<String, Object>) list.get(i);


                StringBuilder s = verbosePrintInternal(map.get("label").toString(), map, lineage, true);
                // StringBuilder s = verbosePrintInternal(null, map, lineage, true);
                str.append(s);
            }

            str.append(printIndent(lineage.size()));
            str.append("]");
            str.append("\n");

        }

        return str;
    }

    private static StringBuilder printIndent(int indent) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < indent; ++i) {
            str.append("    ");
        }
        return str;
    }

    public abstract Map<String, Object> toMap();

}
