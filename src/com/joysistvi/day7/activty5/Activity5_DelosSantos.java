package com.joysistvi.day7.activty5;

import java.util.Scanner;

public class Activity5_DelosSantos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // while (true) {
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter SSD code: ");
        String code = scanner.nextLine();


        if (code.equals("*143#")) {
            System.out.println("* Load Registration *");
            System.out.println("[1] Go+");
            System.out.println("[2] Go");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] Go UNLI 5G");
            System.out.println("[5] ALLNET");
            System.out.println("Enter a Choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("*** Go+ Promos ***");
                System.out.println("1] Go+99");
                System.out.println("[2] Go+129");
                System.out.println("[3] Go+149");
                System.out.println("Enter a Choice: ");

                int promo1 = scanner.nextInt();

                if (promo1 == 1) {
                    System.out.println("** Go+99 Promo ***");
                    System.out.println("-> Get 8 GB for all sites + 8GB");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a choice: ");

                    int go1 = scanner.nextInt();

                    if (go1 == 1) {
                        System.out.println("You are now subscribed to Go+99");
                    } else if (go1 == 2) {
                    }
                } else if (promo1 == 2) {
                    System.out.println("** Go+129 Promo ***");
                    System.out.println("-> Get 10 GB for all sites + 10GB");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a choice: ");

                    int go2 = scanner.nextInt();

                    if (go2 == 1) {
                        System.out.println("You are now subscribed to Go+129");
                    } else if (go2 == 2) {
                    }
                } else if (promo1 == 3) {
                    System.out.println("** Go+149 Promo ***");
                    System.out.println("-> Get 12 GB for all sites + 12GB");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a choice: ");

                    int go3 = scanner.nextInt();

                    if (go3 == 1) {
                        System.out.println("You are now subscribed to Go+149");
                    } else if (go3 == 2) {
                    }
                    return;
                } else {
                    System.out.println("Invalid Code");
                }

            } else if (choice == 2) {
                System.out.println("*** Go Promos ***");
                System.out.println("[1] Go50");
                System.out.println("[2] Go90");
                System.out.println("[3] Go120");
                System.out.println("Enter a choice:");

                int promo2 = scanner.nextInt();

                if (promo2 == 1) {
                    System.out.println("*** Go 50 Promo ***");
                    System.out.println("-> Get 5GB for all sites + 1GB");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go4 = scanner.nextInt();

                    if (go4 == 1) {
                        System.out.println("You are now subscribed to Go 50");
                    } else if (go4 == 2) ;

                } else if (promo2 == 2) {
                    System.out.println("*** Go 100 Promo ***");
                    System.out.println("Get 8GB for all sites + 4GB");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go5 = scanner.nextInt();

                    if (go5 == 1) {
                        System.out.println("You are now subscribed to Go 100");
                    } else if (go5 == 2) ;

                } else if (promo2 == 3) {
                    System.out.println("*** Go 120 Promo ***");
                    System.out.println("Get 10GB for all sites + 4GB");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go6 = scanner.nextInt();

                    if (go6 == 1) {
                        System.out.println("You are now subscribed to Go 120");
                    } else if (go6 == 2) ;


                }
            } else if (choice == 3) {
                System.out.println("** GoEXTRA Promos ***");
                System.out.println("[1] GoEXTRA99");
                System.out.println("[2] GoEXTRA129");
                System.out.println("[3] GoEXTRA149");
                System.out.println("Enter a choice:");

                int promo3 = scanner.nextInt();

                if (promo3 == 1) {
                    System.out.println("*** GoEXTRA99 Promo ***");
                    System.out.println("Get 8GB for al sites, plus 4GB of free 5G, and unlimited calls to all network for 7 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go7 = scanner.nextInt();

                    if (go7 == 1) {
                        System.out.println("You are now subscribed to GoEXTRA99");
                    } else if (go7 == 2) ;

                } else if (promo3 == 2) {
                    System.out.println("*** GoEXTRA129 Promo ***");
                    System.out.println("Get 10GB for al sites, plus 4GB of free 5G, and unlimited calls to all network for 7 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go8 = scanner.nextInt();

                    if (go8 == 1) {
                        System.out.println("You are now subscribed to GoEXTRA129");
                    } else if (go8 == 2) ;

                } else if (promo3 == 3) {
                    System.out.println("*** GoEXTRA149 Promo ***");
                    System.out.println("Get 13GB for al sites, plus 4GB of free 5G, and unlimited calls to all network for 15 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go9 = scanner.nextInt();

                    if (go9 == 1) {
                        System.out.println("You are now subscribed to GoEXTRA149");
                    } else if (go9 == 2) ;
                }

            } else if (choice == 4) {
                System.out.println("*** UNLI 5G Promos ***");
                System.out.println("[1] UNLI 5G 99");
                System.out.println("[2] UNLI 5G 149");
                System.out.println("[3] UNLI 5G 199");
                System.out.println("Enter a choice:");

                int promo4 = scanner.nextInt();

                if (promo4 == 1) {
                    System.out.println("*** UNLI 5G 99 Promo ***");
                    System.out.println("Get Unlimited 5G data, plus 8GB for all sites, 8GB of lifestyle app data and unlimited text to all networks for 7 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go7 = scanner.nextInt();

                    if (go7 == 1) {
                        System.out.println("You are now subscribed to UNLI 5G 99");
                    } else if (go7 == 2) ;

                } else if (promo4 == 2) {
                    System.out.println("*** UNLI 5G 149 Promo ***");
                    System.out.println("Get Unlimited 5G data, plus 12GB for all sites, 8GB of lifestyle app data and unlimited text to all networks for 15 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go8 = scanner.nextInt();

                    if (go8 == 1) {
                        System.out.println("You are now subscribed to UNLI 5G 149");
                    } else if (go8 == 2) ;

                } else if (promo4 == 3) {
                    System.out.println("*** UNLI 5G 199 Promo ***");
                    System.out.println("Get Unlimited 5G data, plus 14GB for all sites, 812GB of lifestyle app data and unlimited text to all networks for 28 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go9 = scanner.nextInt();

                    if (go9 == 1) {
                        System.out.println("You are now subscribed to UNLI 5G 199");
                    } else if (go9 == 2) ;
                }
            } else if (choice == 5) {
                System.out.println("*** ALLNET Promos ***");
                System.out.println("[1] ALLNET99");
                System.out.println("[2] ALLNET149");
                System.out.println("[3] ALLNET199");
                System.out.println("Enter a choice:");

                int promo5 = scanner.nextInt();

                if (promo5 == 1) {
                    System.out.println("*** ALLNET99 Promo ***");
                    System.out.println("Get 2GB for all sites, plus unlimited calls and texts to all networks for 7 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go8 = scanner.nextInt();

                    if (go8 == 1) {
                        System.out.println("You are now subscribed to ALLNET99");
                    } else if (go8 == 2) ;

                } else if (promo5 == 2) {
                    System.out.println("*** ALLNET149 Promo ***");
                    System.out.println("Get 4GB for all sites, plus unlimited calls and texts to all networks for 7 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go9 = scanner.nextInt();

                    if (go9 == 1) {
                        System.out.println("You are now subscribed to ALLNET149");
                    } else if (go9 == 2) ;

                } else if (promo5 == 3) {
                    System.out.println("*** ALLNET199 ***");
                    System.out.println("Get 6GB for all sites, plus unlimited calls and texts to all networks for 7 days!");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.println("Enter a Choice: ");

                    int go10 = scanner.nextInt();

                    if (go10 == 1) {
                        System.out.println("You are now subscribed to ALLNET199");
                    } else if (go10 == 2) ;
                }
                return;
            } else {
                System.out.println("Invalid Code");
            }


        }


    }
}