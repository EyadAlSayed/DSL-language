package Visitors.PageVisitors;

import Models.PageModels.Form;
import gen.DSLParser;


public class FormVisitor {
    private Form form;
    private FormChildrenVisitor childrenVisitor;

    public FormVisitor() {
        this.childrenVisitor = new FormChildrenVisitor();
    }

    // @Override
    public Form visitForm(DSLParser.FormContext ctx) {
        Form form = new Form();
        if (ctx.POST_FORM() != null)
            form.setMethod("POST");
        else if (ctx.GET_FORM() != null)
            form.setMethod("GET");

        if (ctx.form_attribute() != null) {
            for (DSLParser.Form_attributeContext form_attribute : ctx.form_attribute()) {
                if (form_attribute.ACTION() != null)
                    form.setAction(form_attribute.TEXT().getText());
            }
        }

        if (ctx.children() != null) {
            for (DSLParser.ChildrenContext child : ctx.children())
                form.getNodes().add(childrenVisitor.visitChildren(child));
        }
        return form;
    }

 }
