package modul4.tugas;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord wahyu = new StudentRecord();
        StudentRecord ini = new StudentRecord();
        StudentRecord nama = new StudentRecord();

        wahyu.setName("Wahyu");
        ini.setName("Ini");
        nama.setName("Nama");
        System.out.println(wahyu.getName());
        System.out.println("Hitung=" + StudentRecord.getStudentCount());
    }
}
