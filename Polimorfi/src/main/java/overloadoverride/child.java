/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadoverride;

/**
 *
 * @author C-17
 */
class childClass extends parentClass {
    public int showMe(int i) {
        System.out.println("Metode ini ada di childClass.showMe(int i)");
        System.out.println("Override metode di parentClass dan menambah 5");
        return i + 5;
    }
    
    public void showMe() {
        System.out.println("Metode ini ada di childClass.showMe() dan overloaded");
    }
}
