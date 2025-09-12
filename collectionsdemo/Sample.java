package collectionsdemo;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 8, 2025
 * Time    : 3:59:34 PM
 * Project : CoreJava

 */

class Sample<T> { //Parameterized class/Generic class/generics T-type

	private T data; //generic variable declaration

	public Sample(T data) {// generic constructor
		this.data = data;
	}

	public T getData() {//getter with generic return type
		return data;
	}

	public void setData(T data) {//setter with generic type parameter
		this.data = data;
	}



}
