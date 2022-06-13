package com.juaracoding.junit2.tagihan;

import com.juaracoding.junit2.pasien.Pasien;

public class TagihanMenginap {

	public double totalTagihan(Pasien pasien) {
		double total = 0;
		
		if(pasien.getKelas().equals("Kelas VIP")) {
			total = 250000 * pasien.getMenginap();
			
		}else if(pasien.getKelas().equals("Kelas 1")) {
			total = 200000 * pasien.getMenginap();
		}
		
		return total;
	}
}
