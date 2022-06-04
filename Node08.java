/* penulis 
Bima Putra Wicaksono
2141720255_1G_08 */

package kuis2;

public class Node08{
    Pembeli pembeli;
    Pesanan pesanan;
    Node08 prev, next;
    
    Node08(Node08 prev, Pembeli pembeli, Pesanan pesanan, Node08 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesanan=pesanan;
        this.next=next;
    }    
 
}