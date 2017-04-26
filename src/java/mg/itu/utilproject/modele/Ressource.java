/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.modele;

/**
 *
 * @author davra
 */
public class Ressource extends Taches {

    private Membres one;
    private BaseAssoc association;

    public Ressource() {

    }

    public Membres getOne() {
        return one;
    }

    public void setOne(Membres one) {
        this.one = one;
    }

    public BaseAssoc getAssociation() {
        return association;
    }

    public void setAssociation(BaseAssoc association) {
        this.association = association;
    }
}
