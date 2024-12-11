package week12.Lab11;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    protected Scanner scr = new Scanner(System.in);
    protected Pokedex pokedex = new Pokedex();

    public void displayMenu(){
        System.out.println("******MENU******\nPlease make a selection \n1) Add a pokemon\n2) Remove a pokemon\n3) Display pokemon info\n4) Display all pokemon\n5) Exit");
        String input = scr.nextLine();
        while(!input.equals("5")){
            if(input.equals("1")){
                createPokemon();
            }else if(input.equals("2")){
                deletePokemon();
            }else if(input.equals("3")){
                displayPokemon();
            }else if(input.equals("4")){
                displayAllPokemon();
            }else {
                System.out.println("Invalid entry, try again");
            }
            System.out.println("******MENU******\nPlease make a selection \n1) Add a pokemon\n2) Remove a pokemon\n3) Display pokemon info\n4) Display all pokemon\n5) Exit");
            input = scr.nextLine();
            }
    }
    private void addMovesToPokemon(Pokemon input){
        while(true){
            System.out.println("Enter the name of a move or q to exit");
            String moveName = scr.nextLine();
            if(moveName.equals("q")){
                break;
            }else{
                System.out.println("Enter the power and speed of the move");
                int power = scr.nextInt();
                int speed = scr.nextInt();
                scr.nextLine();
                Move newMove = new Move(moveName, power, speed);
                input.addMove(newMove);
            }
        }
    }
    public void createPokemon(){
        System.out.println("enter 1 for creating a new pokemon\nenter 2 to import from file");
        int pokeType = Integer.parseInt(scr.nextLine());
        if(pokeType== 2){
            FileRead fileRead = new FileRead();
            ArrayList<String[]> pokemonData;
            try{
                pokemonData = fileRead.readPokemonData("C:\\Users\\kyled\\Downloads\\CharacterStatsFile.txt");
                if(pokemonData.isEmpty()){
                    System.out.println("No pokemon data available in file");
                    return;
                }else{
                    for(int i = 0;i <pokemonData.size();i++){
                        String[] importPokemon = pokemonData.get(i);
                        System.out.println(importPokemon[0]+" is pokemon number "+(i+1));
                    }
                    System.out.println("\n\nEnter the number of the pokemon you wish to add");
                    int pokePick = Integer.parseInt(scr.nextLine());
                    if(pokePick <= pokemonData.size() && pokePick > 0){
                        String[] newPokemonList = pokemonData.get(pokePick-1);
                        Pokemon newPokemon = new Pokemon(newPokemonList[0], Integer.parseInt(newPokemonList[1]));
                        Move newMove = new Move(newPokemonList[2],Integer.parseInt(newPokemonList[3]), Integer.parseInt(newPokemonList[4]));
                        newPokemon.addMove(newMove);
                        pokedex.addPokemon(newPokemon);
                        System.out.println(newPokemonList[0]+" added to the pokedex");
                    }else{
                        System.out.println("Invalid entry");
                    }
                }
            }catch(FileNotFoundException e){
                System.out.println("Pokemon data file not found");

            }
        }else if (pokeType==1){
            System.out.println("Enter pokemon name and hp");
            String name = scr.nextLine();
            int hp = Integer.parseInt(scr.nextLine());
            Pokemon input = new Pokemon(name, hp);
            addMovesToPokemon(input);
            System.out.println("Pokemon added to pokedex, back to menu");
            pokedex.addPokemon(input);
        }else{
            System.out.println("Error: Invalid entry");
        }
        }

    public void deletePokemon(){
        System.out.println("Enter the name of the pokemon you wish to delete");
        String name = scr.nextLine();
        if(pokedex.getPokemon(name) == null) {
            System.out.println("Pokemon not found");
        }else {
            pokedex.removePokemon(pokedex.getPokemon(name));
            System.out.println("removed "+name);
        }
    }

    public void displayPokemon(){
        System.out.println("Enter the name of the pokemon you wish to display");
        String name = scr.nextLine();
        if(pokedex.getPokemon(name)==null){
            System.out.println("Pokemon not found");
        }else{
            System.out.println(pokedex.getPokemon(name));
        }
    }

    public void displayAllPokemon(){
        if(pokedex.getAllPokemon() != null){
            for (Pokemon i : pokedex.getAllPokemon()) {
                System.out.println("Name: "+ i.getName() + " HP: "+ i.getHp());
                if(i.getAllMoves().isEmpty()){
                    System.out.println("This pokemon has no moves");
                }else{
                    for(Move b : i.getAllMoves()){
                        System.out.println("   Name: " + b.getMoveName() +" Power: "+ b.getMovePower() +" Speed: "+ b.getMoveSpeed());
                    }
                }

            }
        }
    }

}

