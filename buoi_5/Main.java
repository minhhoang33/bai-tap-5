package buoi_5;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Login account = new Login("techmaster", "hoclacoviec", 1000000);

    public static void main(String[] args) {
login();
    }
    public static void login() {
        while (true) {
            System.out.print("Nhap username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Nhap password: ");
            String passwordInput = scanner.nextLine();

            if (account.getUsername().equals(usernameInput) && account.getPassword().equals(passwordInput)) {
                System.out.println("Dang nhap thanh cong!!");
                System.out.println(account);;
                break;
            } else {
                System.out.println("Dangg nhap that bai. Ban co muon thu lai k? (Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("N")) {
                    System.exit(0);
                }
            }
        }
    }







    }



    /*
    public static void array(){
        int Arr[] = {1,4,3};
        int sum=0;
        for(int i=0;i<Arr.length;i++){
            sum+=Arr[i];
        }
        System.out.println("tong cac so la: "+ sum);
    }
    public static int multi(){
        System.out.println("Moi ban nhap vao 1 so nguyen: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int Mutil = 1;
        for (int i = 2; i <= n; i++) {
           Mutil*=i;
        }
        return Mutil;
    }*/
