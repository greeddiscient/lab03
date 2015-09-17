public class AccountTester {

	public static void main(String[] args) {
		Account mike;
		mike = new Account(1000);
		System.out.println(mike.balance());
		mike.deposit(100);
		System.out.println(mike.balance());
		assert mike.withdraw(1200) == false;
		mike.withdraw(200);
		System.out.println(mike.balance());
		Account john= new Account(5000);
		mike.merge(john);
		System.out.println(mike.balance());
		System.out.println(john.balance());
		
		Account nathaline= new Account(1000);
		Account shaun= new Account(100, nathaline);
		shaun.withdraw(200);
		System.out.println("shaun=" + shaun.balance());
		System.out.println("nath=" +nathaline.balance());
		shaun.withdraw(1000);
		System.out.println("shaun=" + shaun.balance());
		System.out.println("nath=" +nathaline.balance());
	}

}