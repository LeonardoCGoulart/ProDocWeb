/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdw.data.crud;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import pdw.data.model.User;

/**
 *
 * @author alexandrelerario
 */
public class CrudOrganization extends AbstractCrud<pdw.data.model.Organization> {

    private EntityManager em;

    public CrudOrganization() {
        super(pdw.data.model.Organization.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }

}
