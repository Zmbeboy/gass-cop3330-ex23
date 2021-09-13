/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? (enter Y or N) ");
        String response = scan.nextLine();
        if(response.toLowerCase().equals("y"))
        {
            System.out.print("Are the battery terminals corroded? (enter Y or N) ");
            response = scan.nextLine();
            if(response.toLowerCase().equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? (enter Y or N) ");
            response = scan.nextLine();
            if(response.toLowerCase().equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? (enter Y or N) ");
                response = scan.nextLine();
                if(response.toLowerCase().equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die? (enter Y or N) ");
                    response = scan.nextLine();
                    if(response.toLowerCase().equals("y"))
                    {
                        System.out.print("Does your car have fuel injection? (enter Y or N) ");
                        response = scan.nextLine();
                        if(response.toLowerCase().equals("y"))
                        {
                            System.out.println("Get the car in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}