/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author omouneu
 */
public interface ItemVisitor {
    
    public void visit(Book item);
    public void visit(CD item);
}
