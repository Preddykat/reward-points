package com.test;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RewardPoints {

public static void main(String[] args) {
isDiv();
}
public static int isDiv() {
List<Integer> transactions = new ArrayList<>();
transactions.add(220);
transactions.add(70);
transactions.add(140);
transactions.add(9);

Iterator<Integer> itr = transactions.listIterator();
int sum=0;
while(itr.hasNext()) {

int amount = itr.next();

if(amount >100) {
int above100 = amount -100;
sum = sum + above100*2;
amount=100;
}
if(amount>50) {
int above50 = amount -50;
sum=sum + above50*1;
}
}
System.out.println("Total reward points : " +sum);
return sum;
}
}
