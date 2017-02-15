import java.util.LinkedList;
import java.util.Scanner;

abstract class Person {
  private String name;
  private int age;
  BankAccount account;
  
  public Person (String name, BankAccount account) {
    setName(name);
    setAccount(account);
  }
  
  public void setName (String name) {
    this.name = name;
  }
  
  public String getName () {
    return name;
  }
  
  public void setAccount (BankAccount account) {
    this.account = account;
  }
  
  public String toString () {
    return "Name: " + getName() + account.toString();
  }
}

class Player extends Person {
  int score;
  boolean online;
  
  public Player (String name, BankAccount account, int score, boolean online) {
    super(name, account);
    setScore(score);
    setOnline(online);
  }
  
  public void setScore (int score) {
    this.score = score;
  }
  
  public int getScore () {
    return score;
  }
  
  public boolean isOnline () {
    return online;
  }
  
  public void setOnline (boolean online) {
    this.online = online;
  }
  
  public String toString () {
    String onlineStatus;
    
    if (isOnline()) {
      onlineStatus = "Online";
    } else {
      onlineStatus = "Not Online";
    }
    
    return super.toString() + "\nIs Online: " + onlineStatus;
  }
}

class BankAccount {
  private String accountNumber;
  private double balance;
  
  public BankAccount (String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  
  
  public String toString () {
    return "\nAccount Number:" + accountNumber + "\nBalance: " + balance;
  }
  
}

class Main {
  public static void main (String[] args) {
    LinkedList<Player> myPlayers = new LinkedList<Player>();
    
    Player emma = new Player("Emma", new BankAccount("AB1234567", 500.10), 200, true);
    Player michael = new Player("Michael", new BankAccount("AB23464", 400.10), 100, false);
    Player tom = new Player("Tom", new BankAccount("AB345345345", 600.10), 600, false);
    
    
    myPlayers.add(emma);
    myPlayers.add(michael);
    myPlayers.add(tom);
    
    
    
    System.out.println(getBestPlayer(myPlayers));

  }
  
  public static Player getBestPlayer (LinkedList myPlayers) {
    Player bestPlayer = (Player)myPlayers.get(0);
    
    for (int i = 1; i < myPlayers.size(); i++) {
      Player currentPlayer = (Player)myPlayers.get(i);
      if (currentPlayer.getScore() > bestPlayer.getScore()) {
        
        bestPlayer = currentPlayer;
      }
    }
    
    return bestPlayer;
  }
}

