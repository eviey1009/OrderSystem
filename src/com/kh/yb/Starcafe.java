package com.kh.yb;

import java.util.Scanner;

public class Starcafe {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count=0;
			
		String orderList[]=new String[10]; 
		
		int total=0;
		
	
		while(true) {
			System.out.println("===�ȳ��ϼ���. ���ٹ� �����Դϴ�.===");
			System.out.println("1. �ֹ�(Ŀ��/����Ʈ)");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.print("�Է�: ");
		
			int num = sc.nextInt();
			
			//
			if(num==1) {
				String menuName="";
				int menuPrice=0;
				System.out.println("1. �Ƹ޸�ī��\t2000��");
				System.out.println("2. �����\t2500��");
				System.out.println("3. �ٴҶ� ��\t3000��");
				System.out.println("4. ��ī ��\t3000��");
				System.out.println("5. ���� �����ƶ�\t3000��");
				System.out.println("6. ���ٹ� ����Ǫġ��\t3500��");
				System.out.println("7. ��������\t2000��");
				System.out.println ("8. ġ������\t2000��");
				
				
				int menuNum=sc.nextInt();
				if(menuNum==1) {
					menuName= "�Ƹ޸�ī��";
					menuPrice=2000;
				}
				else if(menuNum==2) {
					menuName= "�����";
					menuPrice=2500;
				}
				else if(menuNum==3) {
					menuName= "�ٴҶ� ��";
					menuPrice=3000;
				}
				else if(menuNum==4) {
					menuName= "��ī ���";
					menuPrice=3000;
				}
				else if(menuNum==5) {
					menuName="ī��� �����ƶ�";
					menuPrice=3000;
				}
				else if(menuNum==6) {
					menuName="���ٹ� ����Ǫġ��";
					menuPrice=3500;
				}
				else if(menuNum==7) {
					menuName="��������";
					menuPrice=2000;
				}
				else if(menuNum==7) {
					menuName="ġ������";
					menuPrice=2000;
				}	
			    
			
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
				total += menuPrice;
				orderList[count]= menuName;
				count++;
				
				System.out.println("�ֹ��� �޴��� " + menuName + "�Դϴ�.");
				System.out.println("������ " + menuPrice + "�Դϴ�.");
				
			}
			else if(num==2) {
				System.out.println("===�ֹ��� �����Դϴ�.===");
				for(int i=0;i<count;i++) {
					System.out.println(i+1+"."+orderList[i]);
				}
                
				System.out.print("����� �޴���ȣ:");
				int cancelNum= sc.nextInt();
				
				if(1<=cancelNum&&cancelNum<=count) {
					String delMenu=orderList[cancelNum-1];
					System.out.println(delMenu+" �ֹ� ���!");
					for(int i=cancelNum-1;i<count;i++) {
						orderList[i]=orderList[i+1];
					}
					
					if(delMenu.equals("�Ƹ޸�ī��")) {
						total -=2000;
					}
					
					else if(delMenu.equals("�����")) {
						total -=2500;
					}
					
					else if(delMenu.equals("�ٴҶ� ��")) {
						total -=3000;
					}
					
					else if(delMenu.equals("��ī ��")) {
						total -=3000;
					}
					else if(delMenu.equals("ī��� �����ƶ�")) {
						total -=3000;
					}
					else if(delMenu.equals("���ٹ� ����Ǫġ��")) {
						total -=3500;
					}
					else if(delMenu.equals("��������")) {
						total -=2000;
					}
					else if(delMenu.equals("ġ������")) {
						total -=2000;
					}	
					
                
                    else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						continue;
					}
					count--;
					
				}
				
			}
			else if(num==3) {
				System.out.println("���� �ݾ�:" + total +"��");
				System.out.print("�Ա�:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				else {
					System.out.println("�ܵ��� "+(money-total)+"�� �Դϴ�. �ٷ� �غ��ص帮�ڽ��ϴ�.");
					total=0;
					for(int i =0;i<5;i++)
						orderList[i]="";
				}
				count= 0;
				
				
			}
			else if(num==4) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}

	


