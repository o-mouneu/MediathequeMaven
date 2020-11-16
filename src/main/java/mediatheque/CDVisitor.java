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
public class CDVisitor implements ItemVisitor{
    public void visit(CD item){
       System.out.println("VISITING CD : " + item);
    }
    public void visit(Book item) {
        //System.out.println("Book : " + item);
    }
}
