package day4lab.code;

public class ComplexNumber_6 {
	private int real, imag;

	// getters & setters

	public int getReal() {
		return real;
	}

	public int getImag() {
		return imag;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	// Constructors
	public ComplexNumber_6() {
		real = 0;
		imag = 0;
	}

	public ComplexNumber_6(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public void display() {
if(imag>=0)		System.out.println("Entered Complex Number is : "+real+" + "+imag+"i");
if(imag<0)		System.out.println("Entered Complex Number is : "+real+" - "+(-1*imag)+"i");

	}
}
