/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author C-17
 */
class Addition {
            int sum(int x, int y){
                return x + y;
            }
            
            double sum(double x, double y){
                return x + y;
            }
            
            String sum(String s1, String s2){
                return s1.concat(s2);
            }
    }
