package Soal1;

public class ApkBuku {
    private String isbn;
    private String judulBuku;
    private String pengarang;
    private String tahunTerbit;
    private int harga;
    private float rating;

    public ApkBuku(String isbn, String judulBuku, String pengarang, String tahunTerbit, int harga, float rating){
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public void setTahunTerbit(String tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }


    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setRating(float rating){
        this.rating = rating;
    }

    public void searchIsbn(String isbn){
        if (this.isbn.equalsIgnoreCase(isbn)){
            System.out.println(isbn + " " + judulBuku + " " + pengarang + " "
                    + tahunTerbit + " " + harga + " " + rating);
        }
    }

    @Override
    public String toString(){
        return isbn+" "+judulBuku+" "+pengarang+" "+tahunTerbit+" "+harga+" "+rating;
    }

}
