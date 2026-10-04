import java.util.Scanner;
public class a2textedit{
				private static void printHelp() {
						System.out.println("display");
						System.out.println("insert [pos] [text]");
						System.out.println("append [text]");
						System.out.println("delete [start pos] [end pos]");
						System.out.println("exit");
				}
		public static void main(String[] args){
				
				System.out.println("==Text edit simulator==");
				printHelp();
				boolean running = true;
				StringBuilder editor = new StringBuilder();
				Scanner scanner = new Scanner(System.in);
				while(running){
						String cmd = scanner.next().toLowerCase();
						switch(cmd){
								case "display":
										System.out.println(editor.toString());
										System.out.println("len: "+editor.length());
										break;
								case "append":
										String atxt = scanner.nextLine();
										atxt=atxt.trim();
										editor.append(atxt);
										break;
								case "insert":
										if (scanner.hasNextInt()){
												int ipos = scanner.nextInt();
												String itxt = scanner.nextLine();
												itxt=itxt.trim();
												editor.insert(ipos,itxt);
										}
										break;
								case "delete":
										if (scanner.hasNextInt()){
														int spos = scanner.nextInt();
														if (scanner.hasNextInt()){
																int epos = scanner.nextInt();
																editor.delete(spos,epos);
												}}
										break;
								case "exit":
										running=false;
										break;
										
						}		
				}
		}
}