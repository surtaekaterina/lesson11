package by.itacademy.lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainAppExeption {

	public static void main(String[] args) {
throw 10;
		try {
			FileReader fr1 = new FileReader("D:\\surta\\lesson11\\bin\\by\\itacademy\\lesson11\\text1.txt ");
			try {
				FileReader fr2 = new FileReader("test2.txt");
			} catch (IOException e) {
				System.out.println("test2");
			}
			System.out.println("+");

		} catch (FileNotFoundException e) {
			System.out.println("test1");

		}
		System.out.println("+");

		// по типу либо по иерархии выше

		try {
			throw new C();
			throw new D();
			throw new G();
			throw new H();
		} catch (C e) {
		} catch (D e) {
		} catch (H e) {
		} catch (A e) {
		}

		try {
			System.out.println("2");
		} catch (C e) {
		} catch (D e) {
		} catch (E e) {
		} catch (A e) {
		}

		try {
			System.out.println("3");

		} catch (C e) {
		} catch (D e) {
		} catch (G e) {
		} catch (A e) {
		}

		try {
			System.out.println("4");
		} catch (A e) {
		} catch (D e) {
		} catch (G e) {
		} catch (H e) {
		}
		try {
			System.out.println("5");
		} catch (E e) {
		} catch (D e) {
		} catch (B e) {
		} catch (A e) {
		}

	}
}

class A extends java.lang.Exception {
}

class B extends A {
}

class C extends B {
}

class D extends A {
}

class E extends A {
}

class F extends D {
}

class G extends D {
}

class H extends E {
}

class Aa {
	public void f() throws IOException {
	}
}

class Bb extends Aa {
	// public void f() throws FileNotFoundException, InternalError {}
	// public void f() throws IOException {}
	// public void f() throws FileNotFoundException {}
	// public void f() throws IOException, FileNotFoundException {}
}

class Quest {
	private int qQ;

	public Quest(int q) {
		qQ = 12 / q;// 1
	}

	public int getQQ() {
		return qQ;// 2
	}

	public static void main(String[] args) {
		Quest quest = null;
		try {
			quest = new Quest(0);// 3
		} catch (Exception e) {// 4
		}
		System.out.println(quest.getQQ());// 5
	}
}

/*
 * System.out.println("1"); try { System.out.println("2"); doSmth3();
 * 
 * } catch (IOException ex) { System.out.println("3"); throw new
 * NullPointerException();
 * 
 * }catch (Exception ex) { System.out.println("3.1"); throw new
 * NullPointerException();
 * 
 * } finally { System.out.println("4"); } System.out.println("5"); }
 * 
 * public static void doSmth3() throws IOException { throw new IOException(); }
 * public static void doSmth4() throws IOException, { throw new IOException(); }
 * /* doSmth2();
 * 
 * }
 * 
 * public static void doSmth2(){ try { doSmth3();
 * 
 * } catch (Exception ex) {
 * 
 * } }
 * 
 * /*public static void doSmth3() throws Exception { throw new Exception(); }
 * 
 * // 222222222 /* System.out.println("1"); try { System.out.println("2");
 * FileInputStream fis = new FileInputStream("c://data.txt");
 * System.out.println("3"); fis.read(); System.out.println("4");
 * 
 * }catch(FileNotFoundException ex) { ex.printStackTrace();
 * System.out.println("5");
 * 
 * }catch(IOException ex) { ex.printStackTrace(); System.out.println("6"); }
 * System.out.println("7");
 */

// 111111111111
/*
 * Scanner sc = new Scanner("c://data.txt"); sc. try { FileInputStream fis = new
 * FileInputStream("c://data.txt"); fis.read(); } catch(FileNotFoundException
 * ex) { ex.printStackTrace();
 * 
 * } catch(IOException ex) { ex.printStackTrace();
 * 
 * }
 * 
 * String s = "aaaaa"; s.charAt(100);
 * 
 * // виртуал машина прерыывает выполнениe
 * 
 * int[] x = null;
 * 
 * try { doSmth(x); }catch(Throwable e) {
 * 
 * } // Throwable th;
 * 
 * }
 * 
 * public static void doSmth(int[] x) { if (x != null) { // break;
 * System.out.println(x.length);
 * 
 * } // throw new Throwable();
 */
