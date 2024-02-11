package machine;
import java.util.Scanner;



public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;
    private coffeeMachineState currentState;

    public enum coffeeMachineState {
        CHOOSING_ACTION, CHOOSING_COFFEE_TYPE, INPUT_QUANTITY_OF_WATER, INPUT_QUANTITY_OF_MILK, INPUT_QUANTITY_OF_BEANS, INPUT_QUANTITY_OF_CUPS, VIEW_REMAINING, EXIT
    }

    public CoffeeMachine() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.money = 550;
        this.currentState = coffeeMachineState.CHOOSING_ACTION;
    }

    public void processInput(String input) {
        switch (currentState) {
            case CHOOSING_ACTION:
                handleAction(input);
                break;
            case CHOOSING_COFFEE_TYPE:
                chooseCoffee(input);
                break;
            case INPUT_QUANTITY_OF_WATER:
                this.water += Integer.parseInt(input);
                currentState = coffeeMachineState.INPUT_QUANTITY_OF_MILK;
                System.out.println("Write how many ml of milk you want to add: ");
                break;
            case INPUT_QUANTITY_OF_MILK:
                this.milk += Integer.parseInt(input);
                currentState = coffeeMachineState.INPUT_QUANTITY_OF_BEANS;
                System.out.println("Write how many grams of coffee beans you want to add: ");
                break;
            case INPUT_QUANTITY_OF_BEANS:
                this.coffeeBeans += Integer.parseInt(input);
                currentState = coffeeMachineState.INPUT_QUANTITY_OF_CUPS;
                System.out.println("Write how many disposable cups you want to add: ");
                break;
            case INPUT_QUANTITY_OF_CUPS:
                this.cups += Integer.parseInt(input);
                currentState = coffeeMachineState.CHOOSING_ACTION;
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                break;
            case VIEW_REMAINING:
                viewRemaining();
                currentState = coffeeMachineState.CHOOSING_ACTION;
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                break;
            default:
                break;
        }
    }

    private void handleAction(String action) {
        switch (action) {
            case "buy":
                currentState = coffeeMachineState.CHOOSING_COFFEE_TYPE;
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                break;
            case "fill":
                currentState = coffeeMachineState.INPUT_QUANTITY_OF_WATER;
                System.out.println("Write how many ml of water you want to add: ");
                break;
            case "take":
                takeMoney();
                currentState = coffeeMachineState.CHOOSING_ACTION;
                break;
            case "remaining":
                viewRemaining();
                currentState = coffeeMachineState.CHOOSING_ACTION;
                break;
            case "exit":
                currentState = coffeeMachineState.EXIT;
                break;
        }
    }

    private void chooseCoffee(String type) {
        String espresso = "1";
        String latte = "2";
        String cappuccino = "3";
        String toMainMenu = "back";

        switch (type) {
            case "1":
                if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    coffeeBeans -= 16;
                    money += 4;
                    cups -= 1;
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough beans!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else {
                    System.out.println("Sorry, not enough cups!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                }
                break;

            case "2":
                if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    money += 7;
                    cups -= 1;
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough beans!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else {
                    System.out.println("Sorry, not enough cups!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                }
                break;

            case "3":
                if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    money += 6;
                    cups -= 1;
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough beans!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else {
                    System.out.println("Sorry, not enough cups!");
                    currentState = coffeeMachineState.CHOOSING_ACTION;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                }
                break;

            case "back":
                currentState = coffeeMachineState.CHOOSING_ACTION;
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                break;
        }
    }

    private void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();

        currentState = coffeeMachineState.CHOOSING_ACTION;
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
    }

    private void viewRemaining() {
        System.out.println("\nThe coffee machine has: ");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money\n");

        currentState = coffeeMachineState.CHOOSING_ACTION;
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
    }
    
    public boolean isExiting() {
        return currentState == coffeeMachineState.EXIT;
    }
}



class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine();
        String input;

        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        do {
            input = scanner.nextLine();
            machine.processInput(input);
        } while (!machine.isExiting());

        scanner.close();
    }
}





