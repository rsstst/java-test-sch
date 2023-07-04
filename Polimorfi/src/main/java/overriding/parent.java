/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author C-17
 */
class ParentClass {
    public void ShowMe() {
        System.out.println("Di dalam ParentClass.ShowMe");
    }
    public void doNotChangeMe() {
        System.out.println("Di dalam ParentClass.doNotChangeMe()");
    }
}
