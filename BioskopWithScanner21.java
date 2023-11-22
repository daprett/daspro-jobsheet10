import java.util.Scanner;

/**
 * BioskopWithScanner21
 */
public class BioskopWithScanner21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        char operator;

        String[][] penonton = new String[4][2];

       
        System.out.println("I: input nama penonton ");
        System.out.println("D: Daftar penonton ");
        System.out.println("E: Exit");
        
        for (int i = 0; i < penonton.length; i++) {
        System.out.print("Pilih menu (I/D/E) : ");
        operator = sc.next().charAt(0);
        
        switch (operator) {
            case 'I':
             while (true) {
                System.out.print("Masukkan nama penonton: ");
                nama = sc.next();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                if (penonton[baris-1][kolom-1] != null ){
                System.out.println("Kursi sudah terisi silahkan input lagi pada kursi yang kosong");
                continue;
                }
                penonton[baris-1][kolom-1] = nama;
        
                System.out.print("Input penonton lainnya ?(y/n):");
                next=sc.next();
                if (next.equalsIgnoreCase("n"))
                   break; 
                } 
                break;
            case 'D':
            for (int j = 0; j < penonton.length; j++) {
                for (int k = 0; k < penonton[j].length; k++) {
                    if (penonton [j][k] == null){
                        penonton [j][k] = "***";   
                    }
                    System.out.println("penonton pada baris ke-"+(j+1)+" kolom ke-"+(k+1)+ penonton [j][k]);
                }
                   
                    }  
                 break;
            case 'E':
            System.out.println("Sistem telah berhenti");
             System.exit(0);
              
                    
                
                
                    
            default:
                break;
     
            }
        }
    }
}

