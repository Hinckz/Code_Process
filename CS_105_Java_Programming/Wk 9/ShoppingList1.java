package Week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The starter code to an application that a user can use for a shopping list.
 * This provides simple operations like add, delete, show, sort, and exit.
 * 
 * @author Jeff Light
 * @author Gordon Mbong (modified by)
 *
 */

public class ShoppingList1 {

		/**
		 * main() method displays a menu to the user and asks them to select a command.
		 * The method will continue to display the menu to the user until they wish to
		 * quit by selecting 'Exit' from the menu.
		 * <p>
		 * The method also creates a new, empty shoppingList of type ArrayList<String>
		 * Based on the user input, the appropriate method will be called to perform
		 * actions on the shoppingList.
		 * <p>
		 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
		 */
		public static void main(String[] args) {
			// Initialize variables
			Scanner sIn = new Scanner(System.in); // Input Scanner for String
			ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
			String choice; // Holds user input of type String
			boolean done = false; // Keeps program running until user wants to quit

			// Keep running the program until the user quits
			do {
				// Print out the menu to the console
				System.out.println();
				System.out.println("1. Add Items");
				System.out.println("2. Delete Items");
				System.out.println("3. Show Items");
				System.out.println("4. Sort Items");
				System.out.println("5. Exit");
				System.out.print("Please enter a command: ");
				choice = sIn.nextLine();

				// Call the appropriate method for the choice selected.
				switch (choice) {
				case "1": // Add items to the Shopping List
					System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
					break;
				case "2": // Delete items from the Shopping List
					System.out
							.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
					break;
				case "3": // Show the items in the Shopping List
					showItems(shoppingList);
					break;
				case "4": // Sort the items in the Shopping List
					sortItems(shoppingList);
					break;
				case "5": // Exit the program
					System.out.println();
					System.out.println("Goodbye");
					done = true;
					break;
				default: // Handles all input that is not between 1-5
					System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
				} // End of switch (choice)
			} while (!done); // Keep running the program until the user quits

			sIn.close();
		}// end of main()

		//////////////////////////////////////////////
		// STUDENTS, FILL IN THE METHOD STUBS BELOW://
		// addItems() //
		// deleteItems() //
		// showItems() //
		// sortItems() //
		//////////////////////////////////////////////

		/**
		 * Asks the user to enter an item to be stored in the shoppingList and then adds
		 * the item to the shoppingList ArrayList. The user may enter as many items as
		 * they want, hitting ENTER to stop entering items and return to main(). Each
		 * time the user enters an item into the list, a message will be displayed
		 * showing the item entered in the following format:
		 * <p>
		 * 'item' has been added to the Shopping List.
		 * <p>
		 * Example -- 'Eggs' has been added to the Shopping List.
		 * <p>
		 * Returns the number of items added to the shoppingList
		 * 
		 * @param sIn          - The scanner to allow to get user input from the console
		 * @param shoppingList - The array list to store the items of the shopping list
		 * @return - the number of items added to the shopping list
		 */
		public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
			// FIXME: implement the method
			int ItemsAdded = 0;
		

			  while (true) {
			    System.out.print("Enter an item to add to the shopping list: ");
			    String item = sIn.nextLine();

			    if (item.isEmpty()) {
			      break;
			    }

			    shoppingList.add(item);
			    System.out.println("'" + item + "' has been added to the shopping list.");

			    ItemsAdded++;
			  }

			  return ItemsAdded;
		}// end of method addItems(ArrayList<String>)

		/**
		 * Asks the user to enter an item to be deleted from the shoppingList and then
		 * deletes the item from the shoppingList ArrayList. The user may delete as many
		 * items as they want, hitting ENTER to stop deleting items and return to
		 * main(). Each time the user deletes an item from the list, a message will be
		 * displayed showing the item deleted in the following format:
		 * <p>
		 * 'item' has been deleted from the Shopping List.
		 * <p>
		 * Example -- 'Peaches' has been deleted from the Shopping List.
		 * <p>
		 * If the user tries to delete an item not in the list, a message will be
		 * displayed indicating the error and showItems() will be called. Returns the
		 * number of items deleted from the shoppingList
		 * 
		 * @param sIn          - The scanner to allow to get user input from the console
		 * @param shoppingList - The array list to store the items of the shopping list
		 * @return - the number of items deleted from the shopping list
		 */
		public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
			// FIXME: implement the method
			int ItemsDeleted = 0;

			  while (true) {
			    System.out.print("Enter an item to delete from the shopping list: ");
			    String item = sIn.nextLine();

			    if (item.isEmpty()) {
			      break;
			    }

			    boolean itemFound = false;
			    for (int i = 0; i < shoppingList.size(); i++) {
			      if (shoppingList.get(i).equals(item)) {
			        shoppingList.remove(i);
			        System.out.println("'" + item + "' has been deleted from the shopping list.");
			        ItemsDeleted++;
			        itemFound = true;
			        break;
			      }
			    }

			    if (!itemFound) {
			      System.out.println("'" + item + "' is not in the shopping list.");
			      showItems(shoppingList);
			    }
			  }

			  return ItemsDeleted;
				  
		}// end of method deleteItems(ArrayList<String>)

		/**
		 * Simply displays the contents of the shoppingList ArrayList in it's simplest
		 * form. <br>
		 * Example --
		 * <p>
		 * The Shopping List contains the following items: <br>
		 * [item-1, item-2, item-n]
		 * <p>
		 * 
		 * @param shoppingList - The ArrayList that stores the shopping list
		 */
		public static void showItems(ArrayList<String> shoppingList) {
			// FIXME: implement the method
				  System.out.println("The Shopping List contains the following items:");
				  for (String item : shoppingList) {
				    System.out.println("  " + item);
				  }

		}// end of method showItems(ArrayList<String>)

		/**
		 * Sorts the items in the shoppingList ArrayList, then calls showItems() to
		 * display the sorted list. Example --
		 * <p>
		 * The Shopping List contains the following items: <br>
		 * [item-1, item-2, item-n]
		 * <p>
		 * 
		 * @param shoppingList - The ArrayList that stores the shopping list
		 */
		public static void sortItems(ArrayList<String> shoppingList) {
			// FIXME: implement the method
			Collections.sort(shoppingList);
			showItems(shoppingList);
			System.out.println("After Sorting: "+ shoppingList);
		}// end of method sortItems(ArrayList<String>)

	}// 


