
public class mainTest {

    public static void main(String[] args) {
        Lop sc = new Lop("CNTT6", "CNTT");
        Lop sc1 = new Lop("CNTT5", "CNTT");
        Lop sc2 = new Lop("CNTT4", "CNTT");

        Date dv = new Date(8, 5, 2003);
        Date dv1 = new Date(9, 6, 2003);
        Date dv2 = new Date(8, 7, 2003);

        QuanLySinhVien tk1 = new QuanLySinhVien(211203338, "Vu Van Duong", 7.5, sc, dv);
        QuanLySinhVien tk2 = new QuanLySinhVien(211205338, "Nong Lam Hieu", 7, sc1, dv1);
        QuanLySinhVien tk3 = new QuanLySinhVien(21129338, "Nguyen Van A", 4.5, sc2, dv2);

        System.out.println("Khoa Sinh vien 1 theo hoc la : " + tk1);
        System.out.println("Khoa Sinh vien 1 theo hoc la : " + tk2);
        System.out.println("Khoa Sinh vien 1 theo hoc la : " + tk3);

        System.out.println("Sinh vien 1 co do hay khong : " + tk1.sinhVienCoDoHayKhong());
        System.out.println("Sinh vien 2 co do hay khong : " + tk2.sinhVienCoDoHayKhong());
        System.out.println("Sinh vien 3 co do hay khong : " + tk3.sinhVienCoDoHayKhong());

        System.out.println("Sinh vien 1 co giong ngay sinh voi sinh vien 2 khong : " + tk1.kiemTraNgaySinh(dv1));
        System.out.println("Sinh vien 1 co giong ngay sinh voi sinh vien 3 khong : " + tk1.kiemTraNgaySinh(dv2));
        System.out.println("Sinh vien 2 co giong ngay sinh voi sinh vien 3 khong : " + tk2.kiemTraNgaySinh(dv2));
    }
}
