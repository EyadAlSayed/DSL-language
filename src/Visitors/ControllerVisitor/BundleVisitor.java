package Visitors.ControllerVisitor;

import Models.ControllerModels.Bundle;
import Models.ControllerModels.Var;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import org.antlr.v4.runtime.misc.Pair;

// EYAD
public class BundleVisitor extends ControllerVisitor {

    private static BundleVisitor bundleVisitor;

    public static BundleVisitor getInstance() {
        if (bundleVisitor == null) {
            bundleVisitor = new BundleVisitor();
        }
        return bundleVisitor;
    }


    public Bundle visitBundle(DSLParser.BundleContext ctx,Object father) {
        Bundle bundle = new Bundle();
        bundle.setVar(visitVar(ctx.var(),father));

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


    public Var visitVar(DSLParser.VarContext ctx,Object father) {
        Var var = new Var();
        if (ctx.VAR_NAME_ID() != null) {
            Pair<String, Object> pair = new Pair<>(ctx.VAR_NAME_ID().getText(),father);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTableController)) {
                var.setVarNameId(ctx.VAR_NAME_ID().getText());
                ProjectMain.symbolTableController.add(new Pair<>(var.getVarNameId(), father));
            }
        }
        return var;
    }
}
