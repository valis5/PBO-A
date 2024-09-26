public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void telepon(String nomor) {
        System.out.println("Melakukan panggilan video ke nomor " + nomor);
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirimi pesan " + pesan + " dengan nomor tujuan " + nomorTujuan);
    }

    @Overload
    public void kirmPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirimi pesan " + pesan + " dengan email tujuan " + emailTujuan + " dengan subjek " + subjek);
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}