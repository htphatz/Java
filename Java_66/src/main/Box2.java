/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */

/*
    Cac ten tham so duoc su dung pho bien la:
    - E (Element)
    - K (Key)
    - N (Number)
    - T (Type)
    - V (Value)
    - S, U, V, ... loai thu 2, 3, 4
*/

public class Box2<T> {
    private T value;

    public Box2() {
    }

    public Box2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}
