/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pss;

import com.pss.database.DataBaseUtilities;

/**
 *
 * @author santa
 */
public class TrabalhoFinalPSS {

    public static void main(String[] args) {
        DataBaseUtilities database = new DataBaseUtilities();
        database.delete(3);
    }
}
