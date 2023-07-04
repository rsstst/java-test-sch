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
class main {
    public static void main(String[] args) {
        System.out.println("Demonstrasi overloading dan overriding");
        childClass child = new childClass();
        int value = child.showMe(5);
        System.out.println("Input 5 dan hasilnya menjadi " + value); //5 + 5 = 10
        child.showMe();
        System.out.println("Restu Andra Ahmad Saeroji // 22201170");
    }
}
