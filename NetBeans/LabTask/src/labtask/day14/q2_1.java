/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day14;

/**
 *
 * @author harshalsMac
 */
import java.util.Scanner;

public class q2_1 {

    void checkNeg() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter only positive number : ");
            int n = sc.nextInt();
            if (n < 0) {
                throw new NegativeValueException("Negative values are not allowed.");
            }
            System.out.println("You entered a non-negative number: " + n);
        } catch (NegativeValueException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input is not a valid integer.");
        } finally {
            sc.close();
        }
    }

    }
