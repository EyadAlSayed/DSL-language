package Visitors.ControllerVisitor;

import Models.ControllerModels.Bundle;
import Models.ControllerModels.Var;
import gen.DSLParser;

// EYAD
public class BundleVisitor  extends ControllerVisitor{

    private static BundleVisitor bundleVisitor;

    public static BundleVisitor getInstance(){
        if (bundleVisitor == null){
            bundleVisitor = new BundleVisitor();
        }
        return bundleVisitor;
    }

    @Override
    public Bundle visitBundle(DSLParser.BundleContext ctx) {
        Bundle bundle = new Bundle();
        bundle.setVar(visitVar(ctx.var()));

        if (ctx.ASSIGN() != null)
            bundle.setAssign(ctx.ASSIGN().getText());

        if (ctx.BUNDLE_ID() != null)
            bundle.setBundleId(ctx.BUNDLE_ID().getText());

        if (ctx.OPEN_SQR_BRACKT_ID() != null)
            bundle.setOpenSqrBracktId(ctx.OPEN_SQR_BRACKT_ID().getText());

        if (ctx.TEXT() != null)
            bundle.setText(ctx.TEXT().getText());

        if (ctx.CLOSE_SQR_BRACKT_ID() != null)
            bundle.setCloseSqrBracktId(ctx.CLOSE_SQR_BRACKT_ID().getText());
        return bundle;
    }



    @Override
    public Var visitVar(DSLParser.VarContext ctx) {
        Var var = new Var();
        if (ctx.VAR_NAME_ID() != null)
            var.setVarNameId(ctx.VAR_NAME_ID().getText());
        return var;
    }
}
