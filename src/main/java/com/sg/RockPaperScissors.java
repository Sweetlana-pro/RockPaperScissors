/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @Sweetlana Protsenko
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random randomizer = new Random();
        int numRounds;
        int compChoice;
        String yesNo;  
        int counterTie = 0;
        int counterUserWin = 0;
        int counterCompWin = 0; 
        //to play game again block
        do {
            System.out.println("*********WELCOME TO ROCK, PAPER, SCISSORS!*********");
            System.out.println("Let's play! Enter a number of rounds between 1 and 10");
            //Number or rounds block
            numRounds = sc.nextInt();
            if (numRounds >= 1 || numRounds <= 10) {
                System.out.println("Perfect! Off we go!");          
            } else {
                System.out.print("Error");
            }
            int[] rounds = new int[numRounds];
            for(int i = 1; i < rounds.length + 1; i++) {
                //Rock Paper Scissors battle block
                System.out.println("Please choose: ");
                System.out.println("1 - for Rock     2 - for Paper     3 - for Scissors");
                int userChoice = sc.nextInt();
                compChoice = randomizer.nextInt(3) + 1;
                System.out.println("computer's choice: " + compChoice);
                if (userChoice == 2 && compChoice == 1) {
                   System.out.println("You won this round!");
                   counterUserWin++;              
                } else if (userChoice == 1 && compChoice == 2) {
                   System.out.println("Computer won this round");
                   counterCompWin++;
                }else if (userChoice == 3 && compChoice == 2) {
                   System.out.println("You won this round!");
                   counterUserWin++;
                }else if (userChoice == 1 && compChoice == 3) {
                   System.out.println("You won this round!");
                   counterUserWin++;   
                }else if (userChoice == 2 && compChoice == 3) {
                   System.out.println("Computer won this round");
                   counterCompWin++;
                }else if (userChoice == 3 && compChoice == 1) {
                   System.out.println("Computer won this round");
                   counterCompWin++;
                } else if (userChoice == compChoice) {
                   System.out.println("Tie");
                   counterTie++; 
                } else {
                    System.out.println("Wrong input. Out of counting");
                }
            }
            //Round's results
            System.out.println("You won " + counterUserWin + " rounds");
            System.out.println("Computer won " + counterCompWin + " rounds");
            System.out.println("Ties " + counterTie + " rounds");
            // Total counting
            if (counterCompWin > counterUserWin) {
                System.out.println("Computer won this game");
            }else if (counterUserWin > counterCompWin) {
                System.out.println("Congartulation! You are the winner!");
            } else {
                System.out.println("This game is a draw");                
            }
        
            System.out.println("Do you want to play again? yes/no");
            yesNo = sc.nextLine();
                  
                        
        } while(sc.next().equals("y"));
        
        System.out.println("Thank for playing!");
    } 
}
