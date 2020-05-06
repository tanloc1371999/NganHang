/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

public class ThongTin {

	// TODO Auto-generated method stub
	private String maTaiKhoan;
	private String fullName;
	private String soCMND;

	public ThongTin() {
	}

	public ThongTin(String maTaiKhoan, String fullName, String soCMND) {
		this.maTaiKhoan = maTaiKhoan;
		this.fullName = fullName;
		this.soCMND = soCMND;
	}

	public String getmaTaiKhoan() {
		return maTaiKhoan;
	}

	public String getfullName() {
		return fullName;
	}

	public String getsoCMND() {
		return soCMND;
	}

	public String toString() {
		return "ThongTin{" + "maTaiKhoan=" + maTaiKhoan + " , fullName =" + fullName + " , soCMND=" + soCMND + '}';
	}
}
