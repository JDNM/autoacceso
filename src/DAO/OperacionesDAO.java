/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import autoacceso.Bean;
import java.util.ArrayList;
//import mx.edu.upa.bean.Bean;

/**
 *
 * @author Garrison
 */
public interface OperacionesDAO {

    ArrayList select();
    int insert(Bean bean);
    boolean delete(int id);
    boolean update(Bean bean);
    Bean find(int id);

}
