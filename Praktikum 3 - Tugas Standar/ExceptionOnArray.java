/* Nama : Farisah Ghassani Hasyyati 
/* File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan library java
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer 
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}


/*Kenapa ada exception?
