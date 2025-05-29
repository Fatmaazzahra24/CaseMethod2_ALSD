public class AntrianLinkedList {
    nodeKendaraan head, tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }
    public void tambahAntrian(kendaraan data) {
        nodeKendaraan input = new nodeKendaraan(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
        size++;
        System.out.println("Kendaraan " + data.platNomor + " telah ditambahkan ke antrian.");
    }   

    public kendaraan layaniAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada kendaraan yang bisa dilayani.");
            return null;
        }
        kendaraan data = head.data;
        head = head.next;
        size--;
        if (head == null) {
            tail = null; // Jika antrian menjadi kosong
        }
        System.out.println("Kendaraan " + data.platNomor + " telah dilayani.");
        return data;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        nodeKendaraan current = head;
        int no 
        System.out.println("Daftar Kendaraan dalam Antrian:");
        while (current != null) {
            System.out.println(no++ + ". " + current.data.platNomor + 
                           " (Jenis: " + current.data.tipe + 
                           ") - " + current.data.merk);
            current = current.next;
        }
    }
    public int jumlahAntrian() {
        return size;
    }
}
