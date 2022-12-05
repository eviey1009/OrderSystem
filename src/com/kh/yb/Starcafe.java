package com.kh.yb;

import java.util.Scanner;

public class Starcafe {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count=0;
			
		String orderList[]=new String[10]; 
		
		int total=0;
		
	
		while(true) {
			System.out.println("===안녕하세요. 별다방 까페입니다.===");
			System.out.println("1. 주문(커피/디저트)");
			System.out.println("2. 취소");
			System.out.println("3. 결제");
			System.out.println("4. 종료");
			System.out.print("입력: ");
		
			int num = sc.nextInt();
			
			//
			if(num==1) {
				String menuName="";
				int menuPrice=0;
				System.out.println("1. 아메리카노\t2000원");
				System.out.println("2. 까페라떼\t2500원");
				System.out.println("3. 바닐라 라떼\t3000원");
				System.out.println("4. 모카 라떼\t3000원");
				System.out.println("5. 까라멜 마끼아또\t3000원");
				System.out.println("6. 별다방 프라푸치노\t3500원");
				System.out.println("7. 초코케익\t2000원");
				System.out.println ("8. 치즈케익\t2000원");
				
				
				int menuNum=sc.nextInt();
				if(menuNum==1) {
					menuName= "아메리카노";
					menuPrice=2000;
				}
				else if(menuNum==2) {
					menuName= "까페라떼";
					menuPrice=2500;
				}
				else if(menuNum==3) {
					menuName= "바닐라 라떼";
					menuPrice=3000;
				}
				else if(menuNum==4) {
					menuName= "모카 라뗴";
					menuPrice=3000;
				}
				else if(menuNum==5) {
					menuName="카라멜 마끼아또";
					menuPrice=3000;
				}
				else if(menuNum==6) {
					menuName="별다방 프라푸치노";
					menuPrice=3500;
				}
				else if(menuNum==7) {
					menuName="초코케익";
					menuPrice=2000;
				}
				else if(menuNum==7) {
					menuName="치즈케익";
					menuPrice=2000;
				}	
			    
			
				else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				total += menuPrice;
				orderList[count]= menuName;
				count++;
				
				System.out.println("주문한 메뉴는 " + menuName + "입니다.");
				System.out.println("가격은 " + menuPrice + "입니다.");
				
			}
			else if(num==2) {
				System.out.println("===주문한 내역입니다.===");
				for(int i=0;i<count;i++) {
					System.out.println(i+1+"."+orderList[i]);
				}
                
				System.out.print("취소할 메뉴번호:");
				int cancelNum= sc.nextInt();
				
				if(1<=cancelNum&&cancelNum<=count) {
					String delMenu=orderList[cancelNum-1];
					System.out.println(delMenu+" 주문 취소!");
					for(int i=cancelNum-1;i<count;i++) {
						orderList[i]=orderList[i+1];
					}
					
					if(delMenu.equals("아메리카노")) {
						total -=2000;
					}
					
					else if(delMenu.equals("까페라떼")) {
						total -=2500;
					}
					
					else if(delMenu.equals("바닐라 라떼")) {
						total -=3000;
					}
					
					else if(delMenu.equals("모카 라떼")) {
						total -=3000;
					}
					else if(delMenu.equals("카라멜 마끼아또")) {
						total -=3000;
					}
					else if(delMenu.equals("별다방 프라푸치노")) {
						total -=3500;
					}
					else if(delMenu.equals("초코케익")) {
						total -=2000;
					}
					else if(delMenu.equals("치즈케익")) {
						total -=2000;
					}	
					
                
                    else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
					count--;
					
				}
				
			}
			else if(num==3) {
				System.out.println("결제 금액:" + total +"원");
				System.out.print("입금:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				else {
					System.out.println("잔돈은 "+(money-total)+"원 입니다. 바로 준비해드리겠습니다.");
					total=0;
					for(int i =0;i<5;i++)
						orderList[i]="";
				}
				count= 0;
				
				
			}
			else if(num==4) {
				System.out.println("감사합니다.");
				break;
			}
			
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}

	


