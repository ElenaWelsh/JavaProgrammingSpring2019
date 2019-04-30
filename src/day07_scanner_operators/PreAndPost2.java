package day07_scanner_operators;

public class PreAndPost2 {
public static void main(String[] args) {
	int messages = 10;
	messages++;
	++messages;
	System.out.println("Massages:" + messages);
	
	int readMessages = --messages;
	System.out.println("ReadMassages: " + readMessages);
	System.out.println("Messages: " + messages);
	
	int unreadMessages = readMessages--;
	System.out.println("unreadmessages:" + unreadMessages);//11
	System.out.println("readMessages: " + readMessages);//10
	   
	int totalMessages = unreadMessages++ - readMessages--;
	                      // 11          -    //10
	System.out.println("unreadMessages:" + unreadMessages);
	
	int count = 20;
	int count2 = 10;
	int totalCount = ++count + --count2;
	                   //21   +  9      30
	System.out.println("count" + count);
	System.out.println("count2" + count2);
	System.out.println("total" + totalCount);
	
	int myCount = count++ + ++count;
	                 //21     
	System.out.println("count" + count);
	System.out.println("myCount" + myCount);
	
	
}
}
