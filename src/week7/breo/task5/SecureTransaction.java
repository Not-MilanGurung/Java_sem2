package week7.breo.task5;

public final class SecureTransaction {
	void printf(String hello){
		System.out.println(hello);
	}

	public static void main(String[] args){
		// OnlineTransaction on = new OnlineTransaction();
	}
}
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//         The type OnlineTransaction cannot subclass the final class SecureTransaction
// 
// class OnlineTransaction extends SecureTransaction{
// 	String hello(){
// 		return "Sll";
// 	}
// }
