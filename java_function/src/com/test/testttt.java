package com.test;

class testttt {

	class A {
		String a = "a";

		public void out() {
			System.out.println(a);
		}
	}

	{
		System.out.println("x");
	}

	static {
		System.out.println("s");
	}

	class B {
		public void out() {
			System.out.println("B");
		}
	}
	
	interface d{
		void syso();
	}

	class C extends B implements d{
		public void syso() {
			System.out.println("C");
		}
	}

	public static void main(String[] args) {
		new testttt().new C();
	}
}
