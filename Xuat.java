/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;


public class Xuat {
	public static void xuat() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Thông tin tài khoản vui lòng nhập số tiền: ");
		long n = sc.nextLong();
		double p, t, sinterest;
		if (1000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);

			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();

			sinterest = (double) (n * (0.1 / 12) * t / 360);
			double lai = n + (double) Math.floor(sinterest * 1000) / 1000;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 0.1% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + (double) Math.floor(sinterest * 1000) / 1000);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else if (50000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);

			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (0.3 / 12) * t / 360);
			double lai = n + (double) Math.floor(sinterest * 1000) / 1000;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 0.3% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + (double) Math.floor(sinterest * 1000) / 1000);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else if (200000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);

			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (0.5 / 12) * t / 360);
			double lai = n + (double) Math.floor(sinterest * 1000) / 1000;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 0.5% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + (double) Math.floor(sinterest * 1000) / 1000);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else if (1000000000 >= n) {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);

			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (1 / 12) * t / 360);
			double lai = n + (double) Math.floor(sinterest * 1000) / 1000;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 1% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + (double) Math.floor(sinterest * 1000) / 1000);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		} else {
			System.out.println("Số tiền gửi vào ngân hàng là: " + n);

			System.out.print("Nhập vào thời gian tính lãi (1 tháng 30 ngày): ");
			t = sc.nextDouble();
			sc.close();
			sinterest = (double) (n * (1.94 / 12) * t / 360);
			double lai = n + (double) Math.floor(sinterest * 1000) / 1000;
			System.out.println("Số tiền gửi trong tài khoản là: " + n + " lãi xuất được hưởng là 1.94% trong: " + t
					+ " ngày (1 tháng 30 ngày)");
			System.out.println("Tiền gửi: " + n + " có lãi là: " + (double) Math.floor(sinterest * 1000) / 1000);
			System.out.println("Tổng số tiền trong tài khoản là: " + lai);

		}
	}

}
