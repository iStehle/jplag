/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jplag.csharp4;

import jplag.csharp4.grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author stehle
 */
class JplagCSharp4Listener implements ParseTreeListener {

    private jplag.csharp4.Parser jplagParser;
    
    public JplagCSharp4Listener(jplag.csharp4.Parser jplag) {
        
        jplagParser = jplag;
    }

    

    @Override
    public void visitTerminal(TerminalNode tn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visitErrorNode(ErrorNode en) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {
        
    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
