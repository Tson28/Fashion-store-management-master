/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* Repository: https://github.com/Tson28/Fashion-store-management-master.git
 */

package com.fpt.entity;

/**
 *
 * @author ducit
 */
public class Material {

    private int idMaterial;
    private String valueMaterial;

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getValueMaterial() {
        return valueMaterial;
    }

    public void setValueMaterial(String valueMaterial) {
        this.valueMaterial = valueMaterial;
    }

    @Override
    public String toString() {
        return valueMaterial;
    }

}
