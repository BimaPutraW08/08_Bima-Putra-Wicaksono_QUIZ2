/* penulis 
Bima Putra Wicaksono
2141720255_1G_08 */

package kuis2;

public class DoubleLinkedList08{
    Node08 head;
    int size;

    DoubleLinkedList08(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Pembeli pmb, Pesanan psn){
        if (isEmpty()) {
            head = new Node08(null, pmb, psn, null);
        } else {
            Node08 newNode = new Node08 (null, pmb, psn, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli pmb, Pesanan psn){
        if (isEmpty()) {
            addFirst(pmb, psn);
        } else {
            Node08 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node08 newNode08 = new Node08 (current, pmb, psn, null);
            current.next = newNode08;
            size++;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Node08 tmp = head;
            while(tmp != null){
                tmp = tmp.next;
            }
            System.out.println("\nTelah Diisi");
        } else {
            System.out.println("Antrian Masih Kosong !");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Tidak dapat menghapus node, Likked Masih Kosong !");
        } else if (size == 1){
            head = null;
            System.out.println(head.pembeli.namaPembeli+" Telah Memesan ");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
