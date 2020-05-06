/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThongTin[] thongtin = new ThongTin[10];
        thongtin[0] = getThongTinInfo();
        
	}
 
    
    
    public static ThongTin getThongTinInfo() {
        ThongTin s = null;
        String maTaiKhoan, fullName, soCMND;
        
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Mã tài Khoản: ");
            // maTaiKhoan = sc.nextLine();
             maTaiKhoan = sc.nextLine();
                    String nhap = "\\d+";
                    if (maTaiKhoan.matches(nhap)) {
                            System.out.print("");
                            break;

                    } else {
                            System.out.println("mã nhap sai");
                            maTaiKhoan = null;

                    }	
        }
        while(true){
            System.out.print("Tên tài khoản: ");
            fullName = sc.nextLine();
            String nhapten = "^[a-zA-Z\\\\s]+";
                    if (fullName.matches(nhapten)) {
                            System.out.print("");
                            break;
                    } else {
                            System.out.println("Nhap ten ko chinh xac");
                            fullName = null;
                    }
        }
        //fullName = sc.nextLine();
        while(true){
            System.out.print("soCMND: ");
            soCMND = sc.nextLine();
            String so = "\\d{10}";
                    if (soCMND.matches(so)) {
                            System.out.print("" );
                            break;
                    } else {
                            System.out.println("số CMND không hợp lệ ");
                            soCMND = null;
                    }
        }        
		System.out.print("Thông tin tài khoản vui lòng nhập số tiền: ");
		//System.out.println("Vui lòng nhập số tiền: ");
		long n = sc.nextLong();
		double p, t, sinterest;
		if (1000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);

			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			//System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			sc.close();

			sinterest = (double) (n * (0.1 / 12) * t / 360);
			double lai = n + sinterest;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 0.1% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + sinterest);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else if (50000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);
			// n = sc.nextInt();
			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (0.3 / 12) * t / 360);
			double lai = n + sinterest;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 0.3% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + sinterest);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else if (200000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);
			// n = sc.nextInt();
			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (0.5 / 12) * t / 360);
			double lai = n + sinterest;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 0.5% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + sinterest);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else if (1000000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);
			// n = sc.nextInt();
			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (1 / 12) * t / 360);
			double lai = n + sinterest;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 1% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + sinterest);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);
			// n = sc.nextInt();
			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (1.94 / 12) * t / 360);
			double lai = n + sinterest;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 1.94% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + sinterest);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		}
	



		
        
        
        s =new ThongTin(maTaiKhoan, fullName,soCMND);
        return s;
    }
}



		





