import java.util.Scanner;
import java.util.Random;




public class Main {

    String Line000 = "You are traveling";

    String Line001 = "You have encountered nothing";

    Boolean SceneEntered = false;

        private static void UserInputName(){
            Scanner Input1 = new Scanner(System.in);

            //name creation
            System.out.println("What is your first name?");
            String NameFirst = Input1.nextLine();
            System.out.println("2nd name?");
            String NameSecond = Input1.nextLine();
            System.out.println("Your name is " + NameFirst + " " + NameSecond);


        }


       public static void SceneGenerator() throws InterruptedException {
            //scenes
           String Line1 = "You have entered a cave";
           String Line2 = "You have entered a forest";
           String Line3 = "You have entered a city of ghouls";
           String Line4 = "You have entered a swamp";
           String Line5 = "You have entered a plain";


            //enemys and there health
           String Ftreeant = "Treeant";
           int FtreeantHealth = 100;
           String Fvinesnake = "Vine Snake";
           int FvinesnakeHealth = 150;
           String Fcerberus = "Cerberus";
           int FcerberusHeath = 200;
           String Cironorespirit = "Iron Ore Spirit";
           int CironorespiritHealth = 100;
           String Cgoldorespirit = "Gold Ore Spirit";
           int CgoldorespiritHealth = 150;
           String Cbronzeorespirit = "Bronze ore Spirit";
           int CbronzeorespiritHealth = 100;
           String Gghoul = "Ghoul";
           int GghoulHeatlth = 100;
           String Gzombie = "Zombie";
           int GzombieHealth = 150;
           String Gvampire = "Vampire";
           int GvampireHealth = 200;
           String Slochnessmoster = "Loch Ness Monster";
           int SlochnessmosterHealth = 100;
           String Scrocodile = "Crocodile";
           int ScrocodileHealth = 150;
           String SPoisonwater = "Poisen Water";
           int SPoisonwaterHealth = 200;

            Random rand = new Random();
            Random enemygen = new Random();

            int sceneEnter = rand.nextInt(4);

            //scene generator
            if (sceneEnter == 0) {
                System.out.println(Line1);
                Thread.sleep(1000);

            }   else if (sceneEnter == 1){
                System.out.println(Line2);
                Thread.sleep(1000);

            }   else if (sceneEnter == 2){
                System.out.println(Line3);
                Thread.sleep(1000);

            }   else if (sceneEnter == 3){
                System.out.println(Line4);
                Thread.sleep(1000);

            }   else if (sceneEnter == 4){
                System.out.println(Line5);
                Thread.sleep(1000);

            }

            //enemy generators
            if (sceneEnter == 0){
                //enemy's for cave region
                int Enemy1 = enemygen.nextInt(2);
                    if (Enemy1 == 0){
                        System.out.println("you have encountered " + Cironorespirit + ": " + "Health: " + CironorespiritHealth);
                    }

                    else if (Enemy1 == 1){
                        System.out.println("you have encountered " + Cbronzeorespirit + ": " + "Health: " + CbronzeorespiritHealth);

                    }

                    else if (Enemy1 == 2){
                        System.out.println("you have encountered " + Cgoldorespirit + ": " + "Health: " + CgoldorespiritHealth);

                    }



            }

            if (sceneEnter == 1){
                int enemy2 = enemygen.nextInt(2);
                    if (enemy2 == 0){
                        System.out.println("you have encountered " + Ftreeant + ": " + "Health: " + FtreeantHealth);

                    }
                    else if (enemy2 == 1){
                        System.out.println("you have encountered " + Fvinesnake + ": " + "Health: " + FvinesnakeHealth);

                    }
                    else if (enemy2 == 2){
                        System.out.println("you have encountered " + Fcerberus + ": " + "Health: " + FcerberusHeath);

                    }



            }










        }


    public static void main(String args[]) throws InterruptedException {
                Scanner Answer1 = new Scanner(System.in);

                UserInputName();
                Thread.sleep(1000);
                SceneGenerator();


    }


}

