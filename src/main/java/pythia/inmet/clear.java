package inmet;

import group.chon.pythia.inmet.InmetRSS;
import jason.asSemantics.DefaultInternalAction;
import jason.asSemantics.TransitionSystem;
import jason.asSemantics.Unifier;
import jason.asSyntax.Term;

public class clear extends DefaultInternalAction {
    @Override
    public Object execute(TransitionSystem ts, Unifier un, Term[] args) throws Exception {
        InmetRSS inmetRSS = new InmetRSS();
        if(args.length==1){
            if(args[0].toString().equals("all")){
                inmetRSS.cleanCache(".rss");
                return true;
            }
        }
        inmetRSS.cleanCache(".rss/inmetRSS.xml");
        return true;
    }
}