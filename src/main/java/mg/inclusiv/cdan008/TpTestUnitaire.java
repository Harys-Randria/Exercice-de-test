/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mg.inclusiv.cdan008;

import mg.inclusiv.cdan008.Entity.Calculatrice;

/**
 *
 * @author Inclusiv Academy 009
 */
public class TpTestUnitaire {

    public static void main(String[] args) {
        
        double add = Calculatrice.Addition(10, 5);
        double sous =Calculatrice.Soustraction(5, 5);
        double mult =Calculatrice.Multiplication(2, 3);
        double div =Calculatrice.Division(3, 5);
        
        System.out.println(add + " ; " + sous + " ; " + mult + " ; " + div );
    }
}
