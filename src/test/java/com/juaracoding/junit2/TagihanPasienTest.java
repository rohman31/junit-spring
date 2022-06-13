package com.juaracoding.junit2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.juaracoding.junit2.pasien.Pasien;
import com.juaracoding.junit2.tagihan.TagihanMenginap;

public class TagihanPasienTest {
	
	Pasien pasien;
	TagihanMenginap tagihanMenginap;
	
	@Before
	public void setUp() {
		pasien = new Pasien();
		tagihanMenginap = new TagihanMenginap();
		
	}

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		
//	}

	@Test
	public void testTotalTagihanKlsVIP() {
		pasien.setKelas("Kelas VIP");
		pasien.setMenginap(3);
		double expect = 750000;
		double actual = tagihanMenginap.totalTagihan(pasien);
		assertEquals(expect, actual, 0.0);
	}
	
	@Test
	public void testTotalTagihanKls1() {
		pasien.setKelas("Kelas 1");
		pasien.setMenginap(3);
		double expect = 600000;
		double actual = tagihanMenginap.totalTagihan(pasien);
		assertEquals(expect, actual, 0.0);
		
	}

}
